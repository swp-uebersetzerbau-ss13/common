package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;

/**
 * The node to represent a return statement.
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface ReturnNode extends StatementNode
{
	/**
	 * Set the optional value this return statement returns.
	 * 
	 * @param identifier
	 *            the identifier to return.
	 */
	public void setRightValue(IdentifierNode identifier);

	/**
	 * Get the optional value this return statement returns or null if none.
	 * 
	 * @return identifier to return or null if none.
	 */
	public IdentifierNode getRightValue();
}
