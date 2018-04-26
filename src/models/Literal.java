package models;

public class Literal extends Formula{

	private char LiteralName;

	public Literal(char literalName) {
		super();
		LiteralName = literalName;
	}

	public char getLiteralName() {
		return LiteralName;
	}

	public void setLiteralName(char literalName) {
		LiteralName = literalName;
	}

}
