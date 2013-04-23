package swp_compiler_ss13.common.parser.nodes;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface StructNode extends IdentifierNode {
	void setFieldName(String name);
	String getFieldName();
	void setIdentifierNode(IdentifierNode id);
	IdentifierNode getIdentifierNode();
}
