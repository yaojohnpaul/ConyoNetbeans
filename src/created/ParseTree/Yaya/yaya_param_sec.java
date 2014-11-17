package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.Sym.*;

public abstract class yaya_param_sec implements created.iNode 
{
    public static class yayaParamSec extends yaya_param_sec
    {
        public yaya_param_list ypl;
        
        public yayaParamSec()
        {
            ypl = null;   
        }
        
        public yayaParamSec(yaya_param_list ypl)
        {
            this.ypl = ypl;
        }
        
        public String toString()
        {
            if(ypl != null)
                return ypl.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).preInterpret(sl);
            }
        }
    }
    
}