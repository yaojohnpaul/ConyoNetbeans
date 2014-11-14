
package created.OMG;

import created.*;
import created.sabisabi.SabiSabi;

/**
 * A symbol for constants.
 */
public class SymOMG extends SymEntry
{
    SabiSabi ss;
    
    /**
     * Constructor
     * @param n Name of constant.
     */
    public SymOMG(String n, SabiSabi ss)
    {
        super(n);
        this.ss = ss;
    }
    
    @Override
    public int symType()
    {
        return SymEntry.CONST;
    }
    
    @Override
    public String toString()
    {
        return ss.toString();
    }
}
