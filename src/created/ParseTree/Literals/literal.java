package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class literal extends created.iNode
{
    public literal(int ln)
    {
        super(ln);
    }
    
    public static class Inty extends literal
    {
        public String value;
        
        public Inty(int ln, String value)
        {
            super(ln);
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "inty";
        }
        
        public int evaluate()
        {
            return Integer.parseInt(value);
        }
    }
    
    public static class Floaty extends literal
    {
        public String value;
        
        public Floaty(int ln, String value)
        {
            super(ln);
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "floaty";
        }
        
        public float evaluate()
        {
            return Float.parseFloat(value);
        }
    }
    
    public static class Stringy extends literal
    {
        public String value;
        
        public Stringy(int ln,String value)
        {
            super(ln);
            this.value = value;
        }
        
        public String toString(){
            return "\"" + value + "\"";
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "stringy";
        }
        
        public String evaluate()
        {
            return value;
        }
    }
    
    public static class Chary extends literal
    {
        public String value;
        
        public Chary(int ln, String value)
        {
            super(ln);
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "chary";
        }
        
        public char evaluate()
        {
            return value.charAt(0);
        }
    }
    
    public static class Booly extends literal
    {
        public String value;
        
        public Booly(int ln, String value)
        {
            super(ln);
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "booly";
        }
        
        public Boolean evaluate()
        {
            if(value.equals("yuhh"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public static class Waley extends literal
    {
        public String value;
        
        public Waley(int ln, String value)
        {
            super(ln);
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "waley";
        }
        
        public Object evaluate()
        {
            return null;
        }
    }
}