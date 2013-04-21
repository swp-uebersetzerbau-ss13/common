package swp_compiler_ss13.common.ast;

import java.util.Iterator;
import java.util.List;

public interface ASTNode
{
	public enum ASTNodeType
	{
		ArithmeticBinaryExpression,
		ArithmeticUnaryExpression,
		AssignmentNode,
		ASTNode,
		BinaryExpression,
		BlockNode,
		BranchNode,
		BreakNode,
		DeclarationNode,
		DoWhileNode,
		ExpressionNode,
		IdentifierNode,
		LiteralNode,
		LogicBinaryExpression,
		LogicUnaryExpression,
		LoopNode,
		PrintNode,
		ReturnNode,
		StatementNode,
		UnaryExpression,
		WhileNode
	}

	public ASTNodeType getNodeType();

	public Integer getNumberOfNodes();

	public Iterator<ASTNode> getDFSLTRNodeIterator();

	public List<ASTNode> getChildren();

	public ASTNode getParentNode();

	public void setParentNode(ASTNode node);
}
