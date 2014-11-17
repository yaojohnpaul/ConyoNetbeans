package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_makeBasa implements created.iNode  
{
    public static class makeBasa extends utos_makeBasa
    {
        public data_type d; 
        
        public makeBasa(data_type d)
        {
            this.d = d;
        }
        
        public String toString()
        {
            return "makeBasa(" + d.toString() + "";
        }
        
        public void setSymList(SymList sl)
        {
            if(dt instanceof data_type.datatypePrimitive)
            {
                ((data_type.datatypePrimitive) dt).setSymList(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ((data_type.datatypeReference) dt).setSymList(sl);
            }
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            if(dt instanceof data_type.datatypePrimitive)
            {
                return ((data_type.datatypePrimitive) dt).checkContext(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                return ((data_type.datatypeReference) dt).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(dt instanceof data_type.datatypePrimitive)
            {
                ((data_type.datatypePrimitive) dt).preInterpret(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                ((data_type.datatypeReference) dt).preInterpret(sl);
            }
        }
    }
}