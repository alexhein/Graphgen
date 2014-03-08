package de.alexhein.graphgenerator.parsers.fopcl;

// Generated from Fopclgrammar.g4 by ANTLR 4.0

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface FopclgrammarVisitor<T> extends ParseTreeVisitor<T> {
	T visitAtom(FopclgrammarParser.AtomContext ctx);

	T visitNeqconstr(FopclgrammarParser.NeqconstrContext ctx);

	T visitCoimplic(FopclgrammarParser.CoimplicContext ctx);

	T visitDisjunction(FopclgrammarParser.DisjunctionContext ctx);

	T visitArgs(FopclgrammarParser.ArgsContext ctx);

	T visitParentform(FopclgrammarParser.ParentformContext ctx);

	T visitConjunction(FopclgrammarParser.ConjunctionContext ctx);

	T visitCond(FopclgrammarParser.CondContext ctx);

	T visitConst_id(FopclgrammarParser.Const_idContext ctx);

	T visitNegation(FopclgrammarParser.NegationContext ctx);

	T visitSortdef(FopclgrammarParser.SortdefContext ctx);

	T visitFopclsig(FopclgrammarParser.FopclsigContext ctx);

	T visitPred_id(FopclgrammarParser.Pred_idContext ctx);

	T visitProbcond(FopclgrammarParser.ProbcondContext ctx);

	T visitEqu(FopclgrammarParser.EquContext ctx);

	T visitSort_id(FopclgrammarParser.Sort_idContext ctx);

	T visitNequ(FopclgrammarParser.NequContext ctx);

	T visitConstrs(FopclgrammarParser.ConstrsContext ctx);

	T visitImplication(FopclgrammarParser.ImplicationContext ctx);

	T visitImplic(FopclgrammarParser.ImplicContext ctx);

	T visitForm(FopclgrammarParser.FormContext ctx);

	T visitOr(FopclgrammarParser.OrContext ctx);

	T visitVar_id(FopclgrammarParser.Var_idContext ctx);

	T visitConsts(FopclgrammarParser.ConstsContext ctx);

	T visitConcl(FopclgrammarParser.ConclContext ctx);

	T visitEqconstr(FopclgrammarParser.EqconstrContext ctx);

	T visitPreddef(FopclgrammarParser.PreddefContext ctx);

	T visitAnd(FopclgrammarParser.AndContext ctx);

	T visitNot(FopclgrammarParser.NotContext ctx);

	T visitPrem(FopclgrammarParser.PremContext ctx);

	T visitConstr(FopclgrammarParser.ConstrContext ctx);

	T visitSorts(FopclgrammarParser.SortsContext ctx);
}