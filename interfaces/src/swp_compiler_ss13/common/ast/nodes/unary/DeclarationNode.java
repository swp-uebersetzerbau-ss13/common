package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.ASTNode;
import swp_compiler_ss13.common.types.Type;

public interface DeclarationNode extends ASTNode
{
	public String getIdentifier();

	public Type getType();

	public void setIdentifier(String identifier);

	public void setType(Type type);
}
