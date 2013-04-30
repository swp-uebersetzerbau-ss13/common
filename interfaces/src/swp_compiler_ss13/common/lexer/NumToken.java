package swp_compiler_ss13.common.lexer;

/**
 * NumToken should always be used for TokenType NUM and only for this.
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 2
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public interface NumToken extends Token {
	/**
	 * @return value of getValue() converted to Integer
	 */
	Long getLongValue();
}