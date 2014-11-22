package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class arte_dec implements created.iNode 
{
    public static class arteDec extends arte_dec
    {
        public data_type dt; 
        public String id;
        public arte_assign a;
        
        public arteDec(data_type dt, String id, arte_assign a)
        {
            this.dt = dt;
            this.id = id;
            this.a = a;
        }
        
        public String toString()
        {
            return dt.toString() + " " + id.toString() + " " + a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            Boolean avail = sl.addToList(id, new SymVar(id, dt, null));
 
            if(!avail)
            {
                ErrorReport.error("Duplicate variable defined!: " + id);
            }
            
            if(a instanceof arte_assign.arteAssign)
            {
                ((arte_assign.arteAssign) a).setSymList(id, sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            String temp = "";
            if(a instanceof arte_assign.arteAssign)
            {
                temp = ((arte_assign.arteAssign) a).checkContext(sl);
            }
            if(temp.equals("not initialized")){
                if(dt instanceof data_type.datatypePrimitive)
                {
                    return ((data_type.datatypePrimitive) dt).checkContext(sl);
                }
                else if(dt instanceof data_type.datatypeReference)
                {
                    return ((data_type.datatypeReference) dt).checkContext(sl);
                }
            }
            
            if(!temp.isEmpty())
            {
                if(dt instanceof data_type.datatypePrimitive)
                {
                    if(((data_type.datatypePrimitive) dt).checkContext(sl).equals(temp)){
                        return temp;
                    }
                }
                else if(dt instanceof data_type.datatypeReference)
                {
                    if(((data_type.datatypeReference) dt).checkContext(sl).equals(temp)){
                        return temp;
                    }
                }

                if(temp.isEmpty())
                    ErrorReport.error("Datatype Mismatch in " + id);
                else
                    ErrorReport.error("Datatype Mismatch in " + id + ": " + dt.toString() + " and " + temp);
                return "";
            }
            else
            {
                return temp;
            }
            
        }
        
        public void preInterpret(SymList sl)
        {
            if(a instanceof arte_assign.arteAssign)
            {
                ((arte_assign.arteAssign) a).preInterpret(sl);
            }
        }
    }
}