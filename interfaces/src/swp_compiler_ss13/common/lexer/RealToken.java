package swp_compiler_ss13.common.lexer;

public interface RealToken extends Token
{
	/**
	 * @return value of getValue() converted to Double
	 */
	Double getDoubleValue();
}