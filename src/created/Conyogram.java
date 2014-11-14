package created;

import created.OMG.*;

public class Conyogram implements iNode
{
    private OMGlist omglist;
    
    //symbol lists
    SymList OMGSym = null;
    
    /**
     * Constructor
     */
    public Conyogram(OMGlist o)
    {
        omglist = o;
    }
    
    /**
     * Setup all symbol lists.
     */
    public void setupSymList()
    {
        System.out.println("Setting up symbol lists..");
        OMGSym = new SymList();
        omglist.addToSymList(OMGSym);
        System.out.print(OMGSym.toString());
    }
}
