package swp_compiler_ss13.common.ast;

public interface PrintNode extends StatementNode
{
	public void setRightValue(IdentifierNode identifier);

	public IdentifierNode getRightValue();
}
