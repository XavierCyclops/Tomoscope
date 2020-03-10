/*
 * MATLAB Compiler: 7.0.1 (R2019a)
 * Date: Wed Mar  4 15:56:38 2020
 * Arguments: 
 * "-B""macro_default""-W""java:AdquirirHS,AdquirirHSC""-T""link:lib""-d""C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\AdquirirHS\\for_testing""class{AdquirirHSC:C:\\Users\\Acustic\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\AdquirirHS.m}"
 */

package AdquirirHS;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class AdquirirHSMCRFactory
{
    /** Component's uuid */
    private static final String sComponentId = "AdquirirHS_7821A5072E8204ABA5FB390F3EDDBF3D";
    
    /** Component name */
    private static final String sComponentName = "AdquirirHS";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(AdquirirHSMCRFactory.class)
        );
    
    
    private AdquirirHSMCRFactory()
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
            AdquirirHSMCRFactory.class, 
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
