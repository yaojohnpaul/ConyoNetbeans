package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class primitive_dt extends created.iNode
{
    public primitive_dt(int ln)
    {
        super(ln);
    }
    
    public static class intType extends primitive_dt
    {
        public String i;
        
        public intType(int ln, String i)
        {
            super(ln);
            this.i = i;
        }
        
        public String toString(){
            return i;
        }
    }
    
    public static class floatType extends primitive_dt
    {
        public String f;
        
        public floatType(int ln, String f)
        {
            super(ln);
            this.f = f;
        }
        
        public String toString(){
            return f;
        }
    }
    
    public static class stringType extends primitive_dt
    {
        public String s;
        
        public stringType(int ln, String s)
        {
            super(ln);
            this.s = s;
        }
        
        public String toString(){
            return s;
        }
    }
    
    public static class charType extends primitive_dt
    {
        public String c;
        
        public charType(int ln, String c)
        {
            super(ln);
            this.c = c;
        }
        
        public String toString(){
            return c;
        }
    }
    
    public static class booleanType extends primitive_dt
    {
        public String b;
        
        public booleanType(int ln, String b)
        {
            super(ln);
            this.b = b;
        }
        
        public String toString(){
            return b;
        }
    }
    
}


/*
primitive_dt ::= INTY:i {: RESULT = new intType(i); :}
			| FLOATY:f {: RESULT = new floatType(f); :}
			| STRINGY:s {: RESULT = new stringType(s); :}
			| CHARY:c {: RESULT = new charType(c); :}
			| BOOLY:b {: RESULT = new booleanType(b); :};
*/