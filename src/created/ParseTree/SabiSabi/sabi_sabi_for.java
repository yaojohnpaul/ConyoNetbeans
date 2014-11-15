package created.ParseTree.SabiSabi;

abstract class sabi_sabi_for implements created.iNode
{
    public static class SabiSabiFor extends sabi_sabi_for
    {
        public sabi_sabi s;
        
        public SabiSabiFor(sabi_sabi s){
            this.s = s
        }
        
        public String toString(){
            return s + " DB";
        }
        
    }
}

//sabi_sabi_for ::= sabi_sabi:s DB {: RESULT = new SabiSabiFor(s); :};