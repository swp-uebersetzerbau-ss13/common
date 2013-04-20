package swp_compiler_ss13.common.ast.statement;

import swp_compiler_ss13.common.ast.Expression;
import swp_compiler_ss13.common.ast.Statement;
import swp_compiler_ss13.common.ast.expression.Identifier;

public class Assignment extends Statement {
    private Identifier _lvalue;
    private Expression _rvalue;
    
    public void setLeftValue(Identifier lvalue) {
        _lvalue = lvalue;
    }
    
    public void setRightValue(Identifier rvalue) {
        _rvalue = rvalue;
    }
    
    public Identifier getLeftValue() {
        return _lvalue;
    }
    
    public Expression getRightValue() {
        return _rvalue;
    }
}
