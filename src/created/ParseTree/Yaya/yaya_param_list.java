package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.Sym.*;

public abstract class yaya_param_list implements created.iNode 
{
    public static class yayaParamList extends yaya_param_list
    {
        public yaya_param yp;
        public yaya_param_list ypl;
        
        public yayaParamList(yaya_param yp, yaya_param_list ypl)
        {
            this.yp = yp;
            this.ypl = ypl;
        }
        
        public yayaParamList(yaya_param yp)
        {
            this.yp = yp;
            this.ypl = null;
        }
        
        public String toString()
        {
            if(ypl == null)
                return yp.toString();
            else
                return yp.toString() + ", " + ypl.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(yp instanceof yaya_param.yayaParam)
            {
                ((yaya_param.yayaParam) yp).setSymList(sl);
            }
            
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(yp instanceof yaya_param.yayaParam)
            {
                ((yaya_param.yayaParam) yp).checkContext(sl);
            }
            
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(yp instanceof yaya_param.yayaParam)
            {
                ((yaya_param.yayaParam) yp).preInterpret(sl);
            }
            
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).preInterpret(sl);
            }
        }
    }
    
}