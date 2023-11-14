// Generated from D:/Projects/demo-formula/src/main/java/org/jack/demo/formula/component/g4\FormulaParser.g4 by ANTLR 4.7
package com.example.g4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, LPAREN=2, RPAREN=3, COMMA=4, QUESTION=5, COLON=6, ASSIGN=7,
		ASSIGN_PLUS=8, ASSIGN_MINUS=9, ASSIGN_MUL=10, ASSIGN_DIV=11, ASSIGN_MOD=12,
		ASSIGN_BIT_SHL=13, ASSIGN_BIT_SHR=14, ASSIGN_BIT_USHR=15, ASSIGN_BIT_AND=16,
		ASSIGN_BIT_XOR=17, ASSIGN_NOT=18, IDENTICALLY_EQUAL=19, IDENTICALLY_EQUAL_NOT=20,
		EQ=21, NE=22, GT=23, LT=24, GE=25, LE=26, AND=27, OR=28, NOT=29, PLUS=30,
		DOUBLE_PLUS=31, MINUS=32, DOUBLE_MINUS=33, MUL=34, DIV=35, MOD=36, BIT_AND=37,
		BIT_OR=38, BIT_NOT=39, BIT_XOR=40, BIT_SHL=41, BIT_SHR=42, BIT_USHR=43,
		IDENTIFIER=44, INTEGER=45, INTEGER_HEX=46, FLOATING_POINT=47, STRING_DOUBLE=48,
		STRING_SINGLE=49;
	public static final int
		RULE_formula = 0, RULE_expression = 1, RULE_cellName = 2, RULE_functionCall = 3,
		RULE_functionName = 4, RULE_parameters = 5, RULE_parameter = 6;
	public static final String[] ruleNames = {
		"formula", "expression", "cellName", "functionCall", "functionName", "parameters",
		"parameter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "','", "'?'", "':'", "'='", "'+='", "'-='",
		"'*='", "'/='", "'%='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='",
		"'==='", "'!=='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'",
		"'||'", "'!'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'",
		"'|'", "'~'", "'^'", "'<<'", "'>>'", "'>>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "LPAREN", "RPAREN", "COMMA", "QUESTION", "COLON",
		"ASSIGN", "ASSIGN_PLUS", "ASSIGN_MINUS", "ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_MOD",
		"ASSIGN_BIT_SHL", "ASSIGN_BIT_SHR", "ASSIGN_BIT_USHR", "ASSIGN_BIT_AND",
		"ASSIGN_BIT_XOR", "ASSIGN_NOT", "IDENTICALLY_EQUAL", "IDENTICALLY_EQUAL_NOT",
		"EQ", "NE", "GT", "LT", "GE", "LE", "AND", "OR", "NOT", "PLUS", "DOUBLE_PLUS",
		"MINUS", "DOUBLE_MINUS", "MUL", "DIV", "MOD", "BIT_AND", "BIT_OR", "BIT_NOT",
		"BIT_XOR", "BIT_SHL", "BIT_SHR", "BIT_USHR", "IDENTIFIER", "INTEGER",
		"INTEGER_HEX", "FLOATING_POINT", "STRING_DOUBLE", "STRING_SINGLE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FormulaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormulaContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CellNameContext cellName() {
			return getRuleContext(CellNameContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(FormulaParser.INTEGER, 0); }
		public TerminalNode INTEGER_HEX() { return getToken(FormulaParser.INTEGER_HEX, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(FormulaParser.FLOATING_POINT, 0); }
		public TerminalNode STRING_DOUBLE() { return getToken(FormulaParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_SINGLE() { return getToken(FormulaParser.STRING_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(FormulaParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(FormulaParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(FormulaParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(FormulaParser.BIT_NOT, 0); }
		public TerminalNode PLUS() { return getToken(FormulaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FormulaParser.MINUS, 0); }
		public TerminalNode DOUBLE_PLUS() { return getToken(FormulaParser.DOUBLE_PLUS, 0); }
		public TerminalNode DOUBLE_MINUS() { return getToken(FormulaParser.DOUBLE_MINUS, 0); }
		public TerminalNode MUL() { return getToken(FormulaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FormulaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FormulaParser.MOD, 0); }
		public TerminalNode BIT_SHL() { return getToken(FormulaParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(FormulaParser.BIT_SHR, 0); }
		public TerminalNode BIT_USHR() { return getToken(FormulaParser.BIT_USHR, 0); }
		public TerminalNode LT() { return getToken(FormulaParser.LT, 0); }
		public TerminalNode LE() { return getToken(FormulaParser.LE, 0); }
		public TerminalNode GT() { return getToken(FormulaParser.GT, 0); }
		public TerminalNode GE() { return getToken(FormulaParser.GE, 0); }
		public TerminalNode EQ() { return getToken(FormulaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(FormulaParser.NE, 0); }
		public TerminalNode IDENTICALLY_EQUAL() { return getToken(FormulaParser.IDENTICALLY_EQUAL, 0); }
		public TerminalNode IDENTICALLY_EQUAL_NOT() { return getToken(FormulaParser.IDENTICALLY_EQUAL_NOT, 0); }
		public TerminalNode BIT_AND() { return getToken(FormulaParser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(FormulaParser.BIT_XOR, 0); }
		public TerminalNode BIT_OR() { return getToken(FormulaParser.BIT_OR, 0); }
		public TerminalNode AND() { return getToken(FormulaParser.AND, 0); }
		public TerminalNode OR() { return getToken(FormulaParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(FormulaParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(FormulaParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(17);
				functionCall();
				}
				break;
			case 2:
				{
				setState(18);
				cellName();
				}
				break;
			case 3:
				{
				setState(19);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(20);
				match(INTEGER_HEX);
				}
				break;
			case 5:
				{
				setState(21);
				match(FLOATING_POINT);
				}
				break;
			case 6:
				{
				setState(22);
				match(STRING_DOUBLE);
				}
				break;
			case 7:
				{
				setState(23);
				match(STRING_SINGLE);
				}
				break;
			case 8:
				{
				setState(24);
				match(LPAREN);
				setState(25);
				expression(0);
				setState(26);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(28);
				match(NOT);
				setState(29);
				expression(29);
				}
				break;
			case 10:
				{
				setState(30);
				match(BIT_NOT);
				setState(31);
				expression(28);
				}
				break;
			case 11:
				{
				setState(32);
				match(PLUS);
				setState(33);
				expression(27);
				}
				break;
			case 12:
				{
				setState(34);
				match(MINUS);
				setState(35);
				expression(26);
				}
				break;
			case 13:
				{
				setState(36);
				match(DOUBLE_PLUS);
				setState(37);
				expression(25);
				}
				break;
			case 14:
				{
				setState(38);
				match(DOUBLE_MINUS);
				setState(39);
				expression(24);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(42);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(43);
						match(MUL);
						setState(44);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(45);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(46);
						match(DIV);
						setState(47);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(49);
						match(MOD);
						setState(50);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(52);
						match(PLUS);
						setState(53);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(55);
						match(MINUS);
						setState(56);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(58);
						match(BIT_SHL);
						setState(59);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(61);
						match(BIT_SHR);
						setState(62);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(64);
						match(BIT_USHR);
						setState(65);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(67);
						match(LT);
						setState(68);
						expression(16);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(69);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(70);
						match(LE);
						setState(71);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(73);
						match(GT);
						setState(74);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(76);
						match(GE);
						setState(77);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(79);
						match(EQ);
						setState(80);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(82);
						match(NE);
						setState(83);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(85);
						match(IDENTICALLY_EQUAL);
						setState(86);
						expression(10);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						match(IDENTICALLY_EQUAL_NOT);
						setState(89);
						expression(9);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(91);
						match(BIT_AND);
						setState(92);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						match(BIT_XOR);
						setState(95);
						expression(7);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						match(BIT_OR);
						setState(98);
						expression(6);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(AND);
						setState(101);
						expression(5);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(OR);
						setState(104);
						expression(4);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(106);
						match(QUESTION);
						setState(107);
						expression(0);
						setState(108);
						match(COLON);
						setState(109);
						expression(3);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(112);
						match(IDENTICALLY_EQUAL_NOT);
						setState(113);
						expression(2);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(115);
						match(DOUBLE_PLUS);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(117);
						match(DOUBLE_MINUS);
						}
						break;
					}
					}
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CellNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FormulaParser.IDENTIFIER, 0); }
		public CellNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitCellName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellNameContext cellName() throws RecognitionException {
		CellNameContext _localctx = new CellNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cellName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENTIFIER);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FormulaParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FormulaParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			functionName();
			setState(126);
			match(LPAREN);
			setState(127);
			parameters();
			setState(128);
			match(RPAREN);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FormulaParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFIER);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NOT) | (1L << PLUS) | (1L << DOUBLE_PLUS) | (1L << MINUS) | (1L << DOUBLE_MINUS) | (1L << BIT_NOT) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << INTEGER_HEX) | (1L << FLOATING_POINT) | (1L << STRING_DOUBLE) | (1L << STRING_SINGLE))) != 0)) {
				{
				{
				setState(132);
				parameter();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FormulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FormulaParser.COMMA, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaParserVisitor ) return ((FormulaParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expression(0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				expression(0);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 5);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		case 23:
			return precpred(_ctx, 31);
		case 24:
			return precpred(_ctx, 30);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3y\n\3\f\3\16\3|\13\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\7\7\u0088\n\7\f\7\16\7\u008b"+
		"\13\7\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093\13\b\3\b\2\3\4\t\2\4\6"+
		"\b\n\f\16\2\2\2\u00b5\2\20\3\2\2\2\4*\3\2\2\2\6}\3\2\2\2\b\177\3\2\2\2"+
		"\n\u0084\3\2\2\2\f\u0089\3\2\2\2\16\u008c\3\2\2\2\20\21\5\4\3\2\21\3\3"+
		"\2\2\2\22\23\b\3\1\2\23+\5\b\5\2\24+\5\6\4\2\25+\7/\2\2\26+\7\60\2\2\27"+
		"+\7\61\2\2\30+\7\62\2\2\31+\7\63\2\2\32\33\7\4\2\2\33\34\5\4\3\2\34\35"+
		"\7\5\2\2\35+\3\2\2\2\36\37\7\37\2\2\37+\5\4\3\37 !\7)\2\2!+\5\4\3\36\""+
		"#\7 \2\2#+\5\4\3\35$%\7\"\2\2%+\5\4\3\34&\'\7!\2\2\'+\5\4\3\33()\7#\2"+
		"\2)+\5\4\3\32*\22\3\2\2\2*\24\3\2\2\2*\25\3\2\2\2*\26\3\2\2\2*\27\3\2"+
		"\2\2*\30\3\2\2\2*\31\3\2\2\2*\32\3\2\2\2*\36\3\2\2\2* \3\2\2\2*\"\3\2"+
		"\2\2*$\3\2\2\2*&\3\2\2\2*(\3\2\2\2+z\3\2\2\2,-\f\31\2\2-.\7$\2\2.y\5\4"+
		"\3\32/\60\f\30\2\2\60\61\7%\2\2\61y\5\4\3\31\62\63\f\27\2\2\63\64\7&\2"+
		"\2\64y\5\4\3\30\65\66\f\26\2\2\66\67\7 \2\2\67y\5\4\3\2789\f\25\2\29:"+
		"\7\"\2\2:y\5\4\3\26;<\f\24\2\2<=\7+\2\2=y\5\4\3\25>?\f\23\2\2?@\7,\2\2"+
		"@y\5\4\3\24AB\f\22\2\2BC\7-\2\2Cy\5\4\3\23DE\f\21\2\2EF\7\32\2\2Fy\5\4"+
		"\3\22GH\f\20\2\2HI\7\34\2\2Iy\5\4\3\21JK\f\17\2\2KL\7\31\2\2Ly\5\4\3\20"+
		"MN\f\16\2\2NO\7\33\2\2Oy\5\4\3\17PQ\f\r\2\2QR\7\27\2\2Ry\5\4\3\16ST\f"+
		"\f\2\2TU\7\30\2\2Uy\5\4\3\rVW\f\13\2\2WX\7\25\2\2Xy\5\4\3\fYZ\f\n\2\2"+
		"Z[\7\26\2\2[y\5\4\3\13\\]\f\t\2\2]^\7\'\2\2^y\5\4\3\n_`\f\b\2\2`a\7*\2"+
		"\2ay\5\4\3\tbc\f\7\2\2cd\7(\2\2dy\5\4\3\bef\f\6\2\2fg\7\35\2\2gy\5\4\3"+
		"\7hi\f\5\2\2ij\7\36\2\2jy\5\4\3\6kl\f\4\2\2lm\7\7\2\2mn\5\4\3\2no\7\b"+
		"\2\2op\5\4\3\5py\3\2\2\2qr\f\3\2\2rs\7\26\2\2sy\5\4\3\4tu\f!\2\2uy\7!"+
		"\2\2vw\f \2\2wy\7#\2\2x,\3\2\2\2x/\3\2\2\2x\62\3\2\2\2x\65\3\2\2\2x8\3"+
		"\2\2\2x;\3\2\2\2x>\3\2\2\2xA\3\2\2\2xD\3\2\2\2xG\3\2\2\2xJ\3\2\2\2xM\3"+
		"\2\2\2xP\3\2\2\2xS\3\2\2\2xV\3\2\2\2xY\3\2\2\2x\\\3\2\2\2x_\3\2\2\2xb"+
		"\3\2\2\2xe\3\2\2\2xh\3\2\2\2xk\3\2\2\2xq\3\2\2\2xt\3\2\2\2xv\3\2\2\2y"+
		"|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|z\3\2\2\2}~\7.\2\2~\7\3\2\2\2"+
		"\177\u0080\5\n\6\2\u0080\u0081\7\4\2\2\u0081\u0082\5\f\7\2\u0082\u0083"+
		"\7\5\2\2\u0083\t\3\2\2\2\u0084\u0085\7.\2\2\u0085\13\3\2\2\2\u0086\u0088"+
		"\5\16\b\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\r\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0091\5"+
		"\4\3\2\u008d\u008e\7\6\2\2\u008e\u0090\5\4\3\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\17\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\7*xz\u0089\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
