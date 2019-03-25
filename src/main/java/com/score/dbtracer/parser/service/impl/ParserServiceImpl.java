package com.score.dbtracer.parser.service.impl;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.score.dbtracer.parser.antlr.report.Report;
import com.score.dbtracer.parser.antlr.report.ReportManager;
import com.score.dbtracer.parser.antlr.sqlimport.MainProcess;
import com.score.dbtracer.parser.service.ParseService;
import com.score.dbtracer.parser.util.Util;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.Statements;
import net.sf.jsqlparser.statement.create.table.ColumnDefinition;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.TablesNamesFinder;


/**
 * Method description
 *
 * @author mixkorea
 * @since  2019. 3. 11.
 * @version 
 * @see
 */
@Service
@Transactional
public class ParserServiceImpl implements ParseService {

    @Override
    public String JSQLParse(String filePath) throws JSQLParserException {
        String input = filePath;
        String output = "D:\\work\\temp\\result.json";

        if (StringUtils.isEmpty(filePath)) {
            input = "D:\\work\\temp\\sql.sql";
        }

        InputStream in = null;
        OutputStream os = null;
        final Util util = new Util();

        in = util.getInputStream(input);
        os = util.getOutputStream(output);

        String inputContent = util.read(in);
        String outputContent = "";

        Statements stmts = CCJSqlParserUtil.parseStatements(inputContent);
        List<String> columnNames = new ArrayList<String>();
        List<String> tableList = new ArrayList<String>();
        for (Statement stmt : stmts.getStatements()) {
            if (stmt instanceof Select) {
                Select select = (Select) stmt;
                TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
                tableList = tablesNamesFinder.getTableList(select);
                //                ColumnDefinition col = new ColumnDefinition();

            } else if (stmt instanceof CreateTable) {
                CreateTable create = (CreateTable) stmt;
                //                String tablename = create.getTable().getName();
                List<ColumnDefinition> columns = create.getColumnDefinitions();
                for (ColumnDefinition def : columns) {
                    columnNames.add(def.getColumnName());
                }
            }
            //            SelectBody body = selectStatement.getSelectBody();
        }
        System.out.println(tableList.size());
        util.write(outputContent, os);
        return outputContent;
    }


    @Override
    public String ANTLRParse(String filePath) throws Exception {
        String input = filePath;
        String output = "D:\\work\\temp\\result.json";

        if (StringUtils.isEmpty(filePath)) {
            input = "D:\\work\\temp\\sql.sql";
        }
        Util util = new Util();
        InputStream in = null;
        OutputStream os = null;

        String outputContent = "";
        try {
            in = util.getInputStream(input);
            os = util.getOutputStream(output);
            MainProcess mainProcess = new MainProcess();

            String inputContent = util.read(in);
            outputContent = mainProcess.process(inputContent);
            util.write(outputContent, os);

            Report report = mainProcess.getReport();
            ReportManager reportManager = new ReportManager();
            System.out.println(reportManager.toString(report));
            System.out.println("\n\n==========================\n\n");
            System.out.println(reportManager.toStringSchema(report));

        } catch (final Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e);
            //            throw e;
        }
        return outputContent;
    }
}
