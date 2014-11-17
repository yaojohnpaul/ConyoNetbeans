package created.Sym;

public class SymConstructor extends SymEntry
{
    private String id;
    private constructor c;
    
    public SymConstructor(String id, constructor c)
    {
        super(id);
        this.c = c;
    }
    
    @Override
    public String toString()
    {
        return "Constructor: " + id;  
    }
    
    @Override
    public int symType()
    {
        return SymEntry.CONSTRUCTOR;
    }
    
    public constructor getConstructor()
    {
        return c;
    }
}