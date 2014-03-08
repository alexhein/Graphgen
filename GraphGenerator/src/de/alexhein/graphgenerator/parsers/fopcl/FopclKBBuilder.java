/**
 * 
 */
package de.alexhein.graphgenerator.parsers.fopcl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import de.alexhein.graphgenerator.logic.Argument;
import de.alexhein.graphgenerator.logic.ConjunctionFormula;
import de.alexhein.graphgenerator.logic.DisjunctionFormula;
import de.alexhein.graphgenerator.logic.EquivalenceFormula;
import de.alexhein.graphgenerator.logic.ImplicationFormula;
import de.alexhein.graphgenerator.logic.LogicalFormula;
import de.alexhein.graphgenerator.logic.NegationFormula;
import de.alexhein.graphgenerator.logic.ProbCondKnowBase;
import de.alexhein.graphgenerator.logic.ProbConstrConditional;
import de.alexhein.graphgenerator.logic.Relation;
import de.alexhein.graphgenerator.logic.constraint.Constraint;
import de.alexhein.graphgenerator.logic.constraint.ConstraintConjunction;
import de.alexhein.graphgenerator.logic.constraint.ConstraintEqual;
import de.alexhein.graphgenerator.logic.constraint.ConstraintNotEqual;
import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.ConstantScope;
import de.alexhein.graphgenerator.logic.scopes.RelType;
import de.alexhein.graphgenerator.logic.scopes.RelTypeScope;
import de.alexhein.graphgenerator.logic.scopes.Sort;
import de.alexhein.graphgenerator.logic.scopes.SortScope;
import de.alexhein.graphgenerator.logic.scopes.Variable;
import de.alexhein.graphgenerator.logic.scopes.VariableScope;
import de.alexhein.graphgenerator.parsers.fopcl.FopclgrammarParser.*;


/**
 * @author alex
 *
 */
public class FopclKBBuilder extends FopclgrammarBaseVisitor<Object> {
	

