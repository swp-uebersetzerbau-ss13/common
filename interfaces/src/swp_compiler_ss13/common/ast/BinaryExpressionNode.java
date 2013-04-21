package swp_compiler_ss13.common.ast;

public interface BinaryExpressionNode extends ExpressionNode
{
	public enum BinaryOperator
	{
		ADDITION,
		SUBSTRACTION,
		MULTIPLICATION,
		DIVISION,
		LESSTHAN,
		LESSTHANEQUAL,
		GREATERTHAN,
		GREATERTHANEQUAL,
		EQUAL,
		INEQUAL,
		LOGICAL_AND,
		LOGICAL_OR
	}

	public void setLeftValue(ExpressionNode expr);

	public ExpressionNode getLeftValue();

	public void setRightValue(ExpressionNode expr);

	public ExpressionNode getRightValue();

	public void setOperator(BinaryOperator operator);

	public BinaryOperator getOperator();
}
