/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Sep 08 15:38:39 2016
 * Arguments: "-B" "macro_default" "-W" "java:Cerrar_flujo,Cerrar_flujoC" "-T" "link:lib" 
 * "-d" "D:\\Documents\\NetBeansProjects\\Tomoscope\\Cerrar_flujo\\for_testing" 
 * "class{Cerrar_flujoC:D:\\Documents\\NetBeansProjects\\Tomoscope\\Cerrar_flujo.m}" 
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
    private static final String sComponentId = "Cerrar_flujo_5E528E6B2FA3E0B0E1BD03CDDDBA5BCF";
    
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
