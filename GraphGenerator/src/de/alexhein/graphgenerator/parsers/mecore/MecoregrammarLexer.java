package de.alexhein.graphgenerator.parsers.mecore;

// Generated from Mecoregrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MecoregrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, COIMPLIC=11, IMPLIC=12, OR=13, AND=14, NOT=15, UPPERC=16, LOWERC=17, 
		PROB=18, WS=19, LINE_COMMENT=20, COMMENT=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "']'", "')'", "','", "'['", "'('", "'='", "';'", "'|'", "'var'", 
		"'<=>'", "'=>'", "OR", "AND", "NOT", "UPPERC", "LOWERC", "PROB", "WS", 
		"LINE_COMMENT", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "COIMPLIC", "IMPLIC", "OR", "AND", "NOT", "UPPERC", "LOWERC", 
		"PROB", "WS", "LINE_COMMENT", "COMMENT"
	};


	public MecoregrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mecoregrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18: WS_action((RuleContext)_localctx, actionIndex); break;

		case 19: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\27\u009b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16"+
		"O\n\16\3\17\3\17\3\17\3\17\5\17U\n\17\3\20\3\20\3\20\3\20\5\20[\n\20\3"+
		"\21\3\21\7\21_\n\21\f\21\16\21b\13\21\3\22\3\22\7\22f\n\22\f\22\16\22"+
		"i\13\22\3\23\6\23l\n\23\r\23\16\23m\3\23\3\23\6\23r\n\23\r\23\16\23s\5"+
		"\23v\n\23\3\24\6\24y\n\24\r\24\16\24z\3\24\3\24\3\25\3\25\3\25\5\25\u0082"+
		"\n\25\3\25\7\25\u0085\n\25\f\25\16\25\u0088\13\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u0092\n\26\f\26\16\26\u0095\13\26\3\26\3\26"+
		"\3\26\3\26\3\26\4\u0086\u0093\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\2)\26\3+\27\4\3\2\7\4--==\4,,..\6\62;C\\aac|\6"+
		"\62;C\\aac|\5\13\f\17\17\"\"\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2\2\13\66"+
		"\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27"+
		"D\3\2\2\2\31H\3\2\2\2\33N\3\2\2\2\35T\3\2\2\2\37Z\3\2\2\2!\\\3\2\2\2#"+
		"c\3\2\2\2%k\3\2\2\2\'x\3\2\2\2)\u0081\3\2\2\2+\u008d\3\2\2\2-.\7/\2\2"+
		"./\7@\2\2/\4\3\2\2\2\60\61\7_\2\2\61\6\3\2\2\2\62\63\7+\2\2\63\b\3\2\2"+
		"\2\64\65\7.\2\2\65\n\3\2\2\2\66\67\7]\2\2\67\f\3\2\2\289\7*\2\29\16\3"+
		"\2\2\2:;\7?\2\2;\20\3\2\2\2<=\7=\2\2=\22\3\2\2\2>?\7~\2\2?\24\3\2\2\2"+
		"@A\7x\2\2AB\7c\2\2BC\7t\2\2C\26\3\2\2\2DE\7>\2\2EF\7?\2\2FG\7@\2\2G\30"+
		"\3\2\2\2HI\7?\2\2IJ\7@\2\2J\32\3\2\2\2KO\t\2\2\2LM\7q\2\2MO\7t\2\2NK\3"+
		"\2\2\2NL\3\2\2\2O\34\3\2\2\2PU\t\3\2\2QR\7c\2\2RS\7p\2\2SU\7f\2\2TP\3"+
		"\2\2\2TQ\3\2\2\2U\36\3\2\2\2V[\7#\2\2WX\7p\2\2XY\7q\2\2Y[\7v\2\2ZV\3\2"+
		"\2\2ZW\3\2\2\2[ \3\2\2\2\\`\4C\\\2]_\t\4\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2a\"\3\2\2\2b`\3\2\2\2cg\4c|\2df\t\5\2\2ed\3\2\2\2fi\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2h$\3\2\2\2ig\3\2\2\2jl\4\62;\2kj\3\2\2\2lm\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2nu\3\2\2\2oq\7\60\2\2pr\4\62;\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uo\3\2\2\2uv\3\2\2\2v&\3\2\2\2wy\t"+
		"\6\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\24\2\2}("+
		"\3\2\2\2~\177\7\61\2\2\177\u0082\7\61\2\2\u0080\u0082\7%\2\2\u0081~\3"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\25\3\2\u008c*\3\2\2\2\u008d\u008e\7\61\2"+
		"\2\u008e\u008f\7,\2\2\u008f\u0093\3\2\2\2\u0090\u0092\13\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\7\61"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\26\4\2\u009a,\3\2\2\2\17\2NTZ`"+
		"gmsuz\u0081\u0086\u0093";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}