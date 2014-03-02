package de.alexhein.graphgenerator.parsers.agg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.tree.RuleNode;

import de.alexhein.graphgenerator.logic.*;
import de.alexhein.graphgenerator.logic.constraint.Constraint;
import de.alexhein.graphgenerator.logic.constraint.ConstraintConjunction;
import de.alexhein.graphgenerator.logic.constraint.ConstraintEqual;
import de.alexhein.graphgenerator.logic.constraint.ConstraintNotEqual;
import de.alexhein.graphgenerator.logic.scopes.*;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.ConjunctionContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.Const_idContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.ConstrContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.DisjunctionContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.ImplicationContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.NegationContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.PreddefContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.ProbcondContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.Sort_idContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.SortdefContext;
import de.alexhein.graphgenerator.parsers.agg.AgggrammarParser.Var_idContext;

public class AggKBBuilder extends AgggrammarBaseVisitor<Object> {
	
	private Sort currentSort = null;
	private SortScope sscope = new SortScope();
	private ConstantScope cscope = new ConstantScope();
	private RelTypeScope rscope = new RelTypeScope();
	private VariableScope currvarscope = null;
	
	
	
	
	@Override 
	public Relation visitAtom(AgggrammarParser.AtomContext ctx){
		
		
		String p = (String) visit(ctx.pred_id());
		String[] a = (String[]) visit(ctx.args());
		
		RelType rt = rscope.getRelType(p);
		if(rt == null) {
			System.err.println("Undefined predicate symbol " + p + "." );
			System.exit(0);
		}
		if(rt.getArity() != a.length) {
			System.err.println("Mismatch in Argument length.");
			System.exit(0);
		}
		
		Argument[] aarr = new Argument[a.length];
				
		for(int i=0; i<a.length; i++) {
			Sort currsort = rt.getArgSort(i);
			if(cscope.getConstant(a[i]) != null) {
				aarr[i] = cscope.getConstant(a[i]);
			}
			else {
				
				aarr[i] = currvarscope.getInstance(a[i], currsort);			
			}		
		}
		Relation r = new Relation(rt, aarr);
		return r;
	}

	@Override 
	public ConstraintConjunction visitConstrs(AgggrammarParser.ConstrsContext ctx) {
		List<ConstrContext> l = ctx.constr();
		Iterator<ConstrContext> it = l.iterator();
		Constraint[] cstrs = new Constraint[l.size()];
		int i=0;
		while(it.hasNext())
			cstrs[i++] = (Constraint) visit(it.next());
		
		return new ConstraintConjunction(cstrs); 
	}
	
	@Override 
	public ConstraintEqual visitEqconstr(AgggrammarParser.EqconstrContext ctx) { 
		Variable var = currvarscope.getVariable((String) visit(ctx.var_id())); //var kommt nicht vor???
		List<Constant> clist = new LinkedList<Constant>();
		if(ctx.const_id() != null){
			String cstr = (String) visit(ctx.const_id());
			Constant c = cscope.getConstant(cstr); //????
			clist.add(c);
			return new ConstraintEqual(var,clist);
		}
		else {
			String[] cstrs = (String[]) visit(ctx.consts());
			Constant c;
			for(int i=0; i<cstrs.length; i++) {
				 c = cscope.getConstant(cstrs[i]); //????
				 clist.add(c);
			}
			return new ConstraintEqual(var,clist);
		}
	}

	
	@Override 
	public ConstraintNotEqual visitNeqconstr(AgggrammarParser.NeqconstrContext ctx) { 

		ConstraintNotEqual cstr;
		Iterator<Var_idContext> it = ctx.var_id().iterator();
		
		String sv1 = (String) visit(it.next());
		Variable v1 = currvarscope.getVariable(sv1); // Variable kommt nicht in Formel vor?
		
		
		if(it.hasNext()){
			// Constraint of the form X!=Y
			String sv2 =  (String) visit(it.next());
			Variable v2 = currvarscope.getVariable(sv2); 
			cstr = new ConstraintNotEqual(v1,v2);		
		}
		else {
			LinkedList<Constant> clist = new LinkedList<Constant>();
			if(ctx.const_id() != null) {
		
				String cs = (String) visit(ctx.const_id());
				Constant c = cscope.getConstant(cs);
				clist.add(c);
				cstr = new ConstraintNotEqual(v1,clist);
			}
			else {
				
				String[] css = (String[]) visit(ctx.consts());
				Constant c;
				for(int i=0; i<css.length; i++) {
					 c = cscope.getConstant(css[i]);
					 clist.add(c);
				}
				cstr = new ConstraintNotEqual(v1,clist);
			}
		}
		return cstr;
	}

//	@Override public T visitCoimplic(AgggrammarParser.CoimplicContext ctx) { return visitChildren(ctx); }



