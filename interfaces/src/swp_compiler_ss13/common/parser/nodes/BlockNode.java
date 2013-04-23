package swp_compiler_ss13.common.parser.nodes;

import java.util.List;

import swp_compiler_ss13.common.parser.SymbolTable;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface BlockNode extends StatementNode {
	// TODO: define the order of the statements an declarations since they depend
	void AddDeclarationNode(DeclarationNode declarationNode);
	void AddStatement(StatementNode statementNode);
	List<DeclarationNode> getDeclarationNodes();
	List<StatementNode> getStatementNodes();
	int getNDeclarations();
	int getNStatements();
	SymbolTable getAssociatedSymbolTable();
	void setAssociatedSymbolTable(SymbolTable symboltable);
}
