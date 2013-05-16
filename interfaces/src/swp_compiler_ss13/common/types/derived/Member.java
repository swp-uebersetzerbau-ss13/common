package swp_compiler_ss13.common.types.derived;

import swp_compiler_ss13.common.types.Type;

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