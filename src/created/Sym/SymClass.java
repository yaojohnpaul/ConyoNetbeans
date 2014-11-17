package created.Sym;

public class SymClass extends SymEntry
{
    SymList local; 
    
    public SymClass(String name, SymList sl)
    {
        super(name);
        local = sl;
    }
    
    public SymList getSymList()
    {
        return local;
    }
    
    @Override
    public int symType()
    {
        return SymEntry.CLASS;
    }
    
    @Override
    public String toString()
    {
        return symName;
    }
}