/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Nov 23 13:39:35 2016
 * Arguments: "-B" "macro_default" "-W" "java:Abrir_flujo,Abrir_flujoC" "-T" "link:lib" 
 * "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo\\for_testing" 
 * "class{Abrir_flujoC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo.m}" 
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
    private static final String sComponentId = "Abrir_flujo_0BDBD6AE5B3D3DDF16FA48612C07F33F";
    
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
            new int[]{9,0,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
