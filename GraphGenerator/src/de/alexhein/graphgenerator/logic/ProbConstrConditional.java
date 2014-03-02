/**
 * 
 */
package de.alexhein.graphgenerator.logic;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import de.alexhein.graphgenerator.logic.constraint.*;
import de.alexhein.graphgenerator.logic.scopes.*;


/**
 * @author alex
 *
 */
public class ProbConstrConditional extends LogicalFormula{

	/**
	 * 
	 */
	
	
	private final LogicalFormula premise, conclusion;
	private final Constraint constraint;
	private final double probability;
	private final VariableScope vscope;
	
	public ProbConstrConditional(
							LogicalFormula prem, 
							LogicalFormula concl,
							double prob,
							Constraint cstr,
							VariableScope vs) {
		
		this.premise = prem;
		this.conclusion = concl;
		
		if(this.conclusion.isGround() && this.premise != null && this.premise.isGround()) {
			
			this.constraint = null;
			this.vscope = new VariableScope();
		}
		else {
			constraint = cstr;
			this.vscope = vs;	
		}
		this.probability = prob;
	
	}
	public ProbConstrConditional( 
					LogicalFormula concl,
					double prob,
					Constraint cstr,
					VariableScope vs) {
		this(null, concl, prob, cstr, vs);
	}


	@Override
	public ProbConstrConditional instantiate(InstantiationSet is) {
		
		ProbConstrConditional pcc;
		
		if(this.isUnconditioned())
			pcc = new ProbConstrConditional(
				this.conclusion.instantiate(is), 
				this.probability, 
				this.constraint,
				this.vscope);
		else
			pcc = new ProbConstrConditional(
					this.premise.instantiate(is),
					this.conclusion.instantiate(is), 
					this.probability, 
					this.constraint,
					this.vscope);
			
		return pcc;
	}


	
	public VariableScope getVariableScope() {
		return this.vscope;
	}

	@Override
	public boolean isGround() {
		if(!this.isUnconditioned())
			return (premise.isGround() && conclusion.isGround());
		else
			return conclusion.isGround();
	}

	@Override
	public String toString() {
		String str = "";
		str = str + conclusion.toString();
		if(!this.isUnconditioned()) {
			str = str + " | ";
			str = str + premise.toString();
		}
		str = str + "[" + this.probability + "]";
		if(!this.isUnconstrained())
			str = str + "[" + this.constraint.toString() + "]";
		return str;
	}
	
	public boolean isUnconditioned(){
		return premise == null;
	}
	
	public boolean isUnconstrained(){
		return constraint == null;
	}
	
	public Collection<ProbConstrConditional> ground() {
		Collection<ProbConstrConditional> gl = new LinkedList<ProbConstrConditional>();
		
		if(this.isGround()) {
			gl.add(this);
			return gl;
		}
		
		Iterator<InstantiationSet> isit = InstantiationSet.generateAllInsts(vscope, constraint).iterator();
		
		ProbConstrConditional pcc;
		while(isit.hasNext()) {
			pcc = this.instantiate(isit.next());
			if(pcc.isGround())
				gl.add(pcc);
		}
			
		
		return gl;		
	}
	
	public Set<GroundRelation> getAllGroundedRelations(){
		Set<GroundRelation> cgr = new HashSet<GroundRelation>();
		Iterator<ProbConstrConditional> it = this.ground().iterator();
		
		while(it.hasNext())
			cgr.addAll(it.next().getGroundAtoms());
		
		return cgr;
	}
	
	
	@Override
	public Set<GroundRelation> getGroundAtoms() {
		Set<GroundRelation> s = conclusion.getGroundAtoms();
		if(!this.isUnconditioned())
			s.addAll(premise.getGroundAtoms());
		return s;
	}
	
}
