/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 15:54:40 2020
 * Arguments: 
 * "-B""macro_default""-W""java:ConfigGeneratorHS3,ConfigGeneratorHS3C""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3\\for_testing""class{ConfigGeneratorHS3C:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3.m}"
 */

package ConfigGeneratorHS3;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class ConfigGeneratorHS3MCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "ConfigGenera_5A0F92BA5807C794C13EA92F2293DA04";
    
    /** Component name */
    private static final String sComponentName = "ConfigGeneratorHS3";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(ConfigGeneratorHS3MCRFactory.class)
        );
    
    
    private ConfigGeneratorHS3MCRFactory()
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
            ConfigGeneratorHS3MCRFactory.class, 
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
