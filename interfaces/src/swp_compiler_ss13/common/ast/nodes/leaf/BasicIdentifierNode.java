package swp_compiler_ss13.common.ast.nodes.leaf;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;

public interface BasicIdentifierNode extends IdentifierNode
{
	public String getIdentifier();

	public void setIdentifier(String identifier);
}
