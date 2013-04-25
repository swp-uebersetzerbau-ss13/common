package swp_compiler_ss13.common.lexer;

/**
 * Proposed class for a token type
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel", "Florian Freudenberg"
 * @version 2
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
enum TokenType
{
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
	 * ';'
	 */
	SIMICOLON,
	/**
	 * End of file
	 */
	EOF,
	/**
	 * Lexer can not identifiy token
	 */
	NOT_A_TOKEN;
}