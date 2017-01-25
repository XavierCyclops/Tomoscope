/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Jan 25 14:48:56 2017
 * Arguments: "-B" "macro_default" "-W" "java:Signals,SignalsC" "-T" "link:lib" "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\Signals\\for_testing" 
 * "class{SignalsC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuad.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuadn.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosin.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosinc.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuad.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuadn.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsin.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsinc.m}" 
 */

package Signals;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class SignalsMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "Signals_F2380825294DA7E994BC902283443BB1";
    
    /** Component name */
    private static final String sComponentName = "Signals";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(SignalsMCRFactory.class)
        );
    
    
    private SignalsMCRFactory()
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
            SignalsMCRFactory.class, 
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
