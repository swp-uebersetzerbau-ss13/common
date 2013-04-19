package swp_compiler_ss13.common.ir.backend;

import java.io.OutputStream;
import java.util.List;

interface Quadruple
{
	Operator getOperator();
	String   getArgument1();
	String   getArgument2();
	String   getResult();

	/* Should print the Quadruple as a String */
	String toString();
	
	public enum Operator
	{
		/* Variable declaration */
		DECLARE_LONG,
		DECLARE_DOUBLE,
		DECLARE_BOOL,
		DECLARE_STRING,

		/* Type conversion */
		LONG_TO_DOUBLE,
		DOUBLE_TO_LONG,

		/* Unindexed copy */
		ASSIGN_LONG,
		ASSIGN_DOUBLE,
		ASSIGN_BOOL,
		ASSIGN_STRING,

		/* Arithmetic */
		ADD_LONG,
		ADD_DOUBLE,
		SUB_LONG,
		SUB_DOUBLE,
		MULT_LONG,
		MULT_DOUBLE,
		DIV_LONG,
		DIV_DOUBLE,

		/* Control flow */
		RETURN
	}
}

interface Backend
{
	void generateTargetCode(List<Quadruple> tac, OutputStream output);
}
