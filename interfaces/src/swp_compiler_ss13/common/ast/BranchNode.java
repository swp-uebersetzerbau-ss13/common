package swp_compiler_ss13.common.ast;

public interface BranchNode extends StatementNode
{
	public void setCondition(ExpressionNode condition);

	public ExpressionNode getConditoin();

	public void setBlockNodeOnTrue(BlockNode block);

	public BlockNode getBlockNodeOnTrue();

	public void setBlockNodeOnFalse(BlockNode block);

	public BlockNode getBlockNodeOnFalse();
}
