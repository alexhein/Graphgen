package de.alexhein.graphgenerator.logic;

import java.util.List;
import java.util.Set;

public abstract class LogicalFormula implements Instantiable<LogicalFormula>   {
	
	public abstract Set<GroundRelation> getGroundAtoms();

	
	public abstract boolean isGround();
	
	@Override
	public abstract String toString();

}