package swp_compiler_ss13.common.ir;

/**
 * Operators of three address code
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Three-Address-Code-Specification">Three-Address-Code-Specification Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/2">Three-Address-Code-Specification Tracker</a>
 */
public enum Operators
{
	/* Variable declaration */
	DECLARE,

	/* Type conversion */
	LONG_TO_DOUBLE,
	DOUBLE_TO_LONG,

	/* Unindexed copy */
	ASSIGN_LONG,
	ASSIGN_DOUBLE,
	ASSIGN_BOOL,
	ASSIGN_STRING,

	/* Arithmetic */
	ADD_LONG,
	ADD_DOUBLE,
	SUB_LONG,
	SUB_DOUBLE,
	MULT_LONG,
	MULT_DOUBLE,
	DIV_LONG,
	DIV_DOUBLE,

	/* Control flow */
	RETURN
}