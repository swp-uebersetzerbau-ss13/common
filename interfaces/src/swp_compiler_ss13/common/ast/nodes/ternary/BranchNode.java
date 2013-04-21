package swp_compiler_ss13.common.ast.nodes.ternary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;
import swp_compiler_ss13.common.ast.nodes.marynary.BlockNode;


public interface BranchNode extends StatementNode
{
	public void setCondition(ExpressionNode condition);

	public ExpressionNode getCondition();

	public void setBlockNodeOnTrue(BlockNode block);

	public BlockNode getBlockNodeOnTrue();

	public void setBlockNodeOnFalse(BlockNode block);

	public BlockNode getBlockNodeOnFalse();
}
