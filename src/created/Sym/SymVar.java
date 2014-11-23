package created.Sym;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public class SymVar extends SymEntry
{
    private data_type dt;
    private Object value;
       
    public SymVar(String name, data_type dt)
    {
        super(name);
        this.dt = dt;
        this.value = null;
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
        if(value == null)
            return dt.toString() + " " + symName;
        else
            return symName + "-" + value + "-" + dt.toString();
    }
    
    public data_type dataType()
    {
        return dt;
    }
    
    public Object value()
    {
        return value;
    }
    
    public void setValue(Object value)
    {
        this.value = value;
    }
}