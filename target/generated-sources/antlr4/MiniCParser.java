// Generated from MiniC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, VOID=20, INT=21, WHILE=22, IF=23, ELSE=24, 
		RETURN=25, FOR=26, SWITCH=27, CASE=28, OR=29, AND=30, BREAK=31, CONTINUE=32, 
		LE=33, GE=34, EQ=35, NE=36, IDENT=37, LITERAL=38, DecimalConstant=39, 
		OctalConstant=40, HexadecimalConstant=41, WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "':'", "'{'", "'['", "';'", "'++'", "'--'", "'<'", 
		"'}'", "']'", "'='", "'>'", "'%'", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'void'", "'int'", "'while'", "'if'", "'else'", "'return'", "'for'", 
		"'switch'", "'case'", "'or'", "'and'", "'break'", "'continue'", "'<='", 
		"'>='", "'=='", "'!='", "IDENT", "LITERAL", "DecimalConstant", "OctalConstant", 
		"HexadecimalConstant", "WS"
	};
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_fun_decl = 4, RULE_params = 5, RULE_param = 6, RULE_stmt = 7, RULE_switch_stmt = 8, 
		RULE_case_stmt = 9, RULE_while_stmt = 10, RULE_for_stmt = 11, RULE_compound_stmt = 12, 
		RULE_local_decl = 13, RULE_if_stmt = 14, RULE_return_stmt = 15, RULE_expr_stmt = 16, 
		RULE_expr = 17, RULE_expr1 = 18, RULE_orexpr = 19, RULE_orexpr1 = 20, 
		RULE_andexpr = 21, RULE_andexpr1 = 22, RULE_eqexpr = 23, RULE_eqexpr1 = 24, 
		RULE_cpexpr = 25, RULE_cpexpr1 = 26, RULE_arithexpr = 27, RULE_arithexpr1 = 28, 
		RULE_geoexpr = 29, RULE_oneexpr = 30, RULE_args = 31;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
		"stmt", "switch_stmt", "case_stmt", "while_stmt", "for_stmt", "compound_stmt", 
		"local_decl", "if_stmt", "return_stmt", "expr_stmt", "expr", "expr1", 
		"orexpr", "orexpr1", "andexpr", "andexpr1", "eqexpr", "eqexpr1", "cpexpr", 
		"cpexpr1", "arithexpr", "arithexpr1", "geoexpr", "oneexpr", "args"
	};

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); decl();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID || _la==INT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); fun_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); type_spec();
				setState(74); match(IDENT);
				setState(75); match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); type_spec();
				setState(78); match(IDENT);
				setState(79); match(T__8);
				setState(80); match(LITERAL);
				setState(81); match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); type_spec();
				setState(84); match(IDENT);
				setState(85); match(T__15);
				setState(86); match(LITERAL);
				setState(87); match(T__9);
				setState(88); match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public TerminalNode INT() { return getToken(MiniCParser.INT, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); type_spec();
			setState(95); match(IDENT);
			setState(96); match(T__5);
			setState(97); params();
			setState(98); match(T__4);
			setState(99); compound_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); param();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(102); match(T__1);
					setState(103); param();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(VOID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); type_spec();
				setState(114); match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); type_spec();
				setState(117); match(IDENT);
				setState(118); match(T__15);
				setState(119); match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public Case_stmtContext case_stmt() {
			return getRuleContext(Case_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case T__13:
			case T__12:
			case T__5:
			case T__2:
			case T__0:
			case BREAK:
			case CONTINUE:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); expr_stmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(127); for_stmt();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(128); switch_stmt();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 7);
				{
				setState(129); case_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(130); return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(MiniCParser.SWITCH, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitSwitch_stmt(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(SWITCH);
			setState(134); match(T__5);
			setState(135); expr();
			setState(136); match(T__4);
			setState(137); stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_stmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MiniCParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext expr_stmt(int i) {
			return getRuleContext(Expr_stmtContext.class,i);
		}
		public List<Expr_stmtContext> expr_stmt() {
			return getRuleContexts(Expr_stmtContext.class);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCase_stmt(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(CASE);
			setState(140); expr();
			setState(141); match(T__17);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142); expr_stmt();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniCParser.WHILE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(WHILE);
			setState(149); match(T__5);
			setState(150); expr();
			setState(151); match(T__4);
			setState(152); stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FOR() { return getToken(MiniCParser.FOR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(FOR);
			setState(155); match(T__5);
			setState(156); expr();
			setState(157); match(T__14);
			setState(158); expr();
			setState(159); match(T__14);
			setState(160); expr();
			setState(161); match(T__4);
			setState(162); stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(T__16);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==INT) {
				{
				{
				setState(165); local_decl();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__12) | (1L << T__5) | (1L << T__2) | (1L << T__0) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << FOR) | (1L << SWITCH) | (1L << CASE) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(171); stmt();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitLocal_decl(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_local_decl);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); type_spec();
				setState(180); match(IDENT);
				setState(181); match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); type_spec();
				setState(184); match(IDENT);
				setState(185); match(T__8);
				setState(186); match(LITERAL);
				setState(187); match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); type_spec();
				setState(190); match(IDENT);
				setState(191); match(T__15);
				setState(192); match(LITERAL);
				setState(193); match(T__9);
				setState(194); match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MiniCParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MiniCParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_stmt);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); match(IF);
				setState(199); match(T__5);
				setState(200); expr();
				setState(201); match(T__4);
				setState(202); stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(IF);
				setState(205); match(T__5);
				setState(206); expr();
				setState(207); match(T__4);
				setState(208); stmt();
				setState(209); match(ELSE);
				setState(210); stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_stmt);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); match(RETURN);
				setState(215); match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); match(RETURN);
				setState(217); expr();
				setState(218); match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MiniCParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MiniCParser.CONTINUE, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_stmt);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case T__13:
			case T__12:
			case T__5:
			case T__2:
			case T__0:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); expr();
				setState(223); match(T__14);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); match(BREAK);
				setState(226); match(T__14);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(227); match(CONTINUE);
				setState(228); match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrexprContext orexpr() {
			return getRuleContext(OrexprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(IDENT);
				setState(232); match(T__8);
				setState(233); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(IDENT);
				setState(235); match(T__15);
				setState(236); expr();
				setState(237); match(T__9);
				setState(238); match(T__8);
				setState(239); expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); orexpr();
				setState(242); expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244); orexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public OrexprContext orexpr() {
			return getRuleContext(OrexprContext.class,0);
		}
		public TerminalNode OR() { return getToken(MiniCParser.OR, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr1);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); match(OR);
				setState(248); orexpr();
				setState(249); expr1();
				}
				break;
			case T__17:
			case T__14:
			case T__9:
			case T__4:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrexprContext extends ParserRuleContext {
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public Orexpr1Context orexpr1() {
			return getRuleContext(Orexpr1Context.class,0);
		}
		public OrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterOrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitOrexpr(this);
		}
	}

	public final OrexprContext orexpr() throws RecognitionException {
		OrexprContext _localctx = new OrexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orexpr);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); andexpr();
				setState(255); orexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); andexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orexpr1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MiniCParser.AND, 0); }
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public Orexpr1Context orexpr1() {
			return getRuleContext(Orexpr1Context.class,0);
		}
		public Orexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterOrexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitOrexpr1(this);
		}
	}

	public final Orexpr1Context orexpr1() throws RecognitionException {
		Orexpr1Context _localctx = new Orexpr1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_orexpr1);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); match(AND);
				setState(261); andexpr();
				setState(262); orexpr1();
				}
				break;
			case T__17:
			case T__14:
			case T__9:
			case T__4:
			case T__1:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndexprContext extends ParserRuleContext {
		public EqexprContext eqexpr() {
			return getRuleContext(EqexprContext.class,0);
		}
		public Andexpr1Context andexpr1() {
			return getRuleContext(Andexpr1Context.class,0);
		}
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitAndexpr(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		AndexprContext _localctx = new AndexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andexpr);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); eqexpr();
				setState(268); andexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); eqexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Andexpr1Context extends ParserRuleContext {
		public EqexprContext eqexpr() {
			return getRuleContext(EqexprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MiniCParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MiniCParser.NE, 0); }
		public Andexpr1Context andexpr1() {
			return getRuleContext(Andexpr1Context.class,0);
		}
		public Andexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterAndexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitAndexpr1(this);
		}
	}

	public final Andexpr1Context andexpr1() throws RecognitionException {
		Andexpr1Context _localctx = new Andexpr1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_andexpr1);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); match(EQ);
				setState(274); eqexpr();
				setState(275); andexpr1();
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277); match(NE);
				setState(278); eqexpr();
				setState(279); andexpr1();
				}
				break;
			case T__17:
			case T__14:
			case T__9:
			case T__4:
			case T__1:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqexprContext extends ParserRuleContext {
		public Eqexpr1Context eqexpr1() {
			return getRuleContext(Eqexpr1Context.class,0);
		}
		public CpexprContext cpexpr() {
			return getRuleContext(CpexprContext.class,0);
		}
		public EqexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterEqexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitEqexpr(this);
		}
	}

	public final EqexprContext eqexpr() throws RecognitionException {
		EqexprContext _localctx = new EqexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eqexpr);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); cpexpr();
				setState(285); eqexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); cpexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eqexpr1Context extends ParserRuleContext {
		public TerminalNode GE() { return getToken(MiniCParser.GE, 0); }
		public Eqexpr1Context eqexpr1() {
			return getRuleContext(Eqexpr1Context.class,0);
		}
		public CpexprContext cpexpr() {
			return getRuleContext(CpexprContext.class,0);
		}
		public TerminalNode LE() { return getToken(MiniCParser.LE, 0); }
		public Eqexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterEqexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitEqexpr1(this);
		}
	}

	public final Eqexpr1Context eqexpr1() throws RecognitionException {
		Eqexpr1Context _localctx = new Eqexpr1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_eqexpr1);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case LE:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(LE);
				setState(291); cpexpr();
				setState(292); eqexpr1();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); match(T__11);
				setState(295); cpexpr();
				setState(296); eqexpr1();
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 3);
				{
				setState(298); match(GE);
				setState(299); cpexpr();
				setState(300); eqexpr1();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(302); match(T__7);
				setState(303); cpexpr();
				setState(304); eqexpr1();
				}
				break;
			case T__17:
			case T__14:
			case T__9:
			case T__4:
			case T__1:
			case OR:
			case AND:
			case EQ:
			case NE:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CpexprContext extends ParserRuleContext {
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public Cpexpr1Context cpexpr1() {
			return getRuleContext(Cpexpr1Context.class,0);
		}
		public CpexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCpexpr(this);
		}
	}

	public final CpexprContext cpexpr() throws RecognitionException {
		CpexprContext _localctx = new CpexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cpexpr);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); arithexpr();
				setState(310); cpexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); arithexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpexpr1Context extends ParserRuleContext {
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public Cpexpr1Context cpexpr1() {
			return getRuleContext(Cpexpr1Context.class,0);
		}
		public Cpexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCpexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCpexpr1(this);
		}
	}

	public final Cpexpr1Context cpexpr1() throws RecognitionException {
		Cpexpr1Context _localctx = new Cpexpr1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_cpexpr1);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); match(T__2);
				setState(316); arithexpr();
				setState(317); cpexpr1();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(T__0);
				setState(320); arithexpr();
				setState(321); cpexpr1();
				}
				break;
			case T__17:
			case T__14:
			case T__11:
			case T__9:
			case T__7:
			case T__4:
			case T__1:
			case OR:
			case AND:
			case LE:
			case GE:
			case EQ:
			case NE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithexprContext extends ParserRuleContext {
		public GeoexprContext geoexpr() {
			return getRuleContext(GeoexprContext.class,0);
		}
		public Arithexpr1Context arithexpr1() {
			return getRuleContext(Arithexpr1Context.class,0);
		}
		public ArithexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterArithexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitArithexpr(this);
		}
	}

	public final ArithexprContext arithexpr() throws RecognitionException {
		ArithexprContext _localctx = new ArithexprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithexpr);
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); geoexpr();
				setState(327); arithexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); geoexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithexpr1Context extends ParserRuleContext {
		public GeoexprContext geoexpr() {
			return getRuleContext(GeoexprContext.class,0);
		}
		public Arithexpr1Context arithexpr1() {
			return getRuleContext(Arithexpr1Context.class,0);
		}
		public Arithexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterArithexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitArithexpr1(this);
		}
	}

	public final Arithexpr1Context arithexpr1() throws RecognitionException {
		Arithexpr1Context _localctx = new Arithexpr1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_arithexpr1);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); match(T__3);
				setState(333); geoexpr();
				setState(334); arithexpr1();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); match(T__18);
				setState(337); geoexpr();
				setState(338); arithexpr1();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(340); match(T__6);
				setState(341); geoexpr();
				setState(342); arithexpr1();
				}
				break;
			case T__17:
			case T__14:
			case T__11:
			case T__9:
			case T__7:
			case T__4:
			case T__2:
			case T__1:
			case T__0:
			case OR:
			case AND:
			case LE:
			case GE:
			case EQ:
			case NE:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeoexprContext extends ParserRuleContext {
		public OneexprContext oneexpr() {
			return getRuleContext(OneexprContext.class,0);
		}
		public GeoexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterGeoexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitGeoexpr(this);
		}
	}

	public final GeoexprContext geoexpr() throws RecognitionException {
		GeoexprContext _localctx = new GeoexprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_geoexpr);
		try {
			setState(356);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(347); match(T__0);
				setState(348); oneexpr();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349); match(T__2);
				setState(350); oneexpr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(351); match(T__12);
				setState(352); oneexpr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(353); match(T__13);
				setState(354); oneexpr();
				}
				break;
			case T__5:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(355); oneexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OneexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OneexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterOneexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitOneexpr(this);
		}
	}

	public final OneexprContext oneexpr() throws RecognitionException {
		OneexprContext _localctx = new OneexprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oneexpr);
		try {
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358); match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); match(T__5);
				setState(360); expr();
				setState(361); match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363); match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364); match(IDENT);
				setState(365); match(T__15);
				setState(366); expr();
				setState(367); match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369); match(IDENT);
				setState(370); match(T__5);
				setState(371); args();
				setState(372); match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_args);
		int _la;
		try {
			setState(385);
			switch (_input.LA(1)) {
			case T__13:
			case T__12:
			case T__5:
			case T__2:
			case T__0:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(376); expr();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(377); match(T__1);
					setState(378); expr();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\5\7r\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"\u0092\n\13\f\13\16\13\u0095\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16\u00a9\n\16\f\16\16\16\u00ac"+
		"\13\16\3\16\7\16\u00af\n\16\f\16\16\16\u00b2\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00df\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f8"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00ff\n\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0105\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u010c\n\26\3\27\3\27\3\27\3"+
		"\27\5\27\u0112\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u011d\n\30\3\31\3\31\3\31\3\31\5\31\u0123\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0136"+
		"\n\32\3\33\3\33\3\33\3\33\5\33\u013c\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0147\n\34\3\35\3\35\3\35\3\35\5\35\u014d\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015c"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0167\n\37\3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0179\n \3!\3!\3!\7!"+
		"\u017e\n!\f!\16!\u0181\13!\3!\5!\u0184\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\3\3\2\26\27\u019c\2C\3"+
		"\2\2\2\4I\3\2\2\2\6\\\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fq\3\2\2\2\16{\3\2"+
		"\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u008d\3\2\2\2\26\u0096\3\2\2"+
		"\2\30\u009c\3\2\2\2\32\u00a6\3\2\2\2\34\u00c6\3\2\2\2\36\u00d6\3\2\2\2"+
		" \u00de\3\2\2\2\"\u00e7\3\2\2\2$\u00f7\3\2\2\2&\u00fe\3\2\2\2(\u0104\3"+
		"\2\2\2*\u010b\3\2\2\2,\u0111\3\2\2\2.\u011c\3\2\2\2\60\u0122\3\2\2\2\62"+
		"\u0135\3\2\2\2\64\u013b\3\2\2\2\66\u0146\3\2\2\28\u014c\3\2\2\2:\u015b"+
		"\3\2\2\2<\u0166\3\2\2\2>\u0178\3\2\2\2@\u0183\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GJ\5\6\4\2HJ\5\n\6\2IG\3"+
		"\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\5\b\5\2LM\7\'\2\2MN\7\7\2\2N]\3\2\2\2OP"+
		"\5\b\5\2PQ\7\'\2\2QR\7\r\2\2RS\7(\2\2ST\7\7\2\2T]\3\2\2\2UV\5\b\5\2VW"+
		"\7\'\2\2WX\7\6\2\2XY\7(\2\2YZ\7\f\2\2Z[\7\7\2\2[]\3\2\2\2\\K\3\2\2\2\\"+
		"O\3\2\2\2\\U\3\2\2\2]\7\3\2\2\2^_\t\2\2\2_\t\3\2\2\2`a\5\b\5\2ab\7\'\2"+
		"\2bc\7\20\2\2cd\5\f\7\2de\7\21\2\2ef\5\32\16\2f\13\3\2\2\2gl\5\16\b\2"+
		"hi\7\24\2\2ik\5\16\b\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mr\3\2\2"+
		"\2nl\3\2\2\2or\7\26\2\2pr\3\2\2\2qg\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\r\3\2"+
		"\2\2st\5\b\5\2tu\7\'\2\2u|\3\2\2\2vw\5\b\5\2wx\7\'\2\2xy\7\6\2\2yz\7\f"+
		"\2\2z|\3\2\2\2{s\3\2\2\2{v\3\2\2\2|\17\3\2\2\2}\u0086\5\"\22\2~\u0086"+
		"\5\32\16\2\177\u0086\5\36\20\2\u0080\u0086\5\26\f\2\u0081\u0086\5\30\r"+
		"\2\u0082\u0086\5\22\n\2\u0083\u0086\5\24\13\2\u0084\u0086\5 \21\2\u0085"+
		"}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081"+
		"\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\21\3\2\2\2\u0087\u0088\7\35\2\2\u0088\u0089\7\20\2\2\u0089\u008a\5$\23"+
		"\2\u008a\u008b\7\21\2\2\u008b\u008c\5\20\t\2\u008c\23\3\2\2\2\u008d\u008e"+
		"\7\36\2\2\u008e\u008f\5$\23\2\u008f\u0093\7\4\2\2\u0090\u0092\5\"\22\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\25\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\30\2\2\u0097"+
		"\u0098\7\20\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\21\2\2\u009a\u009b\5"+
		"\20\t\2\u009b\27\3\2\2\2\u009c\u009d\7\34\2\2\u009d\u009e\7\20\2\2\u009e"+
		"\u009f\5$\23\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\7"+
		"\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\5\20\t\2\u00a5"+
		"\31\3\2\2\2\u00a6\u00aa\7\5\2\2\u00a7\u00a9\5\34\17\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00b0\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\20\t\2\u00ae\u00ad\3"+
		"\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\13\2\2\u00b4\33\3\2\2"+
		"\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\7\'\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00c7"+
		"\3\2\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\7\'\2\2\u00bb\u00bc\7\r\2\2\u00bc"+
		"\u00bd\7(\2\2\u00bd\u00be\7\7\2\2\u00be\u00c7\3\2\2\2\u00bf\u00c0\5\b"+
		"\5\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7(\2\2\u00c3"+
		"\u00c4\7\f\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00b5\3\2"+
		"\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c9"+
		"\7\31\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cc\7\21\2"+
		"\2\u00cc\u00cd\5\20\t\2\u00cd\u00d7\3\2\2\2\u00ce\u00cf\7\31\2\2\u00cf"+
		"\u00d0\7\20\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\5"+
		"\20\t\2\u00d3\u00d4\7\32\2\2\u00d4\u00d5\5\20\t\2\u00d5\u00d7\3\2\2\2"+
		"\u00d6\u00c8\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d7\37\3\2\2\2\u00d8\u00d9"+
		"\7\33\2\2\u00d9\u00df\7\7\2\2\u00da\u00db\7\33\2\2\u00db\u00dc\5$\23\2"+
		"\u00dc\u00dd\7\7\2\2\u00dd\u00df\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00da"+
		"\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e1\5$\23\2\u00e1\u00e2\7\7\2\2\u00e2"+
		"\u00e8\3\2\2\2\u00e3\u00e4\7!\2\2\u00e4\u00e8\7\7\2\2\u00e5\u00e6\7\""+
		"\2\2\u00e6\u00e8\7\7\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\7\r\2\2"+
		"\u00eb\u00f8\5$\23\2\u00ec\u00ed\7\'\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef"+
		"\5$\23\2\u00ef\u00f0\7\f\2\2\u00f0\u00f1\7\r\2\2\u00f1\u00f2\5$\23\2\u00f2"+
		"\u00f8\3\2\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\5&\24\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f8\5(\25\2\u00f7\u00e9\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7"+
		"\u00f3\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8%\3\2\2\2\u00f9\u00fa\7\37\2\2"+
		"\u00fa\u00fb\5(\25\2\u00fb\u00fc\5&\24\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\'\3\2\2\2\u0100"+
		"\u0101\5,\27\2\u0101\u0102\5*\26\2\u0102\u0105\3\2\2\2\u0103\u0105\5,"+
		"\27\2\u0104\u0100\3\2\2\2\u0104\u0103\3\2\2\2\u0105)\3\2\2\2\u0106\u0107"+
		"\7 \2\2\u0107\u0108\5,\27\2\u0108\u0109\5*\26\2\u0109\u010c\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u010a\3\2\2\2\u010c+\3\2\2\2"+
		"\u010d\u010e\5\60\31\2\u010e\u010f\5.\30\2\u010f\u0112\3\2\2\2\u0110\u0112"+
		"\5\60\31\2\u0111\u010d\3\2\2\2\u0111\u0110\3\2\2\2\u0112-\3\2\2\2\u0113"+
		"\u0114\7%\2\2\u0114\u0115\5\60\31\2\u0115\u0116\5.\30\2\u0116\u011d\3"+
		"\2\2\2\u0117\u0118\7&\2\2\u0118\u0119\5\60\31\2\u0119\u011a\5.\30\2\u011a"+
		"\u011d\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0113\3\2\2\2\u011c\u0117\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011d/\3\2\2\2\u011e\u011f\5\64\33\2\u011f\u0120"+
		"\5\62\32\2\u0120\u0123\3\2\2\2\u0121\u0123\5\64\33\2\u0122\u011e\3\2\2"+
		"\2\u0122\u0121\3\2\2\2\u0123\61\3\2\2\2\u0124\u0125\7#\2\2\u0125\u0126"+
		"\5\64\33\2\u0126\u0127\5\62\32\2\u0127\u0136\3\2\2\2\u0128\u0129\7\n\2"+
		"\2\u0129\u012a\5\64\33\2\u012a\u012b\5\62\32\2\u012b\u0136\3\2\2\2\u012c"+
		"\u012d\7$\2\2\u012d\u012e\5\64\33\2\u012e\u012f\5\62\32\2\u012f\u0136"+
		"\3\2\2\2\u0130\u0131\7\16\2\2\u0131\u0132\5\64\33\2\u0132\u0133\5\62\32"+
		"\2\u0133\u0136\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0124\3\2\2\2\u0135\u0128"+
		"\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\63\3\2\2\2\u0137\u0138\58\35\2\u0138\u0139\5\66\34\2\u0139\u013c\3\2"+
		"\2\2\u013a\u013c\58\35\2\u013b\u0137\3\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\65\3\2\2\2\u013d\u013e\7\23\2\2\u013e\u013f\58\35\2\u013f\u0140\5\66"+
		"\34\2\u0140\u0147\3\2\2\2\u0141\u0142\7\25\2\2\u0142\u0143\58\35\2\u0143"+
		"\u0144\5\66\34\2\u0144\u0147\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u013d\3"+
		"\2\2\2\u0146\u0141\3\2\2\2\u0146\u0145\3\2\2\2\u0147\67\3\2\2\2\u0148"+
		"\u0149\5<\37\2\u0149\u014a\5:\36\2\u014a\u014d\3\2\2\2\u014b\u014d\5<"+
		"\37\2\u014c\u0148\3\2\2\2\u014c\u014b\3\2\2\2\u014d9\3\2\2\2\u014e\u014f"+
		"\7\22\2\2\u014f\u0150\5<\37\2\u0150\u0151\5:\36\2\u0151\u015c\3\2\2\2"+
		"\u0152\u0153\7\3\2\2\u0153\u0154\5<\37\2\u0154\u0155\5:\36\2\u0155\u015c"+
		"\3\2\2\2\u0156\u0157\7\17\2\2\u0157\u0158\5<\37\2\u0158\u0159\5:\36\2"+
		"\u0159\u015c\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u014e\3\2\2\2\u015b\u0152"+
		"\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u015a\3\2\2\2\u015c;\3\2\2\2\u015d"+
		"\u015e\7\25\2\2\u015e\u0167\5> \2\u015f\u0160\7\23\2\2\u0160\u0167\5>"+
		" \2\u0161\u0162\7\t\2\2\u0162\u0167\5> \2\u0163\u0164\7\b\2\2\u0164\u0167"+
		"\5> \2\u0165\u0167\5> \2\u0166\u015d\3\2\2\2\u0166\u015f\3\2\2\2\u0166"+
		"\u0161\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0165\3\2\2\2\u0167=\3\2\2\2"+
		"\u0168\u0179\7(\2\2\u0169\u016a\7\20\2\2\u016a\u016b\5$\23\2\u016b\u016c"+
		"\7\21\2\2\u016c\u0179\3\2\2\2\u016d\u0179\7\'\2\2\u016e\u016f\7\'\2\2"+
		"\u016f\u0170\7\6\2\2\u0170\u0171\5$\23\2\u0171\u0172\7\f\2\2\u0172\u0179"+
		"\3\2\2\2\u0173\u0174\7\'\2\2\u0174\u0175\7\20\2\2\u0175\u0176\5@!\2\u0176"+
		"\u0177\7\21\2\2\u0177\u0179\3\2\2\2\u0178\u0168\3\2\2\2\u0178\u0169\3"+
		"\2\2\2\u0178\u016d\3\2\2\2\u0178\u016e\3\2\2\2\u0178\u0173\3\2\2\2\u0179"+
		"?\3\2\2\2\u017a\u017f\5$\23\2\u017b\u017c\7\24\2\2\u017c\u017e\5$\23\2"+
		"\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u017a\3\2\2\2\u0183\u0182\3\2\2\2\u0184A\3\2\2\2 EI\\lq{\u0085\u0093"+
		"\u00aa\u00b0\u00c6\u00d6\u00de\u00e7\u00f7\u00fe\u0104\u010b\u0111\u011c"+
		"\u0122\u0135\u013b\u0146\u014c\u015b\u0166\u0178\u017f\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}