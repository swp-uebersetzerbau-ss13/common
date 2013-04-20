package swp_compiler_ss13.common.ast.expression;

import swp_compiler_ss13.common.ast.BinaryExpression;

public class ArithmeticExpression extends BinaryExpression {
    private ArithmeticOperation _operator;

    public ArithmeticExpression(ArithmeticOperation operator) {
        _operator = operator;
    }
    
    public ArithmeticOperation getOperator() {
        return _operator;
    }
}
