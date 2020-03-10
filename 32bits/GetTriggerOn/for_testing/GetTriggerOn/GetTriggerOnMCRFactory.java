/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 16:05:15 2020
 * Arguments: 
 * "-B""macro_default""-W""java:GetTriggerOn,GetTriggerOnC""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\GetTriggerOn\\for_testing""class{GetTriggerOnC:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\GetTriggerOn.m}"
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
    private static final String sComponentId = "GetTriggerOn_3FBFC631548E53ADD584E3F99E9CF203";
    
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
            new int[]{9,6,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
