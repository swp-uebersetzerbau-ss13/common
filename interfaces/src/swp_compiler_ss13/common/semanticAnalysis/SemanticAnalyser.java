package swp_compiler_ss13.common.semanticAnalysis;

import swp_compiler_ss13.common.ast.AST;
import swp_compiler_ss13.common.report.ReportLog;

public interface SemanticAnalyser {
	 public void setReportLog(ReportLog log);
	 public AST analyse(AST ast);
}
