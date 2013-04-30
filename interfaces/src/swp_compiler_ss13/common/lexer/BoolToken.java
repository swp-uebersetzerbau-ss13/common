package swp_compiler_ss13.common.lexer;

/**
 * BoolToken should always be used for TokenType FALSE and TRUE and only for
 * those.
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 2
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public interface BoolToken extends Token {
	/**
	 * @return value of getValue() converted to Boolean
	 */
	Boolean getBooleanValue();
}