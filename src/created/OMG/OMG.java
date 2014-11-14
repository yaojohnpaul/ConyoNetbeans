
package created.OMG;

import created.*;

/**
 * Constant declaration instance.
 */
public class OMG implements iNode
{
    String id; //Constant name
    
    public OMG(String id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        return id;
    }
}
