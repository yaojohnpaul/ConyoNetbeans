package created.ParseTree.Utos;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import created.SymManager;
import error.*;

public abstract class utos_makeTawag extends created.iNode  
{
    public utos_makeTawag(int ln)
    {
        super(ln);
    }
    
    public static class makeTawag extends utos_makeTawag
    {
        public valid_name vn; 
        public arte_init_list l;
        
        public makeTawag(int ln, valid_name vn, arte_init_list l)
        {
            super(ln);
            this.vn = vn;
            this.l = l;
        }
        
        public String toString()
        {
            return "makeTawag " + vn.toString() + " (" + l.toString() + "";
        }
        
        public void setSymList(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).setSymList(sl);
            }
            
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).setSymList(sl);
            } 
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String ret = "";
            
            if(vn instanceof valid_name.identifier)
            {
                ret = ((valid_name.identifier) vn).checkContext(sl);

                SymEntry ste = sl.getSymbol (((valid_name.identifier) vn).toString()); 
                
                if(ste == null)
                {
                    ErrorReport.error(ln(), "Symbol not defined: " + ((valid_name.identifier) vn).toString());
                    return "";
                }
                
                if(ste.symType() != 103)
                {
                    ErrorReport.error(ln(), "Not a function used as a function!: " + ((valid_name.identifier) vn).toString());
                    return "";
                }
                else
                {
                    SymFunc sfn = (SymFunc) ste;
                    int passedCount = 0;
                    if(l instanceof arte_init_list.arteInitList)
                    {
                        passedCount = ((arte_init_list.arteInitList) l).getCount();
                    } 
                    if(sfn.getArity() != passedCount)
                    {
                        ErrorReport.error(ln(), "Passed parameter count (" + passedCount +
                                ") does not match function \"" + vn.toString() + "\" declaration parameter count (" +
                                sfn.getArity() + ")");
                    }
                    else
                    {
                        ArrayList<sabi_sabi> alss = ((arte_init_list.arteInitList) l).getContents();
                        ArrayList<data_type> aldt = ((yaya_param_sec.yayaParamSec) sfn.yayaParamSec()).getContents();
                        for(int i = 0; i < aldt.size(); i++)
                        {
                            if(alss.get(i) instanceof sabi_sabi.SabiSabi)
                            {
                                if(aldt.get(i) instanceof data_type.datatypePrimitive)
                                {
                                    if(((sabi_sabi.SabiSabi) alss.get(i)).checkContext(sl).equals(((data_type.datatypePrimitive) aldt.get(i)).toString()))
                                    {
                                        continue;
                                    }
                                    else
                                    {
                                        if(((sabi_sabi.SabiSabi) alss.get(i)).checkContext(sl).isEmpty() || ((data_type.datatypePrimitive) aldt.get(i)).toString().isEmpty())
                                            ErrorReport.error(ln(), "Datatype of passed parameters does not match declared function " + vn.toString() + "'s parameters");
                                        else
                                            ErrorReport.error(ln(), "Datatype of passed parameters does not match declared function " + vn.toString() + "'s parameters: " + 
                                                    ((sabi_sabi.SabiSabi) alss.get(i)).checkContext(sl) + " and " + ((data_type.datatypePrimitive) aldt.get(i)).toString());
                                    }
                                }
                                else if(aldt.get(i) instanceof data_type.datatypeReference)
                                {
                                    if(((sabi_sabi.SabiSabi) alss.get(i)).checkContext(sl).equals(((data_type.datatypeReference) aldt.get(i)).toString()))
                                    {
                                        continue;
                                    }
                                    else
                                    {
                                        if(((sabi_sabi.SabiSabi) alss.get(i)).checkContext(sl).isEmpty() || ((data_type.datatypeReference) aldt.get(i)).toString().isEmpty())
                                            ErrorReport.error(ln(), "Datatype of passed parameters does not match declared function " + vn.toString() + "'s parameters");
                                        else
                                            ErrorReport.error(ln(), "Datatype of passed parameters does not match declared function " + vn.toString() + "'s parameters: " + 
                                                    ((sabi_sabi.SabiSabi) alss.get(i)).checkContext(sl) + " and " + ((data_type.datatypeReference) aldt.get(i)).toString());
                                    }
                                }
                            }
                        }
                    } 
                }
                
                return ret;
                
            }
            
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).checkContext(sl);
            }
            
            return ret;
        }
        
        public void preInterpret(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).preInterpret(sl);
            }
            
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).preInterpret(sl);
            } 
        }
        
        public Object evaluate(SymList sl)
        {
            SymFunc sf = (SymFunc) sl.getSymbol(vn.toString()); //Function Symbol
            yaya.addYaya yy = (yaya.addYaya) sf.getYaya(); //Function class
            yaya_param_sec.yayaParamSec yps = (yaya_param_sec.yayaParamSec) sf.yayaParamSec(); //Function parameters
            ArrayList<String> paramNames = yps.getNames(); //Function parameters
            ArrayList<data_type> paramDT = yps.getContents();
            ArrayList<sabi_sabi> alss = ((arte_init_list.arteInitList) l).getContents(); //Call parameters
            SymList local = yy.getLocalSymList(); //Local function symlist
            SymVar sv = null; //temporary variable for symvar
            for(int i = 0; i < paramNames.size(); i++)
            {
                sv = (SymVar) local.getSymbol(paramNames.get(i));
                /*if(paramDT.get(i) instanceof data_type.datatypePrimitive)
                {
                    data_type.datatypePrimitive dtp = (data_type.datatypePrimitive) paramDT.get(i);
                    if(dtp.toString().equals("inty"))
                    {
                    }
                }
                else if(paramDT.get(i) instanceof data_type.datatypeReference)
                {
                    data_type.datatypeReference dtr = (data_type.datatypeReference) paramDT.get(i);
                }*/
                sv.setValue(((sabi_sabi.SabiSabi)alss.get(i)).evaluate(sl));
                local.editSymbol(paramNames.get(i), sv);
            }
            yy.setLocalSymList(local);
            return yy.evaluate(SymManager.getSym(SymManager.SUPER_ID));
        }
    }
}