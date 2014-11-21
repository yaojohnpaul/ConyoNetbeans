package created.Sym;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public class SymArray
{
    private ArrayList<sabi_sabi> contents;
    
    public SymArray()
    {
        contents = new ArrayList<>();
    }
    
    /**
     * Add an expression/value to the array. 
     * @param s Sabi sabi to be added to SymArray.
     */
    public void addToArray(sabi_sabi s)
    {
        contents.add(s);
    }
    
    /**
     * Returns a member of contents.
     * @param i Index of content.
     * @return Expression
     */
    public sabi_sabi getFromArray(int i)
    {
        return contents.get(i);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < contents.size(); i++)
        {
            if(i >= contents.size() - 1)
                sb.append(contents.get(i).toString());
            else
                sb.append(contents.get(i).toString() + ", ");
        }
        return sb.toString();
    }
}