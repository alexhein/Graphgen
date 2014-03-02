package de.alexhein.graphgenerator.logic.constraint;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.alexhein.graphgenerator.logic.Argument;
import de.alexhein.graphgenerator.logic.Instantiation;
import de.alexhein.graphgenerator.logic.InstantiationSet;
import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.Variable;

public class ConstraintEqual implements Constraint {

	private final Variable var1, var2;
	private final Collection<Constant> cset;
	
	ConstraintEqual(Variable leftarg, Variable rightarg){
		this.var1 = leftarg;
		this.var2 = rightarg;	
		cset = null;
	}
	public ConstraintEqual(Variable leftarg, Collection<Constant> cs) {
		var1 = leftarg;
		var2 = null;
		cset = cs;
	}
	
	@Override
	public boolean fulfills(InstantiationSet insts) {
		
		// constraint of the form "X=Y"
		if(var2 != null){
			Constant c1 = insts.getInstConstant(var1);
			Constant c2 = insts.getInstConstant(var2);
			
			if(c1 != null && c2 != null) 
				if(c1 != c2) 
					return false;
			
			return true;
			
		}
		else {
			Constant c = insts.getInstConstant(var1);
			if(c != null) 
				if(!cset.contains(c))
					return false;
			
			return true;
		}		
	}
	
	
	
	
	@Override
	public String toString(){
		String str;
		if(var2 != null) {
			str = var1.toString() + "=" + var2.toString();
		}
		else {
			Iterator<Constant> it = cset.iterator();
			str = var1.toString() + "=" + "(";
			if(cset.size() >= 1)
				str = str + it.next().toString();
			while(it.hasNext())
				str = str + "," + it.next().toString();
		}
		return str;
	}

}
