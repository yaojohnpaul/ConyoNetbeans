package created;

import created.OMG.*;
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
    
    /**
     * To string function.
     */
    public String toString()
    {
        return "Constants: \n" + o.toString()
                + "Functions: \n" + y.toString()
                + "Classes: \n" + s.toString()
                + "Main: \n" + m.toString();
    }
}
