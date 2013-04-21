package swp_compiler_ss13.common.ast;

public interface AssignmentNode extends StatementNode
{
	public IdentifierNode getLeftValue();

	public void setLeftValue(IdentifierNode identifier);

	public StatementNode getRightValue();

	public void setRightValue(StatementNode node);
}
