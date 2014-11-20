package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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