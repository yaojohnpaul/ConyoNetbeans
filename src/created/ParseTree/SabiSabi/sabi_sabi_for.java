package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class sabi_sabi_for implements created.iNode
{
    public static class SabiSabiFor extends sabi_sabi_for
    {
        public sabi_sabi s;
        
        public SabiSabiFor(sabi_sabi s){
            this.s = s;
        }
        
        public String toString(){
            return s + " DB";
        }
       
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(s instanceof sabi_sabi.SabiSabi)
            {
                return ((sabi_sabi.SabiSabi) s).checkContext(sl);
            }
            return "";
        }
        
        public Boolean evaluate(SymList sl)
        {
            Object o = false;
            Boolean check = false;
            if(s instanceof sabi_sabi.SabiSabi)
            {
                o = ((sabi_sabi.SabiSabi) s).evaluate(sl);
                if(o instanceof Boolean)
                {
                    check = (Boolean) o;
                }
            }
            return check;
        }
    }
}

//sabi_sabi_for ::= sabi_sabi:s DB {: RESULT = new SabiSabiFor(s); :};package created.ParseTree.SabiSabi;

// import created.ParseTree.Array.*;
// import created.ParseTree.Arte.*;
// impo