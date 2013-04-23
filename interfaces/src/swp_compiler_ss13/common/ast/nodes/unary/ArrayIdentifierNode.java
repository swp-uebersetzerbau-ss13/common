package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;

public interface ArrayIdentifierNode extends IdentifierNode
{
	public void setIndex(Integer index);

	public Integer getIndex();

	public void setIdentifierNode(IdentifierNode node);

	public IdentifierNode getIdentifierNode();
}
