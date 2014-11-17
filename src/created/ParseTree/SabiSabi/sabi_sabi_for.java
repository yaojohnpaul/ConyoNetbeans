package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
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
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).setSymList(sl);
            }
        }
        
        public String checkContext(SymList s) 
        { // for sabi sabi plng
            //other context here
            if(s instanceof sabi_sabi.sabiSabi)
            {
                return ((sabi_sabi.sabiSabi) s).checkContext(sl);
            }
            return null;
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).preInterpret(sl);
            }
        }
    }
}

//sabi_sabi_for ::= sabi_sabi:s DB {: RESULT = new SabiSabiFor(s); :};