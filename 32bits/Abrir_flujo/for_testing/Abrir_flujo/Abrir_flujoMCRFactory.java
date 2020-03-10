/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 16:03:30 2020
 * Arguments: 
 * "-B""macro_default""-W""java:Abrir_flujo,Abrir_flujoC""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo\\for_testing""class{Abrir_flujoC:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo.m}"
 */

package Abrir_flujo;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class Abrir_flujoMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "Abrir_flujo_6772ED7317D3F2FB1FA69103AD2DF991";
    
    /** Component name */
    private static final String sComponentName = "Abrir_flujo";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(Abrir_flujoMCRFactory.class)
        );
    
    
    private Abrir_flujoMCRFactory()
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
            Abrir_flujoMCRFactory.class, 
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
