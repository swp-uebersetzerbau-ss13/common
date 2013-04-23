package swp_compiler_ss13.common.lexer;

import java.util.regex.Pattern;

/**
 * Proposed class for a token type
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
enum TokenType {
	
	NUM("-?[0-9]+"),
	OP("[*/+-]"),
	WHITESPACE("[ \t\f\r\n]+");
	
	public final String pattern;
	
	private TokenType(String pattern) {
		this.pattern = pattern;
	}
}

/**
 * Proposed class for a token
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public class Token {
	
	public TokenType type;
	public String data;
	public int line
	
	public Token(TokenType type, String data, int line) {
		this.type = type;
		this.data = data;
		this.line = line;
	}
	
	@Override
	public String toString() {
		return String.format("<%s, '%d','%s'>", type.name(), line, data);
	}
}