package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;


public interface ReturnNode extends StatementNode
{
	public void setRightValue(IdentifierNode identifier);

	public IdentifierNode getRightValue();
}
