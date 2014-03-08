package de.alexhein.graphgenerator.parsers.fopcl;


// Generated from Fopclgrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FopclgrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, UPPERC=22, LOWERC=23, PROB=24, 
		WS=25, LINE_COMMENT=26, COMMENT=27;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "'=>'", "','", "'+'", "'['", "'or'", "'*'", 
		"'('", "'not'", "'<'", "'='", "'<=>'", "'!='", "';'", "'>'", "'{'", "'and'", 
		"'}'", "'|'", "'!'", "UPPERC", "LOWERC", "PROB", "WS", "LINE_COMMENT", 
		"COMMENT"
	};
	public static final int
		RULE_fopclsig = 0, RULE_sortdef = 1, RULE_consts = 2, RULE_preddef = 3, 
		RULE_sorts = 4, RULE_probcond = 5, RULE_constrs = 6, RULE_constr = 7, 
		RULE_neqconstr = 8, RULE_eqconstr = 9, RULE_cond = 10, RULE_concl = 11, 
		RULE_prem = 12, RULE_form = 13, RULE_implication = 14, RULE_disjunction = 15, 
		RULE_conjunction = 16, RULE_negation = 17, RULE_parentform = 18, RULE_atom = 19, 
		RULE_args = 20, RULE_var_id = 21, RULE_const_id = 22, RULE_pred_id = 23, 
		RULE_sort_id = 24, RULE_nequ = 25, RULE_coimplic = 26, RULE_implic = 27, 
		RULE_or = 28, RULE_and = 29, RULE_not = 30, RULE_equ = 31;
	public static final String[] ruleNames = {
		"fopclsig", "sortdef", "consts", "preddef", "sorts", "probcond", "constrs", 
		"constr", "neqconstr", "eqconstr", "cond", "concl", "prem", "form", "implication", 
		"disjunction", "conjunction", "negation", "parentform", "atom", "args", 
		"var_id", "const_id", "pred_id", "sort_id", "nequ", "coimplic", "implic", 
		"or", "and", "not", "equ"
	};

	@Override
	public String getGrammarFileName() { return "Fopclgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FopclgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FopclsigContext extends ParserRuleContext {
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
		public FopclsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fopclsig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitFopclsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FopclsigContext fopclsig() throws RecognitionException {
		FopclsigContext _localctx = new FopclsigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fopclsig);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(64); sortdef();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPERC || _la==LOWERC) {
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
			while (_la==11) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitSortdef(this);
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
			setState(84); match(17);
			setState(85); consts();
			setState(86); match(19);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitConsts(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitPreddef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreddefContext preddef() throws RecognitionException {
		PreddefContext _localctx = new PreddefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preddef);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); pred_id();
				setState(99); match(9);
				setState(100); sorts();
				setState(101); match(2);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); pred_id();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitSorts(this);
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
		public TerminalNode PROB() { return getToken(FopclgrammarParser.PROB, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ProbcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probcond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitProbcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbcondContext probcond() throws RecognitionException {
		ProbcondContext _localctx = new ProbcondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_probcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(11);
			setState(117); match(9);
			setState(118); cond();
			setState(119); match(2);
			setState(120); match(6);
			setState(121); match(PROB);
			setState(122); match(1);
			setState(123); constrs();
			setState(124); match(16);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitConstrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrsContext constrs() throws RecognitionException {
		ConstrsContext _localctx = new ConstrsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(126); match(4);
				setState(127); constr();
				}
				}
				setState(132);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constr);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); neqconstr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); eqconstr();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitNeqconstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqconstrContext neqconstr() throws RecognitionException {
		NeqconstrContext _localctx = new NeqconstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_neqconstr);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(137); var_id();
				setState(138); nequ();
				setState(139); const_id();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(141); const_id();
				setState(142); nequ();
				setState(143); var_id();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(145); var_id();
				setState(146); nequ();
				setState(147); match(9);
				setState(148); consts();
				setState(149); match(2);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(151); match(9);
				setState(152); consts();
				setState(153); match(2);
				setState(154); nequ();
				setState(155); var_id();
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(157); var_id();
				setState(158); nequ();
				setState(159); var_id();
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
		public EqconstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqconstr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitEqconstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqconstrContext eqconstr() throws RecognitionException {
		EqconstrContext _localctx = new EqconstrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eqconstr);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(163); var_id();
				setState(164); equ();
				setState(165); const_id();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(167); const_id();
				setState(168); equ();
				setState(169); var_id();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(171); var_id();
				setState(172); equ();
				setState(173); match(9);
				setState(174); consts();
				setState(175); match(2);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(177); match(9);
				setState(178); consts();
				setState(179); match(2);
				setState(180); equ();
				setState(181); var_id();
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(183); var_id();
				setState(184); equ();
				setState(185); var_id();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); concl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(190); concl();
				setState(191); match(20);
				setState(192); prem();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitConcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclContext concl() throws RecognitionException {
		ConclContext _localctx = new ConclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_concl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); form();
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
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitPrem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremContext prem() throws RecognitionException {
		PremContext _localctx = new PremContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); form();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitForm(this);
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
			setState(200); implication();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13) {
				{
				{
				setState(201); coimplic();
				setState(202); implication();
				}
				}
				setState(208);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitImplication(this);
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
			setState(209); disjunction();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(210); implic();
				setState(211); disjunction();
				}
				}
				setState(217);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitDisjunction(this);
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
			setState(218); conjunction();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 15))) != 0)) {
				{
				{
				setState(219); or();
				setState(220); conjunction();
				}
				}
				setState(226);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitConjunction(this);
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
			setState(227); negation();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 8) | (1L << 18))) != 0)) {
				{
				{
				setState(228); and();
				setState(229); negation();
				}
				}
				setState(235);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_negation);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case 10:
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); not();
				setState(237); parentform();
				}
				break;
			case 9:
			case UPPERC:
			case LOWERC:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); parentform();
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
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitParentform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentformContext parentform() throws RecognitionException {
		ParentformContext _localctx = new ParentformContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parentform);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case UPPERC:
			case LOWERC:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); atom();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); match(9);
				setState(244); form();
				setState(245); match(2);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); pred_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); pred_id();
				setState(251); match(9);
				setState(252); args();
				setState(253); match(2);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitArgs(this);
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
			setState(259);
			switch (_input.LA(1)) {
			case UPPERC:
				{
				setState(257); var_id();
				}
				break;
			case LOWERC:
				{
				setState(258); const_id();
				}
				break;
			case 2:
			case 4:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(261); match(4);
				setState(264);
				switch (_input.LA(1)) {
				case UPPERC:
					{
					setState(262); var_id();
					}
					break;
				case LOWERC:
					{
					setState(263); const_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(270);
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
		public TerminalNode UPPERC() { return getToken(FopclgrammarParser.UPPERC, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(UPPERC);
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
		public TerminalNode LOWERC() { return getToken(FopclgrammarParser.LOWERC, 0); }
		public Const_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitConst_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_idContext const_id() throws RecognitionException {
		Const_idContext _localctx = new Const_idContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_const_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(LOWERC);
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
		public TerminalNode LOWERC() { return getToken(FopclgrammarParser.LOWERC, 0); }
		public TerminalNode UPPERC() { return getToken(FopclgrammarParser.UPPERC, 0); }
		public Pred_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitPred_id(this);
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
			setState(275);
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
		public TerminalNode UPPERC() { return getToken(FopclgrammarParser.UPPERC, 0); }
		public Sort_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitSort_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_idContext sort_id() throws RecognitionException {
		Sort_idContext _localctx = new Sort_idContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sort_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(UPPERC);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitNequ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NequContext nequ() throws RecognitionException {
		NequContext _localctx = new NequContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nequ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(14);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitCoimplic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoimplicContext coimplic() throws RecognitionException {
		CoimplicContext _localctx = new CoimplicContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_coimplic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(13);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitImplic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicContext implic() throws RecognitionException {
		ImplicContext _localctx = new ImplicContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_implic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(3);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitOr(this);
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
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 15))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitAnd(this);
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
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 8) | (1L << 18))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitNot(this);
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
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==10 || _la==21) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FopclgrammarVisitor ) return ((FopclgrammarVisitor<? extends T>)visitor).visitEqu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(12);
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
		"\2\3\35\u0128\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2"+
		"\16\2M\13\2\3\2\7\2P\n\2\f\2\16\2S\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5"+
		"\4\\\n\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5k"+
		"\n\5\3\6\5\6n\n\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u0083\n\b\f\b\16\b\u0086\13\b\3\t\3\t"+
		"\5\t\u008a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a4\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00c5\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00cf\n\17"+
		"\f\17\16\17\u00d2\13\17\3\20\3\20\3\20\3\20\7\20\u00d8\n\20\f\20\16\20"+
		"\u00db\13\20\3\21\3\21\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00ea\n\22\f\22\16\22\u00ed\13\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00f3\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00fa\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26\5\26\u0106\n\26"+
		"\3\26\3\26\3\26\5\26\u010b\n\26\7\26\u010d\n\26\f\26\16\26\u0110\13\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\3\30\31\5\7\7\t\t\21\21\5\6\6"+
		"\n\n\24\24\4\f\f\27\27\u0125\2E\3\2\2\2\4T\3\2\2\2\6[\3\2\2\2\bj\3\2\2"+
		"\2\nm\3\2\2\2\fv\3\2\2\2\16\u0084\3\2\2\2\20\u0089\3\2\2\2\22\u00a3\3"+
		"\2\2\2\24\u00bd\3\2\2\2\26\u00c4\3\2\2\2\30\u00c6\3\2\2\2\32\u00c8\3\2"+
		"\2\2\34\u00ca\3\2\2\2\36\u00d3\3\2\2\2 \u00dc\3\2\2\2\"\u00e5\3\2\2\2"+
		"$\u00f2\3\2\2\2&\u00f9\3\2\2\2(\u0101\3\2\2\2*\u0105\3\2\2\2,\u0111\3"+
		"\2\2\2.\u0113\3\2\2\2\60\u0115\3\2\2\2\62\u0117\3\2\2\2\64\u0119\3\2\2"+
		"\2\66\u011b\3\2\2\28\u011d\3\2\2\2:\u011f\3\2\2\2<\u0121\3\2\2\2>\u0123"+
		"\3\2\2\2@\u0125\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FK\3\2\2\2GE\3\2\2\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\f\7\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2R\3\3\2\2\2SQ\3\2\2\2TU\5\62\32\2UV\7\16\2\2VW\7\23\2\2WX\5\6\4\2"+
		"XY\7\25\2\2Y\5\3\2\2\2Z\\\5.\30\2[Z\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2]^\7"+
		"\6\2\2^`\5.\30\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca"+
		"\3\2\2\2de\5\60\31\2ef\7\13\2\2fg\5\n\6\2gh\7\4\2\2hk\3\2\2\2ik\5\60\31"+
		"\2jd\3\2\2\2ji\3\2\2\2k\t\3\2\2\2ln\5\62\32\2ml\3\2\2\2mn\3\2\2\2ns\3"+
		"\2\2\2op\7\6\2\2pr\5\62\32\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t"+
		"\13\3\2\2\2us\3\2\2\2vw\7\r\2\2wx\7\13\2\2xy\5\26\f\2yz\7\4\2\2z{\7\b"+
		"\2\2{|\7\32\2\2|}\7\3\2\2}~\5\16\b\2~\177\7\22\2\2\177\r\3\2\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0083\5\20\t\2\u0082\u0080\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\5\22\n\2\u0088\u008a\5\24\13\2\u0089\u0087"+
		"\3\2\2\2\u0089\u0088\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\5,\27\2\u008c"+
		"\u008d\5\64\33\2\u008d\u008e\5.\30\2\u008e\u00a4\3\2\2\2\u008f\u0090\5"+
		".\30\2\u0090\u0091\5\64\33\2\u0091\u0092\5,\27\2\u0092\u00a4\3\2\2\2\u0093"+
		"\u0094\5,\27\2\u0094\u0095\5\64\33\2\u0095\u0096\7\13\2\2\u0096\u0097"+
		"\5\6\4\2\u0097\u0098\7\4\2\2\u0098\u00a4\3\2\2\2\u0099\u009a\7\13\2\2"+
		"\u009a\u009b\5\6\4\2\u009b\u009c\7\4\2\2\u009c\u009d\5\64\33\2\u009d\u009e"+
		"\5,\27\2\u009e\u00a4\3\2\2\2\u009f\u00a0\5,\27\2\u00a0\u00a1\5\64\33\2"+
		"\u00a1\u00a2\5,\27\2\u00a2\u00a4\3\2\2\2\u00a3\u008b\3\2\2\2\u00a3\u008f"+
		"\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00a6\5,\27\2\u00a6\u00a7\5@!\2\u00a7\u00a8\5.\30\2"+
		"\u00a8\u00be\3\2\2\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\5@!\2\u00ab\u00ac"+
		"\5,\27\2\u00ac\u00be\3\2\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\5@!\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2\7\4\2\2\u00b2\u00be\3"+
		"\2\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7\4\2\2\u00b6"+
		"\u00b7\5@!\2\u00b7\u00b8\5,\27\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\5,\27"+
		"\2\u00ba\u00bb\5@!\2\u00bb\u00bc\5,\27\2\u00bc\u00be\3\2\2\2\u00bd\u00a5"+
		"\3\2\2\2\u00bd\u00a9\3\2\2\2\u00bd\u00ad\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c5\5\30\r\2\u00c0\u00c1\5\30"+
		"\r\2\u00c1\u00c2\7\26\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\5\34\17"+
		"\2\u00c7\31\3\2\2\2\u00c8\u00c9\5\34\17\2\u00c9\33\3\2\2\2\u00ca\u00d0"+
		"\5\36\20\2\u00cb\u00cc\5\66\34\2\u00cc\u00cd\5\36\20\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d9\5 \21"+
		"\2\u00d4\u00d5\58\35\2\u00d5\u00d6\5 \21\2\u00d6\u00d8\3\2\2\2\u00d7\u00d4"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\37\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e2\5\"\22\2\u00dd\u00de\5:\36"+
		"\2\u00de\u00df\5\"\22\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00eb\5$\23\2\u00e6\u00e7\5<\37\2\u00e7\u00e8"+
		"\5$\23\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee\u00ef\5> \2\u00ef\u00f0\5&\24\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3"+
		"\5&\24\2\u00f2\u00ee\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3%\3\2\2\2\u00f4"+
		"\u00fa\5(\25\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8"+
		"\7\4\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa"+
		"\'\3\2\2\2\u00fb\u0102\5\60\31\2\u00fc\u00fd\5\60\31\2\u00fd\u00fe\7\13"+
		"\2\2\u00fe\u00ff\5*\26\2\u00ff\u0100\7\4\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0102)\3\2\2\2\u0103\u0106\5,\27\2"+
		"\u0104\u0106\5.\30\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u010e\3\2\2\2\u0107\u010a\7\6\2\2\u0108\u010b\5,\27\2\u0109"+
		"\u010b\5.\30\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u0107\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f+\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\30\2\2"+
		"\u0112-\3\2\2\2\u0113\u0114\7\31\2\2\u0114/\3\2\2\2\u0115\u0116\t\2\2"+
		"\2\u0116\61\3\2\2\2\u0117\u0118\7\30\2\2\u0118\63\3\2\2\2\u0119\u011a"+
		"\7\20\2\2\u011a\65\3\2\2\2\u011b\u011c\7\17\2\2\u011c\67\3\2\2\2\u011d"+
		"\u011e\7\5\2\2\u011e9\3\2\2\2\u011f\u0120\t\3\2\2\u0120;\3\2\2\2\u0121"+
		"\u0122\t\4\2\2\u0122=\3\2\2\2\u0123\u0124\t\5\2\2\u0124?\3\2\2\2\u0125"+
		"\u0126\7\16\2\2\u0126A\3\2\2\2\31EKQ[ajms\u0084\u0089\u00a3\u00bd\u00c4"+
		"\u00d0\u00d9\u00e2\u00eb\u00f2\u00f9\u0101\u0105\u010a\u010e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}