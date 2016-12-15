/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Nov 23 13:41:08 2016
 * Arguments: "-B" "macro_default" "-W" "java:Cerrar_flujo,Cerrar_flujoC" "-T" "link:lib" 
 * "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Cerrar_flujo\\for_testing" 
 * "class{Cerrar_flujoC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Cerrar_flujo.m}" 
 */

package Cerrar_flujo;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class Cerrar_flujoMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "Cerrar_flujo_6D1BF9DA6FC1BD45EC194A58C2377F16";
    
    /** Component name */
    private static final String sComponentName = "Cerrar_flujo";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(Cerrar_flujoMCRFactory.class)
        );
    
    
    private Cerrar_flujoMCRFactory()
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
            Cerrar_flujoMCRFactory.class, 
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
