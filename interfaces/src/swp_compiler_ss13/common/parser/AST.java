package swp_compiler_ss13.common.parser;

import swp_compiler_ss13.common.parser.nodes.ASTNode;

/**
 * Proposed interface for abstract syntax tree.
 * 
 * @author Tkrauss
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Abstract Syntax Tree</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/7">Abstract Syntax Tree</a>
 */
public interface AST {
	ASTNode getRootNode();
	void setRootNode(ASTNode root);
	int getNNodes();
	SymbolTable getRootSymbolTable();
	void SetRootSymbolTable(SymbolTable table);
}
