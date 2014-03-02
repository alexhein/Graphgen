package de.alexhein.graphgenerator.parsers.agg;

// Generated from Agggrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface AgggrammarListener extends ParseTreeListener {
	void enterAtom(AgggrammarParser.AtomContext ctx);
	void exitAtom(AgggrammarParser.AtomContext ctx);

	void enterNeqconstr(AgggrammarParser.NeqconstrContext ctx);
	void exitNeqconstr(AgggrammarParser.NeqconstrContext ctx);

	void enterCoimplic(AgggrammarParser.CoimplicContext ctx);
	void exitCoimplic(AgggrammarParser.CoimplicContext ctx);

	void enterDisjunction(AgggrammarParser.DisjunctionContext ctx);
	void exitDisjunction(AgggrammarParser.DisjunctionContext ctx);

	void enterArgs(AgggrammarParser.ArgsContext ctx);
	void exitArgs(AgggrammarParser.ArgsContext ctx);

	void enterParentform(AgggrammarParser.ParentformContext ctx);
	void exitParentform(AgggrammarParser.ParentformContext ctx);

	void enterConjunction(AgggrammarParser.ConjunctionContext ctx);
	void exitConjunction(AgggrammarParser.ConjunctionContext ctx);

	void enterCond(AgggrammarParser.CondContext ctx);
	void exitCond(AgggrammarParser.CondContext ctx);

	void enterConst_id(AgggrammarParser.Const_idContext ctx);
	void exitConst_id(AgggrammarParser.Const_idContext ctx);

	void enterNegation(AgggrammarParser.NegationContext ctx);
	void exitNegation(AgggrammarParser.NegationContext ctx);

	void enterSortdef(AgggrammarParser.SortdefContext ctx);
	void exitSortdef(AgggrammarParser.SortdefContext ctx);

	void enterPred_id(AgggrammarParser.Pred_idContext ctx);
	void exitPred_id(AgggrammarParser.Pred_idContext ctx);

	void enterProbcond(AgggrammarParser.ProbcondContext ctx);
	void exitProbcond(AgggrammarParser.ProbcondContext ctx);

	void enterEqu(AgggrammarParser.EquContext ctx);
	void exitEqu(AgggrammarParser.EquContext ctx);

	void enterSort_id(AgggrammarParser.Sort_idContext ctx);
	void exitSort_id(AgggrammarParser.Sort_idContext ctx);

	void enterNequ(AgggrammarParser.NequContext ctx);
	void exitNequ(AgggrammarParser.NequContext ctx);

	void enterConstrs(AgggrammarParser.ConstrsContext ctx);
	void exitConstrs(AgggrammarParser.ConstrsContext ctx);

	void enterImplication(AgggrammarParser.ImplicationContext ctx);
	void exitImplication(AgggrammarParser.ImplicationContext ctx);

	void enterImplic(AgggrammarParser.ImplicContext ctx);
	void exitImplic(AgggrammarParser.ImplicContext ctx);

	void enterAggsig(AgggrammarParser.AggsigContext ctx);
	void exitAggsig(AgggrammarParser.AggsigContext ctx);

	void enterForm(AgggrammarParser.FormContext ctx);
	void exitForm(AgggrammarParser.FormContext ctx);

	void enterOr(AgggrammarParser.OrContext ctx);
	void exitOr(AgggrammarParser.OrContext ctx);

	void enterVar_id(AgggrammarParser.Var_idContext ctx);
	void exitVar_id(AgggrammarParser.Var_idContext ctx);

	void enterConsts(AgggrammarParser.ConstsContext ctx);
	void exitConsts(AgggrammarParser.ConstsContext ctx);

	void enterConcl(AgggrammarParser.ConclContext ctx);
	void exitConcl(AgggrammarParser.ConclContext ctx);

	void enterEqconstr(AgggrammarParser.EqconstrContext ctx);
	void exitEqconstr(AgggrammarParser.EqconstrContext ctx);

	void enterPreddef(AgggrammarParser.PreddefContext ctx);
	void exitPreddef(AgggrammarParser.PreddefContext ctx);

	void enterAnd(AgggrammarParser.AndContext ctx);
	void exitAnd(AgggrammarParser.AndContext ctx);

	void enterNot(AgggrammarParser.NotContext ctx);
	void exitNot(AgggrammarParser.NotContext ctx);

	void enterPrem(AgggrammarParser.PremContext ctx);
	void exitPrem(AgggrammarParser.PremContext ctx);

	void enterConstr(AgggrammarParser.ConstrContext ctx);
	void exitConstr(AgggrammarParser.ConstrContext ctx);

	void enterSorts(AgggrammarParser.SortsContext ctx);
	void exitSorts(AgggrammarParser.SortsContext ctx);
}