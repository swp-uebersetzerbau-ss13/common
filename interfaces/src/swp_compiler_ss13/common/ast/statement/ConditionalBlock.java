package swp_compiler_ss13.common.ast.statement;

import swp_compiler_ss13.common.ast.Block;
import swp_compiler_ss13.common.ast.Expression;
import swp_compiler_ss13.common.ast.Statement;

public abstract class ConditionalBlock extends Statement {
    private Block _body;
    private Expression _condition;
    
    public void setBody(Block body) {
        _body = body;
    }
    
    public void setCondition(Expression condition) {
        _condition = condition;
    }
    
    public Block getBody() {
        return _body;
    }
    
    public Expression getCondition() {
        return _condition;
    }
}
