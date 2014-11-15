abstract class sub_yaya implements iNode 
{
    public static class SubYaya extends sub_yaya
    {
        public String id;
        public sy_body body;
        
        public SubYaya(String id, sy_body body)
        {
            this.id = id;
            this.body = body;
        }
        
        public String toString()
        {
            return "makeUtusan" + id.toString() + sy.toString();
        }
    }
    
}

//MAKE_UTUSAN IDENTIFIER:id sy_body:body {: RESULT = new SubYaya(id, body); :};