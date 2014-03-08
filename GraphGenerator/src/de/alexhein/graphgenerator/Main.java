package de.alexhein.graphgenerator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import de.alexhein.graphgenerator.logic.InstantiationSet;
import de.alexhein.graphgenerator.logic.ProbCondKnowBase;
import de.alexhein.graphgenerator.logic.Relation;
import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.ConstantScope;
import de.alexhein.graphgenerator.logic.scopes.RelTypeScope;
import de.alexhein.graphgenerator.logic.scopes.Sort;
import de.alexhein.graphgenerator.logic.scopes.SortScope;
import de.alexhein.graphgenerator.logic.scopes.Variable;
import de.alexhein.graphgenerator.logic.scopes.VariableScope;
import de.alexhein.graphgenerator.parsers.mecore.*;
import de.alexhein.graphgenerator.parsers.agg.*;
import de.alexhein.graphgenerator.parsers.fopcl.FopclKBBuilder;
import de.alexhein.graphgenerator.parsers.fopcl.FopclgrammarLexer;
import de.alexhein.graphgenerator.parsers.fopcl.FopclgrammarParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		/*
		File f = new File("/home/alex/workspace/GraphGenerator/fgddfs/BT.mecore");
		InputStream is = null;
		ANTLRInputStream input = null;
		try {
		    is = new FileInputStream(f);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MecoregrammarLexer lexer = new MecoregrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MecoregrammarParser parser = new MecoregrammarParser(tokens);
		ParseTree tree = parser.mecoresig(); // parse; start at prog
		MecoreKBBuilder mkb = new MecoreKBBuilder();
		ProbCondKnowBase kb = (ProbCondKnowBase) mkb.visit(tree);
	//	System.out.println(kb.toString());
	//	System.out.println(kb.ground().toString());
		
		*/
		
	/*	
		File f = new File("/home/alex/workspace/GraphGenerator/fgddfs/elephants.agg");
		InputStream is = null;
		ANTLRInputStream input = null;
		try {
		    is = new FileInputStream(f);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AgggrammarLexer lexer = new AgggrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		AgggrammarParser parser = new AgggrammarParser(tokens);
		ParseTree tree = parser.aggsig(); // parse; start at prog
	
		AggKBBuilder mkb = new AggKBBuilder();
		ProbCondKnowBase kb = (ProbCondKnowBase) mkb.visit(tree);
	//	System.out.println(kb.toString());
	//	System.out.println(kb.ground().toString());
		
		RelTypeScope rts = kb.getRelTypeScope();
		*/
		
		File f = new File("/home/alex/git/ggen/GraphGenerator/fgddfs/ex01.fopcl");
		InputStream is = null;
		ANTLRInputStream input = null;
		try {
		    is = new FileInputStream(f);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FopclgrammarLexer lexer = new FopclgrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FopclgrammarParser parser = new FopclgrammarParser(tokens);
		ParseTree tree = parser.fopclsig(); // parse; start at prog
	
		FopclKBBuilder mkb = new FopclKBBuilder();
		ProbCondKnowBase kb = (ProbCondKnowBase) mkb.visit(tree);
		System.out.println(kb.toString());
	//	System.out.println(kb.ground().toString());	
		
		
		
		/*
		ConstantScope cs = new ConstantScope();
		Constant a1 = cs.getInstance("a1");
		Constant a2 = cs.getInstance("a2");
		Constant a3 = cs.getInstance("a3");
		Constant[] aa = {a1, a2, a3};
		Constant b1 = cs.getInstance("b1");
		Constant b2 = cs.getInstance("b2");
		Constant b3 = cs.getInstance("b3");
		Constant[] bb = {b1, b2, b3};
		SortScope sscope = new SortScope();
		Sort asort = sscope.getInstance("asort", aa);
		Sort bsort = sscope.getInstance("bsort", bb);
		
		VariableScope vscope = new VariableScope();
		Variable X = vscope.getInstance("X", asort);
		Variable Y = vscope.getInstance("Y", bsort);
		
		Iterator<InstantiationSet> i = InstantiationSet.generateAllInsts(vscope).iterator();
		
		while(i.hasNext())
			System.out.println(i.next().toString());
		*/
		
		
	}

}
