package swp_compiler_ss13.common.ast.expression;

import swp_compiler_ss13.common.ast.BinaryExpression;

public class EqualityExpression extends BinaryExpression {
    private EqualityOperation _operator;

    public EqualityExpression(EqualityOperation operator) {
        _operator = operator;
    }
    
    public EqualityOperation getOperator() {
        return _operator;
    }
}