
package created.OMG;

import created.*;
import created.sabisabi.*;

/**
 * Constant declaration instance.
 */
public class OMG implements iNode
{
    String id; //Constant name
    SabiSabi ss; //Expression, value of constant
    
    public OMG(String id, SabiSabi ss)
    {
        this.id = id;
        this.ss = ss;
    }
    
    @Override
    public String toString()
    {
        return id;
    }
    
    /**
     * Get the value of the constant.
     * @return Constant value.
     */
    public SabiSabi getValue()
    {
        return ss;
    }
}
