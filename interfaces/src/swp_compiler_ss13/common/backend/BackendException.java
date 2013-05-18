package swp_compiler_ss13.common.backend;

/**
 * Signals that an error occurred in the Backend <br><br>
 * 
 * Note: No analysis of the TAC is performed in the backend. The
 * <code>BackendException</code> is only thrown if there are errors because incorrect code is
 * passed to the backend.
 * 
 * @author "Jens V. Fischer"
 */
public class BackendException extends Exception {

	/**
	 * serial version uid
	 */
	private static final long serialVersionUID = 1234746139461254784L;

	/**
	 * Constructs an <code>BackendException</code> with <code>null</code> as its error detail message.
	 */
	public BackendException() {
	}

	/**
	 * Constructs an <code>BackendException</code> with the specified detail message.
	 * 
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            Throwable.getMessage() method)
	 */
	public BackendException(String message) {
		super(message);
	}

	/**
	 * Constructs an <code>BackendException</code> with the specified detail message and
	 * cause. Note that the detail message associated with cause is not
	 * automatically incorporated into this exception's detail message
	 * 
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            Throwable.getMessage() method)
	 * @param cause
	 *            The cause (which is saved for later retrieval by the
	 *            Throwable.getCause() method). (A null value is permitted, and
	 *            indicates that the cause is nonexistent or unknown.)
	 */
	public BackendException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs an <code>BackendException</code> with the specified cause and a detail
	 * message of (cause==null ? null : cause.toString()) (which typically
	 * contains the class and detail message of cause).
	 * 
	 * @param cause
	 *            The cause (which is saved for later retrieval by the
	 *            Throwable.getCause() method). (A null value is permitted, and
	 *            indicates that the cause is nonexistent or unknown.)
	 */
	public BackendException(Throwable cause) {
		super(cause);
	}

}
