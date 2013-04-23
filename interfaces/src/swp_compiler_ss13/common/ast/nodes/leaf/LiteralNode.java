package swp_compiler_ss13.common.ast.nodes.leaf;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.types.Type;

/**
 * A literal in the AST. The literal is a constant value.
 * 
 * @author "Frank Zechert"
 * 
 */
public interface LiteralNode extends ExpressionNode
{
	/**
	 * Get the literal constant.
	 * 
	 * @return the literal.
	 */
	public String getLiteral();

	/**
	 * Get the type of this literal.
	 * 
	 * @return the type of the literal.
	 */
	public Type getLiteralType();

	/**
	 * Set the literal value.
	 * 
	 * @param literal
	 *            the literal value.
	 */
	public void setLiteral(String literal);

	/**
	 * Set the type of the literal.
	 * 
	 * @param literalType
	 *            the type of the literal.
	 */
	public void setLiteralType(Type literalType);
}
