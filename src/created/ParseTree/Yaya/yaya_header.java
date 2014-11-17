package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.Sym.*;

public abstract class yaya_header implements created.iNode  
{
    public static class yayaHeader extends yaya_header
    {
        public String name;
        public yaya_param_sec yps;
        public data_type dt;
        public String ret;
        
        public yayaHeader(String name, yaya_param_sec yps, data_type dt, String ret)
        {
            this.name = name;
            this.yps = yps;
            this.dt = dt;
            this.ret = ret;
        }
        
        public yayaHeader(String name, yaya_param_sec yps)
        {
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
        
        public void setSymList(SymList sl)
        {
            sl.addToList(name, new SymFunc(name, yps, dt, ret));
            
            // if(yps instanceof yaya_param_sec.yayaParamSec)
            // {
            //     ((yaya_param_sec.yayaParamSec) y).setSymList(sl);
            // }
            
            // if(dt instanceof data_type.datatypePrimitive)
            // {
            //     ((data_type.datatypePrimitive) dt).setSymList(sl);
            // }
            // else if(dt instanceof data_type.datatypeReference)
            // {
            //     ((data_type.datatypeReference) dt).setSymList(sl);
            // }
        }
        
        public void checkContext(SymList sl)
        {
            if(yps instanceof yaya_param_sec.yayaParamSec)
            {
                ((yaya_param_sec.yayaParamSec) yps).checkContext(sl);
            }
            
            if(dt instanceof data_type.datatypePrimitive)
            {
                ((data_type.datatypePrimitive) dt).checkContext(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ((data_type.datatypeReference) dt).checkContext(sl);
            }
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
    }
    
}