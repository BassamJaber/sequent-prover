package models;

public class Literal extends Formula {

	private char LiteralName;
	private boolean isNegatedLiteral = false;

	public Literal(char literalName) {
		super();
		LiteralName = literalName;
		isNegatedLiteral = false;
	}

	public Literal(char literalName, boolean isNegatedLiteral) {
		super();
		LiteralName = literalName;
		this.isNegatedLiteral = isNegatedLiteral;
	}

	public char getLiteralName() {
		return LiteralName;
	}

	public void setLiteralName(char literalName) {
		LiteralName = literalName;
	}

}
