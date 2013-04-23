package swp_compiler_ss13.common.ast.nodes.leaf;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;

/**
 * A basic identifier in the AST. A basic identifier is the name of a variable.
 * 
 * @author "Frank Zechert"
 * 
 */
public interface BasicIdentifierNode extends IdentifierNode
{
	/**
	 * Get the identifier name.
	 * 
	 * @return the name of the identifier.
	 */
	public String getIdentifier();

	/**
	 * Set the identifier name.
	 * 
	 * @param identifier
	 *            the name of the identifier.
	 */
	public void setIdentifier(String identifier);
}
