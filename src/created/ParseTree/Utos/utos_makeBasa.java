package created.ParseTree.Utos;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
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
                return sc.nextInt();
            }
            else if(datatype.toString().equals("floaty"))
            {
                return sc.nextFloat();
            }
            else if(datatype.toString().equals("booly"))
            {
                return sc.nextBoolean();
            }
            else if(datatype.toString().equals("stringy"))
            {
                return sc.next();
            }
            else if(datatype.toString().equals("chary"))
            {
                return sc.next().charAt(0);
            }
            return null;
        }
    }
}