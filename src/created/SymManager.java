
package created;

import created.Sym.*;
import created.ParseTree.Program.*;
import error.ErrorReport;

/**
 * Class to contain and manage symbol lists.
 */
public class SymManager 
{
    public static int OMG_ID = 1;
    public static int YAYA_ID = 2;
    public static int SUPER_ID = 3;
    
    private static SymList OMG_sym = null;
    private static SymList yaya_sym = null;
    private static SymList super_sym = null;
    
    /**
     * Function to initialize SymList
     * @param id ID of symbol list.
     * @param sl SymList to set to SymList
     */
    public static void initSym(int id, SymList sl)
    {
        if(id == OMG_ID)
        {
            OMG_sym = sl;
        }
        else if(id == YAYA_ID)
        {
            yaya_sym = sl;
        }
        else if(id == SUPER_ID)
        {
            super_sym = sl;
        }
    }
    
    /**
     * Get SymList function
     * @param id SymList id
     * @return SymList object
     */
    public static SymList getSym(int id)
    {
        if(id == OMG_ID)
        {
            return OMG_sym;
        }
        else if(id == YAYA_ID)
        {
            return yaya_sym;
        }
        else if(id == SUPER_ID)
        {
            return super_sym;
        }
        return null;
    }
}
