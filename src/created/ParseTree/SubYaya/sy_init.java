package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
    }
    
}
