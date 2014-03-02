package de.alexhein.graphgenerator.parsers.mecore;



// Generated from Mecoregrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class MecoregrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MecoregrammarVisitor<T> {
	@Override public T visitAtom(MecoregrammarParser.AtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitValueid(MecoregrammarParser.ValueidContext ctx) { return visitChildren(ctx); }

	@Override public T visitImplication(MecoregrammarParser.ImplicationContext ctx) { return visitChildren(ctx); }

	@Override public T visitForm(MecoregrammarParser.FormContext ctx) { return visitChildren(ctx); }

	@Override public T visitProbconds(MecoregrammarParser.ProbcondsContext ctx) { return visitChildren(ctx); }

	@Override public T visitDisjunction(MecoregrammarParser.DisjunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitParentform(MecoregrammarParser.ParentformContext ctx) { return visitChildren(ctx); }

	@Override public T visitConcl(MecoregrammarParser.ConclContext ctx) { return visitChildren(ctx); }

	@Override public T visitConjunction(MecoregrammarParser.ConjunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitVardef(MecoregrammarParser.VardefContext ctx) { return visitChildren(ctx); }

	@Override public T visitCond(MecoregrammarParser.CondContext ctx) { return visitChildren(ctx); }

	@Override public T visitNegation(MecoregrammarParser.NegationContext ctx) { return visitChildren(ctx); }

	@Override public T visitMecoresig(MecoregrammarParser.MecoresigContext ctx) { return visitChildren(ctx); }

	@Override public T visitValues(MecoregrammarParser.ValuesContext ctx) { return visitChildren(ctx); }

	@Override public T visitProbcond(MecoregrammarParser.ProbcondContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrem(MecoregrammarParser.PremContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarid(MecoregrammarParser.VaridContext ctx) { return visitChildren(ctx); }
}