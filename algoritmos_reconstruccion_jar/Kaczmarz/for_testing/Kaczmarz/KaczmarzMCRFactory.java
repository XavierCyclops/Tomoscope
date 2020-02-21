/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Thu Feb 20 16:24:36 2020
 * Arguments: 
 * "-B""macro_default""-W""java:Kaczmarz,Kaczmarz""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\algoritmos_reconstruccion_jar\\Kaczmarz\\for_testing""class{Kaczmarz:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\kaczmarz.m}"
 */

package Kaczmarz;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class KaczmarzMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "Kaczmarz_AA1A7F59DA1240565CF6324FE8DD4FB8";
    
    /** Component name */
    private static final String sComponentName = "Kaczmarz";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(KaczmarzMCRFactory.class)
        );
    
    
    private KaczmarzMCRFactory()
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
            KaczmarzMCRFactory.class, 
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
