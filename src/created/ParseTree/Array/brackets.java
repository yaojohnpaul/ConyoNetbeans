package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public class brackets extends created.iNode 
{
    public brackets(int ln)
    {
        super(ln);
    }
    
    public String toString()
    {
        return "[]";
    }
    
    public void setSymList(SymList sl)
    {
        
    }
    
    public void checkContext(SymList sl)
    {
        
    }
    
    public void preInterpret(SymList sl)
    {
        
    }
}