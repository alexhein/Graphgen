package de.alexhein.graphgenerator.parsers.agg;

// Generated from Agggrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AgggrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, UPPERC=21, LOWERC=22, PROB=23, WS=24, 
		LINE_COMMENT=25, COMMENT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "'=>'", "','", "'+'", "'['", "'or'", "'*'", "'('", "'not'", 
		"'<=>'", "'='", "'!='", "';'", "'{'", "'type'", "'and'", "'}'", "'|'", 
		"'!'", "UPPERC", "LOWERC", "PROB", "WS", "LINE_COMMENT", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "UPPERC", "LOWERC", "PROB", "WS", "LINE_COMMENT", 
		"COMMENT"
	};


	public AgggrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Agggrammar.g4"; }

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
		case 23: WS_action((RuleContext)_localctx, actionIndex); break;

		case 24: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 25: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\34\u00aa\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\7\26n\n\26\f\26\16\26q\13\26\3\27\3\27\7\27u\n\27\f\27\16\27"+
		"x\13\27\3\30\6\30{\n\30\r\30\16\30|\3\30\3\30\6\30\u0081\n\30\r\30\16"+
		"\30\u0082\5\30\u0085\n\30\3\31\6\31\u0088\n\31\r\31\16\31\u0089\3\31\3"+
		"\31\3\32\3\32\3\32\5\32\u0091\n\32\3\32\7\32\u0094\n\32\f\32\16\32\u0097"+
		"\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00a1\n\33\f\33\16"+
		"\33\u00a4\13\33\3\33\3\33\3\33\3\33\3\33\4\u0095\u00a2\34\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\2\63\33\3\65\34\4\3\2\5\6\62;C\\aac|\6\62;C\\aac|\5\13\f\17\17"+
		"\"\"\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2"+
		"\2\2\7;\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21G\3\2"+
		"\2\2\23I\3\2\2\2\25K\3\2\2\2\27O\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35X\3"+
		"\2\2\2\37Z\3\2\2\2!\\\3\2\2\2#a\3\2\2\2%e\3\2\2\2\'g\3\2\2\2)i\3\2\2\2"+
		"+k\3\2\2\2-r\3\2\2\2/z\3\2\2\2\61\u0087\3\2\2\2\63\u0090\3\2\2\2\65\u009c"+
		"\3\2\2\2\678\7_\2\28\4\3\2\2\29:\7+\2\2:\6\3\2\2\2;<\7?\2\2<=\7@\2\2="+
		"\b\3\2\2\2>?\7.\2\2?\n\3\2\2\2@A\7-\2\2A\f\3\2\2\2BC\7]\2\2C\16\3\2\2"+
		"\2DE\7q\2\2EF\7t\2\2F\20\3\2\2\2GH\7,\2\2H\22\3\2\2\2IJ\7*\2\2J\24\3\2"+
		"\2\2KL\7p\2\2LM\7q\2\2MN\7v\2\2N\26\3\2\2\2OP\7>\2\2PQ\7?\2\2QR\7@\2\2"+
		"R\30\3\2\2\2ST\7?\2\2T\32\3\2\2\2UV\7#\2\2VW\7?\2\2W\34\3\2\2\2XY\7=\2"+
		"\2Y\36\3\2\2\2Z[\7}\2\2[ \3\2\2\2\\]\7v\2\2]^\7{\2\2^_\7r\2\2_`\7g\2\2"+
		"`\"\3\2\2\2ab\7c\2\2bc\7p\2\2cd\7f\2\2d$\3\2\2\2ef\7\177\2\2f&\3\2\2\2"+
		"gh\7~\2\2h(\3\2\2\2ij\7#\2\2j*\3\2\2\2ko\4C\\\2ln\t\2\2\2ml\3\2\2\2nq"+
		"\3\2\2\2om\3\2\2\2op\3\2\2\2p,\3\2\2\2qo\3\2\2\2rv\4c|\2su\t\3\2\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w.\3\2\2\2xv\3\2\2\2y{\4\62;\2zy\3"+
		"\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0084\3\2\2\2~\u0080\7\60\2\2\177"+
		"\u0081\4\62;\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084~\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\60\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\31\2\2\u008c\62\3\2\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\u0091\7\61\2\2\u008f\u0091\7%\2\2\u0090\u008d\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0095\3\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\32\3\2\u009b\64\3\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7,\2"+
		"\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\b\33\4\2\u00a9\66\3\2\2\2\f\2ov|\u0082\u0084"+
		"\u0089\u0090\u0095\u00a2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}