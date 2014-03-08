package de.alexhein.graphgenerator.parsers.fopcl;
// Generated from Fopclgrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class FopclgrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements FopclgrammarVisitor<T> {
	@Override public T visitAtom(FopclgrammarParser.AtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitNeqconstr(FopclgrammarParser.NeqconstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitCoimplic(FopclgrammarParser.CoimplicContext ctx) { return visitChildren(ctx); }

	@Override public T visitDisjunction(FopclgrammarParser.DisjunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitArgs(FopclgrammarParser.ArgsContext ctx) { return visitChildren(ctx); }

	@Override public T visitParentform(FopclgrammarParser.ParentformContext ctx) { return visitChildren(ctx); }

	@Override public T visitConjunction(FopclgrammarParser.ConjunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitCond(FopclgrammarParser.CondContext ctx) { return visitChildren(ctx); }

	@Override public T visitConst_id(FopclgrammarParser.Const_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitNegation(FopclgrammarParser.NegationContext ctx) { return visitChildren(ctx); }

	@Override public T visitSortdef(FopclgrammarParser.SortdefContext ctx) { return visitChildren(ctx); }

	@Override public T visitFopclsig(FopclgrammarParser.FopclsigContext ctx) { return visitChildren(ctx); }

	@Override public T visitPred_id(FopclgrammarParser.Pred_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitProbcond(FopclgrammarParser.ProbcondContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqu(FopclgrammarParser.EquContext ctx) { return visitChildren(ctx); }

	@Override public T visitSort_id(FopclgrammarParser.Sort_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitNequ(FopclgrammarParser.NequContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstrs(FopclgrammarParser.ConstrsContext ctx) { return visitChildren(ctx); }

	@Override public T visitImplication(FopclgrammarParser.ImplicationContext ctx) { return visitChildren(ctx); }

	@Override public T visitImplic(FopclgrammarParser.ImplicContext ctx) { return visitChildren(ctx); }

	@Override public T visitForm(FopclgrammarParser.FormContext ctx) { return visitChildren(ctx); }

	@Override public T visitOr(FopclgrammarParser.OrContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar_id(FopclgrammarParser.Var_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitConsts(FopclgrammarParser.ConstsContext ctx) { return visitChildren(ctx); }

	@Override public T visitConcl(FopclgrammarParser.ConclContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqconstr(FopclgrammarParser.EqconstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitPreddef(FopclgrammarParser.PreddefContext ctx) { return visitChildren(ctx); }

	@Override public T visitAnd(FopclgrammarParser.AndContext ctx) { return visitChildren(ctx); }

	@Override public T visitNot(FopclgrammarParser.NotContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrem(FopclgrammarParser.PremContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstr(FopclgrammarParser.ConstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitSorts(FopclgrammarParser.SortsContext ctx) { return visitChildren(ctx); }
}