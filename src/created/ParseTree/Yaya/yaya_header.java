package created.parseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;

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
    }
    
}