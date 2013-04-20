package swp_compiler_ss13.common.ast;

import java.util.ArrayList;
import java.util.List;

public class Block extends Statement {
    private List<Declaration> _declarations;
    private List<Statement> _statements;

    public Block() {
        _declarations = new ArrayList<Declaration>();
        _statements = new ArrayList<Statement>();
    }
    
    public void addDeclaration(Declaration declaration) {        
        _declarations.add(declaration);
    }
    
    public void addStatement(Statement statement) {        
        _statements.add(statement);
    }
    
    public List<Declaration> getDeclarations() {
        return _declarations;
    }
    
    public List<Statement> getStatements() {
        return _statements;
    }
}
