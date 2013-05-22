package swp_compiler_ss13.common.lexer;

/**
 * TokenType defines the specific meaning of a token.
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel"
 * @version 4
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public enum TokenType {
	/**
	 * '[0-9]+ ((E|e)-?[0-9+]))?'
	 */
	NUM,
	/**
	 * '[0-9]+\.[0-9]+ ((E|e)-?[0-9+]))?'
	 */
	REAL,
	/**
	 * 'true'
	 */
	TRUE,
	/**
	 * 'false'
	 */
	FALSE,
	/**
	 * '".*"' where '\"' is part of .*
	 */
	STRING,
	/**
	 * '[a-zA-Z][a-zA-z0-9]*
	 */
	ID,
	/**
	 * 'if'
	 */
	IF,
	/**
	 * 'else
	 */
	ELSE,
	/**
	 * 'while'
	 */
	WHILE,
	/**
	 * 'do'
	 */
	DO,
	/**
	 * 'break'
	 */
	BREAK,
	/**
	 * 'return'
	 */
	RETURN,
	/**
	 * 'print'
	 */
	PRINT,
	/**
	 * 'long'
	 */
	LONG_SYMBOL,
	/**
	 * 'double'
	 */
	DOUBLE_SYMBOL,
	/**
	 * 'bool'
	 */
	BOOL_SYMBOL,
	/**
	 * 'string'
	 */
	STRING_SYMBOL,
	/**
	 * 'record'
	 */
	RECORD_SYMBOL,
	/**
	 * '='
	 */
	ASSIGNOP,
	/**
	 * '&&'
	 */
	AND,
	/**
	 * '||'
	 */
	OR,
	/**
	 * '=='
	 */
	EQUALS,
	/**
	 * '!='
	 */
	NOT_EQUALS,
	/**
	 * '<'
	 */
	LESS,
	/**
	 * '<='
	 */
	LESS_OR_EQUAL,
	/**
	 * '>'
	 */
	GREATER,
	/**
	 * '>='
	 */
	GREATER_EQUAL,
	/**
	 * '+'
	 */
	PLUS,
	/**
	 * '-'
	 */
	MINUS,
	/**
	 * '*'
	 */
	TIMES,
	/**
	 * '/'
	 */
	DIVIDE,
	/**
	 * '!'
	 */
	NOT,
	/**
	 * '('
	 */
	LEFT_PARAN,
	/**
	 * ')'
	 */
	RIGHT_PARAN,
	/**
	 * '['
	 */
	LEFT_BRACKET,
	/**
	 * ']'
	 */
	RIGHT_BRACKET,
	/**
	 * '{'
	 */
	LEFT_BRACE,
	/**
	 * '}'
	 */
	RIGHT_BRACE,
	/**
	 * '.'
	 */
	DOT,
	/**
	 * ';'
	 */
	SEMICOLON,
	/**
	 * End of file
	 */
	EOF,
	/**
	 * Type for untokenizable sequences of characters and signals problems to 
	 * the parser.
	 */
	NOT_A_TOKEN, 
	/**
	 * Type for comments that begins with an '#' and lasts the whole line until \n
	 */
	COMMENT;
}