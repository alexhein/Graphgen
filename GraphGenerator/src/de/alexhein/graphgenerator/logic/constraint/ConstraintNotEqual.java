/**
 * 
 */
package de.alexhein.graphgenerator.logic.constraint;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import de.alexhein.graphgenerator.logic.InstantiationSet;
import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.Variable;

/**
 * @author alex
 *
 */
public class ConstraintNotEqual implements Constraint {

	/**
	 * 
	 */
	private final Variable var1, var2;
	private final Collection<Constant> cset;
	
	public ConstraintNotEqual(Variable leftarg, Variable rightarg){
		this.var1 = leftarg;
		this.var2 = rightarg;	
		this.cset = null;
	}
	public ConstraintNotEqual(Variable leftarg, Collection<Constant> cs) {
		this.var1 = leftarg;
		this.var2 = null;
		this.cset = cs;
	}

	/* (non-Javadoc)
	 * @see de.alexhein.graphgenerator.logic.constraint.Constraint#fulfills(de.alexhein.graphgenerator.logic.InstantiationSet)
	 */
	@Override
	public boolean fulfills(InstantiationSet insts) {
		
				// constraint of the form "X=Y"
				if(var2 != null){
					Constant c1 = insts.getInstConstant(var1);
					Constant c2 = insts.getInstConstant(var2);
					
					if(c1 != null && c2 != null) 
						if(c1 == c2) 
							return false;
					
					return true;
					
				}
				else {
					Constant c = insts.getInstConstant(var1);
					if(c != null) 
						if(!cset.contains(c))
							return true;
						else
							return false;
					else
						return true;
				}		
	}
	
	@Override
	public String toString() {
		String str;
		if(var2 != null) {
			str = var1.toString() + "!=" + var2.toString();
		}
		else {
			Iterator<Constant> it = cset.iterator();
			
			str = var1.toString() + "!=" + "(";
			if(cset.size() >= 1)
				str = str + it.next().toString();
			while(it.hasNext())
				str = str + "," + it.next().toString();
			
			str = str + ")";
		}
		return str;
	}

}
