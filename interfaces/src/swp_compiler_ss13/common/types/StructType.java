package swp_compiler_ss13.common.types;

/**
 * Struct type definition.
 * 
 * @author "Frank Zechert", "Danny Maasch"
 * @version 1
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/wiki/Types">Types Wiki</a>
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/8">Types Issue Tracker</a>
 */
public class StructType extends Type {
	
	/**
	 * The member types in order.
	 */
	protected Type[] memberTypes;
	
	/**
	 * The name of the struct type.
	 */
	protected String name;

	/**
	 * Create a new struct type.
	 * @param typeName The name of this type.
	 * @param types The member types.
	 */
	public StructType(String typeName, Type... types) {
		if (types.length <= 0) {
			throw new IllegalArgumentException("A struct needs to have at least one member.");
		}
		this.name = typeName;
		this.memberTypes = types;

		this.width = 0L;
		for (Type member : types) {
			this.width += member.width;
		}
	}
	
	/**
	 * Return the member types.
	 * @return The member types of this struct.
	 */
	public Type[] memberTypes() {
		return this.memberTypes;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTypeName() {
		return this.name;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	public String toString() {
		StringBuilder typelist = new StringBuilder();
		for(Type member : this.memberTypes) {
			typelist.append(member.toString());
			typelist.append(", ");
		}
		String types = typelist.substring(0, typelist.length() - 2);
		return String.format("%s {%s}", this.name, types);
	}
}
