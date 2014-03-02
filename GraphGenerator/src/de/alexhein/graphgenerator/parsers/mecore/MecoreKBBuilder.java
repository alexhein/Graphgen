package de.alexhein.graphgenerator.parsers.mecore;

import java.util.Iterator;
import java.util.List;

import de.alexhein.graphgenerator.logic.ConjunctionFormula;
import de.alexhein.graphgenerator.logic.DisjunctionFormula;
import de.alexhein.graphgenerator.logic.EquivalenceFormula;
import de.alexhein.graphgenerator.logic.ImplicationFormula;
import de.alexhein.graphgenerator.logic.LogicalFormula;
import de.alexhein.graphgenerator.logic.NegationFormula;
import de.alexhein.graphgenerator.logic.ProbCondKnowBase;
import de.alexhein.graphgenerator.logic.ProbConstrConditional;
import de.alexhein.graphgenerator.logic.Relation;
import de.alexhein.graphgenerator.logic.scopes.*;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.ConjunctionContext;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.DisjunctionContext;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.ImplicationContext;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.NegationContext;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.ProbcondContext;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.ValueidContext;
import de.alexhein.graphgenerator.parsers.mecore.MecoregrammarParser.VardefContext;

public class MecoreKBBuilder extends MecoregrammarBaseVisitor<Object> {

	private final ConstantScope cscope = new ConstantScope();
	private final RelTypeScope rscope = new RelTypeScope();
	private final SortScope sscope = new SortScope();
	
	@Override 
	public Relation visitAtom(MecoregrammarParser.AtomContext ctx) { 
		Relation r;
		String var_id_str = visitVarid(ctx.varid());
		RelType rt = rscope.getRelType(var_id_str);
		if(rt == null) {
			System.err.println("Variable" + var_id_str + "not defined");
			System.exit(0);
		}
		
			Constant[] carr;
			if(ctx.valueid() == null){
				carr = new Constant[0];
				return new Relation(rt, carr);
			}
			else {
				String val_str = visitValueid(ctx.valueid());
				Sort s = sscope.getSort(var_id_str);
				if(s == null) {
					System.err.println("Undeclared sort " + var_id_str + ".");
					System.exit(0);
				}
				Constant c = s.getConstant(val_str);
				if(c == null) {
					System.err.println("Value " + val_str + " not declared for Variable " + var_id_str + ".");
					System.exit(0);
				}
				carr = new Constant[1];
				carr[0] = c;
				return new Relation(rt, carr);
			}
			
		
		
	 }

	@Override 
	public String visitValueid(MecoregrammarParser.ValueidContext ctx) { 
		return ctx.getChild(0).toString();
	}
	@Override 
	public String visitVarid(MecoregrammarParser.VaridContext ctx) {
		return ctx.getChild(0).toString(); 
	}
	
	
	@Override 
	public Sort visitVardef(MecoregrammarParser.VardefContext ctx) { 
		Sort s = sscope.getInstance(visitVarid(ctx.varid()),visitValues(ctx.values()));
		Sort[] sarr;
		if(s.getSize() == 0)
				sarr = new Sort[0];
		else {
			sarr = new Sort[1];
			sarr[0] = s;
		}
			
		rscope.getInstance(s.getName(), sarr);
		return s;
	}
	@Override 
	public Constant[] visitValues(MecoregrammarParser.ValuesContext ctx) { 
		List<ValueidContext> vallist = ctx.valueid();
		Constant[] vals = new Constant[vallist.size()];
		Iterator<ValueidContext> it = vallist.iterator();
		int i = 0;
		while(it.hasNext())
			vals[i++] = cscope.getInstance(visitValueid(it.next()));
		return vals;
	}
	

	@Override 
	public LogicalFormula visitForm(MecoregrammarParser.FormContext ctx) { 
		if(ctx.getChildCount() == 1) {
			return visitImplication(ctx.implication(0));
		}
		else {
			Iterator<ImplicationContext> it = ctx.implication().iterator();
			LogicalFormula ant = visitImplication(it.next());
			LogicalFormula con = visitImplication(it.next());
			EquivalenceFormula eqf = new EquivalenceFormula(ant,con);
			while(it.hasNext()) {
				ant = eqf;
				con = (LogicalFormula) visit(it.next());
				eqf = new EquivalenceFormula(ant,con);
			}
			return eqf;
		}
	 }

