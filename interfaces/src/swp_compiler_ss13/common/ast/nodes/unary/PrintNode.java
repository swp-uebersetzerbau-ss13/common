package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;
import swp_compiler_ss13.common.ast.nodes.StatementNode;

/**
 * The node to represent a print statement
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface PrintNode extends StatementNode
{
	/**
	 * set the identifier that should be printed
	 * 
	 * @param identifier
	 *            the identifier to print.
	 */
	public void setRightValue(IdentifierNode identifier);

	/**
	 * get the identifier that should be printed
	 * 
	 * @return the identifier to print.
	 */
	public IdentifierNode getRightValue();
}
