// Generated from com\restlet\sqlimport\parser\Sql.g4 by ANTLR 4.3
package com.restlet.sqlimport.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull SqlParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull SqlParser.Create_virtual_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(@NotNull SqlParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(@NotNull SqlParser.Column_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(@NotNull SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(@NotNull SqlParser.Column_constraint_foreign_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(@NotNull SqlParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(@NotNull SqlParser.Alter_table_addContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull SqlParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull SqlParser.Drop_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull SqlParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(@NotNull SqlParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(@NotNull SqlParser.Cte_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull SqlParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull SqlParser.Transaction_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull SqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull SqlParser.Column_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull SqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull SqlParser.Sql_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull SqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull SqlParser.Create_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(@NotNull SqlParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(@NotNull SqlParser.Column_default_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull SqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull SqlParser.Rollback_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull SqlParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull SqlParser.Join_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull SqlParser.Alter_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull SqlParser.Table_or_index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull SqlParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull SqlParser.Compound_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull SqlParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull SqlParser.Module_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull SqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull SqlParser.Create_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(@NotNull SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(@NotNull SqlParser.Table_constraint_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull SqlParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull SqlParser.Simple_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull SqlParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull SqlParser.Select_or_valuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull SqlParser.Factored_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(@NotNull SqlParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(@NotNull SqlParser.UnknownContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull SqlParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull SqlParser.Compound_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull SqlParser.Foreign_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull SqlParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull SqlParser.Reindex_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull SqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull SqlParser.Insert_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull SqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull SqlParser.Common_table_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull SqlParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull SqlParser.Vacuum_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull SqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull SqlParser.Create_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull SqlParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull SqlParser.Drop_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull SqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull SqlParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull SqlParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull SqlParser.Detach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull SqlParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull SqlParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull SqlParser.Qualified_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull SqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull SqlParser.Database_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(@NotNull SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(@NotNull SqlParser.Column_constraint_not_nullContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(@NotNull SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(@NotNull SqlParser.Fk_target_column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(@NotNull SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(@NotNull SqlParser.Table_constraint_uniqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull SqlParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull SqlParser.Update_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull SqlParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull SqlParser.Raise_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull SqlParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull SqlParser.Pragma_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull SqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull SqlParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(@NotNull SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(@NotNull SqlParser.Alter_table_add_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull SqlParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull SqlParser.Savepoint_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(@NotNull SqlParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(@NotNull SqlParser.Source_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull SqlParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull SqlParser.Join_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull SqlParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull SqlParser.Indexed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull SqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull SqlParser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull SqlParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull SqlParser.Delete_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull SqlParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull SqlParser.New_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull SqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull SqlParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull SqlParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull SqlParser.Error_messageContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull SqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull SqlParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull SqlParser.Sql_stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull SqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull SqlParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull SqlParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull SqlParser.Pragma_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull SqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull SqlParser.Update_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull SqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull SqlParser.Column_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull SqlParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull SqlParser.Attach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(@NotNull SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(@NotNull SqlParser.Column_constraint_nullContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull SqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull SqlParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull SqlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull SqlParser.Module_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull SqlParser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull SqlParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull SqlParser.Drop_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull SqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull SqlParser.Signed_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull SqlParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull SqlParser.Ordering_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(@NotNull SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(@NotNull SqlParser.Fk_origin_column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull SqlParser.Table_or_subqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull SqlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull SqlParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull SqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull SqlParser.Commit_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull SqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull SqlParser.Select_coreContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull SqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull SqlParser.Savepoint_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull SqlParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull SqlParser.Conflict_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(@NotNull SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(@NotNull SqlParser.Table_constraint_foreign_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull SqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull SqlParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull SqlParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull SqlParser.Begin_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull SqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull SqlParser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull SqlParser.Drop_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull SqlParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull SqlParser.Release_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SqlParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(@NotNull SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(@NotNull SqlParser.Table_constraint_primary_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull SqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull SqlParser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull SqlParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull SqlParser.Create_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull SqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull SqlParser.Column_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull SqlParser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull SqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull SqlParser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull SqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull SqlParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull SqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull SqlParser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull SqlParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull SqlParser.Pragma_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull SqlParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull SqlParser.Analyze_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(@NotNull SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(@NotNull SqlParser.Column_constraint_primary_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull SqlParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull SqlParser.Foreign_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull SqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull SqlParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull SqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull SqlParser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull SqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull SqlParser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull SqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull SqlParser.Delete_stmtContext ctx);
}