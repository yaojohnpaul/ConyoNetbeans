
package created.OMG;

import created.*;

/**
 * A symbol for constants.
 */
public class SymOMG extends SymEntry
{
    /**
     * Constructor
     * @param n Name of constant.
     */
    public SymOMG(String n)
    {
        super(n);
    }
    
    @Override
    public int symType()
    {
        return SymEntry.CONST;
    }
    
    @Override
    public String toString()
    {
        return symName;
    }
}
