package swp_compiler_ss13.common.ast;

public abstract class BinaryExpression extends Expression {
    private Expression _leftOperand;
    private Expression _rightOperand;
    
    public void setLeftOperand(Expression leftOperand) {
        _leftOperand = leftOperand;
    }
    
    public void setRightOperand(Expression rightOperand) {
        _rightOperand = rightOperand;
    }
    
    public Expression getLeftOperand() {
        return _leftOperand;
    }
    
    public Expression getRightOperand() {
        return _rightOperand;
    }
}
