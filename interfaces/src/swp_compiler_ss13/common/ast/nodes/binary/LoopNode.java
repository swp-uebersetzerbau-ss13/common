package swp_compiler_ss13.common.ast.nodes.binary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;
import swp_compiler_ss13.common.ast.nodes.marynary.BlockNode;

/**
 * The node to represent a loop of any kind
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface LoopNode extends StatementNode
{
	/**
	 * Set the block that is the loop's body.
	 * 
	 * @param block
	 *            the loop's body.
	 */
	public void setLoopBody(BlockNode block);

	/**
	 * Get the block that is the loop's body.
	 * 
	 * @return the loop's body.
	 */
	public BlockNode getLoopBody();

	/**
	 * Set the loop condition. The loop will run until the condition is false.
	 * 
	 * @param condition
	 *            The loop condition.
	 */
	public void setCondition(ExpressionNode condition);

	/**
	 * Returns the condition of this loop. The loop will run until the condition
	 * is false.
	 * 
	 * @return The loop conditoin.
	 */
	public ExpressionNode getCondition();
}
