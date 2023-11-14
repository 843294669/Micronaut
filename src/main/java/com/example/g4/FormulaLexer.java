// Generated from D:/Projects/demo-formula/src/main/java/org/jack/demo/formula/component/g4\FormulaLexer.g4 by ANTLR 4.7
package com.example.g4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "LPAREN", "RPAREN", "COMMA", "QUESTION", "COLON", "ASSIGN",
		"ASSIGN_PLUS", "ASSIGN_MINUS", "ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_MOD",
		"ASSIGN_BIT_SHL", "ASSIGN_BIT_SHR", "ASSIGN_BIT_USHR", "ASSIGN_BIT_AND",
		"ASSIGN_BIT_XOR", "ASSIGN_NOT", "IDENTICALLY_EQUAL", "IDENTICALLY_EQUAL_NOT",
		"EQ", "NE", "GT", "LT", "GE", "LE", "AND", "OR", "NOT", "PLUS", "DOUBLE_PLUS",
		"MINUS", "DOUBLE_MINUS", "MUL", "DIV", "MOD", "BIT_AND", "BIT_OR", "BIT_NOT",
		"BIT_XOR", "BIT_SHL", "BIT_SHR", "BIT_USHR", "IDENTIFIER", "INTEGER",
		"INTEGER_HEX", "FLOATING_POINT", "INT", "FRAC", "EXP", "STRING_DOUBLE",
		"STRING_SINGLE", "OTHERS", "ESC", "UNICODE", "HEX"
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


	public FormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FormulaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0143\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-"+
		"\3-\7-\u00ed\n-\f-\16-\u00f0\13-\3.\3.\5.\u00f4\n.\3/\3/\3/\3/\6/\u00fa"+
		"\n/\r/\16/\u00fb\3/\5/\u00ff\n/\3\60\3\60\3\60\5\60\u0104\n\60\3\60\5"+
		"\60\u0107\n\60\3\60\5\60\u010a\n\60\3\61\3\61\3\61\7\61\u010f\n\61\f\61"+
		"\16\61\u0112\13\61\5\61\u0114\n\61\3\62\6\62\u0117\n\62\r\62\16\62\u0118"+
		"\3\63\3\63\5\63\u011d\n\63\3\63\3\63\3\64\3\64\3\64\7\64\u0124\n\64\f"+
		"\64\16\64\u0127\13\64\3\64\3\64\3\65\3\65\3\65\7\65\u012e\n\65\f\65\16"+
		"\65\u0131\13\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67\u013a\n\67\38"+
		"\38\38\38\38\38\39\39\4\u0125\u012f\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\2c\2e\2g\62i\63k\2m\2o\2q\2\3\2\17\f\2\13\17\"\"\u0087\u0087"+
		"\u00a2\u00a2\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031\u2061\u2061"+
		"\u3002\u3002\6\2&&C\\aac|\7\2&&\62;C\\aac|\b\2FFHHNNffhhnn\4\2NNnn\6\2"+
		"FFHHffhh\3\2\63;\3\2\62;\4\2GGgg\4\2--//\5\2\f\f\17\17^^\n\2$$))^^ddh"+
		"hppttvv\5\2\62;CHch\2\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3s\3\2\2\2\5w\3\2\2\2\7y"+
		"\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0083"+
		"\3\2\2\2\23\u0086\3\2\2\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u008f\3"+
		"\2\2\2\33\u0092\3\2\2\2\35\u0096\3\2\2\2\37\u009a\3\2\2\2!\u009f\3\2\2"+
		"\2#\u00a2\3\2\2\2%\u00a5\3\2\2\2\'\u00a8\3\2\2\2)\u00ac\3\2\2\2+\u00b0"+
		"\3\2\2\2-\u00b3\3\2\2\2/\u00b6\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2"+
		"\2\65\u00bd\3\2\2\2\67\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c6\3\2\2\2=\u00c8"+
		"\3\2\2\2?\u00ca\3\2\2\2A\u00cd\3\2\2\2C\u00cf\3\2\2\2E\u00d2\3\2\2\2G"+
		"\u00d4\3\2\2\2I\u00d6\3\2\2\2K\u00d8\3\2\2\2M\u00da\3\2\2\2O\u00dc\3\2"+
		"\2\2Q\u00de\3\2\2\2S\u00e0\3\2\2\2U\u00e3\3\2\2\2W\u00e6\3\2\2\2Y\u00ea"+
		"\3\2\2\2[\u00f1\3\2\2\2]\u00f5\3\2\2\2_\u0100\3\2\2\2a\u0113\3\2\2\2c"+
		"\u0116\3\2\2\2e\u011a\3\2\2\2g\u0120\3\2\2\2i\u012a\3\2\2\2k\u0134\3\2"+
		"\2\2m\u0136\3\2\2\2o\u013b\3\2\2\2q\u0141\3\2\2\2st\t\2\2\2tu\3\2\2\2"+
		"uv\b\2\2\2v\4\3\2\2\2wx\7*\2\2x\6\3\2\2\2yz\7+\2\2z\b\3\2\2\2{|\7.\2\2"+
		"|\n\3\2\2\2}~\7A\2\2~\f\3\2\2\2\177\u0080\7<\2\2\u0080\16\3\2\2\2\u0081"+
		"\u0082\7?\2\2\u0082\20\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085\7?\2\2\u0085"+
		"\22\3\2\2\2\u0086\u0087\7/\2\2\u0087\u0088\7?\2\2\u0088\24\3\2\2\2\u0089"+
		"\u008a\7,\2\2\u008a\u008b\7?\2\2\u008b\26\3\2\2\2\u008c\u008d\7\61\2\2"+
		"\u008d\u008e\7?\2\2\u008e\30\3\2\2\2\u008f\u0090\7\'\2\2\u0090\u0091\7"+
		"?\2\2\u0091\32\3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094\7>\2\2\u0094\u0095"+
		"\7?\2\2\u0095\34\3\2\2\2\u0096\u0097\7@\2\2\u0097\u0098\7@\2\2\u0098\u0099"+
		"\7?\2\2\u0099\36\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7@\2\2\u009c\u009d"+
		"\7@\2\2\u009d\u009e\7?\2\2\u009e \3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7`\2\2\u00a3\u00a4\7?\2\2\u00a4$\3"+
		"\2\2\2\u00a5\u00a6\7~\2\2\u00a6\u00a7\7?\2\2\u00a7&\3\2\2\2\u00a8\u00a9"+
		"\7?\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab(\3\2\2\2\u00ac\u00ad"+
		"\7#\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\u00b2\7?\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7\60\3\2\2\2\u00b8\u00b9"+
		"\7>\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\7?\2\2\u00bc\64"+
		"\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7?\2\2\u00bf\66\3\2\2\2\u00c0"+
		"\u00c1\7(\2\2\u00c1\u00c2\7(\2\2\u00c28\3\2\2\2\u00c3\u00c4\7~\2\2\u00c4"+
		"\u00c5\7~\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7<\3\2\2\2\u00c8\u00c9"+
		"\7-\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc\7-\2\2\u00cc@\3"+
		"\2\2\2\u00cd\u00ce\7/\2\2\u00ceB\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1D\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3F\3\2\2\2\u00d4\u00d5\7"+
		"\61\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7J\3\2\2\2\u00d8\u00d9"+
		"\7(\2\2\u00d9L\3\2\2\2\u00da\u00db\7~\2\2\u00dbN\3\2\2\2\u00dc\u00dd\7"+
		"\u0080\2\2\u00ddP\3\2\2\2\u00de\u00df\7`\2\2\u00dfR\3\2\2\2\u00e0\u00e1"+
		"\7>\2\2\u00e1\u00e2\7>\2\2\u00e2T\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5"+
		"\7@\2\2\u00e5V\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9"+
		"\7@\2\2\u00e9X\3\2\2\2\u00ea\u00ee\t\3\2\2\u00eb\u00ed\t\4\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"Z\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\5a\61\2\u00f2\u00f4\t\5\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\\\3\2\2\2\u00f5\u00f6\7"+
		"\62\2\2\u00f6\u00f7\7z\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\5q9\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\t\6\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff^\3\2\2\2\u0100\u0103\5a\61\2\u0101\u0102\7\60\2\2"+
		"\u0102\u0104\5c\62\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0107\5e\63\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u010a\t\7\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a`\3\2\2\2\u010b\u0114\7\62\2\2\u010c\u0110\t\b\2\2\u010d\u010f"+
		"\t\t\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u010b\3\2"+
		"\2\2\u0113\u010c\3\2\2\2\u0114b\3\2\2\2\u0115\u0117\t\t\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"d\3\2\2\2\u011a\u011c\t\n\2\2\u011b\u011d\t\13\2\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5a\61\2\u011ff\3"+
		"\2\2\2\u0120\u0125\7$\2\2\u0121\u0124\5m\67\2\u0122\u0124\5k\66\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\7$\2\2\u0129h\3\2\2\2\u012a\u012f\7)\2\2\u012b\u012e\5m\67\2\u012c"+
		"\u012e\5k\66\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7)\2\2\u0133j\3\2\2\2\u0134\u0135\n\f\2\2\u0135"+
		"l\3\2\2\2\u0136\u0139\7^\2\2\u0137\u013a\t\r\2\2\u0138\u013a\5o8\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013an\3\2\2\2\u013b\u013c\7w\2\2\u013c"+
		"\u013d\5q9\2\u013d\u013e\5q9\2\u013e\u013f\5q9\2\u013f\u0140\5q9\2\u0140"+
		"p\3\2\2\2\u0141\u0142\t\16\2\2\u0142r\3\2\2\2\23\2\u00ee\u00f3\u00fb\u00fe"+
		"\u0103\u0106\u0109\u0110\u0113\u0118\u011c\u0123\u0125\u012d\u012f\u0139"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
