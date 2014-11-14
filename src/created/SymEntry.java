
package created;

/**
 * An entry for the symbol list.
 * Based on SymtabEntry class by Klein and Rumpe. (jflex examples, interpreter)
 */
public class SymEntry 
{
    /*Variables that act as types for symbols.*/
    public static final int NONE = 100;
    public static final int VAR = 101;
    public static final int CONST = 102;
    public static final int FUNC = 103;
    public static final int CLASS = 104;
    
    protected String symName = "";
    
    /**
     * Constructor
     * @param n Name of symbol.
     */
    public SymEntry(String n)
    {
        symName = n;
    }
    
    /**
     * What type of symbol it is. (e.g. variable)
     * @return Type of symbol
     */
    public int symType()
    {
        return NONE;
    }
    
    @Override
    public String toString()
    {
        return symName;
    }
}
