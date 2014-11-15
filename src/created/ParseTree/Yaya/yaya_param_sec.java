package created.parseTree.Yaya;

abstract class yaya_param_sec implements created.iNode 
{
    public static class yayaParamSec extends yaya_param_sec
    {
        public yaya_param_list ypl;
        
        public yayaParamSec()
        {
            ypl = null;   
        }
        
        public yayaParamSec(yaya_param_list ypl)
        {
            this.ypl = ypl;
        }
        
        public String toString()
        {
            return ypl.toString();
        }
    }
    
}