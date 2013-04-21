package swp_compiler_ss13.common.ast;

import java.util.Iterator;

import swp_compiler_ss13.common.parser.SymbolTable;

public interface AST
{
	public ASTNode getRootNode();

	public void setRootNode(ASTNode rootNode);

	public Integer getNumberOfNodes();

	public Iterator<ASTNode> getDFSLTRIterator();

	public SymbolTable getRootSymbolTable();
}
