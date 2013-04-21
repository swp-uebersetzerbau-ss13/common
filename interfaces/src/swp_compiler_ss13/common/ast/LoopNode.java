package swp_compiler_ss13.common.ast;

public interface LoopNode extends StatementNode
{
	public void setLoopBody(BlockNode block);

	public BlockNode getLoopBody();

	public void setCondition(ExpressionNode condition);

	public ExpressionNode getCondition();
}
