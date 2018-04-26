package models;

import java.util.List;

import utils.Operation;

public class Clause extends Formula{
	private List<Formula> leftFormula;
	private List<Formula> rightFormula;
	private Operation operation;


	public Clause() {
		super();
	}

	public Clause(List<Formula> leftFormula, List<Formula> rightFormula, Operation operation) {
		super();
		this.leftFormula = leftFormula;
		this.rightFormula = rightFormula;
		this.operation = operation;
	}
	
	

	public List<Formula> getLeftFormula() {
		return leftFormula;
	}

	public void setLeftFormula(List<Formula> leftFormula) {
		this.leftFormula = leftFormula;
	}

	public List<Formula> getRightFormula() {
		return rightFormula;
	}

	public void setRightFormula(List<Formula> rightFormula) {
		this.rightFormula = rightFormula;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	@Override
	public boolean isLiteral() {
		return false;
	}

}
