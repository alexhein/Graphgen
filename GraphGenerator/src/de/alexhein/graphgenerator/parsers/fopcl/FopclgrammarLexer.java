package de.alexhein.graphgenerator.parsers.fopcl;


// Generated from Fopclgrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FopclgrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, UPPERC=22, LOWERC=23, PROB=24, 
		WS=25, LINE_COMMENT=26, COMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "'=>'", "','", "'+'", "'['", "'or'", "'*'", "'('", "'not'", 
		"'<'", "'='", "'<=>'", "'!='", "';'", "'>'", "'{'", "'and'", "'}'", "'|'", 
		"'!'", "UPPERC", "LOWERC", "PROB", "WS", "LINE_COMMENT", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "UPPERC", "LOWERC", "PROB", "WS", "LINE_COMMENT", 
		"COMMENT"
	};


	public FopclgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fopclgrammar.g4"; }

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
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;

		case 25: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 26: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\35\u00ab\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\7\27o\n\27\f\27\16\27r\13\27\3\30\3\30\7\30v\n\30\f\30"+
		"\16\30y\13\30\3\31\6\31|\n\31\r\31\16\31}\3\31\3\31\6\31\u0082\n\31\r"+
		"\31\16\31\u0083\5\31\u0086\n\31\3\32\6\32\u0089\n\32\r\32\16\32\u008a"+
		"\3\32\3\32\3\33\3\33\3\33\5\33\u0092\n\33\3\33\7\33\u0095\n\33\f\33\16"+
		"\33\u0098\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00a2\n\34"+
		"\f\34\16\34\u00a5\13\34\3\34\3\34\3\34\3\34\3\34\4\u0096\u00a3\35\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1"+
		"-\30\1/\31\1\61\32\1\63\33\2\65\34\3\67\35\4\3\2\5\6\62;C\\aac|\6\62;"+
		"C\\aac|\5\13\f\17\17\"\"\u00b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2"+
		"\rD\3\2\2\2\17F\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27Q\3\2\2"+
		"\2\31S\3\2\2\2\33U\3\2\2\2\35Y\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#`\3\2\2"+
		"\2%b\3\2\2\2\'f\3\2\2\2)h\3\2\2\2+j\3\2\2\2-l\3\2\2\2/s\3\2\2\2\61{\3"+
		"\2\2\2\63\u0088\3\2\2\2\65\u0091\3\2\2\2\67\u009d\3\2\2\29:\7_\2\2:\4"+
		"\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7?\2\2>?\7@\2\2?\b\3\2\2\2@A\7.\2\2A\n"+
		"\3\2\2\2BC\7-\2\2C\f\3\2\2\2DE\7]\2\2E\16\3\2\2\2FG\7q\2\2GH\7t\2\2H\20"+
		"\3\2\2\2IJ\7,\2\2J\22\3\2\2\2KL\7*\2\2L\24\3\2\2\2MN\7p\2\2NO\7q\2\2O"+
		"P\7v\2\2P\26\3\2\2\2QR\7>\2\2R\30\3\2\2\2ST\7?\2\2T\32\3\2\2\2UV\7>\2"+
		"\2VW\7?\2\2WX\7@\2\2X\34\3\2\2\2YZ\7#\2\2Z[\7?\2\2[\36\3\2\2\2\\]\7=\2"+
		"\2] \3\2\2\2^_\7@\2\2_\"\3\2\2\2`a\7}\2\2a$\3\2\2\2bc\7c\2\2cd\7p\2\2"+
		"de\7f\2\2e&\3\2\2\2fg\7\177\2\2g(\3\2\2\2hi\7~\2\2i*\3\2\2\2jk\7#\2\2"+
		"k,\3\2\2\2lp\4C\\\2mo\t\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"q.\3\2\2\2rp\3\2\2\2sw\4c|\2tv\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2x\60\3\2\2\2yw\3\2\2\2z|\4\62;\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u0085\3\2\2\2\177\u0081\7\60\2\2\u0080\u0082\4\62;\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\177\3\2\2\2\u0085\u0086\3\2\2\2\u0086\62"+
		"\3\2\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\32"+
		"\2\2\u008d\64\3\2\2\2\u008e\u008f\7\61\2\2\u008f\u0092\7\61\2\2\u0090"+
		"\u0092\7%\2\2\u0091\u008e\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0096\3\2"+
		"\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7\f\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\33\3\2\u009c"+
		"\66\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7,\2\2\u009f\u00a3\3\2\2"+
		"\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\b\34\4\2\u00aa8\3\2\2\2\f\2pw}\u0083\u0085\u008a\u0091\u0096\u00a3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}