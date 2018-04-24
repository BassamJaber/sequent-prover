package models;

import java.util.ArrayList;
import java.util.List;

public class Branch {

	private List<Predicate> leftPremises;
	private List<Predicate> rightConclusion;
	public Branch() {
		super();
		leftPremises = new ArrayList<Predicate>();
		rightConclusion = new ArrayList<Predicate>();
	}
	
	
}
