package swp_compiler_ss13.common.parser;

import swp_compiler_ss13.common.optimization.Liveliness;
import swp_compiler_ss13.common.types.Type;

/**
 * Extended interface for the SymbolTable.
 * The old SymbolTable interface was updated because
 * new features have been requested and the old method
 * names and javadoc comments have been unclear
 * @author Frank Zechert
 * @version 2
 */

public interface SymbolTable {
    /**
     * Get the symbol table of the previous scope. If there is no previous scope returns null.
     * @return The symbol table of the previous scope or null.
     */
    public SymbolTable getParentSymbolTable();

    /**
     * Get the root symbol table
     * @return the root symbol table
     * @since 2
     */
     public SymbolTable getRootSymbolTable();

    /**
     * Checks if the given identifier is already declared.
     * This method checks the current symbol table and all parent
     * symbol tables until the identifier is found or the root table is reached.
     * @param identifier The identifier to check.
     * @return true if the identifier is declared, false otherwise
     * @since 2
     */
    public Boolean isDeclared(String identifier);

    /**
     * Check if the given identifier is declared in this symbol table instance.
     * It does not check the identifier in the parent symbol tables up to the root.
     * @param identifier The identifier to check.
     * @return true if the identifier is declared, false otherwise
     * @since 2
     */
     public Boolean isDeclaredInCurrentScope(String identifier);

    /**
     * Returns the Type of the given identifier. The identifier is searched
     * in this symbol table and in all parent symbol tables up to the root until it is found.
     * @param identifier The identifier to lookup.
     * @return The Type of the identifier. Returns null if identifier was not found.
     * @since 2
     */
    public Type lookupType(String identifier);

    /**
     * Returns the Type of the given identifier. The identifier is searched
     * in this symbol table only. Parent symbol tables are not searched.
     * @param identifier The identifier to lookup.
     * @return The Type of the identifier. Returns null if identifier was not found.
     * @since 2
     */
    public Type lookupTypeInCurrentScope(String identifier);

    /**
     * Insert the identifier <code>identifier</code> of type <code>type</code> into the symbol table.
     * The identifier is added into this symbol table. 
     * @param identifier The identifier to insert into the symbol table.
     * @param type The Type of the identifier.
     * @return Returns false if the identifier was already declared in the current symbol table (it does not look into parent tables), true otherwise.
     */
    public Boolean insert(String identifier, Type type);

    /**
     * Remove the <code>identifier</code> from the current symbol table.
     * @param identifier The identifier to remove.
     * @return true if the identifier was removed, false if it was not in the symbol table and therefore not removed.
     */
    public Boolean remove(String identifier);

    /**
     * Set the liveliness information of the identifier in the current symbol table.
     * @param identifier The identifier.
     * @param liveliness New liveliness information.
     */
    public void setLivelinessInformation(String identifier, Liveliness liveliness);


    /**
     * Get the liveliness information of the identifier from the current symbol table.
     * @param identifier The identifier to get the liveliniess informations for.
     * @return The liveliness information or null if none.
     */
    public Liveliness getLivelinessInformation(String identifier);


    /**
     * Get the next free temporary name.
     * The returned temporary name has to be globally unique.
     * @return the next free temporary name
     */
    public String getNextFreeTemporary();

    /**
     * Put the identifier into the root symbol table.
     * @param identifier The identifier to insert into the root symbol table.
     * @param type The Type of the identifier.
     */
    public void putTemporary(String identifier, Type type);

    /**
     * Save an alias for the identifier given in the current symbol table.
     * @param identifier The identifier to set the alias for
     * @param alias The alias to define for the identifier
     * @since 2
     */
    public void setIdentifierAlias(String identifier, String alias);

    /**
     * Get an alias for the identifier from the symbol table.
     * The alias is searched in this symbol tables and all parent symbol tables
     * up to the root table. The first alias found is returned.
     * @param identifier The identifier to get the alias for
     * @return Return the alias if any found, return the identifier if no alias was found, return null if the identifier does not exist.
     * @since 2
     */
    public String getIdentifierAlias(String identifier);

    /**
     * Returns the SymbolTable that declares the identifier. 
     * It checks this symbol table and all parents up to the root symbol table until the identifier is found.
     * @param identifier The identifier to look for
     * @return The SymbolTable that declares the identifier or null if the identifier is not declared
     * @since 2
     */
    public SymbolTable getDeclaringSymbolTable(String identifier);
}
