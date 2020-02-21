/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Thu Feb 20 16:26:57 2020
 * Arguments: 
 * "-B""macro_default""-W""java:RayTracer2d,RayTracer2d""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\algoritmos_reconstruccion_jar\\RayTracer2d\\for_testing""class{RayTracer2d:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\rayTracer2d.m}"
 */

package RayTracer2d;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class RayTracer2dMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "RayTracer2d_2273953BB9082B8D24F246F731BD1720";
    
    /** Component name */
    private static final String sComponentName = "RayTracer2d";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(RayTracer2dMCRFactory.class)
        );
    
    
    private RayTracer2dMCRFactory()
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
            RayTracer2dMCRFactory.class, 
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
