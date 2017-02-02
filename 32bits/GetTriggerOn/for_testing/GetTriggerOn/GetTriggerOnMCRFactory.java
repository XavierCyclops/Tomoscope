/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Feb 02 13:42:09 2017
 * Arguments: "-B" "macro_default" "-W" "java:GetTriggerOn,GetTriggerOnC" "-T" "link:lib" 
 * "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\GetTriggerOn\\for_testing" 
 * "class{GetTriggerOnC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\GetTriggerOn.m}" 
 */

package GetTriggerOn;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class GetTriggerOnMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "GetTriggerOn_B77693F497A29AF40F5F0A96D7C2F05A";
    
    /** Component name */
    private static final String sComponentName = "GetTriggerOn";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(GetTriggerOnMCRFactory.class)
        );
    
    
    private GetTriggerOnMCRFactory()
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
            GetTriggerOnMCRFactory.class, 
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
