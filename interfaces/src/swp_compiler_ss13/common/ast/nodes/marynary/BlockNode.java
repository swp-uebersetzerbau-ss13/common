package swp_compiler_ss13.common.ast.nodes.marynary;

import java.util.Iterator;
import java.util.List;

import swp_compiler_ss13.common.ast.nodes.StatementNode;
import swp_compiler_ss13.common.ast.nodes.unary.DeclarationNode;
import swp_compiler_ss13.common.parser.SymbolTable;

public interface BlockNode extends StatementNode
{
	public void addDeclaration(DeclarationNode declaration);

	public void addStatement(StatementNode statement);

	public List<DeclarationNode> getDeclarationList();

	public List<StatementNode> getStatementList();

	public Iterator<DeclarationNode> getDeclarationIterator();

	public Iterable<StatementNode> getStatementIterator();

	public Integer getNumberOfDeclarations();

	public Integer getNumberOfStatements();

	public SymbolTable getSymbolTable();

	public void setSymbolTable(SymbolTable symbolTable);
}
