package swp_compiler_ss13.common.lexer;

/**
 * BoolToken should always be used for TokenType FALSE and TRUE and only for
 * those.
 */
public interface BoolToken extends Token
{
	/**
	 * @return value of getValue() converted to Boolean
	 */
	Boolean getBooleanValue();
}