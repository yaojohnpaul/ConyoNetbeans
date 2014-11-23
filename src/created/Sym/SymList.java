package created.Sym;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

/**
 * A class to act as a list of symbols (variables, functions, etc.).
 * Based on SymTab class by Klein and Rumpe. (jflex examples, interpreter)
 */
public class SymList 
{
    Map <String, SymEntry> m;
    SymList anc; //ancestor symlist
    
    /**
     * First constructor, no ancestor.
     */
    public SymList()
    {
        this(null);
    }
    
    /**
     * Second constructor, w/ ancestor.
     * @param anc Ancestor SymList.
     */
    public SymList(SymList anc)
    {
        m = new HashMap<String, SymEntry>();
        this.anc = anc;
    }
    
    /**
     * Set a new ancestor for the SymList.
     * @param anc New ancestor 
     */
    public void setAncestor(SymList anc)
    {
        this.anc = anc;
    }
    
    /**
     * Add a new symbol to the list.
     * @param s Name of symbol.
     * @param se Symbol value.
     * @return 
     */
    public Boolean addToList(String s, SymEntry se)
    {
        SymEntry symbol = getSymbol(s);
        Boolean symbolAvail = (symbol == null); //if symbol is not taken
        if(symbolAvail)
        {
            m.put(s, se);
        }
        return symbolAvail;
    }
    
    /**
     * Get a symbol from the list.
     * @param s Name of symbol.
     * @return Symbol with matching name.
     */
    public SymEntry getSymbol(String s)
    {
        SymEntry symbol = m.get(s);
        if(symbol == null && anc != null) 
        {
            symbol = anc.getSymbol(s);
        }
        return symbol;
    }
    
    /**
     * Function for editing a symbol in the list.
     * @param s Name of symbol.
     * @param se New value for symbol.
     */
    public void editSymbol(String s, SymEntry se)
    {
        SymEntry symbol = m.get(s);
        Boolean symbolAvail = (symbol == null); //if symbol is not taken
        if(!symbolAvail)
        {
            m.put(s, se);
        }
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Iterator i = m.entrySet().iterator();
        while (i.hasNext()) 
        {
            Map.Entry inst = (Map.Entry)i.next();
            sb.append(inst.getKey()).append(" - ").append(inst.getValue()).append("\n");
        }
        return sb.toString();
    }
}
