/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Tue Jul 26 15:06:10 2016
 * Arguments: "-B" "macro_default" "-W" "java:InitHS,InitHSC" "-T" "link:lib" "-d" 
 * "G:\\Interfaz\\InitHS\\for_testing" "class{InitHSC:G:\\Interfaz\\InitHS.m}" "-a" 
 * "G:\\Interfaz\\HS3_thunk_pcwin64.dll" 
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
    private static final String sComponentId = "InitHS_7457990118CC89D5AA61FD4CAA333E8D";
    
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
            new int[]{9,0,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
