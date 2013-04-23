package swp_compiler_ss13.common.ast.nodes.binary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;
import swp_compiler_ss13.common.ast.nodes.marynary.BlockNode;

public interface LoopNode extends StatementNode
{
	public void setLoopBody(BlockNode block);

	public BlockNode getLoopBody();

	public void setCondition(ExpressionNode condition);

	public ExpressionNode getCondition();
}
