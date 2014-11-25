
package created;

/**
 * Main general node interface for all classes.
 */
public abstract class iNode 
{
    private int ln; //line number
    
    public iNode(int ln)
    {
        this.ln = ln;
    }
    
    public int ln()
    {
        return ln;
    }
    
    public String toString()
    {
        return "";
    };
}
