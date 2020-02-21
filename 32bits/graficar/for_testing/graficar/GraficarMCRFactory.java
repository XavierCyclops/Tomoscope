/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu May 31 15:26:23 2018
 * Arguments: "-B" "macro_default" "-W" "java:graficar,Grafica" "-T" "link:lib" "-d" 
 * "C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\graficar\\for_testing" 
 * "class{Grafica:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\graficar.m}" 
 */

package graficar;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class GraficarMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "graficar_881660C7238521E937203D29CAB5AA9F";
    
    /** Component name */
    private static final String sComponentName = "graficar";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(GraficarMCRFactory.class)
        );
    
    
    private GraficarMCRFactory()
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
            GraficarMCRFactory.class, 
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
