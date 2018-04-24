package models;

public class Literal extends Predicate{

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

	@Override
	public boolean isLiteral() {
		return true;
	}
	
	
}
