package swp_compiler_ss13.common.lexer;

public interface BoolToken extends Token
{
	/**
	 * @return value of getValue() converted to Boolean
	 */
	Boolean getBooleanValue();
}