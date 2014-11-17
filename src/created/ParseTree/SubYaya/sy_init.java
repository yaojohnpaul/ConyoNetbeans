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
        public arte_init_list al;
        
        public SubYayaInitialize(reference_dt rd, arte_init_list al)
        {
            this.rd = rd;
            this.al = al;
        }
        
        public String toString()
        {
            return "brandNew " + rd.toString() + " (" + al.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            if(rd instanceof reference_dt.referenceArray)
            {
                ((reference_dt.referenceArray) rd).setSymList(sl);
            }
            else if(rd instanceof reference_dt.referenceValidName)
            {
             
            }
            
            if(al instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) al).setSymList(sl);
            } 
        }
        
        public String checkContext(SymList sl)
        {
            if(rd instanceof reference_dt.referenceArray)
            {
                return ((reference_dt.referenceArray) rd).checkContext(sl);
            }
            else if(rd instanceof reference_dt.referenceValidName)
            {
                return ((reference_dt.referenceValidName) rd).checkContext(sl);
            }
            
            if(al instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) al).checkContext(sl);
            } 
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(rd instanceof reference_dt.referenceArray)
            {
                ((reference_dt.referenceArray) rd).preInterpret(sl);
            }
            else if(rd instanceof reference_dt.referenceValidName)
            {
                ((reference_dt.referenceValidName) rd).preInterpret(sl);
            }
            
            if(al instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) al).preInterpret(sl);
            } 
        }
    }
    
}
