package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class data_type extends created.iNode
{
    public data_type(int ln)
    {
        super(ln);
    }
    
    public static class datatypePrimitive extends data_type
    {
        public primitive_dt p;
        
        public datatypePrimitive(int ln, primitive_dt p)
        {
            super(ln);
            this.p = p;
        }
        
        public String toString()
        {
            return p.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(p instanceof primitive_dt.intType)
            {
                
            }
            else if(p instanceof primitive_dt.floatType)
            {
                
            }
            else if(p instanceof primitive_dt.stringType)
            {
                
            }
            else if(p instanceof primitive_dt.charType)
            {
                
            }
            else if(p instanceof primitive_dt.booleanType)
            {
                
            }
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return p.toString();
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
    }
    
    public static class datatypeReference extends data_type
    {
        public reference_dt r;
        
        public datatypeReference(int ln, reference_dt r)
        {
            super(ln);
            this.r = r;
        }
        
        public String toString()
        {
            return r.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(r instanceof reference_dt.referenceArray)
            {
                
            }
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            if(r instanceof reference_dt.referenceArray)
            {
                return ((reference_dt.referenceArray) r).checkContext(st);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
    }
}

/*
data_type ::= primitive_dt:p {: RESULT = new datatypePrimitive(p); :}
			| reference_dt:r {: RESULT = new datatypeReference(r); :};
*/