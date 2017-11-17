/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Nov 16 17:19:44 2017
 * Arguments: "-B" "macro_default" "-W" "java:AdquirirHS,AdquirirHSC" "-T" "link:lib" 
 * "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\AdquirirHS\\for_testing" 
 * "class{AdquirirHSC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\AdquirirHS.m}" 
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
    private static final String sComponentId = "AdquirirHS_FE7DED8BE10809E1D6EB55206976FF4D";
    
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
            new int[]{9,0,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
