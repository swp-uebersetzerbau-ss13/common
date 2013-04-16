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
	 * {@inheritDoc}
	 */
	public IntermediateCodeGeneratorException() {
	}

	/**
	 * {@inheritDoc}
	 */
	public IntermediateCodeGeneratorException(String message) {
		super(message);
	}

	/**
	 * {@inheritDoc}
	 */
	public IntermediateCodeGeneratorException(Throwable cause) {
		super(cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public IntermediateCodeGeneratorException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public IntermediateCodeGeneratorException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
