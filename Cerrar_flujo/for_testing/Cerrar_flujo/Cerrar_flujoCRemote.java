/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Thu Sep 08 15:38:39 2016
 * Arguments: "-B" "macro_default" "-W" "java:Cerrar_flujo,Cerrar_flujoC" "-T" "link:lib" 
 * "-d" "D:\\Documents\\NetBeansProjects\\Tomoscope\\Cerrar_flujo\\for_testing" 
 * "class{Cerrar_flujoC:D:\\Documents\\NetBeansProjects\\Tomoscope\\Cerrar_flujo.m}" 
 */

package Cerrar_flujo;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>Cerrar_flujoCRemote</code> class provides a Java RMI-compliant interface to 
 * the M-functions from the files:
 * <pre>
 *  D:\\Documents\\NetBeansProjects\\Tomoscope\\Cerrar_flujo.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a 
 * <code>Cerrar_flujoCRemote</code> instance when it is no longer needed to ensure that 
 * native resources allocated by this class are properly freed, and the server-side proxy 
 * is unexported.  (Failure to call dispose may result in server-side threads not being 
 * properly shut down, which often appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of Cerrar_flujo.Cerrar_flujoC.
 */
public interface Cerrar_flujoCRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>Cerrar_flujo</code> 
     * M-function with 1 input argument.  
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
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] Cerrar_flujo(Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
