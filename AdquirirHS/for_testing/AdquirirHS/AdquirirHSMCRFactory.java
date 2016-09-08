/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Sep 08 15:24:52 2016
 * Arguments: "-B" "macro_default" "-W" "java:AdquirirHS,AdquirirHSC" "-T" "link:lib" 
 * "-d" "D:\\Documents\\NetBeansProjects\\Tomoscope\\AdquirirHS\\for_testing" 
 * "class{AdquirirHSC:D:\\Documents\\NetBeansProjects\\Tomoscope\\AdquirirHS.m}" 
 */

package AdquirirHS;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class AdquirirHSMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "AdquirirHS_B0CB49E1232402F1CD0219901D7E7C82";
    
    /** Component name */
    private static final String sComponentName = "AdquirirHS";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(AdquirirHSMCRFactory.class)
        );
    
    
    private AdquirirHSMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            AdquirirHSMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{9,0,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
