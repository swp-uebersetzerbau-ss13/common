package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.ASTNode;
import swp_compiler_ss13.common.types.Type;

/**
 * The node to represent a declaration
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface DeclarationNode extends ASTNode
{
	/**
	 * Get the identifier that is being declared
	 * 
	 * @return the identifier name.
	 */
	public String getIdentifier();

	/**
	 * Get the type of this declaration.
	 * 
	 * @return The type of this declaration.
	 */
	public Type getType();

	/**
	 * Set the identifier name that is being declared.
	 * 
	 * @param identifier
	 *            the identifier name.
	 */
	public void setIdentifier(String identifier);

	/**
	 * Set the type of this identifier.
	 * 
	 * @param type
	 *            The type of this identifier.
	 */
	public void setType(Type type);
}
