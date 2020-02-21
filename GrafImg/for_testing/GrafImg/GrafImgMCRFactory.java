/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Thu Feb 20 15:00:13 2020
 * Arguments: 
 * "-B""macro_default""-W""java:GrafImg,GrafImg""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\GrafImg\\for_testing""class{GrafImg:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\graficar.m}"
 */

package GrafImg;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class GrafImgMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "GrafImg_595DE1F1CB3F884A65A041DC817A8A64";
    
    /** Component name */
    private static final String sComponentName = "GrafImg";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(GrafImgMCRFactory.class)
        );
    
    
    private GrafImgMCRFactory()
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
            GrafImgMCRFactory.class, 
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
