package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class data_type implements created.iNode
{
    public static class datatypePrimitive extends data_type
    {
        public primitive_dt p;
        
        public datatypePrimitive(primitive_dt p)
        {
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
        
        public datatypeReference(reference_dt r)
        {
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
            else if(r instanceof reference_dt.referenceValidName)
            {
                
            }
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            if(r instanceof reference_dt.referenceArray)
            {
                ((reference_dt.referenceArray) r).checkContext(st);
            }
            else if(r instanceof reference_dt.referenceValidName)
            {
                return ((reference_dt.referenceValidName) r).checkContext(st);
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