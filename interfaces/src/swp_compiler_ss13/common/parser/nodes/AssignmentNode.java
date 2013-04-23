package swp_compiler_ss13.common.parser.nodes;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface AssignmentNode extends StatementNode {
	void setIdentifierNode(IdentifierNode node);
	IdentifierNode getIdentifierNode();
	void setStatementNode(StatementNode statement);
	StatementNode getStatementNode();
}
