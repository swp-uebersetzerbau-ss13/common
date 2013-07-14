package swp_compiler_ss13.common.test;

import swp_compiler_ss13.common.report.ReportType;

/**
 * Datastructure representing a program with expected exit code, output and ReportTypes.
 */
public class Program {

	public String programCode;
	public Integer expectedExitcode;
	public String expectedOutput;
	public ReportType[] expecteReportTypes;

	public Program(String programCode, Integer expectedExitcode, String expectedOutput, ReportType[] expecteReportTypes) {
		this.programCode = programCode;
		this.expectedExitcode = expectedExitcode;
		this.expectedOutput = expectedOutput;
		this.expecteReportTypes = expecteReportTypes;
	}
}
