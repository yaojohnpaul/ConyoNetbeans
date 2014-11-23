package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.Sym.*;

public abstract class yaya implements created.iNode  
{
    public static class addYaya extends yaya
    {
        public yaya_header h;
        public utos_block u;
        
        public addYaya(yaya_header h, utos_block u)
        {
            this.h = h;
            this.u = u;
        }
        
        public String toString()
        {
            return h.toString() + u.toString();
        }
        
        private SymList sl;
        
        public void setSymList(SymList sl)
        {
            this.sl = new SymList(sl);
            
            if(h instanceof yaya_header.yayaHeader)
            {
                Boolean availFunc = ((yaya_header.yayaHeader) h).setSymList(sl, this.sl);
                //add utos block to SymFunc if this is not a duplicate function
                if(availFunc)
                {
                    String tName = ((yaya_header.yayaHeader) h).name;
                    SymFunc temp = (SymFunc) sl.getSymbol(tName);
                    sl.editSymbol(tName, new SymFunc(tName, temp.yayaParamSec(), temp.dataType(), temp.ret(), u, temp.getArity()));
                }
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(this.sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            this.sl.setAncestor(sl);
            if(h instanceof yaya_header.yayaHeader)
            {
                ((yaya_header.yayaHeader) h).checkContext(this.sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).checkContext(this.sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            this.sl.setAncestor(sl);
            if(h instanceof yaya_header.yayaHeader)
            {
                ((yaya_header.yayaHeader) h).preInterpret(this.sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).preInterpret(this.sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            this.sl.setAncestor(sl);
            if(h instanceof yaya_header.yayaHeader)
            {
                ((yaya_header.yayaHeader) h).evaluate(this.sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).evaluate(this.sl);
            }
        }
    }
    
}