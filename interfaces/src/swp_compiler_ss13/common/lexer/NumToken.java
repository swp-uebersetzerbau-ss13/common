package swp_compiler_ss13.common.lexer;

public interface NumToken extends Token
{
	/**
	 * @return value of getValue() converted to Integer
	 */
	Long getLongValue();
}