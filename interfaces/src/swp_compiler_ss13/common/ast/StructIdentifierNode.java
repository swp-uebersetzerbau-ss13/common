package swp_compiler_ss13.common.ast;

public interface StructIdentifierNode extends IdentifierNode
{
	public void setFieldName(String fieldIdentifier);

	public String getFieldName();

	public void setIdentifierNode(IdentifierNode node);

	public IdentifierNode getIdentifierNode();
}
