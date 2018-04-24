package models;

import utils.Operation;

public class Clause extends Predicate{
	private Literal leftLiteral;
	private Literal rightLiteral;
	private Operation operation;

	public Clause(Literal leftLiteral, Literal rightLiteral, Operation operation) {
		super();
		this.leftLiteral = leftLiteral;
		this.rightLiteral = rightLiteral;
		this.operation = operation;
	}

	public Literal getLeftLiteral() {
		return leftLiteral;
	}

	public void setLeftLiteral(Literal leftLiteral) {
		this.leftLiteral = leftLiteral;
	}

	public Literal getRightLiteral() {
		return rightLiteral;
	}

	public void setRightLiteral(Literal rightLiteral) {
		this.rightLiteral = rightLiteral;
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
