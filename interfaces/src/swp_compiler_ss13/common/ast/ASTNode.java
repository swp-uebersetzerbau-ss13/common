package swp_compiler_ss13.common.ast;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import swp_compiler_ss13.common.lexer.Token;

/**
 * A node in the AST. Every node in the AST is of the type ASTNode. Though there
 * are a lot of specialized nodes.
 * 
 * @author "Frank Zechert, Tilman Krauss"
 * @version 1
 */
public interface ASTNode
{
	/**
	 * This enumeration is used to assign node types to the specialized nodes.
	 * This enumerations enables you to use a switch case statement to
	 * distinguish between the nodes instead of using the instanceof operator in
	 * a lot of if statements.
	 * 
	 * @author "Frank Zechert"
	 * @version 1
	 */
	public enum ASTNodeType
	{
		// leaf nodes
		BasicIdentifierNode,
		BreakNode,
		LiteralNode,

		// unary nodes
		ArithmeticUnaryExpressionNode,
		ArrayIdentifierNode,
		DeclarationNode,
		LogicUnaryExpressionNode,
		PrintNode,
		ReturnNode,
		StructIdentifierNode,

		// binary nodes
		ArithmeticBinaryExpressionNode,
		AssignmentNode,
		DoWhileNode,
		LogicBinaryExpressionNode,
		RelationExpressionNode,
		WhileNode,

		// ternay nodes
		BranchNode,

		// m-ary n-ary nodes
		BlockNode
	}

	/**
	 * Return the type of this node. This is one of the ASTNodeType enumeration
	 * constants. Each node needs to return the correct enumeration constant.
	 * 
	 * @return the type of the node.
	 */
	public ASTNodeType getNodeType();

	/**
	 * Return the number of nodes that are in this node's subtree. This is the
	 * number of nodes following this node. The number of nodes contains this
	 * node as well.
	 * 
	 * @return the number of nodes.
	 */
	public Integer getNumberOfNodes();

	/**
	 * Get the Depth-First-Search Left-To-Right (DFSLTR) iterator for the
	 * subtree this node is the root of.
	 * 
	 * @return the DFSLTR iterator.
	 */
	public Iterator<ASTNode> getDFSLTRNodeIterator();

	/**
	 * Get all the children of this node. These are the nodes directly following
	 * on the next level of the tree which parent is this node.
	 * 
	 * @return the children of this node.
	 */
	public List<ASTNode> getChildren();

	/**
	 * Get the parent node of this node. If this node is the root node and no
	 * parent exist, this should return null.
	 * 
	 * @return the parent node or null if no parent exists (this is a root
	 *         node).
	 */
	public ASTNode getParentNode();

	/**
	 * Set the parent node of this node. Root nodes do not have a parent. The
	 * parent of a root node is null.
	 * 
	 * @param node
	 *            the node to set as the parent.
	 */
	public void setParentNode(ASTNode node);
	
	/**
	 * Computes the Range of tokens, whose are represented by this nodes subtree.
	 * Following properties must hold, if n1, n2 are two nodes and c1,c2 the corresponding coverages:
	 * c1 includes at least all elements of c2 <=> t2 is in the subtree of t2 or t2 is t1
	 * c1 includes all elements of c2 and c2 includes all elements of c1 <=> t1 is t2
	 * Let c' be the concatenation of c1 and c2. c' exists as a valid coverage of a node t', where c1 is the first
	 * part of the list and c2 the second part if and only if t1 and t2 is in the subtree of t' 
	 * and t1 represents a piece of source code which occurs before the code of t2. 
	 * @return tokens, whose are in the subtree of this node.
	 */
	public List<Token> coverage();
	
	/**
	 * Sets the value of attribute for the semantic analyser
	 * 
	 * @param attribute
	 *            the attribute of the semantic analysis
	 * @param value
	 *            the value of the attribute
	 */
	public void setAttributeValue(Object attribute, Object value);
	
	/**
	 * Get the value of the attribute for the semantic analyser
	 * 
	 * @param attribute
	 *            the attribute of the semantic analysis
	 * 
	 * @return the value of the attribute
	 */
	public Object getAttributeValue(Object attribute);
	
	/**
	 * Computes the map of the attributes set by {@link #setAttributeValue}
	 * 
	 * @return map with attributes of the semantic analyser, which can be visualised.
	 */
	public Map<?,?> getAttributeValues();
}
