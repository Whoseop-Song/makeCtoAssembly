//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Arrays;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTreeProperty;


public class MiniCPrintListener extends MiniCBaseListener{
   ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
   HashMap<String, String> parameter = new HashMap<>();
   HashMap<String, String> localVal = new HashMap<>();
   HashMap<Integer, String> casetable = new HashMap<>();
   int paramCnt = 0;
   int valdeclCnt=0;
   int localCnt = 0;
   int whileCnt = 0, forCnt = 0;
   int swinum=0, casenum=0, ifnum=0;
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
      localCnt = 0;
      int cnt =0;
      for(int i=0 ;i<ctx.getChildCount();i++){
         if(ctx.getChild(i) instanceof MiniCParser.Local_declContext){
            cnt++;
         }
      }
      newTexts.put(ctx, cnt+"");
      localVal.clear();
   }
   @Override public void exitFun_decl(MiniCParser.Fun_declContext ctx) {
      String fundecl = "";

      if(ctx.IDENT().getText().equals("main")){
         fundecl = ".global main\n";
         fundecl += "main:\n";
      }
      else{
         fundecl = ".type "+ctx.IDENT().getText()+", @function\n";
         fundecl+= ctx.IDENT().getText()+":\n";
      }
      if(localVal.size()>0)
         fundecl += "\tsubq\t$"+(localVal.size()+1)*8+", %rsp\n";
      fundecl+=newTexts.get(ctx.compound_stmt())+"\n\tret";
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
      System.out.println(ctx.IDENT().getText() + " : "+parameter.get(ctx.IDENT().getText()));
   }
   
   @Override public void exitStmt(MiniCParser.StmtContext ctx) { 
      newTexts.put(ctx, newTexts.get(ctx.getChild(0)));
   }
   
   @Override public void enterSwitch_stmt(MiniCParser.Switch_stmtContext ctx) { 
      casetable.clear();
   }
   
   @Override public void exitSwitch_stmt(MiniCParser.Switch_stmtContext ctx) { 
      String tt="";
      if(localVal.containsKey(ctx.IDENT().getText()))
         tt ="\tmovq   "+localVal.get(ctx.IDENT().getText())+", %rax\n";
      else
         tt ="\tmovq   "+ctx.IDENT().getText()+", %rax\n";
      int maxsub =0;
      Integer key[] = new Integer[casetable.size()];
      casetable.keySet().toArray(key);//쨍챨쨉챌 case쨍짝 째징횁짰쩔횊.(쩌첩쩌짯쨈챘쨌횓)
      Arrays.sort(key);
      for(int i=0;i<key.length-1;i++){
         int a = key[i+1].intValue();
         int b = key[i].intValue();
         if(maxsub<a-b)
            maxsub = a-b;
      }
      if(maxsub > 15){//15쨘쨍쨈횢 횇짤쨍챕 짹횞쨀횋 if else if 횉체쩍횆�쨍쨌횓.
         int mid = key[key.length/2].intValue();
         tt += "\tcmpq   $"+mid+", %rax\n";
         tt+="\tcmpq   $"+mid+", %rax\n\tje   .s"+swinum+"c"+casetable.get(mid)+"\n";
         if(mid!=key[key.length-1].intValue())
            tt+="\tcmpq   $"+mid+", %rax\n\tjg   .sw"+swinum+":\n";
         else
            tt+="\tcmpq   $"+mid+", %rax\n\tjg   .swend"+swinum+":\n";
         
         for(int i=0;i<key.length/2;i++){
            tt+="\tcmpq   $"+key[i]+", %rax\n\tje   .s"+swinum+"c"+casetable.get(key[i])+"\n";
         }
         if(mid!=key[key.length-1].intValue())
            tt +=".sw"+swinum+":\n";
         for(int i=1+(key.length/2);i<key.length;i++){
            tt+="\tcmpq   $"+key[i]+", %rax\n\tje   .s"+swinum+"c"+casetable.get(key[i])+"\n";
         }
         
      }else{//if cases are sequaltial(max sub < 15)
         int max = key[key.length-1];
         tt += "\tmovq   .sw"+swinum+"(,%rax,8), %rax\n.sw"+swinum+":\n";
         for(int i=0;i<=max;i++){
            if(casetable.containsKey(i)){
               tt += "\t.quad\t.s"+swinum+"c"+casetable.get(i)+"\n";
            }else{
               tt += "\t.quad\t.swend"+swinum+":\n";
            }
         }
      
      }
      newTexts.put(ctx, tt+newTexts.get(ctx.stmt())+"\n.swend"+swinum+":\n");
   }
   
   @Override public void exitCase_stmt(MiniCParser.Case_stmtContext ctx) { 
      String a = ".s"+swinum+"c"+casenum+":\n";
      //System.out.println(ctx.expr().getText());
      for(int i=0;i<ctx.expr_stmt().size()-1;i++)
         a+=newTexts.get(ctx.expr_stmt(i));
      casetable.put(Integer.parseInt(ctx.LITERAL().getText()), String.valueOf(casenum++));
      newTexts.put(ctx,a+"\n\tjmp\t.swend"+swinum+"\n");
   }
   
   @Override public void exitWhile_stmt(MiniCParser.While_stmtContext ctx) { 
      whileCnt++;
      String whilestmt = "\tjmp .W"+whileCnt+"\n";
      whilestmt += ".W"+whileCnt+"c:\n";
      whilestmt +=""+newTexts.get(ctx.stmt())+"\n";
      whilestmt +=".W"+whileCnt+":\n\t"+newTexts.get(ctx.expr());
      whilestmt +=".W"+whileCnt+"c\n";
      newTexts.put(ctx, whilestmt);
   }
   
   @Override public void exitFor_stmt(MiniCParser.For_stmtContext ctx) { 
      String forstmt = newTexts.get(ctx.expr(0))+"\n";
      forstmt += "\tjmp .F"+forCnt+"\n";
      forstmt += ".F"+forCnt+"c:\n";
      forstmt += ""+newTexts.get(ctx.stmt())+"\n";
      forstmt += ""+newTexts.get(ctx.expr(2))+"\n";
      forstmt += ".F"+forCnt+":\n\t"+newTexts.get(ctx.expr(1));
      //conditional jump (default jmp)
      forstmt += " .F"+forCnt+"c\n";
      newTexts.put(ctx, forstmt);
   }
   
   @Override public void exitCompound_stmt(MiniCParser.Compound_stmtContext ctx) {
      String com = "";//횁횩째첵횊짙 쨀쨩쨘횓
      for(int i =0;i<ctx.local_decl().size();i++){//0째쨀�횑쨩처 째징쨈횋
            com += newTexts.get(ctx.local_decl(i));
         }
      for(int i =0;i<ctx.stmt().size();i++){//0째쨀�횑쨩처 째징쨈횋
            com += newTexts.get(ctx.stmt(i));
      }
      newTexts.put(ctx,com);//쨀징쨀쨉�쨍쨈횕 횉횗횆짯쨀쨩쨍짼
   }
   
   @Override public void enterLocal_decl(MiniCParser.Local_declContext ctx) {
      localCnt++;
      if(ctx.getChildCount()==3)
         localVal.put(ctx.IDENT().getText(), +localCnt*8+"(%rsp)");
      else if(ctx.getChildCount()==5)
         localVal.put(ctx.IDENT().getText(), +localCnt*8+"(%rsp)");
   }
   
   @Override public void exitLocal_decl(MiniCParser.Local_declContext ctx) {
      if(ctx.getChildCount()==3)
         newTexts.put(ctx, "\tmovq\t$0, "+localVal.get(ctx.IDENT().getText())+"\n");
      else if(ctx.getChildCount()==5)
         newTexts.put(ctx, "\tmovq\t$"+ctx.LITERAL().getText()+",\t"+localVal.get(ctx.IDENT().getText())+"\n");
   }
   
   @Override public void exitIf_stmt(MiniCParser.If_stmtContext ctx) { 
      String ifmoon = "\t"+newTexts.get(ctx.expr())+".if"+ifnum+"\n\tjmp\t.ifend\n";
      ifmoon+=".if"+ifnum+":\n"+newTexts.get(ctx.stmt(0))+".ifend"+ifnum+":\n";
      if(ctx.stmt(1)!=null){
         ifmoon+=newTexts.get(ctx.stmt(1));
      }
      newTexts.put(ctx,ifmoon);
   }

   
   @Override public void exitReturn_stmt(MiniCParser.Return_stmtContext ctx) {
      if(ctx.expr()==null)
         newTexts.put(ctx, "");
      else{
         String returnstmt = "\tmovq\t"; 
      }
   }
   @Override public void exitExpr_stmt(MiniCParser.Expr_stmtContext ctx) { 
      if(ctx.expr()!=null){
         newTexts.put(ctx,newTexts.get(ctx.expr())+"\n");   
      }
//      System.out.println(newTexts.get(ctx.expr()));
   }
   
   @Override public void exitExpr(MiniCParser.ExprContext ctx) { 
      String val;
      if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.orexpr()));
      }
      if(ctx.getChildCount()==3){
         if(localVal.containsKey(ctx.IDENT().getText())){
             val = localVal.get(ctx.IDENT().getText());
         }
         else{
            val = ctx.IDENT().getText();
         }
         //System.out.println(newTexts.get(ctx.expr(0)));
         newTexts.put(ctx,newTexts.get(ctx.expr(0))+"\tmovq\t%rbx, "+val );
         if(newTexts.get(ctx.expr(0)).charAt(0)=='$')
            newTexts.put(ctx,"\tmovq\t"+newTexts.get(ctx.expr(0))+",\t"+val );
      }
      
   }
   
   @Override public void exitExpr1(MiniCParser.Expr1Context ctx) {
      
   }
   
   @Override public void exitOrexpr(MiniCParser.OrexprContext ctx) {
      
      if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.andexpr()));
      }
      //System.out.println(newTexts.get(ctx));
   }
   
   @Override public void exitOrexpr1(MiniCParser.Orexpr1Context ctx) { 
      
   }
   
   @Override public void exitAndexpr(MiniCParser.AndexprContext ctx) {

      
      if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.eqexpr()));
      }if(ctx.getChildCount()==2){
         if(ctx.andexpr1()!=null){
            String temp = "movq\t"+newTexts.get(ctx.eqexpr())+", %rax\n";
            System.out.println();
            newTexts.put(ctx , temp+newTexts.get(ctx.andexpr1()));
         }
      }
