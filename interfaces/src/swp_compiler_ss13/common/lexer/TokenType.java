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
	NUM,
	REAL,
	TRUE,
	FALSE,
	STRING,
	ID,
	IF,
	WHILE,
	DO,
	BREAK,
	RETURN,
	PRINT,
	ASSIGNOP,
	AND,
	OR,
	EQUALS,
	NOT_EQUALS,
	LESS,
	LESS_OR_EQUAL,
	GREATER,
	GREATER_EQUAL,
	PLUS,
	MINUS,
	TIMES,
	DIVIDE,
	NOT,
	NEGATE,
	LEFT_PARAN,
	RIGHT_PARAN,
	LEFT_BRACKET,
	RIGHT_BRACKET,
	LEFT_BRACE,
	RIGHT_BRACE,
	SIMICOLON;
}