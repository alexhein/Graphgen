/**
 * 
 */
package de.alexhein.graphgenerator.logic;

import java.util.Iterator;

import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.RelType;

/**
 * @author alex
 *
 */
public class GroundRelation extends Relation {

	/**
	 * @param rt
	 * @param a
	 */
	public GroundRelation(RelType rt, Constant[] a) {
		super(rt, a);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		
		if(!(o instanceof GroundRelation))
			return false;
		
		GroundRelation r = (GroundRelation) o;
		
		if(r.getRelType() != this.getRelType())
			return false;
	
		Iterator<Argument> l1 = this.getArgumentIterator();
		Iterator<Argument> l2 = r.getArgumentIterator();
		
		while(l1.hasNext() && l2.hasNext()) {
			if(l1.next() != l2.next())
				return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	
	
	
	

}
