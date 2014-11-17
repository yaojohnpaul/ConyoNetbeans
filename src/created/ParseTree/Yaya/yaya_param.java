package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.Sym.*;
import error.*;

public abstract class yaya_param implements created.iNode  
{
    public static class yayaParam extends yaya_param
    {
        public data_type dt;
        public String id;
        
        public yayaParam(data_type dt, String id)
        {
            this.dt = dt;
            this.id = id;
        }
        
        public String toString()
        {
            return dt.toString() + " " + id;
        }
        
        public void setSymList(SymList sl)
        {
            if(dt instanceof data_type.datatypePrimitive)
            {
                Boolean avail = sl.addToList(id, new SymVar(id, dt, null));
                if(!avail)
                {
                    ErrorReport.error("Duplicate parameter!: " + id);
                }
                // ((data_type.datatypePrimitive) dt).setSymList(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                Boolean avail = sl.addToList(id, new SymVar(id, dt, null));
                if(!avail)
                {
                    ErrorReport.error("Duplicate parameter!: " + id);
                }
                // ((data_type.datatypeReference) dt).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            Boolean avail = sl.addToList(id, new SymVar(id, dt, null));
            if(!avail)
            {
                ErrorReport.error("Duplicate variable name!: " + id);
            }
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
    }
    
}