	private Sort currentSort = null;
	private SortScope sscope = new SortScope();
	private ConstantScope cscope = new ConstantScope();
	private RelTypeScope rscope = new RelTypeScope();
	private VariableScope currvarscope = null;
	
	
	
	
	
	
	@Override 
	public Relation visitAtom(FopclgrammarParser.AtomContext ctx) {
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
	public ConstraintConjunction visitConstrs(FopclgrammarParser.ConstrsContext ctx) {
		List<ConstrContext> l = ctx.constr();
		Iterator<ConstrContext> it = l.iterator();
		Constraint[] cstrs = new Constraint[l.size()];
		int i=0;
		while(it.hasNext())
			cstrs[i++] = (Constraint) visit(it.next());
		
		return new ConstraintConjunction(cstrs); 
	}
	
	@Override 
	public ConstraintNotEqual visitNeqconstr(FopclgrammarParser.NeqconstrContext ctx) { 
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
	
	@Override 
	public ConstraintEqual visitEqconstr(FopclgrammarParser.EqconstrContext ctx) { 
		ConstraintEqual cstr;
		Iterator<Var_idContext> it = ctx.var_id().iterator();
		
		String sv1 = (String) visit(it.next());
		Variable v1 = currvarscope.getVariable(sv1); // Variable kommt nicht in Formel vor?
		
		
		if(it.hasNext()){
			// Constraint of the form X!=Y
			String sv2 =  (String) visit(it.next());
			Variable v2 = currvarscope.getVariable(sv2); 
			cstr = new ConstraintEqual(v1,v2);		
		}
		else {
			LinkedList<Constant> clist = new LinkedList<Constant>();
			if(ctx.const_id() != null) {
		
				String cs = (String) visit(ctx.const_id());
				Constant c = cscope.getConstant(cs);
				clist.add(c);
				cstr = new ConstraintEqual(v1,clist);
			}
			else {
				
				String[] css = (String[]) visit(ctx.consts());
				Constant c;
				for(int i=0; i<css.length; i++) {
					 c = cscope.getConstant(css[i]);
					 clist.add(c);
				}
				cstr = new ConstraintEqual(v1,clist);
			}
		}
		return cstr; 
	}
	
	@Override 
	public String[] visitArgs(FopclgrammarParser.ArgsContext ctx) {
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
	
	@Override 
	public String visitConst_id(FopclgrammarParser.Const_idContext ctx) { 
		return ctx.getChild(0).toString(); 
	}
	@Override 
	public Sort visitSortdef(FopclgrammarParser.SortdefContext ctx) { 
		String sname = (String) visit(ctx.sort_id());
		String[] cnames = (String[]) visit(ctx.consts());
		Constant[] carr = new Constant[cnames.length];
		
		for(int i=0; i<cnames.length; i++)
			carr[i] = cscope.getInstance(cnames[i]);
		
		Sort s = sscope.getInstance(sname, carr);
		
		return s; 
	}
	@Override 
	public String visitPred_id(FopclgrammarParser.Pred_idContext ctx) {
		return ctx.getChild(0).toString(); }
	
	@Override 
	public String visitSort_id(FopclgrammarParser.Sort_idContext ctx) { 
		return ctx.getChild(0).toString();
	}
	
	@Override
	public ProbCondKnowBase visitFopclsig(FopclgrammarParser.FopclsigContext ctx) {
		
		
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
	
	@Override public String visitVar_id(FopclgrammarParser.Var_idContext ctx) { 
		return ctx.getChild(0).toString(); }
	
	@Override public String[] visitConsts(FopclgrammarParser.ConstsContext ctx) { 
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
	
	@Override 
	public RelType visitPreddef(FopclgrammarParser.PreddefContext ctx) { 
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
	
	@Override 
	public ProbConstrConditional visitProbcond(FopclgrammarParser.ProbcondContext ctx) { 
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
	public String[] visitSorts(FopclgrammarParser.SortsContext ctx) { 
		List<Sort_idContext> l = ctx.sort_id();
		Iterator<Sort_idContext> i = l.iterator();
		String[] s = new String[l.size()];
		int c = 0;
		while(i.hasNext())
			s[c++] = (String) visit(i.next());
		
		return s;
	}
	
	@Override 
	public LogicalFormula[] visitCond(FopclgrammarParser.CondContext ctx) { 
		LogicalFormula[] premcon = {null, null};
		if(ctx.prem() != null)
			premcon[0] = (LogicalFormula) visit(ctx.prem());
		premcon[1] = (LogicalFormula) visit(ctx.concl());		
		return premcon; 
	}
	
	@Override 
	public LogicalFormula visitForm(FopclgrammarParser.FormContext ctx) { 
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
	
	@Override public LogicalFormula visitImplication(FopclgrammarParser.ImplicationContext ctx) { 
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
	public LogicalFormula visitDisjunction(FopclgrammarParser.DisjunctionContext ctx) { 
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
	public LogicalFormula visitConjunction(FopclgrammarParser.ConjunctionContext ctx) { 
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
	public LogicalFormula visitNegation(FopclgrammarParser.NegationContext ctx) { 
		if(ctx.not() == null) 
			return (LogicalFormula) visit(ctx.parentform());
		else
			return new NegationFormula((LogicalFormula) visit(ctx.parentform()));
	}
	
	@Override public LogicalFormula visitParentform(FopclgrammarParser.ParentformContext ctx) { 
		if(ctx.atom() != null)
			return (LogicalFormula) visit(ctx.atom());
		else
			return (LogicalFormula) visit(ctx.form());
	}

/*
 * 

	

	@Override public T visitCoimplic(FopclgrammarParser.CoimplicContext ctx) { return visitChildren(ctx); }

	
	

	

	

	

	


	

	

	

	

	@Override public T visitEqu(FopclgrammarParser.EquContext ctx) { return visitChildren(ctx); }

	

	@Override public T visitNequ(FopclgrammarParser.NequContext ctx) { return visitChildren(ctx); }

	

	

	@Override public T visitImplic(FopclgrammarParser.ImplicContext ctx) { return visitChildren(ctx); }

	

	@Override public T visitOr(FopclgrammarParser.OrContext ctx) { return visitChildren(ctx); }

	

	@Override public T visitConsts(FopclgrammarParser.ConstsContext ctx) { return visitChildren(ctx); }

	@Override public T visitConcl(FopclgrammarParser.ConclContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqconstr(FopclgrammarParser.EqconstrContext ctx) { return visitChildren(ctx); }

	

	@Override public T visitAnd(FopclgrammarParser.AndContext ctx) { return visitChildren(ctx); }

	@Override public T visitNot(FopclgrammarParser.NotContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrem(FopclgrammarParser.PremContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstr(FopclgrammarParser.ConstrContext ctx) { return visitChildren(ctx); }

	
 * 	
 */
	

}
