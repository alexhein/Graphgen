package de.alexhein.graphgenerator.parsers.mecore;

// Generated from Mecoregrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface MecoregrammarVisitor<T> extends ParseTreeVisitor<T> {
	T visitAtom(MecoregrammarParser.AtomContext ctx);

	T visitValueid(MecoregrammarParser.ValueidContext ctx);

	T visitImplication(MecoregrammarParser.ImplicationContext ctx);

	T visitForm(MecoregrammarParser.FormContext ctx);

	T visitProbconds(MecoregrammarParser.ProbcondsContext ctx);

	T visitDisjunction(MecoregrammarParser.DisjunctionContext ctx);

	T visitParentform(MecoregrammarParser.ParentformContext ctx);

	T visitConcl(MecoregrammarParser.ConclContext ctx);

	T visitConjunction(MecoregrammarParser.ConjunctionContext ctx);

	T visitVardef(MecoregrammarParser.VardefContext ctx);

	T visitCond(MecoregrammarParser.CondContext ctx);

	T visitNegation(MecoregrammarParser.NegationContext ctx);

	T visitMecoresig(MecoregrammarParser.MecoresigContext ctx);

	T visitValues(MecoregrammarParser.ValuesContext ctx);

	T visitProbcond(MecoregrammarParser.ProbcondContext ctx);

	T visitPrem(MecoregrammarParser.PremContext ctx);

	T visitVarid(MecoregrammarParser.VaridContext ctx);
}