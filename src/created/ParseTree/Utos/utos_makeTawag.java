package created.parseTree.Utos;

abstract class utos_makeTawag implements created.iNode  
{
    public static class makeTawag extends PLACEHOLDER_ABSTRACT
    {
        public valid_name vn; 
        public arte_init_list l;
        
        public makeTawag(valid_name vn, arte_init_list l)
        {
            this.vn = vn;
            this.l = l;
        }
        
        public String toString()
        {
            return "makeTawag " + vn.toString() + " (" + l.toString() + "";
        }
    }
}