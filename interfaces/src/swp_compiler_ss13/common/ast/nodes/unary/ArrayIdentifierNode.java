package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;
import swp_compiler_ss13.common.ast.nodes.IdentifierNode;

/**
 * The node to reference an array identifier. The index defines the index to
 * access. The identifier itself is another IdentifierNode. This IdentifierNode
 * can be a BasicIdentifierNode to access the first array level. It can be
 * another ArrayIdentifierNode to access a multidimensional array or a
 * StructIdentifierNode to access an array inside a struct.
 * 
 * @author "Frank Zechert"
 * 
 */
public interface ArrayIdentifierNode extends IdentifierNode
{
	/**
	 * Set the {@link ExpressionNode} that yields the index
	 * to access the array.
	 * 
	 * @param index
	 *            The array index.
	 */
	public void setIndexNode(ExpressionNode index);

	/**
	 * Get the {@link ExpressionNode} that yields the index
	 * to access the array.
	 * 
	 * @return The array index expression node.
	 */
	public ExpressionNode getIndexNode();

	/**
	 * Set the identifier to access. This is the array type itself.
	 * 
	 * @param node
	 *            The array to access.
	 */
	public void setIdentifierNode(IdentifierNode node);

	/**
	 * Get the array to access.
	 * 
	 * @return The array to access.
	 */
	public IdentifierNode getIdentifierNode();
}
