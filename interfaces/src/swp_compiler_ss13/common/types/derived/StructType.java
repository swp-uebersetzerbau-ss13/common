package swp_compiler_ss13.common.types.derived;

import swp_compiler_ss13.common.types.Type;

/**
 * Struct type definition.
 *
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public class StructType extends Type
{
	/**
	 * The members in order.
	 */
	protected Member[] members;

	/**
	 * The name of the struct type.
	 */
	protected String name;

	/**
	 * Create a new struct type.
	 * @param typeName The name of this type.
	 * @param members The member types.
	 */
	public StructType(String typeName, Member... members)
	{
		super(Kind.STRUCT);
		if (members.length <= 0)
		{
			throw new IllegalArgumentException("A struct needs to have at least one member.");
		}

		this.name = typeName;
		this.members = members;

		this.width = 0L;
		for (Member member : members)
		{
			this.width += member.type.getWidth();
		}
	}

	/**
	 * Return the members.
	 * @return The members of this struct type.
	 */
	public Member[] members()
	{
		return this.members;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTypeName()
	{
		return this.name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		StringBuilder typelist = new StringBuilder();
		for(Member member : this.members)
		{
			typelist.append(member.toString());
			typelist.append(", ");
		}

		String types = typelist.substring(0, typelist.length() - 2);
		return String.format("%s {%s}", this.name, types);
	}
}
