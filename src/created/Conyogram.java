package created;

import created.Sym.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
    
    private SymList OMG_sym;
    private SymList yaya_sym;
    private SymList super_sym;
    
    /**
     * Function for setting up symbol lists.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void setSymList()
    {
        OMG_sym = new SymList();
        
        //OMG
        if(o instanceof OMG_section.OMGSection)
        {
            ((OMG_section.OMGSection) o).setSymList(OMG_sym);
        }
        
        yaya_sym = new SymList(OMG_sym);
        
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).setSymList(yaya_sym);
        }
        
        super_sym = new SymList(yaya_sym);
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).setSymList(super_sym);
        }
    }
    
    /**
     * Function to check for semantic errors in code.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void checkContext()
    {
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).checkContext(yaya_sym);
        }
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).checkContext(super_sym);
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
            ((OMG_section.OMGSection) o).preInterpret(OMG_sym);
        }
        
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).preInterpret(yaya_sym);
        }
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).preInterpret(super_sym);
        }
    }
    
    /**
     * Function to interpret and evaluate expressions, functions, etc.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void evaluate()
    {
        //OMG
        if(o instanceof OMG_section.OMGSection)
        {
            ((OMG_section.OMGSection) o).evaluate(OMG_sym);
        }
        
        //Yaya
        if(y instanceof yaya_section.yayaSection)
        {
            ((yaya_section.yayaSection) y).evaluate(yaya_sym);
        }
        
        //Super Yaya
        if(s instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) s).evaluate(super_sym);
        }
        
        OutGen.printResult();
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
