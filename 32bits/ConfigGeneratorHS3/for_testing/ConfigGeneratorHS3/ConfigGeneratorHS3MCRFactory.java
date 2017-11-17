/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Nov 16 16:48:13 2017
 * Arguments: "-B" "macro_default" "-W" "java:ConfigGeneratorHS3,ConfigGeneratorHS3C" 
 * "-T" "link:lib" "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3\\for_testing" 
 * "class{ConfigGeneratorHS3C:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3.m}" 
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
    private static final String sComponentId = "ConfigGenera_E588337D58C2A6E6E6F25BC187850E8E";
    
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
            new int[]{9,0,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
