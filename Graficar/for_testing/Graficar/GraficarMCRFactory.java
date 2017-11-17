/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Aug 24 19:54:25 2017
 * Arguments: "-B" "macro_default" "-W" "java:Graficar,GraficarC" "-T" "link:lib" "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\Graficar\\for_testing" 
 * "class{GraficarC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\graficar.m}" 
 */

package Graficar;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class GraficarMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "Graficar_218DD1FB3102C862A61C4BDFE12FEE46";
    
    /** Component name */
    private static final String sComponentName = "Graficar";
    
   
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
