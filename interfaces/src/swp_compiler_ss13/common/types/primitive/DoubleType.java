package swp_compiler_ss13.common.types.primitive;


/**
 * Double type definition.
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public class DoubleType extends PrimitiveType
{

	/**
	 * Create a new double type
	 */
	public DoubleType()
	{
		super(Kind.DOUBLE);
		this.width = 8L;
	}
}
