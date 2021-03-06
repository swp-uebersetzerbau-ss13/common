package swp_compiler_ss13.common.ast.nodes.binary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.IdentifierNode;

/**
 * The node to represent an assignment.
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface AssignmentNode extends ExpressionNode
{
	/**
	 * The left value of this node. The left node is an identifier (variable).
	 * The left value is the target of the assignment.
	 * 
	 * @return The left value of this node.
	 */
	public IdentifierNode getLeftValue();

	/**
	 * Set the left value of the assignment. The left node is an identifier
	 * (variable). The left value is the target of the assignment.
	 * 
	 * @param identifier
	 *            The identifier to set as the left value.
	 */
	public void setLeftValue(IdentifierNode identifier);

	/**
	 * The right value of this node. The right value is an expression of any kind.
	 * The right value is the value to assign to the left value.
	 * 
	 * @return the identifier of this assignment.
	 */
	public ExpressionNode getRightValue();

	/**
	 * Set the right value of this node. The right value is an expression of any
	 * kind. The right value is the value to assign to the left value.
	 * 
	 * @param node
	 *            The statement to use as the right value.
	 */
	public void setRightValue(ExpressionNode node);
}
