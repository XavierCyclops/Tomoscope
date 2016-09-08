/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Sep 08 15:34:33 2016
 * Arguments: "-B" "macro_default" "-W" "java:Abrir_flujo,Class1" "-T" "link:lib" "-d" 
 * "D:\\Documents\\NetBeansProjects\\Tomoscope\\Abrir_flujo\\for_testing" 
 * "class{Class1:D:\\Documents\\NetBeansProjects\\Tomoscope\\Abrir_flujo.m}" 
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
    private static final String sComponentId = "Abrir_flujo_16A3C1C87DE2DB88486AA43D269EBFF1";
    
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
