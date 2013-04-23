package swp_compiler_ss13.common.parser.nodes;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface DeclarationNode extends ASTNode {
	String getIdentifier();
	void setIdentifier(String id);
	swp_compiler_ss13.common.types.Type getType();
	void setType(swp_compiler_ss13.common.types.Type type);
}
