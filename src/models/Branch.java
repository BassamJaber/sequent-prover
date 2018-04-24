package models;

import java.util.ArrayList;
import java.util.List;

public class Branch {

	private List<Clause> leftClauses;
	private List<Clause> rightClauses;
	public Branch() {
		super();
		leftClauses = new ArrayList<Clause>();
		rightClauses = new ArrayList<Clause>();
	}
	
	
}
