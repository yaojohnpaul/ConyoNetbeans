package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.Sym.*;
import error.*;

public abstract class yaya_header extends created.iNode  
{
    public yaya_header(int ln)
    {
        super(ln);
    }
    
    public static class yayaHeader extends yaya_header
    {
        public String name;
        public yaya_param_sec yps;
        public data_type dt;
        public String ret;
        
        public yayaHeader(int ln, String name, yaya_param_sec yps, data_type dt, String ret)
        {
            super(ln);
            this.name = name;
            this.yps = yps;
            this.dt = dt;
            this.ret = ret;
        }
        
        public yayaHeader(int ln, String name, yaya_param_sec yps)
        {
            super(ln);
            this.name = name;
            this.yps = yps;
            dt = null;
            ret = null;
        }
        
        public String toString()
        {
            if(dt == null)
                return name + ": Parameters - " + yps.toString();
            else
                return name + ": Parameters - " + yps.toString() + ", Return - " + dt.toString() + " " + ret; 
        }
        
        public Boolean setSymList(SymList sl, SymList local)
        {
            Boolean availFunc = sl.addToList(name, new SymFunc(name, yps, dt, ret, null, null));
            if(!availFunc)
            {
                ErrorReport.error(ln(), "Duplicate function!: " + name); 
            }
            
            if(dt != null || ret != null)
            {
                Boolean avail = false;
                if(dt instanceof data_type.datatypePrimitive)
                {
                    avail = local.addToList(ret, new SymVar(ret, dt));
                    if(!avail)
                    {
                        ErrorReport.error(ln(), "Duplicate variable name!: " + ret);
                    }
                    //((data_type.datatypePrimitive) dt).setSymList(sl);
                }
                else if(dt instanceof data_type.datatypeReference)
                {
                    avail = local.addToList(ret, new SymVar(ret, dt));
                    if(!avail)
                    {
                        ErrorReport.error(ln(), "Duplicate variable name!: " + ret);
                    }
                    //((data_type.datatypeReference) dt).setSymList(sl);
                }
            }
            
            if(yps instanceof yaya_param_sec.yayaParamSec)
            {
                ((yaya_param_sec.yayaParamSec) yps).setSymList(sl, name, local);
            }
            
            return availFunc;
        }
        
        public void checkContext(SymList sl)
        {
            if(yps instanceof yaya_param_sec.yayaParamSec)
            {
                ((yaya_param_sec.yayaParamSec) yps).checkContext(sl);
            }
            
            // if(dt != null || ret != null)
            // {
            //     Boolean avail = sl.addToList(ret, new SymVar(ret, dt, null));
            //     if(!avail)
            //     {
            //         ErrorReport.error(ln(), "Duplicate variable name!: " + ret);
            //     }
            // }
        }
        
        public void preInterpret(SymList sl)
        {
            if(yps instanceof yaya_param_sec.yayaParamSec)
            {
                ((yaya_param_sec.yayaParamSec) yps).preInterpret(sl);
            }
            
            if(dt instanceof data_type.datatypePrimitive)
            {
                ((data_type.datatypePrimitive) dt).preInterpret(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ((data_type.datatypeReference) dt).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            // if(yps instanceof yaya_param_sec.yayaParamSec)
            // {
            //     ((yaya_param_sec.yayaParamSec) yps).evaluate(sl);
            // }
            
            // if(dt instanceof data_type.datatypePrimitive)
            // {
            //     ((data_type.datatypePrimitive) dt).evaluate(sl);
            // }
            // else if(dt instanceof data_type.datatypeReference)
            // {
            //     ((data_type.datatypeReference) dt).evaluate(sl);
            // }
        }
    }
    
}