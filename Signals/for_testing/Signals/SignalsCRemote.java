/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Jan 25 14:48:56 2017
 * Arguments: "-B" "macro_default" "-W" "java:Signals,SignalsC" "-T" "link:lib" "-d" 
 * "C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\Signals\\for_testing" 
 * "class{SignalsC:C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuad.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsocuadn.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosin.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsosinc.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuad.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTcuadn.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsin.m,C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\pulsoUTsinc.m}" 
 */

package Signals;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>SignalsCRemote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
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
 * The {@link #dispose} method <b>must</b> be called on a <code>SignalsCRemote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of Signals.SignalsC.
 */
public interface SignalsCRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>pulsocuad</code> M-function 
     * with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsocuad(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsocuadn</code> M-function 
     * with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsocuadn(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsosin</code> M-function 
     * with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsosin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsosinc</code> M-function 
     * with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %f = 500e3;
     * %fs = 5e6;
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsosinc(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsoUTcuad</code> 
     * M-function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsoUTcuad(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsoUTcuadn</code> 
     * M-function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos 
     *  %f   = 0.5e6;
     *  %fs  = 50e6;
     *  %N   = 2000;
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsoUTcuadn(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsoUTsin</code> M-function 
     * with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % pulso sinusoidal con envolvente gaussiana
     * % f  : frecuencia 
     * % fs : frecuencia de meustreo
     * % N  : numero de muestras
     * % NT : numero de ciclos
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsoUTsin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>pulsoUTsinc</code> 
     * M-function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %%%---------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] pulsoUTsinc(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
