/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Fri Mar 13 16:37:41 2020
 * Arguments: 
 * "-B""macro_default""-W""java:graficar,GrafImg""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\GrafImg\\for_testing""class{GrafImg:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\graficar.m}"
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
    private static final String sComponentId = "graficar_B3966B241B33CD8A49A6879DFA263B44";
    
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
            new int[]{9,6,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
