package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;

/**
 * The node to represent a unary expression
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface UnaryExpressionNode extends ExpressionNode
{
	/**
	 * Enumerator for the operation
	 * 
	 * @author "Frank Zechert"
	 * @version 1
	 */
	public enum UnaryOperator
	{
		// unary minus
		MINUS,
		// logical negation
		LOGICAL_NEGATE
	}

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
	public void setOperator(UnaryOperator operator);

	/**
	 * Get the operator of this expression.
	 * 
	 * @return the operator of this expressoin
	 */
	public UnaryOperator getOperator();
}
