package swp_compiler_ss13.common.types.derived;

import swp_compiler_ss13.common.types.Type;

/**
 * Array Type for type definitions.
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public class ArrayType extends DerivedType
{
	/**
	 * Type of the array.
	 */
	protected Type type;

	/**
	 * Number of elements in this array.
	 */
	protected Integer length;

	/**
	 * Create a new array of type <code>type</code> with <code>length</code> elements.
	 * @param type The type of this array.
	 * @param length The number of elements in the array.
	 */
	public ArrayType(Type type, int length)
	{
		super(Kind.ARRAY);
		if(length < 0)
		{
			throw new NegativeArraySizeException(
				String.format(
					"The array size %d is invalid. Array size needs to be greater or equal to 0",
					length));
		}
		this.type = type;
		this.width = type.getWidth() * length;
		this.length = length;
	}

	/**
	 * Return the number of elements this array can store.
	 * @return The length of this array (number of elements).
	 */
	public Integer getLength()
	{
		return this.length;
	}

	/**
	 * Get the inner type of this array. This is the type of the array elements.
	 * @return The type of the array elements.
	 */
	public Type getInnerType()
	{
		return this.type;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTypeName()
	{
		return String.format("%s[]", type.getTypeName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		ArrayType type = (ArrayType) this;
		Type innerType = type.getInnerType();
		Integer numberOfElements = type.length;
		return String.format("%s[%d]", innerType.toString(), numberOfElements);
	}
}
