package swp_compiler_ss13.common.parser.nodes;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface BranchNode extends StatementNode {
	void setCondition(ExpressionNode condition);
	ExpressionNode getCondition();
	void setBlockNodeOnTrue( BlockNode block);
	BlockNode getBlockNodeOnTrue();
	void setBlockNodeOnFalse( BlockNode block);
	BlockNode getBlockNodeOnFalse();
}
