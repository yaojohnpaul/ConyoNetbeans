package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

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
    }
}