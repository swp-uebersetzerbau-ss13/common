package swp_compiler_ss13.common.parser.nodes;

import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Tkrauss
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Abstract-Syntax-Tree">Parser Wiki</a>
 */
public interface ASTNode {
	ASTNodeType getNodeType();
	int getNChildren();
	List<ASTNode> getChildren();
	Iterator<ASTNode> getLTRIterator();
}