	@Override 
	public String[] visitArgs(AgggrammarParser.ArgsContext ctx) {
	
		int nbargs;
		if(ctx.getChildCount() <= 1){
			//none or only one argument
			nbargs = ctx.getChildCount();
		}
		else {
			nbargs = (ctx.getChildCount() + 1) / 2;
		}
		String[] argarr = new String[nbargs];
		for(int i=0; i<nbargs; i++) {
			argarr[i] = (String) visit(ctx.getChild(i*2));
		}
		
		
		
	return argarr;		
	}

//	@Override public T visitParentform(AgggrammarParser.ParentformContext ctx) { return visitChildren(ctx); }



//	

	@Override 
	public String visitConst_id(AgggrammarParser.Const_idContext ctx) { 
		return ctx.getChild(0).toString(); 
	}

//	@Override public T visitNegation(AgggrammarParser.NegationContext ctx) { return visitChildren(ctx); }

	@Override 
	public Sort visitSortdef(AgggrammarParser.SortdefContext ctx) { 
		
		String sname = (String) visit(ctx.sort_id());
		String[] cnames = (String[]) visit(ctx.consts());
		Constant[] carr = new Constant[cnames.length];
		
		for(int i=0; i<cnames.length; i++)
			carr[i] = cscope.getInstance(cnames[i]);
		
		Sort s = sscope.getInstance(sname, carr);
		
		return s; 
	}

	@Override 
	public String visitPred_id(AgggrammarParser.Pred_idContext ctx) { 
		return ctx.getChild(0).toString(); }



//	@Override public T visitEqu(AgggrammarParser.EquContext ctx) { return visitChildren(ctx); }

	@Override 
	public String visitSort_id(AgggrammarParser.Sort_idContext ctx) {
		return ctx.getChild(0).toString();
	}

//	@Override 
//	public  visitNequ(AgggrammarParser.NequContext ctx) {
//		
//		return visitChildren(ctx); 
//	}





	@Override 
	public LogicalFormula visitImplic(AgggrammarParser.ImplicContext ctx) { 
	
		return null; }

	@Override 
	public ProbCondKnowBase visitAggsig(AgggrammarParser.AggsigContext ctx) { 
		
	
		Iterator<SortdefContext> sdi = ctx.sortdef().iterator();
		while(sdi.hasNext()) 
			visit(sdi.next());
		
		Iterator<PreddefContext> pdi = ctx.preddef().iterator();
		while(pdi.hasNext())
			visit(pdi.next());
		
		
		ProbCondKnowBase kb = new ProbCondKnowBase(rscope, sscope, cscope);
		
		Iterator<ProbcondContext> pci = ctx.probcond().iterator();
		while(pci.hasNext())
			kb.addProbConstrCond((ProbConstrConditional) visit(pci.next()));
			
 		return kb; 
 	}

	
//	@Override public T visitOr(AgggrammarParser.OrContext ctx) { return visitChildren(ctx); }

	@Override public String visitVar_id(AgggrammarParser.Var_idContext ctx) { 
		return ctx.getChild(0).toString(); }

	@Override public String[] visitConsts(AgggrammarParser.ConstsContext ctx) { 
		
		List<Const_idContext> l = ctx.const_id();
		Iterator<Const_idContext> i = l.iterator();
		String[] s = new String[l.size()];
		int c = 0;
		while(i.hasNext())
			s[c++] = (String) visit(i.next());
		
		return s;
		
		//String[] s = new String[1];
		//s[0] = "12";
		// return s;
		//return visitChildren(ctx); 
	}

//	@Override public T visitConcl(AgggrammarParser.ConclContext ctx) { return visitChildren(ctx); }


	@Override public RelType visitPreddef(AgggrammarParser.PreddefContext ctx) { 
		String rname = (String) visit(ctx.pred_id());
		String[] snames = (String[]) visit(ctx.sorts());
		
        Sort[] sarr = new Sort[snames.length];
		
		for(int i=0; i<snames.length; i++){
			Sort s = sscope.getSort(snames[i]);
			if(s == null){
				System.err.println("Undeclared Sort in Def. of Relation.");
				System.exit(0);
			}
			else {
				sarr[i] = s;
			}
		}
		RelType rt = rscope.getInstance(rname, sarr);
	
		return rt;
	}

//	@Override public T visitAnd(AgggrammarParser.AndContext ctx) { return visitChildren(ctx); }

//	@Override public T visitNot(AgggrammarParser.NotContext ctx) { return visitChildren(ctx); }

//	@Override public T visitPrem(AgggrammarParser.PremContext ctx) { return visitChildren(ctx); }

//	@Override public T visitConstr(AgggrammarParser.ConstrContext ctx) { return visitChildren(ctx); }

