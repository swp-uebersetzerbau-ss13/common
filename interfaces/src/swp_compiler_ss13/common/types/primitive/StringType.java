package swp_compiler_ss13.common.types.primitive;

import swp_compiler_ss13.common.types.Type;

/**
 * String type definition.
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public class StringType extends PrimitiveType
{

	/**
	 * Create a new string type
	 */
	public StringType(Long max_length)
	{
		this.width = max_length;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + "["+this.width+"]";
	}
}
