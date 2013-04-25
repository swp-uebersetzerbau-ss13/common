package swp_compiler_ss13.common.lexer;

/**
 * Proposed inteface for a token
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel", "Florian Freudenberg"
 * @version 2
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public interface Token
{
	/**
	 * @return string readed by lexer for this token
	 */
	String getValue();
	
	/**
	 * @return type of token
	 */
	TokenType getTokenType();
	
	/**
	 * @return line of code in source file
	 */
	Integer getLine();
	
	/**
	 * @return column of code in source file
	 */
	Integer getColumn();
}