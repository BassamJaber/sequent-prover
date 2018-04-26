package models;

import java.util.List;

import utils.Operation;

public class Clause extends Formula{
	private Formula leftFormula;
	private Formula rightFormula;
	private Operation operation;


	public Clause() {
		super();
	}

	public Clause(Formula leftFormula, Formula rightFormula, Operation operation) {
		super();
		this.leftFormula = leftFormula;
		this.rightFormula = rightFormula;
		this.operation = operation;
	}

	public Formula getLeftFormula() {
		return leftFormula;
	}

	public void setLeftFormula(Formula leftFormula) {
		this.leftFormula = leftFormula;
	}

	public Formula getRightFormula() {
		return rightFormula;
	}

	public void setRightFormula(Formula rightFormula) {
		this.rightFormula = rightFormula;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
