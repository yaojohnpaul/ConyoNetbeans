package created.ParseTree.Yaya;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
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
        
        public void setSymList(SymList sl, String name, SymList local)
        {
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).setSymList(sl, name, local);
            }
        }
        
        public ArrayList<data_type> getContents()
        {
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                return ((yaya_param_list.yayaParamList) ypl).getContents();
            }
            return new ArrayList<>();
        }
        
        public ArrayList<String> getNames()
        {
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                return ((yaya_param_list.yayaParamList) ypl).getNames();
            }
            return new ArrayList<>();
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