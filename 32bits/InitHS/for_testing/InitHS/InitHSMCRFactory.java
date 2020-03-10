/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 16:48:54 2020
 * Arguments: 
 * "-B""macro_default""-W""java:InitHS,InitHSC""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\InitHS\\for_testing""class{InitHSC:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\InitHS.m}"
 */

package InitHS;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class InitHSMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "InitHS_14FC8AA5B4902ECE9B0134E92E1C0692";
    
    /** Component name */
    private static final String sComponentName = "InitHS";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(InitHSMCRFactory.class)
        );
    
    
    private InitHSMCRFactory()
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
            InitHSMCRFactory.class, 
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
