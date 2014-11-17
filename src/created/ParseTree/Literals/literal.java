package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class literal implements created.iNode
{
    
    public static class Inty extends literal
    {
        public String value;
        
        public Inty(String value)
        {
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
        
    }
    
    public static class Floaty extends literal
    {
        public String value;
        
        public Floaty(String value)
        {
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
    }
    
    public static class Stringy extends literal
    {
        public String value;
        
        public Stringy(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            return "stringy";
        }
    }
    
    public static class Chary extends literal
    {
        public String value;
        
        public Chary(String value)
        {
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
    }
    
    public static class Booly extends literal
    {
        public String value;
        
        public Booly(String value)
        {
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
    }
    
    public static class Waley extends literal
    {
        public String value;
        
        public Waley(String value)
        {
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
    }
}