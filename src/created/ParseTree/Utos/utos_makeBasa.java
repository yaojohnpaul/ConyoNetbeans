package created.ParseTree.Utos;

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
        
        public Object evaluate(SymList sl, int call, int inAFunction)
        {
            data_type.datatypePrimitive datatype = ((data_type.datatypePrimitive) dt);
            if(datatype.toString().equals("inty"))
            {
                while(true)
                {
                    try
                    {
                        String temp = MainFrame.scanInput();
                        return Integer.parseInt(temp);
                    }
                    catch(Exception e)
                    {
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
                        String temp = MainFrame.scanInput();
                        return Float.parseFloat(temp);
                    }
                    catch(Exception e)
                    {
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
                        String bool = MainFrame.scanInput();
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
                        return MainFrame.scanInput();
                    }
                    catch(Exception e)
                    {
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
                        return MainFrame.scanInput().charAt(0);
                    }
                    catch(Exception e)
                    {
                        OutGen.addOut("Invalid character input! Input again: ");
                    }
                }
            }
            if(WatchAndTrace.getVersion() != WatchManager.NOWATCH_ID){
                if(WatchAndTrace.getVersion() == WatchManager.NORMALWATCH_ID || inAFunction == WatchManager.NOT_IN_A_FUNCTION){
                    if(call == WatchManager.STANDALONE){
                        WatchAndTrace GUI = WatchAndTrace.getInstance();
                        GUI.watchAndTrace(sl, ln());
                    }
                }
            }
            return null;
        }
    }
}