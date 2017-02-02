/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Feb 02 13:47:49 2017
 * Arguments: "-B" "macro_default" "-W" "java:GetTriggerOff,GetTriggerOffC" "-T" 
 * "link:lib" "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\GetTriggerOff\\for_testing" 
 * "class{GetTriggerOffC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\GetTriggerOff.m}" 
 */

package GetTriggerOff;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class GetTriggerOffMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "GetTriggerOf_8F0273472E163693DB1090B96ED61588";
    
    /** Component name */
    private static final String sComponentName = "GetTriggerOff";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(GetTriggerOffMCRFactory.class)
        );
    
    
    private GetTriggerOffMCRFactory()
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
            GetTriggerOffMCRFactory.class, 
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
