package created.Sym;

public class SymConst extends SymEntry
{
    private sabi_sabi ss;
    private data_type dt;
    
    public SymConst(String name, sabi_sabi ss, data_type dt)
    {
        super(name);
        this.ss = ss;
        this.dt = dt;
    }
    
    public sabi_sabi sabiSabi()
    {
        return ss;
    }
    
    public data_type dataType()
    {
        return dt;
    }
    
    @Override
    public data_type type()
    {
        return dt;
    }
    
    @Override
    public int symType()
    {
        return SymEntry.CONST;
    }
    
    @Override
    public String toString()
    {
        return symName + "-" + ss.toString() + "-" + dt.toString();
    }
}