	@Override 
	public ProbConstrConditional visitProbcond(AgggrammarParser.ProbcondContext ctx) {
		currvarscope = new VariableScope();
		LogicalFormula[] prem_con = (LogicalFormula[]) visit(ctx.cond()); //vor constr.!!
		Constraint cstr = null;
		if(ctx.constrs() != null)
			cstr = (Constraint) visit(ctx.constrs());
		double p = Double.valueOf(ctx.PROB().toString());
		
		ProbConstrConditional pcc = new ProbConstrConditional
				(prem_con[0], prem_con[1], p, cstr, currvarscope);
	
		return pcc; 
	}
	
	@Override 
	public String[] visitSorts(AgggrammarParser.SortsContext ctx) { 
		List<Sort_idContext> l = ctx.sort_id();
		Iterator<Sort_idContext> i = l.iterator();
		String[] s = new String[l.size()];
		int c = 0;
		while(i.hasNext())
			s[c++] = (String) visit(i.next());
		
		return s;
	}
	
	@Override 
	public LogicalFormula[] visitCond(AgggrammarParser.CondContext ctx) {
		LogicalFormula[] premcon = {null, null};
		if(ctx.prem() != null)
			premcon[0] = (LogicalFormula) visit(ctx.prem());
		premcon[1] = (LogicalFormula) visit(ctx.concl());		
		return premcon; 
	}
	
	@Override 
	public LogicalFormula visitForm(AgggrammarParser.FormContext ctx) { 
		List<ImplicationContext> l = ctx.implication();
		Iterator<ImplicationContext> it = l.iterator();
		if(l.size() == 1)
			return (LogicalFormula) visit(it.next());
		else {	
			LogicalFormula ant = (LogicalFormula) visit(it.next());
			LogicalFormula con = (LogicalFormula) visit(it.next());
			EquivalenceFormula ef = new EquivalenceFormula(ant,con);
			while(it.hasNext()) {
				ant = ef;
				con = (LogicalFormula) visit(it.next());
				ef = new EquivalenceFormula(ant,con);
			}
			return ef;
		}
	}
	@Override 
	public LogicalFormula visitImplication(AgggrammarParser.ImplicationContext ctx) { 
		List<DisjunctionContext> l = ctx.disjunction();
		Iterator<DisjunctionContext> it = l.iterator();
		if(l.size() == 1)
			return (LogicalFormula) visit(it.next());
		else {	
			LogicalFormula ant = (LogicalFormula) visit(it.next());
			LogicalFormula con = (LogicalFormula) visit(it.next());
			ImplicationFormula imf = new ImplicationFormula(ant,con);
			while(it.hasNext()) {
				ant = imf;
				con = (LogicalFormula) visit(it.next());
				imf = new ImplicationFormula(ant,con);
			}
			return imf;
		} 
	}
	@Override 
	public LogicalFormula visitDisjunction(AgggrammarParser.DisjunctionContext ctx) { 
		List<ConjunctionContext> l = ctx.conjunction();
		Iterator<ConjunctionContext> it = l.iterator();
		if(l.size() == 1)
			return (LogicalFormula) visit(it.next());
		else {	
			LogicalFormula dis1 = (LogicalFormula) visit(it.next());
			LogicalFormula dis2 = (LogicalFormula) visit(it.next());
			DisjunctionFormula djf = new DisjunctionFormula(dis1,dis2);
			while(it.hasNext()) {
				dis1 = djf;
				dis2 = (LogicalFormula) visit(it.next());
				djf = new DisjunctionFormula(dis1,dis2);
			}
			return djf;
		} 
	}
	@Override 
	public LogicalFormula visitConjunction(AgggrammarParser.ConjunctionContext ctx) { 
		List<NegationContext> l = ctx.negation();
		Iterator<NegationContext> it = l.iterator();
		if(l.size() == 1)
			return (LogicalFormula) visit(it.next());
		else {	
			LogicalFormula con1 = (LogicalFormula) visit(it.next());
			LogicalFormula con2 = (LogicalFormula) visit(it.next());
			ConjunctionFormula cjf = new ConjunctionFormula(con1,con2);
			while(it.hasNext()) {
				con1 = cjf;
				con2 = (LogicalFormula) visit(it.next());
				cjf = new ConjunctionFormula(con1,con2);
			}
			return cjf;
		} 
	}
	@Override 
	public LogicalFormula visitNegation(AgggrammarParser.NegationContext ctx) { 
		if(ctx.not() == null) 
			return (LogicalFormula) visit(ctx.parentform());
		else
			return new NegationFormula((LogicalFormula) visit(ctx.parentform()));
	}
	@Override 
	public LogicalFormula visitParentform(AgggrammarParser.ParentformContext ctx) { 
		if(ctx.atom() != null)
			return (LogicalFormula) visit(ctx.atom());
		else
			return (LogicalFormula) visit(ctx.form());
	}
	

}
