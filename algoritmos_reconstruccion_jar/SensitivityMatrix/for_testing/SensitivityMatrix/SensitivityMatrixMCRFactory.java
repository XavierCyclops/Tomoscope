/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Thu Feb 20 16:22:20 2020
 * Arguments: 
 * "-B""macro_default""-W""java:SensitivityMatrix,SensitivityMatrix""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\SensitivityMatrix\\for_testing""class{SensitivityMatrix:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\createSensitivityMatrix.m}"
 */

package SensitivityMatrix;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class SensitivityMatrixMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "SensitivityM_C5F0473105216C00D7A24BD2B5429CDB";
    
    /** Component name */
    private static final String sComponentName = "SensitivityMatrix";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(SensitivityMatrixMCRFactory.class)
        );
    
    
    private SensitivityMatrixMCRFactory()
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
            SensitivityMatrixMCRFactory.class, 
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
