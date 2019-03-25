package com.score.dbtracer.parser.antlr.sql;


import java.util.ArrayList;
import java.util.List;


/**
 * Database
 */

public class Database {
    private String      name   = "";
    /**
     * Tables
     */
    private List<Table> tables = new ArrayList<Table>();


    public Table getTableForName(final String tableName) {
        for (final Table table : tables) {
            if (table.getName().equalsIgnoreCase(tableName)) {
                return table;
            }
        }
        return null;
    }


    public List<Table> getTables() {
        return tables;
    }


    public void setTables(final List<Table> tables) {
        this.tables = tables;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
