package swp_compiler_ss13.common.ast.nodes.unary;

import swp_compiler_ss13.common.ast.nodes.ExpressionNode;

public interface UnaryExpressionNode extends ExpressionNode
{
	public enum UnaryOperator
	{
		MINUS,
		LOGICAL_NEGATE
	}

	public void setRightValue(ExpressionNode expr);

	public ExpressionNode getRightValue();

	public void setOperator(UnaryOperator operator);

	public UnaryOperator getOperator();
}
