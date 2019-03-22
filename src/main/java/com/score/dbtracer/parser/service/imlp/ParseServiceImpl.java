/*
* File Name : UserService.java
* Author : mixkorea
* Date : 2019-03-11
* Description : File description
* 
* Modification Information
* Date         Reviser      Description
* ------------ ----------- ---------------------------
* 2019. 3. 11. mixkorea     최초작성
* 2019. 3. 11. mixkorea     수정사항 입력
*
* 상기 프로그램에 대한 저작권을 포함한 지적재산권은 에스코어(주)에 있으며,
* 에스코어(주)가 명시적으로 허용하지 않은 사용, 복사, 변경, 제3자에의 공개,
* 배포는 엄격히 금지되며, 에스코어(주)의 지적 재산권 침해에 해당됩니다.
* (Copyright ⓒ 2014 S-Core Co., Ltd. All Rights Reserved| Confidential)
*/
package com.score.dbtracer.parser.service.imlp;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.score.dbtracer.parser.service.ParseService;

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
public class ParseServiceImpl implements ParseService {

    @Override
    public String parse(String sql) throws JSQLParserException {
        Statements stmts = CCJSqlParserUtil.parseStatements(sql);
        List<String> columnNames = new ArrayList<String>();
        List<String> tableList = new ArrayList<String>();
        for (Statement stmt : stmts.getStatements()) {
            if (stmt instanceof Select) {
                Select select = (Select) stmt;
                TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
                tableList = tablesNamesFinder.getTableList(select);
                ColumnDefinition col = new ColumnDefinition();
            } else if (stmt instanceof CreateTable){
                CreateTable create = (CreateTable) stmt;
                String tablename = create.getTable().getName();
                List<ColumnDefinition> columns = create.getColumnDefinitions();
                for (ColumnDefinition def : columns) {
                    columnNames.add(def.getColumnName());
                }
            
            }

            //            SelectBody body = selectStatement.getSelectBody();

        }

        return tableList.toString();
    }
}
