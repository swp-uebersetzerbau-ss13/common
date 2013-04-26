package swp_compiler_ss13.common.parser;

import swp_compiler_ss13.common.ast.AST;
import swp_compiler_ss13.common.lexer.Lexer;

public interface Parser {
	
	/**
	 * Defines the lexer instance which should be used. The lexer has to be
	 * ready for process before calling getParsedAST().
	 * 
	 * @param lexer 
	 */
	void setLexer(Lexer lexer);
	
	/**
	 * Set the ReportLog which should be used for error reporting by the 
	 * parser.
	 * 
	 * @param reportLog
	 */
	void setReportLog(ReportLog reportLog);
	
	/**
	 * Starts the parsing process for the source file associated with the
	 * defined lexer.
	 * 
	 * This assumes that Lexer and ReportLog are setted and usable.
	 * 
	 * @return a well-formed AST
	 */
	AST getParsedAST();
}
