package swp_compiler_ss13.common.ast.expression;

import swp_compiler_ss13.common.ast.Expression;

public class UnaryExpression extends Expression {
    private UnaryOperation _operator;
    private Expression _operand;

    public UnaryExpression(UnaryOperation operator) {
        _operator = operator;
    }
    
    public UnaryOperation getOperator() {
        return _operator;
    }
    
    public void setOperand(Expression operand) {
        _operand = operand;
    }
    
    public Expression getOperand() {
        return _operand;
    }
}
