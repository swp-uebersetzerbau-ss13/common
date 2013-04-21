package swp_compiler_ss13.common.lexer;

/**
 * Proposed interface for lexer
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public interface Lexer {
	
	/**
	 * Get the next token of the source code. If there is no token, this method returns null.
	 * @return A Token, representing the next valid lexeme of the source code
	 */
	public Token getNextToken();
	
}