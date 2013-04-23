package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.IdentifierNode;

/**
 * The node to reference a struct field. The fieldname defines the field to
 * access. The identifier itself is another IdentifierNode. This IdentifierNode
 * can be a BasicIdentifierNode to access the first struct level. It can be
 * another ArrayIdentifierNode to access a multidimensional array or a
 * StructIdentifierNode to access a struct inside a struct.
 * 
 * @author "Frank Zechert"
 * 
 */
public interface StructIdentifierNode extends IdentifierNode
{
	/**
	 * Set the fieldname to access within this struct
	 * 
	 * @param fieldIdentifier
	 *            The field to access
	 */
	public void setFieldName(String fieldIdentifier);

	/**
	 * Get the fieldname to access within this struct
	 * 
	 * @return the fieldname to access
	 */
	public String getFieldName();

	/**
	 * Set the struct to access the field in.
	 * 
	 * @param node
	 *            the struct to access.
	 */
	public void setIdentifierNode(IdentifierNode node);

	/**
	 * Get the struct to access the field in.
	 * 
	 * @return the struct to access
	 */
	public IdentifierNode getIdentifierNode();
}
