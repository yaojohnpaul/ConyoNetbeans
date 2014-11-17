package created;

import created.Sym.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public class Conyogram implements iNode
{
    private OMG_section o;
    private yaya_section y;
    private sub_yaya_section s;
    private super_yaya m;
    
    /**
     * Constructor
     */
    public Conyogram(OMG_section o, yaya_section y, sub_yaya_section s, super_yaya m)
    {
        this.o = o;
        this.y = y;
        this.s = s;
        this.m = m;
    }
    
    private SymList OMG_sym;
    private SymList yaya_sym;
    private SymList sub_yaya_sym;
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
        
        sub_yaya_sym = new SymList(yaya_sym);
        
        //Sub Yaya 
        if(s instanceof sub_yaya_section.subYayaSection)
        {
            ((sub_yaya_section.subYayaSection) s).setSymList(sub_yaya_sym);
        }
        
        super_sym = new SymList(sub_yaya_sym);
        
        //Super Yaya
        if(m instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) m).setSymList(super_sym);
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
        
        //Sub Yaya 
        if(s instanceof sub_yaya_section.subYayaSection)
        {
            ((sub_yaya_section.subYayaSection) s).checkContext(sub_yaya_sym);
        }
        
        //Super Yaya
        if(m instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) m).checkContext(super_sym);
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
        
        //Sub Yaya 
        if(s instanceof sub_yaya_section.subYayaSection)
        {
            ((sub_yaya_section.subYayaSection) s).preInterpret(sub_yaya_sym);
        }
        
        //Super Yaya
        if(m instanceof super_yaya.superYaya)
        {
            ((super_yaya.superYaya) m).preInterpret(super_sym);
        }
    }
    
    /**
     * Function to interpret and evaluate expressions, functions, etc.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void evaluate()
    {
        // //OMG
        // if(o instanceof OMG_section.OMGSection)
        // {
        //     ((OMG_section.OMGSection) o).evaluate(OMG_sym);
        // }
        
        // //Yaya
        // if(y instanceof yaya_section.yayaSection)
        // {
        //     ((yaya_section.yayaSection) y).evaluate(yaya_sym);
        // }
        
        // //Sub Yaya 
        // if(s instanceof sub_yaya_section.subYayaSection)
        // {
        //     ((sub_yaya_section.subYayaSection) s).evaluate(sub_yaya_sym);
        // }
        
        // //Super Yaya
        // if(m instanceof super_yaya.superYaya)
        // {
        //     ((super_yaya.superYaya) m).evaluate(super_sym);
        // }
        
        OutGen.printResult();
    }
    
    /**
     * To string function.
     */
    public String toString()
    {
        return "Constants: \n" + o.toString()
                + "\n\nFunctions: \n" + y.toString()
                + "\n\nClasses: \n" + s.toString()
                + "\n\nMain: \n" + m.toString();
    }
}
