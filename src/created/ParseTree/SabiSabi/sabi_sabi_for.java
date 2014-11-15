package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
        
    }
}

//sabi_sabi_for ::= sabi_sabi:s DB {: RESULT = new SabiSabiFor(s); :};