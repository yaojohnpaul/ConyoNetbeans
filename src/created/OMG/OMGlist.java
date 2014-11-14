
package created.OMG;

import error.ErrorReport;
import created.*;

/**
 * List of constant declaration.
 */
public class OMGlist implements iNode
{
    private OMGlist olist;
    private OMG o;
    
    /**
     * First constructor, no constant declaration.
     */
    public OMGlist()
    {
        olist = null;
        o = null;
    }
    
    /**
     * Second constructor, one constant declaration.
     * @param o Single constant declaration.
     */
    public OMGlist(OMG o)
    {
        olist = null;
        this.o = o;
    }
    
    /**
     * Third constructor, multiple constant declaration
     * @param o Single constant declaration.
     * @param l All the other constants in another OMGlist instance.
     */
    public OMGlist(OMG o, OMGlist l)
    {
        olist = l;
        this.o = o;
    }
    
    /**
     * Add constants to symbol list.
     * @param sl Symbol list.
     */
    public void addToSymList(SymList sl)
    {
        Boolean success = false;
        if(o != null) //there are constants
        {
            success = sl.addToList(o.toString(), new SymOMG(o.toString(), o.getValue()));
            if(!success) //no duplicate
            {
                ErrorReport.error("Duplicate constant! - " + o.toString());
            }
            if(olist != null) //more constants
            {
                olist.addToSymList(sl);
            }
        }
    }
}
