package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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