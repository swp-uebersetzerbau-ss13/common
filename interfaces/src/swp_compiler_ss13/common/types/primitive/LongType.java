package swp_compiler_ss13.common.types.primitive;

import swp_compiler_ss13.common.types.Type;

/**
 * Long type definition.
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public class LongType extends PrimitiveType
{

	/**
	 * Create a new long type
	 */
	public LongType() {
		this.width = 8L;
	}
}
