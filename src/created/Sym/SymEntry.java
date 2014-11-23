
package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
    public static final int CONSTRUCTOR = 105;
    
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
    
    public data_type type()
    {
        return null;
    }
    
    @Override
    public String toString()
    {
        return symName;
    }
}
