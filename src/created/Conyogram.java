package created;

import created.Sym.*;
import created.ParseTree.Program.*;
import error.ErrorReport;

public class Conyogram implements iNode
{
    private OMG_section o;
    private yaya_section y;
    private super_yaya s;
    
    /**
     * Constructor
     */
    public Conyogram(OMG_section o, yaya_section y, super_yaya s)
    {
        this.o = o;
        this.y = y;
        this.s = s;
    }
    
    /**
     * Function for setting up symbol lists.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void setSymList()
    {
        SymManager.initSym(SymManager.OMG_ID, new SymList());
        
        //OMG
        if(o instanceof OMG_section.OMGSection)
        {
            ((OMG_section.OMGSection) o).setSymList(SymManager.getSym(SymManager.OMG_ID));
        }
        
        SymManager.initSym(SymManager.YAYA_ID, new SymList(SymManager.getSym(SymManager.OMG_ID)));
        
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).setSymList(SymManager.getSym(SymManager.YAYA_ID));
        }
        
        SymManager.initSym(SymManager.SUPER_ID, new SymList(SymManager.getSym(SymManager.YAYA_ID)));
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).setSymList(SymManager.getSym(SymManager.SUPER_ID));
        }
    }
    
    /**
     * Method for printing the general SymLists of Conyogram.
     */
    public void printSymList()
    {
        System.out.println("OMG SymList: \n" + SymManager.getSym(SymManager.OMG_ID).toString());
        System.out.println("Yaya SymList: \n" + SymManager.getSym(SymManager.YAYA_ID).toString());
        //System.out.println("Super Yaya SymList: \n" + super_sym.toString());
    }
    
    /**
     * Function to check for semantic errors in code.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void checkContext()
    {
        //OMG
        if(o instanceof OMG_section.OMGSection)
        {
            ((OMG_section.OMGSection) o).checkContext(SymManager.getSym(SymManager.OMG_ID));
        }
        
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).checkContext(SymManager.getSym(SymManager.YAYA_ID));
        }
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).checkContext(SymManager.getSym(SymManager.SUPER_ID));
        }
    }
    
    /**
     * Function to retrieve values from SymList for evaluation in evaluate()
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void preInterpret()
    {
        //OMG
        if(o instanceof OMG_section.OMGSection)
        {
            ((OMG_section.OMGSection) o).preInterpret(SymManager.getSym(SymManager.OMG_ID));
        }
        
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).preInterpret(SymManager.getSym(SymManager.YAYA_ID));
        }
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).preInterpret(SymManager.getSym(SymManager.SUPER_ID));
        }
    }
    
    /**
     * Function to interpret and evaluate expressions, functions, etc.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void evaluate()
    {
        //OMG
        /*if(o instanceof OMG_section.OMGSection)
        {
            ((OMG_section.OMGSection) o).evaluate(OMG_sym);
        }*/
        
        //Yaya
        /*if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).evaluate(yaya_sym);
        }*/
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).evaluate(SymManager.getSym(SymManager.SUPER_ID));
        }
    }
    
    /**
     * To string function.
     */
    public String toString()
    {
        return "Constants: \n" + o.toString()
                + "\n\nFunctions: \n" + y.toString()
                + "\n\nMain: \n" + s.toString();
    }
}
