package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public class SymFunc extends SymEntry
{
    private yaya_param_sec yps;
    private data_type dt;
    private String ret;
    private utos_block ub;
    private yaya y;
    private int arity;
    
    public SymFunc(String name, yaya_param_sec yps, data_type dt, String ret, utos_block ub, yaya y)
    {
        super(name);
        this.yps = yps;
        this.dt = dt;
        this.ret = ret;
        this.ub = ub;
        this.y = y;
        arity = 0;
    }
    
    public SymFunc(String name, yaya_param_sec yps, data_type dt, String ret, utos_block ub, yaya y, int arity)
    {
        super(name);
        this.yps = yps;
        this.dt = dt;
        this.ret = ret;
        this.ub = ub;
        this.y = y;
        this.arity = arity;
    }
    
    public int getArity()
    {
        return arity;
    }
    
    public void incArity()
    {
        arity++;
    }
    
    public data_type dataType()
    {
        return dt;
    }
    
    public yaya_param_sec yayaParamSec()
    {
        return yps;
    }
    
    public String ret()
    {
        if(ret != null)
            return ret;
            
        return "";
    }
    
    public utos_block ub()
    {
        return ub;
    }
    
    public yaya getYaya()
    {
        return y;
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
            return symName + "-" + yps.toString() + ":\n" + ub.toString();
        else
            return symName + "-" + yps.toString() + "-" + dt.toString() + "-" + ret + ":\n" + ub.toString();
    }
}