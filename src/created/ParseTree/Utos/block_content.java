package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class block_content implements created.iNode  
{
    public static class blockContent extends block_content
    {
        public utos_dec u;
        public block_content b;
        
        public blockContent(utos_dec u, block_content b)
        {
            this.u = u;
            this.b = b;
        }
        
        public blockContent(utos_dec u)
        {
            this.u = u;
            this.b = null;
        }
        
        public String toString()
        {
            if(b != null)
                return u.toString() + "\n" + b.toString();
            else 
                return u.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(u instanceof utos_dec.utosDecDB)
            {
                ((utos_dec.utosDecDB) u).setSymList(sl);
            }
            else if(u instanceof utos_dec.utosDecNoDB)
            {
                ((utos_dec.utosDecNoDB) u).setSymList(sl);
            }
            else if(u instanceof utos_dec.utosDecSabiSabi)
            {
                ((utos_dec.utosDecSabiSabi) u).setSymList(sl);
            }
            else if(u instanceof utos_dec.utosDecVal)
            {
                ((utos_dec.utosDecVal) u).setSymList(sl);
            }
            
            if(b instanceof block_content.blockContent)
            {
                ((block_content.blockContent) b).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(u instanceof utos_dec.utosDecDB)
            {
                ((utos_dec.utosDecDB) u).checkContext(sl);
            }
            else if(u instanceof utos_dec.utosDecNoDB)
            {
                ((utos_dec.utosDecNoDB) u).checkContext(sl);
            }
            else if(u instanceof utos_dec.utosDecSabiSabi)
            {
                ((utos_dec.utosDecSabiSabi) u).checkContext(sl);
            }
            else if(u instanceof utos_dec.utosDecVal)
            {
                ((utos_dec.utosDecVal) u).checkContext(sl);
            }
            
            if(b instanceof block_content.blockContent)
            {
                ((block_content.blockContent) b).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(u instanceof utos_dec.utosDecDB)
            {
                ((utos_dec.utosDecDB) u).preInterpret(sl);
            }
            else if(u instanceof utos_dec.utosDecNoDB)
            {
                ((utos_dec.utosDecNoDB) u).preInterpret(sl);
            }
            else if(u instanceof utos_dec.utosDecSabiSabi)
            {
                ((utos_dec.utosDecSabiSabi) u).preInterpret(sl);
            }
            else if(u instanceof utos_dec.utosDecVal)
            {
                ((utos_dec.utosDecVal) u).preInterpret(sl);
            }
            
            if(b instanceof block_content.blockContent)
            {
                ((block_content.blockContent) b).preInterpret(sl);
            }
        }
    }
}