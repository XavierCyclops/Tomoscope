/*
 * MATLAB Compiler: 6.1 (R2015b)
 * Date: Wed Jan 25 15:14:24 2017
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

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>ConfigGeneratorHS3CRemote</code> class provides a Java RMI-compliant 
 * interface to the M-functions from the files:
 * <pre>
 *  C:\\Users\\TomografoV2\\Documents\\NetBeansProjects\\Tomoscope\\32bits\\ConfigGeneratorHS3.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a 
 * <code>ConfigGeneratorHS3CRemote</code> instance when it is no longer needed to ensure 
 * that native resources allocated by this class are properly freed, and the server-side 
 * proxy is unexported.  (Failure to call dispose may result in server-side threads not 
 * being properly shut down, which often appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of 
 * ConfigGeneratorHS3.ConfigGeneratorHS3C.
 */
public interface ConfigGeneratorHS3CRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>ConfigGeneratorHS3</code> 
     * M-function with 5 input arguments.  
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
     * %Modo lineal = 2 y Modo DDS = 1
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
    public Object[] ConfigGeneratorHS3(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
