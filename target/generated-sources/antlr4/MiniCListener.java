// Generated from MiniC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCParser}.
 */
public interface MiniCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MiniCParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MiniCParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MiniCParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MiniCParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(MiniCParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(MiniCParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl(MiniCParser.Fun_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl(MiniCParser.Fun_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiniCParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiniCParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniCParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniCParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MiniCParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MiniCParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(MiniCParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(MiniCParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(MiniCParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(MiniCParser.Case_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MiniCParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MiniCParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(MiniCParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(MiniCParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(MiniCParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(MiniCParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#local_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocal_decl(MiniCParser.Local_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#local_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocal_decl(MiniCParser.Local_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MiniCParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MiniCParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MiniCParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MiniCParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(MiniCParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(MiniCParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(MiniCParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(MiniCParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrexpr(MiniCParser.OrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrexpr(MiniCParser.OrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#orexpr1}.
	 * @param ctx the parse tree
	 */
	void enterOrexpr1(MiniCParser.Orexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#orexpr1}.
	 * @param ctx the parse tree
	 */
	void exitOrexpr1(MiniCParser.Orexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(MiniCParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(MiniCParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#andexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr1(MiniCParser.Andexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#andexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr1(MiniCParser.Andexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#eqexpr}.
	 * @param ctx the parse tree
	 */
	void enterEqexpr(MiniCParser.EqexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#eqexpr}.
	 * @param ctx the parse tree
	 */
	void exitEqexpr(MiniCParser.EqexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#eqexpr1}.
	 * @param ctx the parse tree
	 */
	void enterEqexpr1(MiniCParser.Eqexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#eqexpr1}.
	 * @param ctx the parse tree
	 */
	void exitEqexpr1(MiniCParser.Eqexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cpexpr}.
	 * @param ctx the parse tree
	 */
	void enterCpexpr(MiniCParser.CpexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cpexpr}.
	 * @param ctx the parse tree
	 */
	void exitCpexpr(MiniCParser.CpexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cpexpr1}.
	 * @param ctx the parse tree
	 */
	void enterCpexpr1(MiniCParser.Cpexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cpexpr1}.
	 * @param ctx the parse tree
	 */
	void exitCpexpr1(MiniCParser.Cpexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#arithexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithexpr(MiniCParser.ArithexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#arithexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithexpr(MiniCParser.ArithexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#arithexpr1}.
	 * @param ctx the parse tree
	 */
	void enterArithexpr1(MiniCParser.Arithexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#arithexpr1}.
	 * @param ctx the parse tree
	 */
	void exitArithexpr1(MiniCParser.Arithexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#geoexpr}.
	 * @param ctx the parse tree
	 */
	void enterGeoexpr(MiniCParser.GeoexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#geoexpr}.
	 * @param ctx the parse tree
	 */
	void exitGeoexpr(MiniCParser.GeoexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#oneexpr}.
	 * @param ctx the parse tree
	 */
	void enterOneexpr(MiniCParser.OneexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#oneexpr}.
	 * @param ctx the parse tree
	 */
	void exitOneexpr(MiniCParser.OneexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MiniCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MiniCParser.ArgsContext ctx);
}