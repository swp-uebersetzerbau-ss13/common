package swp_compiler_ss13.common.ast.nodes.ternary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;

/**
 * The node to represent a branch ("if") statement
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface BranchNode extends StatementNode
{
	/**
	 * Set the branching condition.
	 * 
	 * @param condition
	 *            the condition of the branch.
	 */
	public void setCondition(ExpressionNode condition);

	/**
	 * Get the branching condition.
	 * 
	 * @return the condition of the branch.
	 */
	public ExpressionNode getCondition();

	/**
	 * Set the statement that is executed when the condition evaluates to true.
	 * 
	 * @param statement
	 *            The statement to execute when the condition evaluates to true.
	 */
	public void setStatementNodeOnTrue(StatementNode statement);

	/**
	 * The statement that is executed when the condition evaluates to true.
	 * 
	 * @return The statement to execute when the condition evaluates to true.
	 */
	public StatementNode getStatementNodeOnTrue();

	/**
	 * Set the statement that is executed when the condition evaluates to false.
	 * This is the else statement. If there is no else set to null.
	 * 
	 * @param statement
	 *            The statement to execute when the condition evaluates to false or
	 *            null if no else branch is needed.
	 */
	public void setStatementNodeOnFalse(StatementNode statement);

	/**
	 * The statement that is executed when the condition is false. This is the else
	 * branch. If no else branch exists this will return null.
	 * 
	 * @return The statement to execute when the condition evaluates to false.
	 */
	public StatementNode getStatementNodeOnFalse();
}