	@Override 
	public LogicalFormula visitImplication(MecoregrammarParser.ImplicationContext ctx) {
		if(ctx.getChildCount() == 1) {
			return visitDisjunction(ctx.disjunction(0));
		}
		else {
			Iterator<DisjunctionContext> it = ctx.disjunction().iterator();
			LogicalFormula dis1 = visitDisjunction(it.next());
			LogicalFormula dis2 = visitDisjunction(it.next());
			ImplicationFormula imf = new ImplicationFormula(dis1,dis2);
			while(it.hasNext()) {
				dis1 = imf;
				dis2 = visitDisjunction(it.next());
				imf = new ImplicationFormula(dis1,dis2);
			}
			return imf;
		}
	}
	@Override 
	public LogicalFormula visitDisjunction(MecoregrammarParser.DisjunctionContext ctx) { 
		if(ctx.getChildCount() == 1) {
			return visitConjunction(ctx.conjunction(0));
		}
		else {
			Iterator<ConjunctionContext> it = ctx.conjunction().iterator();
			LogicalFormula con1 = visitConjunction(it.next());
			LogicalFormula con2 = visitConjunction(it.next());
			DisjunctionFormula djf = new DisjunctionFormula(con1,con2);


			while(it.hasNext()) {
				con1 = djf;
				con2 = visitConjunction(it.next());
				djf = new DisjunctionFormula(con1,con2);
			}

			return djf;
		}
	 }
	@Override 
	public LogicalFormula visitConjunction(MecoregrammarParser.ConjunctionContext ctx) { 
		if(ctx.getChildCount() == 1) {
			return visitNegation(ctx.negation(0));
		}
		else {
			Iterator<NegationContext> it = ctx.negation().iterator();
			LogicalFormula neg1 = visitNegation(it.next());
			LogicalFormula neg2 = visitNegation(it.next());
			ConjunctionFormula cnf = new ConjunctionFormula(neg1,neg2);
			while(it.hasNext()) {
				neg1 = cnf;
				neg2 = visitNegation(it.next());
				cnf = new ConjunctionFormula(neg1,neg2);
			}
			return cnf;
		}
	}
	@Override 
	public LogicalFormula visitNegation(MecoregrammarParser.NegationContext ctx) {
		if(ctx.NOT() == null)
			return visitParentform(ctx.parentform());
		else
			return new NegationFormula(visitParentform(ctx.parentform()));
	}
	@Override 
	public LogicalFormula visitParentform(MecoregrammarParser.ParentformContext ctx) { 
		if(ctx.atom() == null)
			return visitForm(ctx.form());
		else
			return visitAtom(ctx.atom());	
	}




//	@Override public T visitProbconds(MecoregrammarParser.ProbcondsContext ctx) { return visitChildren(ctx); }

//	@Override public T visitDisjunction(MecoregrammarParser.DisjunctionContext ctx) { return visitChildren(ctx); }


//	@Override public T visitConcl(MecoregrammarParser.ConclContext ctx) { return visitChildren(ctx); }




//	@Override public T visitCond(MecoregrammarParser.CondContext ctx) { return visitChildren(ctx); }


	@Override 
	public ProbCondKnowBase visitMecoresig(MecoregrammarParser.MecoresigContext ctx) { 
		
		
		Iterator<VardefContext> vit = ctx.vardef().iterator();
		while(vit.hasNext())
			visitVardef(vit.next());
		
		ProbCondKnowBase kb = new ProbCondKnowBase(rscope, sscope, cscope);
		
		Iterator<ProbcondContext> pit = ctx.probconds().probcond().iterator();
		while(pit.hasNext())
			kb.addProbConstrCond(visitProbcond(pit.next()));
		
		return kb;
	}



	@Override 
	public ProbConstrConditional visitProbcond(MecoregrammarParser.ProbcondContext ctx) { 
		LogicalFormula prem, concl;
		concl = visitForm(ctx.cond().concl().form());
		if (ctx.cond().prem() == null) 
			prem = null;
		else 
			prem = visitForm(ctx.cond().prem().form());
	
		return new ProbConstrConditional(prem, concl, Double.parseDouble(ctx.PROB().toString()), null, null);
		
	}

//	@Override public T visitPrem(MecoregrammarParser.PremContext ctx) { return visitChildren(ctx); }

	
}
