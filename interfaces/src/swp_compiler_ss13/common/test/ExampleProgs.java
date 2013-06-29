package swp_compiler_ss13.common.test;


import swp_compiler_ss13.common.report.ReportType;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 *
 * Example programs with expected exitcodes (return), expected output (print)
 * and expected report types (from errlog), including the examples from
 * common/examples.
 *
 *
 * @author Jens V. Fischer
 */
public class ExampleProgs {

	/* M1 progs */

	public static Object[] simpleAddProg() {
		String prog = loadExample("m1/simple_add.prog");
		int expectedExitcode = 6;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] addProg(){
		String prog = loadExample("m1/add.prog");
		int expectedExitcode = 27;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] simpleMulProg(){
		String prog = loadExample("m1/simple_mul.prog");
		int expectedExitcode = 9;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] parenthesesProg(){
		String prog = loadExample("m1/paratheses.prog");
		int expectedExitcode = 8;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}


	/* M1 progs producing errors */

	public static Object[] doubleDeclaration(){
		String prog = loadExample("m1/error_double_decl.prog");

		int expectedExitcode = -1;
		String expectedOutput = "";
		ReportType[] reportTypes = {ReportType.DOUBLE_DECLARATION};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] invalidIds(){
		String prog = loadExample("m1/error_invalid_ids.prog");
		int expectedExitcode = -1;
		String expectedOutput = "";
		ReportType[] reportTypes = {ReportType.UNRECOGNIZED_TOKEN};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] multipleMinusENotation(){
		String prog = loadExample("m1/error_multiple_minus_e_notation.prog");
		int expectedExitcode = -1;
		String expectedOutput = "";
		ReportType[] reportTypes = {ReportType.UNRECOGNIZED_TOKEN};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] multiplePlusesInExp(){
		String prog = loadExample("m1/error_multiple_pluses_in_exp.prog");
		int expectedExitcode = -1;
		String expectedOutput = "";
		ReportType[] reportTypes = {ReportType.UNDEFINED};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] undefReturnProg(){
		String prog = loadExample("m1/error_undef_return.prog");
		int expectedExitcode = 0;
		String expectedOutput = "";
		ReportType[] reportTypes = {ReportType.UNDEFINED};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* M1 additional progs */

	/* test empty prog */
	public static Object[] emptyProg() {
		String prog = "";
		int expectedExitcode = 0;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* M2 progs */

	public static Object[] assignmentProg(){
		String prog = loadExample("m2/assignment.prog");
		int expectedExitcode = 10;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] condProg() {
		String prog = loadExample("m2/cond.prog");
		int expectedExitcode = 5;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] printProg() {
		String prog = loadExample("m2/print.prog");
		int expectedExitcode = 0;
		String expectedOutput = "" +
				"true\n" +
				"18121313223\n" +
				"-2.323000e-99\n" +
				"jagÄrEttString\"\n";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* M2 additional progs */

	/* test prog for regression test against return bug */
	public static Object[] returnProg() {
		String prog = "return;";
		int expectedExitcode = 0;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* array test prog 1 */
	public static Object[] arrayProg1() {
		String prog = "long l; long [ 3 ] a; a [ 0 ] = 42; l = a [ 0 ]; return l;";
		int expectedExitcode = 42;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* array test prog 2 */
	public static Object[] arrayProg2() {
		String prog = "long [ 3 ] a; a [ 0 ] = 42; print a [ 0 ]; return; ";
		int expectedExitcode = 0;
		String expectedOutput = "42\n";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* array test prog 2 */
	public static Object[] arrayProg3() {
		String prog = "long [ 3 ] a; a [ 0 ] = 42; return a [ 0 ];";
		int expectedExitcode = 42;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/**
	 * As the compiler does not implement functions yet, the return statement is
	 * effectivly the exit code of the implicit main function. As OS'es usually
	 * allow only positive natural numbers as exit codes, only returning longs
	 * is specified and implemented yet.
	 */
	public static Object[] returnBool() {
		String prog = "bool b; b = true; return b";
		int expectedExitcode = 0;
		String expectedOutput = "42\n";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	/* M3 example progs */

	public static Object[] fibProg(){
		String prog = loadExample("m3/fib.prog");
		int expectedExitcode = 98;
		String expectedOutput = "6765\n";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] matrixMultiplicationProg(){
		String prog = loadExample("m3/matrixMultiplication.prog");
		int expectedExitcode = 0;
		String expectedOutput = "14 46\n28 92\n42 138\n42 138\n";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	public static Object[] newtonProg(){
		String prog = loadExample("m3/newton.prog");
		int expectedExitcode = 0;
		String expectedOutput = "";
		ReportType[] reportTypes = {};
		return new Object[]{prog, expectedExitcode, expectedOutput, reportTypes};
	}

	private static String loadExample(String progName) {
		String userDir = System.getProperty("user.dir");
		Path path;

		/* handling different paths depending on from where the tests are called*/
		if (userDir.endsWith("fuc/code") || userDir.endsWith("crosstesting"))
			path = FileSystems.getDefault().getPath("common", "examples", progName);
		else if (userDir.endsWith("fuc/code/test") || userDir.endsWith("crosstesting/crosstest") )
			path = FileSystems.getDefault().getPath("..", "common", "examples", progName);
		else /* will fail */
			path = FileSystems.getDefault().getPath(progName);
		try {
			return new Scanner(path, "UTF-8").useDelimiter("\\A").next();
		} catch (IOException e) {
			throw new RuntimeException("file '" + progName + "' not found at '" +
					path.toAbsolutePath().normalize() + "'");
		}
	}

}