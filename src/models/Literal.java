package models;

public class Literal extends Formula {

	private String LiteralName;
	private boolean isNegatedLiteral = false;

	public Literal(String literalName) {
		super();
		LiteralName = literalName;
		isNegatedLiteral = false;
	}

	public Literal(String literalName, boolean isNegatedLiteral) {
		super();
		LiteralName = literalName;
		this.isNegatedLiteral = isNegatedLiteral;
	}

	
	public boolean isNegatedLiteral() {
		return isNegatedLiteral;
	}

	public void setNegatedLiteral(boolean isNegatedLiteral) {
		this.isNegatedLiteral = isNegatedLiteral;
	}

	public String getLiteralName() {
		return LiteralName;
	}

	public void setLiteralName(String literalName) {
		LiteralName = literalName;
	}
	
	@Override
	public String toString() {
		return (isNegatedLiteral)?"NOT"+ getLiteralName(): getLiteralName();
	}

}
