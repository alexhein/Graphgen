package de.alexhein.graphgenerator.parsers.agg;

// Generated from Agggrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AgggrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, UPPERC=21, LOWERC=22, PROB=23, WS=24, 
		LINE_COMMENT=25, COMMENT=26;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "'=>'", "','", "'+'", "'['", "'or'", "'*'", 
		"'('", "'not'", "'<=>'", "'='", "'!='", "';'", "'{'", "'type'", "'and'", 
		"'}'", "'|'", "'!'", "UPPERC", "LOWERC", "PROB", "WS", "LINE_COMMENT", 
		"COMMENT"
	};
	public static final int
		RULE_aggsig = 0, RULE_sortdef = 1, RULE_consts = 2, RULE_preddef = 3, 
		RULE_sorts = 4, RULE_probcond = 5, RULE_cond = 6, RULE_constrs = 7, RULE_constr = 8, 
		RULE_neqconstr = 9, RULE_eqconstr = 10, RULE_concl = 11, RULE_prem = 12, 
		RULE_form = 13, RULE_implication = 14, RULE_disjunction = 15, RULE_conjunction = 16, 
		RULE_negation = 17, RULE_parentform = 18, RULE_atom = 19, RULE_args = 20, 
		RULE_var_id = 21, RULE_const_id = 22, RULE_pred_id = 23, RULE_sort_id = 24, 
		RULE_nequ = 25, RULE_coimplic = 26, RULE_implic = 27, RULE_or = 28, RULE_and = 29, 
		RULE_not = 30, RULE_equ = 31;
	public static final String[] ruleNames = {
		"aggsig", "sortdef", "consts", "preddef", "sorts", "probcond", "cond", 
		"constrs", "constr", "neqconstr", "eqconstr", "concl", "prem", "form", 
		"implication", "disjunction", "conjunction", "negation", "parentform", 
		"atom", "args", "var_id", "const_id", "pred_id", "sort_id", "nequ", "coimplic", 
		"implic", "or", "and", "not", "equ"
	};

	@Override
	public String getGrammarFileName() { return "Agggrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public AgggrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AggsigContext extends ParserRuleContext {
		public ProbcondContext probcond(int i) {
			return getRuleContext(ProbcondContext.class,i);
		}
		public List<SortdefContext> sortdef() {
			return getRuleContexts(SortdefContext.class);
		}
		public List<ProbcondContext> probcond() {
			return getRuleContexts(ProbcondContext.class);
		}
		public PreddefContext preddef(int i) {
			return getRuleContext(PreddefContext.class,i);
		}
		public SortdefContext sortdef(int i) {
			return getRuleContext(SortdefContext.class,i);
		}
		public List<PreddefContext> preddef() {
			return getRuleContexts(PreddefContext.class);
		}
		public AggsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggsig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterAggsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitAggsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitAggsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggsigContext aggsig() throws RecognitionException {
		AggsigContext _localctx = new AggsigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aggsig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPERC) {
				{
				{
				setState(64); sortdef();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(70); preddef();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(76); probcond();
				}
				}
				setState(81);
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

	public static class SortdefContext extends ParserRuleContext {
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public Sort_idContext sort_id() {
			return getRuleContext(Sort_idContext.class,0);
		}
		public SortdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterSortdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitSortdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitSortdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortdefContext sortdef() throws RecognitionException {
		SortdefContext _localctx = new SortdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sortdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); sort_id();
			setState(83); match(12);
			setState(84); match(15);
			setState(85); consts();
			setState(86); match(18);
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

	public static class ConstsContext extends ParserRuleContext {
		public Const_idContext const_id(int i) {
			return getRuleContext(Const_idContext.class,i);
		}
		public List<Const_idContext> const_id() {
			return getRuleContexts(Const_idContext.class);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_consts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if (_la==LOWERC) {
				{
				setState(88); const_id();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(91); match(4);
				setState(92); const_id();
				}
				}
				setState(97);
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

	public static class PreddefContext extends ParserRuleContext {
		public Pred_idContext pred_id() {
			return getRuleContext(Pred_idContext.class,0);
		}
		public SortsContext sorts() {
			return getRuleContext(SortsContext.class,0);
		}
		public PreddefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preddef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterPreddef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitPreddef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitPreddef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreddefContext preddef() throws RecognitionException {
		PreddefContext _localctx = new PreddefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preddef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(16);
			setState(99); match(9);
			setState(100); pred_id();
			setState(101); match(9);
			setState(102); sorts();
			setState(103); match(2);
			setState(104); match(2);
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

	public static class SortsContext extends ParserRuleContext {
		public Sort_idContext sort_id(int i) {
			return getRuleContext(Sort_idContext.class,i);
		}
		public List<Sort_idContext> sort_id() {
			return getRuleContexts(Sort_idContext.class);
		}
		public SortsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterSorts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitSorts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitSorts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortsContext sorts() throws RecognitionException {
		SortsContext _localctx = new SortsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sorts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if (_la==UPPERC) {
				{
				setState(106); sort_id();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(109); match(4);
				setState(110); sort_id();
				}
				}
				setState(115);
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
		public ConstrsContext constrs() {
			return getRuleContext(ConstrsContext.class,0);
		}
		public TerminalNode PROB() { return getToken(AgggrammarParser.PROB, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ProbcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterProbcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitProbcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitProbcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbcondContext probcond() throws RecognitionException {
		ProbcondContext _localctx = new ProbcondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_probcond);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(116); match(9);
				setState(117); cond();
				setState(118); match(2);
				setState(119); match(6);
				setState(120); match(PROB);
				setState(121); match(1);
				setState(122); constrs();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(124); match(9);
				setState(125); cond();
				setState(126); match(2);
				setState(127); match(6);
				setState(128); match(PROB);
				setState(129); match(1);
				}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); concl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(134); concl();
				setState(135); match(19);
				setState(136); prem();
				}
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

	public static class ConstrsContext extends ParserRuleContext {
		public ConstrContext constr(int i) {
			return getRuleContext(ConstrContext.class,i);
		}
		public List<ConstrContext> constr() {
			return getRuleContexts(ConstrContext.class);
		}
		public ConstrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterConstrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitConstrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitConstrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrsContext constrs() throws RecognitionException {
		ConstrsContext _localctx = new ConstrsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(6);
			setState(142);
			_la = _input.LA(1);
			if (_la==UPPERC) {
				{
				setState(141); constr();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(144); match(4);
				setState(145); constr();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(1);
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

	public static class ConstrContext extends ParserRuleContext {
		public NeqconstrContext neqconstr() {
			return getRuleContext(NeqconstrContext.class,0);
		}
		public EqconstrContext eqconstr() {
			return getRuleContext(EqconstrContext.class,0);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitConstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constr);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); neqconstr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); eqconstr();
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

	public static class NeqconstrContext extends ParserRuleContext {
		public NequContext nequ() {
			return getRuleContext(NequContext.class,0);
		}
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public Const_idContext const_id() {
			return getRuleContext(Const_idContext.class,0);
		}
		public NeqconstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neqconstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterNeqconstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitNeqconstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitNeqconstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqconstrContext neqconstr() throws RecognitionException {
		NeqconstrContext _localctx = new NeqconstrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_neqconstr);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(157); var_id();
				setState(158); nequ();
				setState(159); const_id();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(161); var_id();
				setState(162); nequ();
				setState(163); match(9);
				setState(164); consts();
				setState(165); match(2);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(167); var_id();
				setState(168); nequ();
				setState(169); var_id();
				}
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

	public static class EqconstrContext extends ParserRuleContext {
		public EquContext equ() {
			return getRuleContext(EquContext.class,0);
		}
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public Const_idContext const_id() {
			return getRuleContext(Const_idContext.class,0);
		}
		public EqconstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqconstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterEqconstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitEqconstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitEqconstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqconstrContext eqconstr() throws RecognitionException {
		EqconstrContext _localctx = new EqconstrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eqconstr);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(173); var_id();
				setState(174); equ();
				setState(175); const_id();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(177); var_id();
				setState(178); equ();
				setState(179); match(9);
				setState(180); consts();
				setState(181); match(2);
				}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterConcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitConcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitConcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclContext concl() throws RecognitionException {
		ConclContext _localctx = new ConclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_concl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); form();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterPrem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitPrem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitPrem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremContext prem() throws RecognitionException {
		PremContext _localctx = new PremContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); form();
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
		public CoimplicContext coimplic(int i) {
			return getRuleContext(CoimplicContext.class,i);
		}
		public List<ImplicationContext> implication() {
			return getRuleContexts(ImplicationContext.class);
		}
		public List<CoimplicContext> coimplic() {
			return getRuleContexts(CoimplicContext.class);
		}
		public ImplicationContext implication(int i) {
			return getRuleContext(ImplicationContext.class,i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); implication();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==11) {
				{
				{
				setState(190); coimplic();
				setState(191); implication();
				}
				}
				setState(197);
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
		public List<ImplicContext> implic() {
			return getRuleContexts(ImplicContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public ImplicContext implic(int i) {
			return getRuleContext(ImplicContext.class,i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitImplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); disjunction();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(199); implic();
				setState(200); disjunction();
				}
				}
				setState(206);
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
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); conjunction();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 14))) != 0)) {
				{
				{
				setState(208); or();
				setState(209); conjunction();
				}
				}
				setState(215);
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
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); negation();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 8) | (1L << 17))) != 0)) {
				{
				{
				setState(217); and();
				setState(218); negation();
				}
				}
				setState(224);
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
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public ParentformContext parentform() {
			return getRuleContext(ParentformContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_negation);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case 10:
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); not();
				setState(226); parentform();
				}
				break;
			case 9:
			case UPPERC:
			case LOWERC:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); parentform();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterParentform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitParentform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitParentform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentformContext parentform() throws RecognitionException {
		ParentformContext _localctx = new ParentformContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parentform);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case UPPERC:
			case LOWERC:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); atom();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); match(9);
				setState(233); form();
				setState(234); match(2);
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
		public Pred_idContext pred_id() {
			return getRuleContext(Pred_idContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); pred_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); pred_id();
				setState(240); match(9);
				setState(241); args();
				setState(242); match(2);
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
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Const_idContext const_id(int i) {
			return getRuleContext(Const_idContext.class,i);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public List<Const_idContext> const_id() {
			return getRuleContexts(Const_idContext.class);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch (_input.LA(1)) {
			case UPPERC:
				{
				setState(246); var_id();
				}
				break;
			case LOWERC:
				{
				setState(247); const_id();
				}
				break;
			case 2:
			case 4:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(250); match(4);
				setState(253);
				switch (_input.LA(1)) {
				case UPPERC:
					{
					setState(251); var_id();
					}
					break;
				case LOWERC:
					{
					setState(252); const_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(259);
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

	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode UPPERC() { return getToken(AgggrammarParser.UPPERC, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitVar_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(UPPERC);
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

	public static class Const_idContext extends ParserRuleContext {
		public TerminalNode LOWERC() { return getToken(AgggrammarParser.LOWERC, 0); }
		public Const_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterConst_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitConst_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitConst_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_idContext const_id() throws RecognitionException {
		Const_idContext _localctx = new Const_idContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_const_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(LOWERC);
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

	public static class Pred_idContext extends ParserRuleContext {
		public TerminalNode LOWERC() { return getToken(AgggrammarParser.LOWERC, 0); }
		public TerminalNode UPPERC() { return getToken(AgggrammarParser.UPPERC, 0); }
		public Pred_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterPred_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitPred_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitPred_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pred_idContext pred_id() throws RecognitionException {
		Pred_idContext _localctx = new Pred_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pred_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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

	public static class Sort_idContext extends ParserRuleContext {
		public TerminalNode UPPERC() { return getToken(AgggrammarParser.UPPERC, 0); }
		public Sort_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterSort_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitSort_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitSort_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_idContext sort_id() throws RecognitionException {
		Sort_idContext _localctx = new Sort_idContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sort_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(UPPERC);
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

	public static class NequContext extends ParserRuleContext {
		public NequContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nequ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterNequ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitNequ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitNequ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NequContext nequ() throws RecognitionException {
		NequContext _localctx = new NequContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nequ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(13);
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

	public static class CoimplicContext extends ParserRuleContext {
		public CoimplicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coimplic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterCoimplic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitCoimplic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitCoimplic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoimplicContext coimplic() throws RecognitionException {
		CoimplicContext _localctx = new CoimplicContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_coimplic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(11);
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

	public static class ImplicContext extends ParserRuleContext {
		public ImplicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterImplic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitImplic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitImplic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicContext implic() throws RecognitionException {
		ImplicContext _localctx = new ImplicContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_implic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(3);
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 14))) != 0)) ) {
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 8) | (1L << 17))) != 0)) ) {
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==10 || _la==20) ) {
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

	public static class EquContext extends ParserRuleContext {
		public EquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).enterEqu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgggrammarListener ) ((AgggrammarListener)listener).exitEqu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgggrammarVisitor ) return ((AgggrammarVisitor<? extends T>)visitor).visitEqu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(12);
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
		"\2\3\34\u011d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2"+
		"\16\2M\13\2\3\2\7\2P\n\2\f\2\16\2S\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5"+
		"\4\\\n\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\5\6n\n\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u008d\n\b\3\t\3\t\5\t\u0091\n\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t"+
		"\u0098\13\t\3\t\3\t\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7\13\17\3\20\3\20\3\20\3\20\7"+
		"\20\u00cd\n\20\f\20\16\20\u00d0\13\20\3\21\3\21\3\21\3\21\7\21\u00d6\n"+
		"\21\f\21\16\21\u00d9\13\21\3\22\3\22\3\22\3\22\7\22\u00df\n\22\f\22\16"+
		"\22\u00e2\13\22\3\23\3\23\3\23\3\23\5\23\u00e8\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f7\n\25\3"+
		"\26\3\26\5\26\u00fb\n\26\3\26\3\26\3\26\5\26\u0100\n\26\7\26\u0102\n\26"+
		"\f\26\16\26\u0105\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\"\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\3\27\30"+
		"\5\7\7\t\t\20\20\5\6\6\n\n\23\23\4\f\f\26\26\u0116\2E\3\2\2\2\4T\3\2\2"+
		"\2\6[\3\2\2\2\bd\3\2\2\2\nm\3\2\2\2\f\u0085\3\2\2\2\16\u008c\3\2\2\2\20"+
		"\u008e\3\2\2\2\22\u009d\3\2\2\2\24\u00ad\3\2\2\2\26\u00b9\3\2\2\2\30\u00bb"+
		"\3\2\2\2\32\u00bd\3\2\2\2\34\u00bf\3\2\2\2\36\u00c8\3\2\2\2 \u00d1\3\2"+
		"\2\2\"\u00da\3\2\2\2$\u00e7\3\2\2\2&\u00ee\3\2\2\2(\u00f6\3\2\2\2*\u00fa"+
		"\3\2\2\2,\u0106\3\2\2\2.\u0108\3\2\2\2\60\u010a\3\2\2\2\62\u010c\3\2\2"+
		"\2\64\u010e\3\2\2\2\66\u0110\3\2\2\28\u0112\3\2\2\2:\u0114\3\2\2\2<\u0116"+
		"\3\2\2\2>\u0118\3\2\2\2@\u011a\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\f\7\2ON\3\2\2\2PS\3\2\2\2"+
		"QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SQ\3\2\2\2TU\5\62\32\2UV\7\16\2\2VW\7\21"+
		"\2\2WX\5\6\4\2XY\7\24\2\2Y\5\3\2\2\2Z\\\5.\30\2[Z\3\2\2\2[\\\3\2\2\2\\"+
		"a\3\2\2\2]^\7\6\2\2^`\5.\30\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"b\7\3\2\2\2ca\3\2\2\2de\7\22\2\2ef\7\13\2\2fg\5\60\31\2gh\7\13\2\2hi\5"+
		"\n\6\2ij\7\4\2\2jk\7\4\2\2k\t\3\2\2\2ln\5\62\32\2ml\3\2\2\2mn\3\2\2\2"+
		"ns\3\2\2\2op\7\6\2\2pr\5\62\32\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2t\13\3\2\2\2us\3\2\2\2vw\7\13\2\2wx\5\16\b\2xy\7\4\2\2yz\7\b\2\2z{\7"+
		"\31\2\2{|\7\3\2\2|}\5\20\t\2}\u0086\3\2\2\2~\177\7\13\2\2\177\u0080\5"+
		"\16\b\2\u0080\u0081\7\4\2\2\u0081\u0082\7\b\2\2\u0082\u0083\7\31\2\2\u0083"+
		"\u0084\7\3\2\2\u0084\u0086\3\2\2\2\u0085v\3\2\2\2\u0085~\3\2\2\2\u0086"+
		"\r\3\2\2\2\u0087\u008d\5\30\r\2\u0088\u0089\5\30\r\2\u0089\u008a\7\25"+
		"\2\2\u008a\u008b\5\32\16\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008d\17\3\2\2\2\u008e\u0090\7\b\2\2\u008f\u0091\5\22\n"+
		"\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0093"+
		"\7\6\2\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\7\3\2\2\u009a\21\3\2\2\2\u009b\u009e\5\24\13\2\u009c"+
		"\u009e\5\26\f\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\23\3\2\2"+
		"\2\u009f\u00a0\5,\27\2\u00a0\u00a1\5\64\33\2\u00a1\u00a2\5.\30\2\u00a2"+
		"\u00ae\3\2\2\2\u00a3\u00a4\5,\27\2\u00a4\u00a5\5\64\33\2\u00a5\u00a6\7"+
		"\13\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\7\4\2\2\u00a8\u00ae\3\2\2\2\u00a9"+
		"\u00aa\5,\27\2\u00aa\u00ab\5\64\33\2\u00ab\u00ac\5,\27\2\u00ac\u00ae\3"+
		"\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b0\5,\27\2\u00b0\u00b1\5@!\2\u00b1\u00b2\5.\30\2"+
		"\u00b2\u00ba\3\2\2\2\u00b3\u00b4\5,\27\2\u00b4\u00b5\5@!\2\u00b5\u00b6"+
		"\7\13\2\2\u00b6\u00b7\5\6\4\2\u00b7\u00b8\7\4\2\2\u00b8\u00ba\3\2\2\2"+
		"\u00b9\u00af\3\2\2\2\u00b9\u00b3\3\2\2\2\u00ba\27\3\2\2\2\u00bb\u00bc"+
		"\5\34\17\2\u00bc\31\3\2\2\2\u00bd\u00be\5\34\17\2\u00be\33\3\2\2\2\u00bf"+
		"\u00c5\5\36\20\2\u00c0\u00c1\5\66\34\2\u00c1\u00c2\5\36\20\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ce\5 \21"+
		"\2\u00c9\u00ca\58\35\2\u00ca\u00cb\5 \21\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d7\5\"\22\2\u00d2\u00d3\5:\36"+
		"\2\u00d3\u00d4\5\"\22\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00da\u00e0\5$\23\2\u00db\u00dc\5<\37\2\u00dc\u00dd"+
		"\5$\23\2\u00dd\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1#\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e4\5> \2\u00e4\u00e5\5&\24\2\u00e5\u00e8\3\2\2\2\u00e6\u00e8"+
		"\5&\24\2\u00e7\u00e3\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8%\3\2\2\2\u00e9"+
		"\u00ef\5(\25\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed"+
		"\7\4\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f7\5\60\31\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\7\13"+
		"\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f5\7\4\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00fb\5,\27\2"+
		"\u00f9\u00fb\5.\30\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u0103\3\2\2\2\u00fc\u00ff\7\6\2\2\u00fd\u0100\5,\27\2\u00fe"+
		"\u0100\5.\30\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00fc\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104+\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\27\2\2"+
		"\u0107-\3\2\2\2\u0108\u0109\7\30\2\2\u0109/\3\2\2\2\u010a\u010b\t\2\2"+
		"\2\u010b\61\3\2\2\2\u010c\u010d\7\27\2\2\u010d\63\3\2\2\2\u010e\u010f"+
		"\7\17\2\2\u010f\65\3\2\2\2\u0110\u0111\7\r\2\2\u0111\67\3\2\2\2\u0112"+
		"\u0113\7\5\2\2\u01139\3\2\2\2\u0114\u0115\t\3\2\2\u0115;\3\2\2\2\u0116"+
		"\u0117\t\4\2\2\u0117=\3\2\2\2\u0118\u0119\t\5\2\2\u0119?\3\2\2\2\u011a"+
		"\u011b\7\16\2\2\u011bA\3\2\2\2\32EKQ[ams\u0085\u008c\u0090\u0096\u009d"+
		"\u00ad\u00b9\u00c5\u00ce\u00d7\u00e0\u00e7\u00ee\u00f6\u00fa\u00ff\u0103";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}