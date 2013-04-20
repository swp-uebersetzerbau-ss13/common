package swp_compiler_ss13.common.ast.expression;

import swp_compiler_ss13.common.ast.BinaryExpression;

public class LogicExpression extends BinaryExpression {
    private LogicOperation _operator;

    public LogicExpression(LogicOperation operator) {
        _operator = operator;
    }
    
    public LogicOperation getOperator() {
        return _operator;
    }
}
