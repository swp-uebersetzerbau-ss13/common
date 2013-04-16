/**
 * 
 */
package swp_compiler_ss13.common.ir;

/**
 * Exception thrown when intermediate code generation fails.
 * 
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href=
 *      "https://github.com/swp-uebersetzerbau-ss13/common/wiki/Intermediate-Code-Generator"
 *      >Intermediate Code Generator Wiki</a>
 * @see <a target="_top"
 *      href="https://github.com/swp-uebersetzerbau-ss13/common/issues/1"
 *      >Intermediate Code Generator Issue Tracker</a>
 */
public class IntermediateCodeGeneratorException extends Exception {

	/**
	 * serial version uid
	 */
	private static final long serialVersionUID = -8670103678115061426L;

	/**
	 * Create a new IntermediateCodeGeneratorException.
	 */
	public IntermediateCodeGeneratorException() {
	}

	/**
	 * Create a new IntermediateCodeGeneratorException.
	 * 
	 * @param message
	 *            The error message.
	 */
	public IntermediateCodeGeneratorException(String message) {
		super(message);
	}

	/**
	 * Create a new IntermediateCodeGeneratorException.
	 * 
	 * @param cause
	 *            The error cause.
	 */
	public IntermediateCodeGeneratorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Create a new IntermediateCodeGeneratorException.
	 * 
	 * @param message
	 *            The error message.
	 * @param cause
	 *            The error cause.
	 */
	public IntermediateCodeGeneratorException(String message, Throwable cause) {
		super(message, cause);
	}
}
