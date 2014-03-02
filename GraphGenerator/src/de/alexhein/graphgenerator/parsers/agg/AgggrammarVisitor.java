package de.alexhein.graphgenerator.parsers.agg;

// Generated from Agggrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface AgggrammarVisitor<T> extends ParseTreeVisitor<T> {
	T visitAtom(AgggrammarParser.AtomContext ctx);

	T visitNeqconstr(AgggrammarParser.NeqconstrContext ctx);

	T visitCoimplic(AgggrammarParser.CoimplicContext ctx);

	T visitDisjunction(AgggrammarParser.DisjunctionContext ctx);

	T visitArgs(AgggrammarParser.ArgsContext ctx);

	T visitParentform(AgggrammarParser.ParentformContext ctx);

	T visitConjunction(AgggrammarParser.ConjunctionContext ctx);

	T visitCond(AgggrammarParser.CondContext ctx);

	T visitConst_id(AgggrammarParser.Const_idContext ctx);

	T visitNegation(AgggrammarParser.NegationContext ctx);

	T visitSortdef(AgggrammarParser.SortdefContext ctx);

	T visitPred_id(AgggrammarParser.Pred_idContext ctx);

	T visitProbcond(AgggrammarParser.ProbcondContext ctx);

	T visitEqu(AgggrammarParser.EquContext ctx);

	T visitSort_id(AgggrammarParser.Sort_idContext ctx);

	T visitNequ(AgggrammarParser.NequContext ctx);

	T visitConstrs(AgggrammarParser.ConstrsContext ctx);

	T visitImplication(AgggrammarParser.ImplicationContext ctx);

	T visitImplic(AgggrammarParser.ImplicContext ctx);

	T visitAggsig(AgggrammarParser.AggsigContext ctx);

	T visitForm(AgggrammarParser.FormContext ctx);

	T visitOr(AgggrammarParser.OrContext ctx);

	T visitVar_id(AgggrammarParser.Var_idContext ctx);

	T visitConsts(AgggrammarParser.ConstsContext ctx);

	T visitConcl(AgggrammarParser.ConclContext ctx);

	T visitEqconstr(AgggrammarParser.EqconstrContext ctx);

	T visitPreddef(AgggrammarParser.PreddefContext ctx);

	T visitAnd(AgggrammarParser.AndContext ctx);

	T visitNot(AgggrammarParser.NotContext ctx);

	T visitPrem(AgggrammarParser.PremContext ctx);

	T visitConstr(AgggrammarParser.ConstrContext ctx);

	T visitSorts(AgggrammarParser.SortsContext ctx);
}