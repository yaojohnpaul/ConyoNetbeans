package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class sy_init implements created.iNode 
{
    public static class SubYayaInitialize extends sy_init
    {
        public reference_dt rd;
        public arte_init_list ai;
        
        public SubYayaInitialize(reference_dt rd, arte_init_list ai)
        {
            this.rd = rd;
            this.ai = ai;
        }
        
        public String toString()
        {
            return "brandNew " + rd.toString() + " (" + ai.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            
        }
        
        public String checkContext(SymList sl)
        {
            if(r instanceof reference_dt.referenceArray)
            {
                return ((reference_dt.referenceArray) r).checkContext(st);
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
