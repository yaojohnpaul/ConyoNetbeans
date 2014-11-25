package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.Sym.*;

public abstract class yaya extends created.iNode  
{
    public yaya(int ln)
    {
        super(ln);
    }
    
    public static class addYaya extends yaya
    {
        public yaya_header h;
        public utos_block u;
        
        public addYaya(int ln, yaya_header h, utos_block u)
        {
            super(ln);
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
                    sl.editSymbol(tName, new SymFunc(tName, temp.yayaParamSec(), temp.dataType(), temp.ret(), u, this, temp.getArity()));
                }
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(this.sl);
            }
        }
        
        public SymList getLocalSymList()
        {
            return this.sl;
        }
        
        public void setLocalSymList(SymList sl)
        {
            this.sl = sl;
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
        
        public Object evaluate(SymList sl)
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
            
            SymVar sv = null;
            if(h instanceof yaya_header.yayaHeader)
            {
                if(((yaya_header.yayaHeader) h).ret != null)
                    sv = (SymVar) this.sl.getSymbol(((yaya_header.yayaHeader) h).ret);
            }
            
            if(sv != null)
            {
                return sv.value();
            }
            else
            {
                return null;
            }
        }
    }
    
}