/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Nov 23 13:39:35 2016
 * Arguments: "-B" "macro_default" "-W" "java:Abrir_flujo,Abrir_flujoC" "-T" "link:lib" 
 * "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo\\for_testing" 
 * "class{Abrir_flujoC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo.m}" 
 */

package Abrir_flujo;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>Abrir_flujoC</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\Abrir_flujo.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>Abrir_flujoC</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed.
 * @version 0.0
 */
public class Abrir_flujoC extends MWComponentInstance<Abrir_flujoC>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>Abrir_flujo</code> M-function.
     */
    private static final MWFunctionSignature sAbrir_flujoSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "Abrir_flujo",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private Abrir_flujoC (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(Abrir_flujoC.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>Abrir_flujoC</code> class.
     */
    public Abrir_flujoC() throws MWException
    {
        this(Abrir_flujoMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #Abrir_flujoC(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public Abrir_flujoC(String pathToComponent) throws MWException
    {
        this(Abrir_flujoMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>Abrir_flujoC</code> class. Use this 
     * constructor to specify the options required to instantiate this component.  The 
     * options will be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public Abrir_flujoC(MWComponentOptions componentOptions) throws MWException
    {
        this(Abrir_flujoMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(Abrir_flujoC.class) {
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
            MWMCR mcr = Abrir_flujoMCRFactory.newInstance();
            mcr.runMain( sAbrir_flujoSignature, args);
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
        synchronized(Abrir_flujoC.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>Abrir_flujo</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
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
    public void Abrir_flujo(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAbrir_flujoSignature);
    }

    /**
     * Provides the interface for calling the <code>Abrir_flujo</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
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
    public void Abrir_flujo(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAbrir_flujoSignature);
    }

    /**
     * Provides the standard interface for calling the <code>Abrir_flujo</code>
     * M-function with 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] Abrir_flujo(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAbrir_flujoSignature), 
                    sAbrir_flujoSignature);
        return lhs;
    }
}
