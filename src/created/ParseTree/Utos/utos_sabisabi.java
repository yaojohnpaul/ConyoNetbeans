package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_sabisabi implements created.iNode 
{
    public static class utosSabiSabiFront extends utos_sabisabi
    {
        public valid_var vv;
        public String kind;
        
        public utosSabiSabiFront(valid_var vv, String s)
        {
            this.vv = vv;
            kind = s;
        }
        
        public String toString()
        {
            return s + vv.toString() + " DB";
        }
        
        public void evaluate(){
            switch(s){
                case "++" : ++vv.toEvaluate();
                case "--" : --vv.toEvaluate();
            }
        }
    }
    
    public static class utosSabiSabiBack extends utos_sabisabi
    {
        public valid_var vv;
        public String kind;
        
        public utosSabiSabiBack(valid_var vv, String s)
        {
            this.vv = vv;
            kind = s;
        }
        
        public String toString()
        {
            return vv.toString() + s + " DB";
        }
        
        public void evaluate(){
            switch(s){
                case "++" : vv.toEvaluate()++;
                case "--" : vv.toEvaluate()--;
            }
        }
    }
    
    
}