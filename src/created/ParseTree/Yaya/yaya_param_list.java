package created.ParseTree.Yaya;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.Sym.*;

public abstract class yaya_param_list extends created.iNode 
{
    public yaya_param_list(int ln)
    {
        super(ln);
    }
    
    public static class yayaParamList extends yaya_param_list
    {
        public yaya_param yp;
        public yaya_param_list ypl;
        
        public yayaParamList(int ln, yaya_param yp, yaya_param_list ypl)
        {
            super(ln);
            this.yp = yp;
            this.ypl = ypl;
        }
        
        public yayaParamList(int ln, yaya_param yp)
        {
            super(ln);
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
        
        public void setSymList(SymList sl, String name, SymList local)
        {   
            SymFunc sfn = (SymFunc) sl.getSymbol(name);
            
            if(yp instanceof yaya_param.yayaParam)
            {
                ((yaya_param.yayaParam) yp).setSymList(local);
                sfn.incArity();
            }
            
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                ((yaya_param_list.yayaParamList) ypl).setSymList(sl, name, local);
            }
            
            sl.editSymbol(name, sfn);
        }
        
        public ArrayList<data_type> getContents()
        {
            ArrayList<data_type> local = new ArrayList<>();
            
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                local.addAll(((yaya_param_list.yayaParamList) ypl).getContents());
                if(yp instanceof yaya_param.yayaParam)
                {
                    local.add(((yaya_param.yayaParam) yp).dt);
                }
                return local;
            }
            else
            {
                if(yp instanceof yaya_param.yayaParam)
                {
                    local.add(((yaya_param.yayaParam) yp).dt);
                }
                return local;
            }
        }
        
        public ArrayList<String> getNames()
        {
            ArrayList<String> local = new ArrayList<>();
            
            if(ypl instanceof yaya_param_list.yayaParamList)
            {
                local.addAll(((yaya_param_list.yayaParamList) ypl).getNames());
                if(yp instanceof yaya_param.yayaParam)
                {
                    local.add(((yaya_param.yayaParam) yp).id);
                }
                return local;
            }
            else
            {
                if(yp instanceof yaya_param.yayaParam)
                {
                    local.add(((yaya_param.yayaParam) yp).id);
                }
                return local;
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