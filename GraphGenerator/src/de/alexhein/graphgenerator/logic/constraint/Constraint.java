package de.alexhein.graphgenerator.logic.constraint;

import de.alexhein.graphgenerator.logic.InstantiationSet;

public interface Constraint {
	public boolean fulfills(InstantiationSet is);
}
