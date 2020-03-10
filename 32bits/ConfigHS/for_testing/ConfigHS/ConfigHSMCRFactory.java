/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 16:01:57 2020
 * Arguments: 
 * "-B""macro_default""-W""java:ConfigHS,ConfigHSC""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigHS\\for_testing""class{ConfigHSC:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigHS.m}"
 */

package ConfigHS;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class ConfigHSMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "ConfigHS_806BE12456F129F9F40BAC803AE803CB";
    
    /** Component name */
    private static final String sComponentName = "ConfigHS";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(ConfigHSMCRFactory.class)
        );
    
    
    private ConfigHSMCRFactory()
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
            ConfigHSMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{9,6,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
