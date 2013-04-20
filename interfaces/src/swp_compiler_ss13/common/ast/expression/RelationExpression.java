package swp_compiler_ss13.common.ast.expression;

import swp_compiler_ss13.common.ast.BinaryExpression;

public class RelationExpression extends BinaryExpression {
    private RelationOperation _operator;

    public RelationExpression(RelationOperation operator) {
        _operator = operator;
    }
    
    public RelationOperation getOperator() {
        return _operator;
    }
}