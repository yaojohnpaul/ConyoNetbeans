package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public class SymConst extends SymEntry
{
    private literal l;
    private data_type dt;
    
    public SymConst(String name, literal l, data_type dt)
    {
        super(name);
        this.l = l;
        this.dt = dt;
    }
    
    public literal getLiteral()
    {
        return l;
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
        return symName + "-" + l.toString() + "-" + dt.toString();
    }
}