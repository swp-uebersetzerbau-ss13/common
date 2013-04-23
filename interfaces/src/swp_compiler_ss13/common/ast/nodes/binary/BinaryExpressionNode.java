package swp_compiler_ss13.common.ast.nodes.binary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;

/**
 * The node to represent a binary expression
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface BinaryExpressionNode extends ExpressionNode
{
	/**
	 * Enumerator for the operation
	 * 
	 * @author "Frank Zechert"
	 * @version 1
	 */
	public enum BinaryOperator
	{
		// arithmetic
		ADDITION,
		SUBSTRACTION,
		MULTIPLICATION,
		DIVISION,

		// relation
		LESSTHAN,
		LESSTHANEQUAL,
		GREATERTHAN,
		GREATERTHANEQUAL,
		EQUAL,
		INEQUAL,

		// logical
		LOGICAL_AND,
		LOGICAL_OR
	}

	/**
	 * Set the left value of the operation. This is an expression.
	 * 
	 * @param expr
	 *            the left value.
	 */
	public void setLeftValue(ExpressionNode expr);

	/**
	 * Get the left value of the operation. This is an expression.
	 * 
	 * @return the left value.
	 */
	public ExpressionNode getLeftValue();

	/**
	 * Set the right value of the operation. This is an expression.
	 * 
	 * @param expr
	 *            the right value
	 */
	public void setRightValue(ExpressionNode expr);

	/**
	 * Get the right value of the operation. This is an expression.
	 * 
	 * @return the right value.
	 */
	public ExpressionNode getRightValue();

	/**
	 * Set the operator of this expression.
	 * 
	 * @param operator
	 *            the operator to set
	 */
	public void setOperator(BinaryOperator operator);

	/**
	 * Get the operator of this expression.
	 * 
	 * @return the operator of this expressoin
	 */
	public BinaryOperator getOperator();
}
