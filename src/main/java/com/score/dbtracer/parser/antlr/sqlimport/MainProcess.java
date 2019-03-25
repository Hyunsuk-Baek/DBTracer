package com.score.dbtracer.parser.antlr.sqlimport;


import com.score.dbtracer.parser.antlr.SqlImport;
import com.score.dbtracer.parser.antlr.export.DatabaseToResdef;
import com.score.dbtracer.parser.antlr.export.ResdefToJson;
import com.score.dbtracer.parser.antlr.report.Report;
import com.score.dbtracer.parser.antlr.report.ReportStatus;
import com.score.dbtracer.parser.antlr.resdef.Resdef;
import com.score.dbtracer.parser.antlr.sql.Database;
import com.score.dbtracer.parser.antlr.type.TypeConverter;
import com.score.dbtracer.parser.antlr.validation.DatabaseValidator;


/**
 * Main manager for SQL import and export in the pivot format file
 */
public class MainProcess {

    /**
     * Report.
     */
    private Report report = new Report();


    /**
     * Main method
     */
    public String process(final String sqlContent) {

        // Load SQL file, filter and parse SQL queries
        final SqlImport sqlImport = new SqlImport(report);
        final Database database = sqlImport.getDatabase(sqlContent);

        if ((database == null) || database.getTables().isEmpty()) {
            // Empty database
            report.setReportStatus(ReportStatus.EMPTY_DATABASE);
            return null;
        }

        // Convert SQL types to Entity store types
        final TypeConverter typeConverter = new TypeConverter(report);
        typeConverter.convertTypeFromSQLToEntityStore(database);

        // Database schema validator
        final DatabaseValidator databaseValidator = new DatabaseValidator(report);
        databaseValidator.validateDatabase(database);

        // Convert to Resdef bean
        final DatabaseToResdef databaseToResdef = new DatabaseToResdef();
        final Resdef resdef = databaseToResdef.databaseToResdef(database);
        report.setResdef(resdef);

        // Export to JSON
        final ResdefToJson resdefToJson = new ResdefToJson();
        final String json = resdefToJson.resdefToJson(resdef);
        report.setReportStatus(ReportStatus.SUCCESS);

        // Summary
        report.setNbCreatedEntity(database.getTables().size());

        return json;
    }


    /**
     * Get report.
     * @return report
     */
    public Report getReport() {
        return report;
    }


    public void setReport(final Report report) {
        this.report = report;
    }

}
