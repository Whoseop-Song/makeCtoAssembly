//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
//import org.antlr.v4.runtime.tree.TerminalNode;

public class MiniCPrintListener extends MiniCBaseListener{
	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
	HashMap<String, String> parameter = new HashMap<>();
	int paramCnt = 0;
	int valdeclCnt=0;
	@Override public void exitProgram(MiniCParser.ProgramContext ctx) {
		System.out.println(".section .data");
		for(int i=0;i<ctx.getChildCount();i++){
			if(ctx.getChild(i).getChild(0) instanceof MiniCParser.Var_declContext)
				System.out.println(newTexts.get(ctx.getChild(i)));
		}
		System.out.println(".section .text");
		for(int i=0;i<ctx.getChildCount();i++){
			if(ctx.getChild(i).getChild(0) instanceof MiniCParser.Fun_declContext)
				System.out.println(newTexts.get(ctx.getChild(i)));
		}
	}
	
	
	@Override public void exitDecl(MiniCParser.DeclContext ctx) {
		newTexts.put(ctx,newTexts.get(ctx.getChild(0)));
	}
	
	@Override public void exitVar_decl(MiniCParser.Var_declContext ctx) {
		valdeclCnt++;
		String valdecl = ctx.IDENT().getText()+":\n";
		if(ctx.getChildCount()==3)
			valdecl += "\t."+ctx.type_spec().getText()+" 0";
		if(ctx.getChildCount() == 5)
			valdecl += "\t."+ctx.type_spec().getText()+" "+ctx.LITERAL().getText();
		newTexts.put(ctx,valdecl);
	}
	
	@Override public void exitType_spec(MiniCParser.Type_specContext ctx) {
		newTexts.put(ctx, ctx.getChild(0).getText());
	}
	@Override public void enterFun_decl(MiniCParser.Fun_declContext ctx) {
		paramCnt=0;
	}
	@Override public void exitFun_decl(MiniCParser.Fun_declContext ctx) {
		String fundecl = "";
		if(ctx.IDENT().getText().equals("main")){
			fundecl = ".global main\n";
			fundecl = "main:\n";
		}
		else{
			fundecl = ".type "+ctx.IDENT().getText()+", @function\n";
			fundecl+= ctx.IDENT().getText()+":\n";
		}
		fundecl +="ret";
		newTexts.put(ctx, fundecl);
	}
	
	@Override public void enterParams(MiniCParser.ParamsContext ctx) { }
	@Override public void enterParam(MiniCParser.ParamContext ctx) {
		paramCnt++;
		if(paramCnt==1)
			parameter.put(ctx.IDENT().getText(), "%rdi");
		else if(paramCnt==2)
			parameter.put(ctx.IDENT().getText(), "%rsi");
		else if(paramCnt==3)
			parameter.put(ctx.IDENT().getText(), "%rdx");
		else if(paramCnt==4)
			parameter.put(ctx.IDENT().getText(), "%rcx");
		else if(paramCnt==5)
			parameter.put(ctx.IDENT().getText(), "%r8");
		else if(paramCnt==6)
			parameter.put(ctx.IDENT().getText(), "%r9");
		//System.out.println(ctx.IDENT().getText() + " : "+parameter.get(ctx.IDENT().getText()));
	}
	
	@Override public void exitStmt(MiniCParser.StmtContext ctx) { }
	
	@Override public void exitSwitch_stmt(MiniCParser.Switch_stmtContext ctx) { }
	
	@Override public void exitCase_stmt(MiniCParser.Case_stmtContext ctx) { }
	
	@Override public void exitWhile_stmt(MiniCParser.While_stmtContext ctx) { }
	
	@Override public void exitFor_stmt(MiniCParser.For_stmtContext ctx) { }
	
	@Override public void exitCompound_stmt(MiniCParser.Compound_stmtContext ctx) { }
	
	@Override public void exitLocal_decl(MiniCParser.Local_declContext ctx) { }
	
	@Override public void exitIf_stmt(MiniCParser.If_stmtContext ctx) { }
	
	@Override public void exitReturn_stmt(MiniCParser.Return_stmtContext ctx) { }
	
	@Override public void exitExpr_stmt(MiniCParser.Expr_stmtContext ctx) { }
	
	@Override public void exitExpr(MiniCParser.ExprContext ctx) { }
	
	@Override public void exitExpr1(MiniCParser.Expr1Context ctx) { }
	
	@Override public void exitOrexpr(MiniCParser.OrexprContext ctx) { }
	
	@Override public void exitOrexpr1(MiniCParser.Orexpr1Context ctx) { }
	
	@Override public void exitAndexpr(MiniCParser.AndexprContext ctx) { }
	
	@Override public void exitAndexpr1(MiniCParser.Andexpr1Context ctx) { }
	
	@Override public void exitEqexpr(MiniCParser.EqexprContext ctx) { }
	
	@Override public void exitEqexpr1(MiniCParser.Eqexpr1Context ctx) { }
	
	@Override public void exitCpexpr(MiniCParser.CpexprContext ctx) { }
	
	@Override public void exitCpexpr1(MiniCParser.Cpexpr1Context ctx) { }
	
	@Override public void exitArithexpr(MiniCParser.ArithexprContext ctx) { }
	
	@Override public void exitArithexpr1(MiniCParser.Arithexpr1Context ctx) { }
	
	@Override public void exitGeoexpr(MiniCParser.GeoexprContext ctx) { }
	
	@Override public void exitOneexpr(MiniCParser.OneexprContext ctx) { }
	
	@Override public void exitArgs(MiniCParser.ArgsContext ctx) { }
}
