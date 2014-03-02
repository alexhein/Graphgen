package de.alexhein.graphgenerator.parsers.mecore;

// Generated from Mecoregrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MecoregrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, COIMPLIC=11, IMPLIC=12, OR=13, AND=14, NOT=15, UPPERC=16, LOWERC=17, 
		PROB=18, WS=19, LINE_COMMENT=20, COMMENT=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "']'", "')'", "','", "'['", "'('", "'='", "';'", 
		"'|'", "'var'", "'<=>'", "'=>'", "OR", "AND", "NOT", "UPPERC", "LOWERC", 
		"PROB", "WS", "LINE_COMMENT", "COMMENT"
	};
	public static final int
		RULE_mecoresig = 0, RULE_vardef = 1, RULE_values = 2, RULE_probconds = 3, 
		RULE_probcond = 4, RULE_cond = 5, RULE_concl = 6, RULE_prem = 7, RULE_form = 8, 
		RULE_implication = 9, RULE_disjunction = 10, RULE_conjunction = 11, RULE_negation = 12, 
		RULE_parentform = 13, RULE_atom = 14, RULE_varid = 15, RULE_valueid = 16;
	public static final String[] ruleNames = {
		"mecoresig", "vardef", "values", "probconds", "probcond", "cond", "concl", 
		"prem", "form", "implication", "disjunction", "conjunction", "negation", 
		"parentform", "atom", "varid", "valueid"
	};

	@Override
	public String getGrammarFileName() { return "Mecoregrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MecoregrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MecoresigContext extends ParserRuleContext {
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public ProbcondsContext probconds() {
			return getRuleContext(ProbcondsContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public MecoresigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mecoresig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitMecoresig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MecoresigContext mecoresig() throws RecognitionException {
		MecoresigContext _localctx = new MecoresigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mecoresig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==10) {
				{
				{
				setState(34); vardef();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); probconds();
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

	public static class VardefContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(10);
			setState(43); values();
			setState(44); match(1);
			setState(45); varid();
			setState(46); match(8);
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

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueidContext> valueid() {
			return getRuleContexts(ValueidContext.class);
		}
		public ValueidContext valueid(int i) {
			return getRuleContext(ValueidContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if (_la==LOWERC) {
				{
				setState(48); valueid();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(51); match(4);
				setState(52); valueid();
				}
				}
				setState(57);
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

	public static class ProbcondsContext extends ParserRuleContext {
		public ProbcondContext probcond(int i) {
			return getRuleContext(ProbcondContext.class,i);
		}
		public List<ProbcondContext> probcond() {
			return getRuleContexts(ProbcondContext.class);
		}
		public ProbcondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probconds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitProbconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbcondsContext probconds() throws RecognitionException {
		ProbcondsContext _localctx = new ProbcondsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_probconds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(58); probcond();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(61); match(4);
				setState(62); probcond();
				}
				}
				setState(67);
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

	public static class ProbcondContext extends ParserRuleContext {
		public TerminalNode PROB() { return getToken(MecoregrammarParser.PROB, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ProbcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probcond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitProbcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbcondContext probcond() throws RecognitionException {
		ProbcondContext _localctx = new ProbcondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_probcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); cond();
			setState(69); match(5);
			setState(70); match(PROB);
			setState(71); match(2);
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

	public static class CondContext extends ParserRuleContext {
		public PremContext prem() {
			return getRuleContext(PremContext.class,0);
		}
		public ConclContext concl() {
			return getRuleContext(ConclContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cond);
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(6);
				setState(74); concl();
				setState(75); match(9);
				setState(76); prem();
				setState(77); match(3);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(6);
				setState(80); concl();
				setState(81); match(3);
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

	public static class ConclContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ConclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitConcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclContext concl() throws RecognitionException {
		ConclContext _localctx = new ConclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_concl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); form();
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

	public static class PremContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public PremContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitPrem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremContext prem() throws RecognitionException {
		PremContext _localctx = new PremContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); form();
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

	public static class FormContext extends ParserRuleContext {
		public List<TerminalNode> COIMPLIC() { return getTokens(MecoregrammarParser.COIMPLIC); }
		public List<ImplicationContext> implication() {
			return getRuleContexts(ImplicationContext.class);
		}
		public TerminalNode COIMPLIC(int i) {
			return getToken(MecoregrammarParser.COIMPLIC, i);
		}
		public ImplicationContext implication(int i) {
			return getRuleContext(ImplicationContext.class,i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); implication();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COIMPLIC) {
				{
				{
				setState(90); match(COIMPLIC);
				setState(91); implication();
				}
				}
				setState(96);
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

	public static class ImplicationContext extends ParserRuleContext {
		public TerminalNode IMPLIC(int i) {
			return getToken(MecoregrammarParser.IMPLIC, i);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public List<TerminalNode> IMPLIC() { return getTokens(MecoregrammarParser.IMPLIC); }
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); disjunction();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLIC) {
				{
				{
				setState(98); match(IMPLIC);
				setState(99); disjunction();
				}
				}
				setState(104);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(MecoregrammarParser.OR, i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(MecoregrammarParser.OR); }
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); conjunction();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(106); match(OR);
				setState(107); conjunction();
				}
				}
				setState(112);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MecoregrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MecoregrammarParser.AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); negation();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(114); match(AND);
				setState(115); negation();
				}
				}
				setState(120);
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MecoregrammarParser.NOT, 0); }
		public ParentformContext parentform() {
			return getRuleContext(ParentformContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_negation);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); match(NOT);
				setState(122); parentform();
				}
				break;
			case 6:
			case UPPERC:
			case LOWERC:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); parentform();
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

	public static class ParentformContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ParentformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentform; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitParentform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentformContext parentform() throws RecognitionException {
		ParentformContext _localctx = new ParentformContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parentform);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case UPPERC:
			case LOWERC:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); atom();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); match(6);
				setState(128); form();
				setState(129); match(3);
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

	public static class AtomContext extends ParserRuleContext {
		public ValueidContext valueid() {
			return getRuleContext(ValueidContext.class,0);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); varid();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); varid();
				setState(135); match(7);
				setState(136); valueid();
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

	public static class VaridContext extends ParserRuleContext {
		public TerminalNode LOWERC() { return getToken(MecoregrammarParser.LOWERC, 0); }
		public TerminalNode UPPERC() { return getToken(MecoregrammarParser.UPPERC, 0); }
		public VaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitVarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaridContext varid() throws RecognitionException {
		VaridContext _localctx = new VaridContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==UPPERC || _la==LOWERC) ) {
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

	public static class ValueidContext extends ParserRuleContext {
		public TerminalNode LOWERC() { return getToken(MecoregrammarParser.LOWERC, 0); }
		public ValueidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MecoregrammarVisitor ) return ((MecoregrammarVisitor<? extends T>)visitor).visitValueid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueidContext valueid() throws RecognitionException {
		ValueidContext _localctx = new ValueidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valueid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(LOWERC);
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
		"\2\3\27\u0093\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\5\4\64\n\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\5\5"+
		">\n\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n"+
		"_\n\n\f\n\16\nb\13\n\3\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\3"+
		"\f\3\f\7\fo\n\f\f\f\16\fr\13\f\3\r\3\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\16"+
		"\3\16\3\16\5\16\177\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0086\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u008d\n\20\3\21\3\21\3\22\3\22\3\22\2\23\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\22\23\u008e\2\'\3\2\2\2\4"+
		",\3\2\2\2\6\63\3\2\2\2\b=\3\2\2\2\nF\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20"+
		"Y\3\2\2\2\22[\3\2\2\2\24c\3\2\2\2\26k\3\2\2\2\30s\3\2\2\2\32~\3\2\2\2"+
		"\34\u0085\3\2\2\2\36\u008c\3\2\2\2 \u008e\3\2\2\2\"\u0090\3\2\2\2$&\5"+
		"\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2"+
		"*+\5\b\5\2+\3\3\2\2\2,-\7\f\2\2-.\5\6\4\2./\7\3\2\2/\60\5 \21\2\60\61"+
		"\7\n\2\2\61\5\3\2\2\2\62\64\5\"\22\2\63\62\3\2\2\2\63\64\3\2\2\2\649\3"+
		"\2\2\2\65\66\7\6\2\2\668\5\"\22\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\2"+
		"9:\3\2\2\2:\7\3\2\2\2;9\3\2\2\2<>\5\n\6\2=<\3\2\2\2=>\3\2\2\2>C\3\2\2"+
		"\2?@\7\6\2\2@B\5\n\6\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\t\3\2"+
		"\2\2EC\3\2\2\2FG\5\f\7\2GH\7\7\2\2HI\7\24\2\2IJ\7\4\2\2J\13\3\2\2\2KL"+
		"\7\b\2\2LM\5\16\b\2MN\7\13\2\2NO\5\20\t\2OP\7\5\2\2PV\3\2\2\2QR\7\b\2"+
		"\2RS\5\16\b\2ST\7\5\2\2TV\3\2\2\2UK\3\2\2\2UQ\3\2\2\2V\r\3\2\2\2WX\5\22"+
		"\n\2X\17\3\2\2\2YZ\5\22\n\2Z\21\3\2\2\2[`\5\24\13\2\\]\7\r\2\2]_\5\24"+
		"\13\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2c"+
		"h\5\26\f\2de\7\16\2\2eg\5\26\f\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\25\3\2\2\2jh\3\2\2\2kp\5\30\r\2lm\7\17\2\2mo\5\30\r\2nl\3\2\2\2or"+
		"\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\27\3\2\2\2rp\3\2\2\2sx\5\32\16\2tu\7\20"+
		"\2\2uw\5\32\16\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\31\3\2\2\2z"+
		"x\3\2\2\2{|\7\21\2\2|\177\5\34\17\2}\177\5\34\17\2~{\3\2\2\2~}\3\2\2\2"+
		"\177\33\3\2\2\2\u0080\u0086\5\36\20\2\u0081\u0082\7\b\2\2\u0082\u0083"+
		"\5\22\n\2\u0083\u0084\7\5\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2"+
		"\u0085\u0081\3\2\2\2\u0086\35\3\2\2\2\u0087\u008d\5 \21\2\u0088\u0089"+
		"\5 \21\2\u0089\u008a\7\t\2\2\u008a\u008b\5\"\22\2\u008b\u008d\3\2\2\2"+
		"\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008d\37\3\2\2\2\u008e\u008f"+
		"\t\2\2\2\u008f!\3\2\2\2\u0090\u0091\7\23\2\2\u0091#\3\2\2\2\17\'\639="+
		"CU`hpx~\u0085\u008c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}