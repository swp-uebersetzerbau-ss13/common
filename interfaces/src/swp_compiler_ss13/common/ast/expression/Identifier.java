package swp_compiler_ss13.common.ast.expression;

import swp_compiler_ss13.common.ast.Declaration;
import swp_compiler_ss13.common.ast.Expression;

public class Identifier extends Expression {
    private Declaration _symbol;

    public Identifier(Declaration symbol) {
        _symbol = symbol;
    }
    
    public Declaration getDeclaration() {
        return _symbol;
    }
}
