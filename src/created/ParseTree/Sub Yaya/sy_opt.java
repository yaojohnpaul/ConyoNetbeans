abstract class sy_opt implements iNode 
{
    public static class SubYayaBodyList extends sy_opt
    {
        public sy_cont_list l;
        
        public SubYayaBodyList(sy_cont_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
    }
    
    public static class SubYayaBodyListEmpty extends sy_opt
    {
        
        public SubYayaBodyListEmpty()
        {
  
        }
        
        public String toString()
        {
            return ""
        }
    }
    
}

//sy_opt ::= sy_cont_list:l {: RESULT = new SubYayaBodyList(l); :}
//			| {: RESULT = new SubYayaBodyListEmpty(); :};