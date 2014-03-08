/**
 * 
 */
package de.alexhein.graphgenerator.logic.constraint;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import de.alexhein.graphgenerator.logic.InstantiationSet;

/**
 * @author alex
 *
 */
public class ConstraintConjunction implements Constraint {

	/**
	 * 
	 */
	
	private List<Constraint> cstrs = new LinkedList<Constraint>();
	
	public ConstraintConjunction(Constraint[] cs) {
		for(int i=0; i<cs.length; i++){
			if(cs[i] != null)
				cstrs.add(cs[i]);
		}
	}

	/* (non-Javadoc)
	 * @see de.alexhein.graphgenerator.logic.constraint.Constraint#fulfills(de.alexhein.graphgenerator.logic.InstantiationSet)
	 */
	@Override
	public boolean fulfills(InstantiationSet is) {
		Iterator<Constraint> it = cstrs.iterator();
		while(it.hasNext()) {
			Constraint c = it.next();
			if(!c.fulfills(is))
				return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		String str = "";
		Iterator<Constraint> it = cstrs.iterator();
		if(it.hasNext()) 
			str = str + it.next().toString();
		while(it.hasNext())
			str = str + "," + it.next().toString();
	
		return str;
	}

}
