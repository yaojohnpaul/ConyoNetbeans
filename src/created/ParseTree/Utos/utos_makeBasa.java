package created.ParseTree.Utos;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import created.*;
import error.*;

public abstract class utos_makeBasa extends created.iNode  
{
    public utos_makeBasa(int ln)
    {
        super(ln);
    }
    
    public static class makeBasa extends utos_makeBasa
    {
        public data_type dt; 
        
        public makeBasa(int ln, data_type dt)
        {
            super(ln);
            this.dt = dt;
        }
        
        public String toString()
        {
            return "makeBasa(" + dt.toString() + "";
        }
        
        public void setSymList(SymList sl)
        {
            if(dt instanceof data_type.datatypePrimitive)
            {
                ((data_type.datatypePrimitive) dt).setSymList(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ((data_type.datatypeReference) dt).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(dt instanceof data_type.datatypePrimitive)
            {
                if(((data_type.datatypePrimitive) dt).toString().equals("poor"))
                {
                    ErrorReport.error(ln(), "Cannot get void as user input.");
                }
                return ((data_type.datatypePrimitive) dt).checkContext(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ErrorReport.error(ln(), "Cannot get array as user input.");
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(dt instanceof data_type.datatypePrimitive)
            {
                ((data_type.datatypePrimitive) dt).preInterpret(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ((data_type.datatypeReference) dt).preInterpret(sl);
            }
        }
        
        public Object evaluate(SymList sl)
        {
            Scanner sc = new Scanner(System.in);
            data_type.datatypePrimitive datatype = ((data_type.datatypePrimitive) dt);
            if(datatype.toString().equals("inty"))
            {
                while(true)
                {
                    try
                    {
                        return sc.nextInt();
                    }
                    catch(Exception e)
                    {
                        sc.next();
                        OutGen.addOut("Invalid integer input! Input again: ");
                    }
                }
            }
            else if(datatype.toString().equals("floaty"))
            {
                while(true)
                {
                    try
                    {
                        return sc.nextFloat();
                    }
                    catch(Exception e)
                    {
                        sc.next();
                        OutGen.addOut("Invalid float input! Input again: ");
                    }
                }
            }
            else if(datatype.toString().equals("booly"))
            {
                while(true)
                {
                    try
                    {
                        String bool = sc.next();
                        if(bool.equals("yuhh") || bool.equals("true"))
                        {
                            return true;
                        }
                        else if(bool.equals("nuhh") || bool.equals("false"))
                        {
                            return false;
                        }
                        else
                        {
                            OutGen.addOut("Invalid boolean input! Input again: ");
                        }
                    }
                    catch(Exception e)
                    {
                        sc.next();
                        OutGen.addOut("Invalid boolean input! Input again: ");
                    }
                }
            }
            else if(datatype.toString().equals("stringy"))
            {
                while(true)
                {
                    try
                    {
                        return sc.next();
                    }
                    catch(Exception e)
                    {
                        sc.next();
                        OutGen.addOut("Invalid string input! Input again: ");
                    }
                }
            }
            else if(datatype.toString().equals("chary"))
            {
                while(true)
                {
                    try
                    {
                        return sc.next().charAt(0);
                    }
                    catch(Exception e)
                    {
                        sc.next();
                        OutGen.addOut("Invalid character input! Input again: ");
                    }
                }
            }
            return null;
        }
    }
}