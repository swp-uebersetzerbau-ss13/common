package swp_compiler_ss13.common.test;


import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

import swp_compiler_ss13.common.report.ReportType;

/**
 *
 *
 * Example programs with expected exitcodes and expected output, including the
 * examples from common/examples.
 *
 *
 * @author Jens V. Fischer
 */
public class ExampleProgs {

	/* M1 progs */

	public static Object[] simpleAddProg() {
		String prog = loadExample("m1"+File.separator+"simple_add.prog");
		int expectedExitcode = 6;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] addProg(){
		String prog = loadExample("m1"+File.separator+"add.prog");
		int expectedExitcode = 27;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] simpleMulProg(){
		String prog = loadExample("m1"+File.separator+"simple_mul.prog");
		int expectedExitcode = 9;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] parenthesesProg(){
		String prog = loadExample("m1"+File.separator+"paratheses.prog");
		int expectedExitcode = 8;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}


	/* M1 progs producing errors */

	public static Object[] doubleDeclaration(){
		String prog = loadExample("m1"+File.separator+"error_double_decl.prog");

		int expectedExitcode = -1;
		String expectedOutput = "ERROR (DOUBLE_DECLARATION): The variable 'i' of type 'LongType' has been declared twice in this scope!";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] invalidIds(){
		String prog = loadExample("m1"+File.separator+"error_invalid_ids.prog");
		int expectedExitcode = -1;
		String expectedOutput = "ERROR (UNRECOGNIZED_TOKEN): Found undefined token 'foo$bar'!";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] multipleMinusENotation(){
		String prog = loadExample("m1"+File.separator+"error_multiple_minus_e_notation.prog");
		int expectedExitcode = -1;
		String expectedOutput = "ERROR (UNRECOGNIZED_TOKEN): Found undefined token '10e----1'!";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] multiplePlusesInExp(){
		String prog = loadExample("m1"+File.separator+"error_multiple_pluses_in_exp.prog");
		int expectedExitcode = -1;
		String expectedOutput = "An error occurred: No entry for + in parsetable!";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] undefReturnProg(){
		String prog = loadExample("m1"+File.separator+"error_undef_return.prog");
		int expectedExitcode = 0;
		String expectedOutput = "WARNNING (UNDEFINED): Variable 'spam' may be used without initialization.";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* M1 additional progs */

	/* test empty prog */
	public static Object[] emptyProg() {
		String prog = "";
		int expectedExitcode = 0;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* M2 progs */

	public static Object[] assignmentProg(){
		String prog = loadExample("m2"+File.separator+"assignment.prog");
		int expectedExitcode = 10;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] condProg() {
		String prog = loadExample("m2"+File.separator+"cond.prog");
		int expectedExitcode = 5;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] printProg() {
		String prog = loadExample("m2"+File.separator+"print.prog");
		int expectedExitcode = 0;
		String expectedOutput = "" +
				"true\n" +
				"18121313223\n" +
				"-2.323000e-99\n" +
				"jagÄrEttString\"\n";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* M2 additional progs */

	/* test prog for regression test against return bug */
	public static Object[] returnProg() {
		String prog = "return;";
		int expectedExitcode = 0;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* array test prog 1 */
	public static Object[] arrayProg1() {
		String prog = "long l; long [ 3 ] a; a [ 0 ] = 42; l = a [ 0 ]; return l;";
		int expectedExitcode = 42;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* array test prog 2 */
	public static Object[] arrayProg2() {
		String prog = "long [ 3 ] a; a [ 0 ] = 42; print a [ 0 ]; return; ";
		int expectedExitcode = 0;
		String expectedOutput = "42\n";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* array test prog 2 */
	public static Object[] arrayProg3() {
		String prog = "long [ 3 ] a; a [ 0 ] = 42; return a [ 0 ];";
		int expectedExitcode = 42;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
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
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	/* M3 example progs */

	public static Object[] fibProg(){
		String prog = loadExample("m3"+File.separator+"fib.prog");
		int expectedExitcode = 98;
		String expectedOutput = "6765\n";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] matrixMultiplicationProg(){
		String prog = loadExample("m3"+File.separator+"matrixMultiplication.prog");
		int expectedExitcode = 0;
		String expectedOutput = "14 46\n28 92\n42 138\n42 138\n";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	public static Object[] newtonProg(){
		String prog = loadExample("m3"+File.separator+"newton.prog");
		int expectedExitcode = 0;
		String expectedOutput = "";
		return new Object[]{prog, expectedExitcode, expectedOutput, new ReportType[]{}};
	}

	private static String loadExample(String progName) {
		String userDir = System.getProperty("user.dir");
		Path path;

		/* if executed by global build.xml */
		if (userDir.endsWith("fuc"+File.separator+"code"))
			path = FileSystems.getDefault().getPath("common", "examples", progName);

		/* if executed by modules build.xml */
		else if (userDir.endsWith("fuc"+File.separator+"code"+File.separator+"test") || userDir.endsWith("crosstesting"+File.separator+"crosstest") )
			path = FileSystems.getDefault().getPath("..", "common", "examples", progName);

		/* if in unknown user.dir */
		else
			path = FileSystems.getDefault().getPath(progName);

		try {
			return new Scanner(path, "UTF-8").useDelimiter("\\A").next();
		} catch (IOException e) {
			throw new RuntimeException("file '" + progName + "' not found at '" +
					path.toAbsolutePath().normalize() + "'");
		}
	}

}
