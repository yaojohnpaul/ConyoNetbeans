package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class sy_cont implements created.iNode 
{
    public static class SubYayaContArte extends sy_cont
    {
        public arte_dec a;
        
        public SubYayaContArte(arte_dec a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
    public static class SubYayaContYaya extends sy_cont
    {
        public yaya a;
        
        public SubYayaContYaya(yaya a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
    public static class SubYayaContConstructor extends sy_cont
    {
        public constructor a;
        
        public SubYayaContConstructor(constructor a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
}
