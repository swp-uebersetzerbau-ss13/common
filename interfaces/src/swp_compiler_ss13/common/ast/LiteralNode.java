package swp_compiler_ss13.common.ast;

import swp_compiler_ss13.common.types.Type;

public interface LiteralNode extends ExpressionNode
{
	public String getLiteral();

	public Type getLiteralType();

	public void setLiteral(String literal);

	public void setLiteralType(Type literalType);
}
