package swp_compiler_ss13.common.ir;

/**
 * Operators of three address code
 * 
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Three-Address-Code-Specification">Three-Address-Code-Specification Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/2">Three-Address-Code-Specification Tracker</a>
 */
public enum Operator {
	DECL,
	
	// Arithmetics
	COPY_NUM,
	COPY_REAL,
	UNARY_MINUS_NUM,
	UNARY_MINUS_REAL,
	ADD_NUM,
	ADD_REAL,
	SUB_NUM,
	SUB_REAL,
	MULT_NUM,
	MULT_REAL,
	DIV_NUM,
	DIV_REAL
}
