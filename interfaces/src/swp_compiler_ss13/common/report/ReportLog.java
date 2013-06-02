package swp_compiler_ss13.common.report;

import java.util.List;

import swp_compiler_ss13.common.lexer.Token;

/**
 * ReportLog provides convenient way to communicate problems with source code
 * processed by the compiler modules.
 */
public interface ReportLog {
	/**
	 * reportWarning adds a new warning to the ReportLog. A warning does not
	 * force the compiler to stop proceeding. 
	 * 
	 * @param type distinguishes the warning in machine readable format 
	 * @param tokens is a list of tokens containing the warning cause and 
	 *        identify the position in code
	 * @param message describes the warning in human readable manner
	 */
	public void reportWarning(ReportType type, List<Token> tokens, String message);
    
	/**
	 * reportError adds a new error to the ReportLog. A error force the 
	 * compiler to stop proceeding. 
	 * 
	 * @param type distinguishes the error in machine readable format 
	 * @param tokens is a list of tokens containing the error cause and 
	 *        identify the position in code
	 * @param message describes the error in human readable manner
	 */
	public void reportError(ReportType type, List<Token> tokens, String message);
}
