package swp_compiler_ss13.common.types.primitive;

import swp_compiler_ss13.common.types.Type;

/**
 * Primitive type definition.
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public abstract class PrimitiveType extends Type
{

	protected PrimitiveType(Kind kind)
	{
		super(kind);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getTypeName()
	{
		return this.getClass().getSimpleName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName();
	}
}
