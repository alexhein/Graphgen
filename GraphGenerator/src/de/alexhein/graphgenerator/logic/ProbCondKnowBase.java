/**
 * 
 */
package de.alexhein.graphgenerator.logic;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import de.alexhein.graphgenerator.graph.datastructures.UndGraphHashed;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;
import de.alexhein.graphgenerator.logic.scopes.*;

/**
 * @author alex
 *
 */



public class ProbCondKnowBase {

	/**
	 * 
	 */
	private final RelTypeScope reltypescope;
	private final SortScope sortscope;
	private final ConstantScope constscope;
	
	Collection<ProbConstrConditional> forms = new LinkedList<ProbConstrConditional>();
	
	public ProbCondKnowBase(RelTypeScope rsc, SortScope ssc, ConstantScope csc) {
		this.reltypescope = rsc;
		this.sortscope = ssc;
		this.constscope = csc;
	}
	
	public RelTypeScope getRelTypeScope() {
		return this.reltypescope;
	}
	
	public void addProbConstrCond(ProbConstrConditional pcc){
		forms.add(pcc);
	}
	public void addProbConstrCond(Collection<ProbConstrConditional> pccc) {
		forms.addAll(pccc);
	}
	
	public Iterator<ProbConstrConditional> getCPFormulaIterator() {
		return this.forms.iterator();
	}
	
	public ProbCondKnowBase ground() {
		ProbCondKnowBase groundkb = new ProbCondKnowBase(reltypescope, sortscope, constscope);
		Iterator<ProbConstrConditional> it = this.getCPFormulaIterator();
		while(it.hasNext()){
			groundkb.addProbConstrCond(it.next().ground());
		}
		return groundkb;
	}
	
	@Override
	public String toString() {
		String str = "Sorts:\n"         + "==========\n" + sortscope.toString() + "\n";
		str = str + "Relation Types:\n" + "==========\n" + reltypescope.toString() + "\n";
		str = str + "Conditional Probabilistic Formulas:\n" + "==========\n"; 
		Iterator<ProbConstrConditional> i = this.getCPFormulaIterator();
		while(i.hasNext())
			str = str + i.next().toString() + "\n";
		return str;
	}
	
	public UndirectedGraph<GroundRelation> toGraph() {
		
		UndirectedGraph<GroundRelation> g = new UndGraphHashed<GroundRelation>();
		
		for(ProbConstrConditional pcc : forms) {
			Set<GroundRelation> grs = pcc.getAllGroundedRelations();
			for(GroundRelation g1 : grs)
				for(GroundRelation g2 : grs)
					g.addEdge(g1, g2);
		}
		return g;
		
	}
	
	int getSize(){
		return forms.size();
	}
	
	

}
