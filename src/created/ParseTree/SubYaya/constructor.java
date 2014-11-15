package created.ParseTree.SubYaya;

abstract class constructor implements created.iNode 
{
    public static class mSimula extends constructor
    {
        public String id;
        public utos_block u;
        
        public mSimula(String id, utos_block u)
        {
            this.id = id;
            this.u = u;
        }
        
        public String toString()
        {
            return "makeSimula" + id + u.toString();
        }
    }
    
}

constructor ::= MAKE_SIMULA IDENTIFIER:id utos_block:u {: RESULT = new mSimula(id, u); :};