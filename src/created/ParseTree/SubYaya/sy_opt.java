package created.ParseTree.SubYaya;

abstract class sy_opt implements created.iNode 
{
    public static class SubYayaOpt extends sy_opt
    {
        public sy_cont_list l;
        
        public SubYayaOpt(sy_cont_list l)
        {
            this.l = l;
        }
        
        public SubYayaOpt()
        {
            this.l = null;
        }
        
        public String toString()
        {
            if(l != null)
            return l.toString();
            else
            return "null"
        }
    }
    
}

//sy_opt ::= sy_cont_list:l {: RESULT = new SubYayaBodyList(l); :}
//			| {: RESULT = new SubYayaBodyListEmpty(); :};