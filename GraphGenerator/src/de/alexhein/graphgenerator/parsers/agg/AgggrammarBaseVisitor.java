package de.alexhein.graphgenerator.parsers.agg;

// Generated from Agggrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class AgggrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AgggrammarVisitor<T> {
	@Override public T visitAtom(AgggrammarParser.AtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitNeqconstr(AgggrammarParser.NeqconstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitCoimplic(AgggrammarParser.CoimplicContext ctx) { return visitChildren(ctx); }

	@Override public T visitDisjunction(AgggrammarParser.DisjunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitArgs(AgggrammarParser.ArgsContext ctx) { return visitChildren(ctx); }

	@Override public T visitParentform(AgggrammarParser.ParentformContext ctx) { return visitChildren(ctx); }

	@Override public T visitConjunction(AgggrammarParser.ConjunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitCond(AgggrammarParser.CondContext ctx) { return visitChildren(ctx); }

	@Override public T visitConst_id(AgggrammarParser.Const_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitNegation(AgggrammarParser.NegationContext ctx) { return visitChildren(ctx); }

	@Override public T visitSortdef(AgggrammarParser.SortdefContext ctx) { return visitChildren(ctx); }

	@Override public T visitPred_id(AgggrammarParser.Pred_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitProbcond(AgggrammarParser.ProbcondContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqu(AgggrammarParser.EquContext ctx) { return visitChildren(ctx); }

	@Override public T visitSort_id(AgggrammarParser.Sort_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitNequ(AgggrammarParser.NequContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstrs(AgggrammarParser.ConstrsContext ctx) { return visitChildren(ctx); }

	@Override public T visitImplication(AgggrammarParser.ImplicationContext ctx) { return visitChildren(ctx); }

	@Override public T visitImplic(AgggrammarParser.ImplicContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggsig(AgggrammarParser.AggsigContext ctx) { return visitChildren(ctx); }

	@Override public T visitForm(AgggrammarParser.FormContext ctx) { return visitChildren(ctx); }

	@Override public T visitOr(AgggrammarParser.OrContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar_id(AgggrammarParser.Var_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitConsts(AgggrammarParser.ConstsContext ctx) { return visitChildren(ctx); }

	@Override public T visitConcl(AgggrammarParser.ConclContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqconstr(AgggrammarParser.EqconstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitPreddef(AgggrammarParser.PreddefContext ctx) { return visitChildren(ctx); }

	@Override public T visitAnd(AgggrammarParser.AndContext ctx) { return visitChildren(ctx); }

	@Override public T visitNot(AgggrammarParser.NotContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrem(AgggrammarParser.PremContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstr(AgggrammarParser.ConstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitSorts(AgggrammarParser.SortsContext ctx) { return visitChildren(ctx); }
}