//      System.out.println(newTexts.get(ctx));
   }
   
   @Override public void exitAndexpr1(MiniCParser.Andexpr1Context ctx) {
      if(ctx.eqexpr()==null){
         newTexts.put(ctx,"");
      }else if(ctx.EQ()!=null){
         if(localVal.containsKey(newTexts.get(ctx.eqexpr()))){
            newTexts.put(ctx,"\tcmpq\t "+localVal.get(newTexts.get(ctx.eqexpr()))+", %rax\n\tje\t");
         }
         else{
            newTexts.put(ctx,"\tcmpq\t "+newTexts.get(ctx.eqexpr())+", %rax\n\tje\t");
         }
      }else if(ctx.NE()!=null){
         if(localVal.containsKey(newTexts.get(ctx.eqexpr()))){
            newTexts.put(ctx,"\tcmpq\t "+localVal.get(newTexts.get(ctx.eqexpr()))+", %rax\n\tjne\t");
         }
         else{
            newTexts.put(ctx,"\tcmpq\t "+newTexts.get(ctx.eqexpr())+", %rax\n\tjne\t");
         }
      }
   }
   
   @Override public void exitEqexpr(MiniCParser.EqexprContext ctx) {
      
      if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.cpexpr()));
      }if(ctx.getChildCount()==2){
         if(ctx.eqexpr1()!=null){
            String temp = "movq\t"+newTexts.get(ctx.cpexpr())+", %rax\n";
            System.out.println();
            newTexts.put(ctx , temp+newTexts.get(ctx.eqexpr1()));
         }
      }
      //System.out.println(newTexts.get(ctx));
   }
   
   @Override public void exitEqexpr1(MiniCParser.Eqexpr1Context ctx) { 
      if(ctx.cpexpr()==null){
         newTexts.put(ctx,"");
      }else if(ctx.LE()!=null){
         if(localVal.containsKey(newTexts.get(ctx.cpexpr()))){
            newTexts.put(ctx,"\tcmpq\t "+localVal.get(newTexts.get(ctx.cpexpr()))+", %rax\n\tjle\t");
         }
         else{
            newTexts.put(ctx,"\tcmpq\t "+newTexts.get(ctx.cpexpr())+", %rax\n\tjle\t");
         }
      }else if(ctx.GE()!=null){
         if(localVal.containsKey(newTexts.get(ctx.cpexpr()))){
            newTexts.put(ctx,"\tcmpq\t "+localVal.get(newTexts.get(ctx.cpexpr()))+", %rax\n\tjge\t");
         }
         else{
            newTexts.put(ctx,"\tcmpq\t "+newTexts.get(ctx.cpexpr())+", %rax\n\tjge\t");
         }
      }else if(ctx.getChild(0).getText().equals("<")){
         if(localVal.containsKey(newTexts.get(ctx.cpexpr()))){
            newTexts.put(ctx,"\tcmpq\t "+localVal.get(newTexts.get(ctx.cpexpr()))+"\n\tjl\t");
         }
         else{
            newTexts.put(ctx,"\tcmpq\t "+newTexts.get(ctx.cpexpr())+", %rax\n\tjl\t");
         }
      }else if(ctx.getChild(0).getText().equals(">")){
         if(localVal.containsKey(newTexts.get(ctx.cpexpr()))){
            newTexts.put(ctx,"\tcmpq\t "+localVal.get(newTexts.get(ctx.cpexpr()))+", %rax\n\tjg\t");
         }
         else{
            newTexts.put(ctx,"\tcmpq\t "+newTexts.get(ctx.cpexpr())+", %rax\n\tjg\t");
         }
      }
      
   }
   
   @Override public void exitCpexpr(MiniCParser.CpexprContext ctx) {
      if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.arithexpr()));
      }
      if(ctx.getChildCount()==2){
         if(ctx.cpexpr1()!=null){
            String temp = "\tmovq\t "+newTexts.get(ctx.arithexpr())+", %rbx\n";
            newTexts.put(ctx , temp+newTexts.get(ctx.cpexpr1())+"  "+"%rbx\n");
         }
      }
      //System.out.println(newTexts.get(ctx));
   }
   
   @Override public void exitCpexpr1(MiniCParser.Cpexpr1Context ctx) {
      if(ctx.arithexpr()==null){
         newTexts.put(ctx,"");
      }else if(ctx.getChild(0).getText().equals("+")){
         if(localVal.containsKey(newTexts.get(ctx.arithexpr()))){
            newTexts.put(ctx,"\taddq\t "+localVal.get(newTexts.get(ctx.arithexpr())));
         }
         else{
            newTexts.put(ctx,"\taddq\t "+newTexts.get(ctx.arithexpr())+",\t"+newTexts.get(ctx.cpexpr1()));
         }
      }else if(ctx.getChild(0).getText().equals("-")){
         if(localVal.containsKey(newTexts.get(ctx.arithexpr()))){
            newTexts.put(ctx,"\tsubq\t "+localVal.get(newTexts.get(ctx.arithexpr())));
         }
         else{
            newTexts.put(ctx,"\tsubq\t "+newTexts.get(ctx.arithexpr())+newTexts.get(ctx.cpexpr1()));
         }
      }
   
   }
   
   @Override public void exitArithexpr(MiniCParser.ArithexprContext ctx) {
      
      if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.geoexpr()));
      }
      if(ctx.getChildCount()==2){
         if(ctx.arithexpr1()!=null){
            String temp = "\tmovq\t "+newTexts.get(ctx.geoexpr())+", %rbx\n";
            newTexts.put(ctx , temp+newTexts.get(ctx.arithexpr1())+"  "+"%rbx\n");
         }
      }
      //System.out.println(newTexts.get(ctx));

   }

   @Override public void exitArithexpr1(MiniCParser.Arithexpr1Context ctx) {
      if(ctx.geoexpr()==null){
         newTexts.put(ctx,"");
      }else if(ctx.getChild(0).getText().equals("*")){
         if(localVal.containsKey(newTexts.get(ctx.geoexpr()))){
            newTexts.put(ctx,"\timulq\t "+localVal.get(newTexts.get(ctx.geoexpr())));
         }
         else{
            newTexts.put(ctx,"\timulq\t "+newTexts.get(ctx.geoexpr())+",\t"+newTexts.get(ctx.arithexpr1()));
         }
      }else if(ctx.getChild(0).getText().equals("/")){
         if(localVal.containsKey(newTexts.get(ctx.geoexpr()))){
            newTexts.put(ctx,"\tidivq\t "+localVal.get(newTexts.get(ctx.geoexpr())));
         }
         else{
            newTexts.put(ctx,"\tidivq\t "+newTexts.get(ctx.geoexpr())+",\t"+newTexts.get(ctx.arithexpr1()));
         }
      }else if(ctx.getChild(0).getText().equals("%")){
         if(localVal.containsKey(newTexts.get(ctx.geoexpr()))){
            newTexts.put(ctx,"\timulq\t "+localVal.get(newTexts.get(ctx.geoexpr())));
         }
         else{
            newTexts.put(ctx,"\timulq\t "+newTexts.get(ctx.geoexpr())+",\t"+newTexts.get(ctx.arithexpr1()));
         }
      }
      //System.out.println(newTexts.get(ctx));
   }

   
   @Override public void exitGeoexpr(MiniCParser.GeoexprContext ctx) {


      if(ctx.getChild(0).getText().equals("+")){
         newTexts.put(ctx,newTexts.get(ctx.oneexpr()));
      }else if(ctx.getChild(0).getText().equals("-")){
         if(localVal.containsKey(newTexts.get(ctx.oneexpr())))
            newTexts.put(ctx,"\tnegq\t$1, "+localVal.get(newTexts.get(ctx.oneexpr())));
         else
            newTexts.put(ctx,"\tnegq\t$1, "+newTexts.get(ctx.oneexpr()));
      }else if(ctx.getChild(0).getText().equals("--")){
         if(localVal.containsKey(newTexts.get(ctx.oneexpr())))
            newTexts.put(ctx,"\tsubq\t$1, "+localVal.get(newTexts.get(ctx.oneexpr())));
         else
            newTexts.put(ctx,"\tsubq\t$1, "+newTexts.get(ctx.oneexpr()));
      }else if(ctx.getChild(0).getText().equals("++")){

         if(localVal.containsKey(newTexts.get(ctx.oneexpr())))
            newTexts.put(ctx,"\taddq\t$1, "+localVal.get(newTexts.get(ctx.oneexpr())));
         else
            newTexts.put(ctx,"\taddq\t$1, "+newTexts.get(ctx.oneexpr()));
      }else if(ctx.getChildCount()==1){
         newTexts.put(ctx,newTexts.get(ctx.oneexpr()));
      } 
      //System.out.println(newTexts.get(ctx));
   }

   @Override public void exitOneexpr(MiniCParser.OneexprContext ctx) {   
      if(ctx.LITERAL() != null){
         newTexts.put(ctx, "$"+ctx.LITERAL().getText());      
      }
      else if(ctx.IDENT() != null){
         if(localVal.containsKey(ctx.IDENT().getText())){
            newTexts.put(ctx, localVal.get(ctx.IDENT().getText()));   
         }else{
            newTexts.put(ctx, ctx.IDENT().getText());   
         }
      }
      //System.out.println(newTexts.get(ctx));
   }
   
   @Override public void exitArgs(MiniCParser.ArgsContext ctx) { }
}