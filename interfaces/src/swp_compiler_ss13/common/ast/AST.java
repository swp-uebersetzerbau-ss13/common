package swp_compiler_ss13.common.ast;

import java.util.Iterator;

import swp_compiler_ss13.common.parser.SymbolTable;

/**
 * The abstract syntax tree (AST).
 * 
 * @author "Frank Zechert"
 * @version 1
 */
public interface AST
{
	/**
	 * Returns the root node of the AST. The root node is always a BlockNode for
	 * correct ASTs.
	 * 
	 * @return the root node of the AST.
	 */
	public ASTNode getRootNode();

	/**
	 * Set the root node of the AST.
	 * 
	 * @param rootNode
	 *            The root node.
	 */
	public void setRootNode(ASTNode rootNode);

	/**
	 * Get the number of nodes the complete tree contains.
	 * 
	 * @return the number of nodes in this AST.
	 */
	public Integer getNumberOfNodes();

	/**
	 * Gets an iterator for this AST. The iterator will traverse the tree in
	 * Depth First Search from Left to Right (DFSLTR).
	 * 
	 * @return the DFSLTR iterator for this tree.
	 */
	public Iterator<ASTNode> getDFSLTRIterator();

	/**
	 * Get the symbol table associated with the complete program. This is the
	 * symbol table that contains all program scopes. The symbol table returned
	 * is most likely the symbol table of the root node.
	 * 
	 * @return The root symbol table.
	 */
	public SymbolTable getRootSymbolTable();
}
