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
	 * A member of a struct.
	 *
	 * @author "Frank Zechert", "Danny Maasch"
	 * @version 1
	 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Symbol Table">Symbol Table Wiki</a>
	 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/6">Symbol Table Issue Tracker</a>
	 */
	public class Member
	{

		/**
		 * The name of the member
		 */
		protected String name;

		/**
		 * The type of the member
		 */
		protected Type type;

		/**
		 * Create a new member with the given <code>name</code> and <code>type</code>.
		 * @param name The name of the member
		 * @param type The type of the member
		 */
		public Member(String name, Type type)
		{
			this.name = name;
			this.type = type;
		}

		/**
		 * Get the name of this member.
		 * @return The name name.
		 */
		public String getName()
		{
			return name;
		}

		/**
		 * Get the type of this member.
		 * @return The type of this member.
		 */
		public Type getType()
		{
			return type;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public String toString()
		{
			return String.format("%s: %s", this.name, this.type.toString());
		}
	}

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
