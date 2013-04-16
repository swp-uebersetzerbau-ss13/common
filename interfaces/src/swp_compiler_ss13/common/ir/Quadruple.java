package swp_compiler_ss13.common.ir;

/**
 * Proposed interface for intermediate code generator.
 * 
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href=
 *      "https://github.com/swp-uebersetzerbau-ss13/common/wiki/Three-Address-Code-Specification"
 *      >Three Address Code Specification Wiki</a>
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/2">Three
 *      Address Code Specification Issue Tracker</a>
 */
public class Quadruple {

	/**
	 * Operator of the quadruple
	 */
	private Operator operator;

	/**
	 * Addresses of the quadruple
	 */
	private Address argument1, argument2, result;

	/**
	 * Creates a new Quadruple.
	 * 
	 * @param operator
	 *            The operator of this quadruple.
	 * @param argument1
	 *            Address 1 of the three address code.
	 * @param argument2
	 *            Address 2 of the three address code.
	 * @param result
	 *            Address 3 of the three address code.
	 */
	public Quadruple(Operator operator, Address argument1, Address argument2,
			Address result) {
		this.operator = operator;
		this.argument1 = argument1;
		this.argument2 = argument2;
		this.result = result;
	}

	/**
	 * Get the operator of this quadruple
	 * 
	 * @return The operator of this quadruple
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * Get the first address of this quadruple
	 * 
	 * @return The first address of this quadruple
	 */
	public Address getArgument1() {
		return argument1;
	}

	/**
	 * Get the second address of this quadruple
	 * 
	 * @return The second address of this quadruple
	 */
	public Address getArgument2() {
		return argument2;
	}

	/**
	 * Get the third address of this quadruple
	 * 
	 * @return The third address of this quadruple
	 */
	public Address getResult() {
		return result;
	}
}
