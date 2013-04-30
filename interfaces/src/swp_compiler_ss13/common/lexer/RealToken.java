package swp_compiler_ss13.common.lexer;

/**
 * RealToken should always be used for TokenType REAL and only for this.
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 2
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public interface RealToken extends Token {
	/**
	 * @return value of getValue() converted to Double
	 */
	Double getDoubleValue();
}