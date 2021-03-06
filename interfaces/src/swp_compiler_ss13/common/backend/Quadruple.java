package swp_compiler_ss13.common.backend;

public interface Quadruple
{
	Operator getOperator();
	String   getArgument1();
	String   getArgument2();
	String   getResult();

	static final String EmptyArgument = "!";

	/* Should print the Quadruple as a String */
	String toString();

	public enum Operator
	{
		/* Variable declaration */
		DECLARE_LONG,
		DECLARE_DOUBLE,
		DECLARE_BOOLEAN,
		DECLARE_STRING,
		DECLARE_REFERENCE,
		DECLARE_ARRAY,
		DECLARE_STRUCT,

		/* Type conversion */
		LONG_TO_DOUBLE,
		DOUBLE_TO_LONG,
		BOOLEAN_TO_STRING,
		LONG_TO_STRING,
		DOUBLE_TO_STRING,

		/* Unindexed copy */
		ASSIGN_LONG,
		ASSIGN_DOUBLE,
		ASSIGN_BOOLEAN,
		ASSIGN_STRING,

		/* Indexed copy */
		ARRAY_GET_LONG,
		ARRAY_GET_DOUBLE,
		ARRAY_GET_BOOLEAN,
		ARRAY_GET_STRING,
		ARRAY_GET_REFERENCE,
		ARRAY_SET_LONG,
		ARRAY_SET_DOUBLE,
		ARRAY_SET_BOOLEAN,
		ARRAY_SET_STRING,
		STRUCT_GET_LONG,
		STRUCT_GET_DOUBLE,
		STRUCT_GET_BOOLEAN,
		STRUCT_GET_STRING,
		STRUCT_GET_REFERENCE,
		STRUCT_SET_LONG,
		STRUCT_SET_DOUBLE,
		STRUCT_SET_BOOLEAN,
		STRUCT_SET_STRING,

		/* Arithmetic */
		ADD_LONG,
		ADD_DOUBLE,
		SUB_LONG,
		SUB_DOUBLE,
		MUL_LONG,
		MUL_DOUBLE,
		DIV_LONG,
		DIV_DOUBLE,
		NOT_BOOLEAN,
		OR_BOOLEAN,
		AND_BOOLEAN,
		CONCAT_STRING,

		/* Compare */
		COMPARE_LONG_E,
		COMPARE_LONG_G,
		COMPARE_LONG_L,
		COMPARE_LONG_GE,
		COMPARE_LONG_LE,
		COMPARE_DOUBLE_E,
		COMPARE_DOUBLE_G,
		COMPARE_DOUBLE_L,
		COMPARE_DOUBLE_GE,
		COMPARE_DOUBLE_LE,

		/* Control flow */
		RETURN,
		LABEL,
		BRANCH,

		/* I/O */
		PRINT_STRING
	}
}
