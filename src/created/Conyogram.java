package created;

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
    
    /**
     * Function for setting up symbol lists.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void setSymList()
    {
        
    }
    
    /**
     * Function to check for semantic errors in code.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void checkContext()
    {
        
    }
    
    /**
     * Function to retrieve values from SymList for evaluation in evaluate()
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void preInterpret()
    {
        
    }
    
    /**
     * Function to interpret and evaluate expressions, functions, etc.
     * Based on code by Klein and Rumpe, examples->interpreter
     */
    public void evaluate()
    {
        
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
