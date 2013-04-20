package swp_compiler_ss13.common.ast.statement;

import swp_compiler_ss13.common.ast.Expression;
import swp_compiler_ss13.common.ast.Statement;

public class Return extends Statement {
    private Expression _rvalue;
    
    public void setRightValue(Expression rvalue) {
        _rvalue = rvalue;
    }
    
    public Expression getRightValue() {
        return _rvalue;
    }
}
