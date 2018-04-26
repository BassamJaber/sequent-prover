package models;

import java.util.ArrayList;
import java.util.List;

public class Branch {

	private List<Formula> leftPremises;
	private List<Formula> rightConclusion;
	public Branch() {
		super();
		leftPremises = new ArrayList<Formula>();
		rightConclusion = new ArrayList<Formula>();
	}
	
	
}
