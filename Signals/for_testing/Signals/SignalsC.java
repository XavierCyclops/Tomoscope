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
import java.util.*;

/**
 * The <code>SignalsC</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuad.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuadn.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosin.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosinc.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuad.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuadn.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsin.m
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsinc.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>SignalsC</code> instance 
 * when it is no longer needed to ensure that native resources allocated by this class 
 * are properly freed.
 * @version 0.0
 */
public class SignalsC extends MWComponentInstance<SignalsC>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>pulsocuad</code> M-function.
     */
    private static final MWFunctionSignature sPulsocuadSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsocuad",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsocuadn</code> M-function.
     */
    private static final MWFunctionSignature sPulsocuadnSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsocuadn",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsosin</code> M-function.
     */
    private static final MWFunctionSignature sPulsosinSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsosin",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsosinc</code> M-function.
     */
    private static final MWFunctionSignature sPulsosincSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsosinc",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsoUTcuad</code> M-function.
     */
    private static final MWFunctionSignature sPulsoUTcuadSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsoUTcuad",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsoUTcuadn</code> M-function.
     */
    private static final MWFunctionSignature sPulsoUTcuadnSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsoUTcuadn",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsoUTsin</code> M-function.
     */
    private static final MWFunctionSignature sPulsoUTsinSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsoUTsin",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pulsoUTsinc</code> M-function.
     */
    private static final MWFunctionSignature sPulsoUTsincSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pulsoUTsinc",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private SignalsC (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(SignalsC.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>SignalsC</code> class.
     */
    public SignalsC() throws MWException
    {
        this(SignalsMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #SignalsC(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public SignalsC(String pathToComponent) throws MWException
    {
        this(SignalsMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>SignalsC</code> class. Use this constructor 
     * to specify the options required to instantiate this component.  The options will 
     * be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public SignalsC(MWComponentOptions componentOptions) throws MWException
    {
        this(SignalsMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(SignalsC.class) {
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
            MWMCR mcr = SignalsMCRFactory.newInstance();
            mcr.runMain( sPulsocuadSignature, args);
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
        synchronized(SignalsC.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>pulsocuad</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
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
    public void pulsocuad(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsocuadSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsocuad</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
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
    public void pulsocuad(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsocuadSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsocuad</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
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
    public Object[] pulsocuad(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsocuadSignature), 
                    sPulsocuadSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsocuadn</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public void pulsocuadn(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsocuadnSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsocuadn</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public void pulsocuadn(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsocuadnSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsocuadn</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public Object[] pulsocuadn(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsocuadnSignature), 
                    sPulsocuadnSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsosin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
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
    public void pulsosin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsosinSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsosin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
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
    public void pulsosin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsosinSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsosin</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
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
    public Object[] pulsosin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsosinSignature), 
                    sPulsosinSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsosinc</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %f = 500e3;
     * %fs = 5e6;
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
    public void pulsosinc(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsosincSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsosinc</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %f = 500e3;
     * %fs = 5e6;
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
    public void pulsosinc(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsosincSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsosinc</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %f = 500e3;
     * %fs = 5e6;
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
    public Object[] pulsosinc(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsosincSignature), 
                    sPulsosincSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsoUTcuad</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public void pulsoUTcuad(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsoUTcuadSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsoUTcuad</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public void pulsoUTcuad(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsoUTcuadSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsoUTcuad</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public Object[] pulsoUTcuad(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsoUTcuadSignature), 
                    sPulsoUTcuadSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsoUTcuadn</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public void pulsoUTcuadn(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsoUTcuadnSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsoUTcuadn</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public void pulsoUTcuadn(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsoUTcuadnSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsoUTcuadn</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
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
    public Object[] pulsoUTcuadn(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsoUTcuadnSignature), 
                    sPulsoUTcuadnSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsoUTsin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
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
    public void pulsoUTsin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsoUTsinSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsoUTsin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
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
    public void pulsoUTsin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsoUTsinSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsoUTsin</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
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
    public Object[] pulsoUTsin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsoUTsinSignature), 
                    sPulsoUTsinSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pulsoUTsinc</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %%%---------------
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
    public void pulsoUTsinc(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPulsoUTsincSignature);
    }

    /**
     * Provides the interface for calling the <code>pulsoUTsinc</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %%%---------------
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
    public void pulsoUTsinc(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPulsoUTsincSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pulsoUTsinc</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %%%---------------
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
    public Object[] pulsoUTsinc(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPulsoUTsincSignature), 
                    sPulsoUTsincSignature);
        return lhs;
    }
}
