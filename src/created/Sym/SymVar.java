package created.Sym;

public class SymVar extends SymEntry
{
    private data_type dt;
    private arte_init value;
       
    public SymVar(String name, data_type dt, arte_init value)
    {
        super(name);
        this.dt = dt;
        this.value = value;
    }
    
    @Override
    public data_type type()
    {
        return dt;
    }
    
    @Override
    public int symType()
    {
        return SymEntry.VAR;
    }
    
    @Override
    public String toString()
    {
        return symName + "-" + value + "-" + dt.toString();
    }
    
    public data_type dataType()
    {
        return dt;
    }
    
    public arte_init value()
    {
        return value;
    }
}