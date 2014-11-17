package created.Sym;

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
        return symName + "-" + yps.toString() + "-" + dt.toString() + "-" + ret;
    }
}