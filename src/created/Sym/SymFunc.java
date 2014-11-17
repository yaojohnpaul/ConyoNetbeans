package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public class SymFunc extends SymEntry
{
    private yaya_param_sec yps;
    private data_type dt;
    private String ret;
    
    public SymFunc(String name, yaya_param_sec yps, data_type dt, String ret)
    {
        super(name);
        this.yps = yps;
        this.dt = dt;
        this.ret = ret;
    }
    
    public yaya_param_sec yayaParamSec()
    {
        return yps;
    }
    
    public data_type dataType()
    {
        return dt;
    }
    
    public String ret()
    {
        return ret;
    }
    
    @Override
    public data_type type()
    {
        return dt;
    }
    
    @Override
    public int symType()
    {
        return SymEntry.FUNC;
    }
    
    @Override
    public String toString()
    {
        if(dt == null || ret == null)
            return symName + "-" + yps.toString();
        else
            return symName + "-" + yps.toString() + "-" + dt.toString() + "-" + ret;
    }
}