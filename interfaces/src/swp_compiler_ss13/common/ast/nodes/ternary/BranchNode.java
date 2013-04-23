package swp_compiler_ss13.common.ast.nodes.ternary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;
import swp_compiler_ss13.common.ast.nodes.marynary.BlockNode;

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
	 * Set the block that is executed when the condition evaluates to true.
	 * 
	 * @param block
	 *            The block to execute when the condition evaluates to true.
	 */
	public void setBlockNodeOnTrue(BlockNode block);

	/**
	 * The block that is executed when the condition evaluates to true.
	 * 
	 * @return The block to execute when the condition evaluates to true.
	 */
	public BlockNode getBlockNodeOnTrue();

	/**
	 * Set the block that is executed when the condition evaluates to flase.
	 * This is the else branch. If there is no else an empty block should be
	 * set.
	 * 
	 * @param block
	 *            The block to execute when the condition evaluates to false or
	 *            an empty block if no else branch is needed.
	 */
	public void setBlockNodeOnFalse(BlockNode block);

	/**
	 * The block that is executed when the condition is false. This is the else
	 * branch. If no else branch exists this will return an empty block.
	 * 
	 * @return The block to execute when the condition evaluates to false.
	 */
	public BlockNode getBlockNodeOnFalse();
}
