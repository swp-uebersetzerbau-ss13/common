package swp_compiler_ss13.common.parser;

/**
 * ReportLog provides convenient way to communicate errors of sourcefiles
 */
public interface ReportLog {
	
	/**
	 * ReportError adds a new error to the ReportLog. This method never
	 * throw an exception.
	 * 
	 * @param text part of source which cause the error
	 * @param line 
	 * @param column
	 * @param message description of error
	 */
	void reportError(String text, Integer line, Integer column, String message);
}
