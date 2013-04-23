package swp_compiler_ss13.common.parser.nodes;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface LiteralNode extends ExpressionNode {
	void setLiteral(String literal);
	String getLiteral();
	void setLiteralType(swp_compiler_ss13.common.types.Type type);
	swp_compiler_ss13.common.types.Type getLiteralType();
}
