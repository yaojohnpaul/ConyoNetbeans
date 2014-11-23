package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class primitive_dt implements created.iNode
{
    
    public static class intType extends primitive_dt
    {
        public String i;
        
        public intType(String i)
        {
            this.i = i;
        }
        
        public String toString(){
            return i;
        }
    }
    
    public static class floatType extends primitive_dt
    {
        public String f;
        
        public floatType(String f)
        {
            this.f = f;
        }
        
        public String toString(){
            return f;
        }
    }
    
    public static class stringType extends primitive_dt
    {
        public String s;
        
        public stringType(String s)
        {
            this.s = s;
        }
        
        public String toString(){
            return s;
        }
    }
    
    public static class charType extends primitive_dt
    {
        public String c;
        
        public charType(String c)
        {
            this.c = c;
        }
        
        public String toString(){
            return c;
        }
    }
    
    public static class booleanType extends primitive_dt
    {
        public String b;
        
        public booleanType(String b)
        {
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