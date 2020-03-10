/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 16:04:00 2020
 * Arguments: 
 * "-B""macro_default""-W""java:Cerrar_flujo,Cerrar_flujoC""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Cerrar_flujo\\for_testing""class{Cerrar_flujoC:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Cerrar_flujo.m}"
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
    private static final String sComponentId = "Cerrar_flujo_AC4DE850727E4C170702759B485C1221";
    
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
            new int[]{9,6,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
