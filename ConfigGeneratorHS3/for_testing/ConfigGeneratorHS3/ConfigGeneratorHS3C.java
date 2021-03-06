/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Jan 25 15:14:23 2017
 * Arguments: "-B" "macro_default" "-W" "java:ConfigGeneratorHS3,ConfigGeneratorHS3C" 
 * "-T" "link:lib" "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\ConfigGeneratorHS3\\for_testing" 
 * "class{ConfigGeneratorHS3C:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3.m}" 
 * "-a" "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuad.m" 
 * "-a" "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuadn.m" 
 * "-a" "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosin.m" "-a" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosinc.m" "-a" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuad.m" "-a" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuadn.m" "-a" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsin.m" "-a" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsinc.m" 
 */

package ConfigGeneratorHS3;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>ConfigGeneratorHS3C</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a 
 * <code>ConfigGeneratorHS3C</code> instance when it is no longer needed to ensure that 
 * native resources allocated by this class are properly freed.
 * @version 0.0
 */
public class ConfigGeneratorHS3C extends MWComponentInstance<ConfigGeneratorHS3C>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>ConfigGeneratorHS3</code> 
     *M-function.
     */
    private static final MWFunctionSignature sConfigGeneratorHS3Signature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "ConfigGeneratorHS3",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private ConfigGeneratorHS3C (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(ConfigGeneratorHS3C.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>ConfigGeneratorHS3C</code> class.
     */
    public ConfigGeneratorHS3C() throws MWException
    {
        this(ConfigGeneratorHS3MCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #ConfigGeneratorHS3C(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public ConfigGeneratorHS3C(String pathToComponent) throws MWException
    {
        this(ConfigGeneratorHS3MCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>ConfigGeneratorHS3C</code> class. Use this 
     * constructor to specify the options required to instantiate this component.  The 
     * options will be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public ConfigGeneratorHS3C(MWComponentOptions componentOptions) throws MWException
    {
        this(ConfigGeneratorHS3MCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(ConfigGeneratorHS3C.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = ConfigGeneratorHS3MCRFactory.newInstance();
            mcr.runMain( sConfigGeneratorHS3Signature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(ConfigGeneratorHS3C.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>ConfigGeneratorHS3</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %Modo lineal = 2 y Modo DDS = 1
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void ConfigGeneratorHS3(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sConfigGeneratorHS3Signature);
    }

    /**
     * Provides the interface for calling the <code>ConfigGeneratorHS3</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %Modo lineal = 2 y Modo DDS = 1
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void ConfigGeneratorHS3(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sConfigGeneratorHS3Signature);
    }

    /**
     * Provides the standard interface for calling the <code>ConfigGeneratorHS3</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %Modo lineal = 2 y Modo DDS = 1
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] ConfigGeneratorHS3(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sConfigGeneratorHS3Signature), 
                    sConfigGeneratorHS3Signature);
        return lhs;
    }
}
