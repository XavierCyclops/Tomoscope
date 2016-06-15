/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import InitHS.*;
import com.mathworks.toolbox.javabuilder.*;  // MATLAB Java Builder
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACTECK
 */
public class ControlHandyScope {
    
    private String HS = "hs3.dll";
    
    // Configuración para el HandyScope
    private int TRIGGERSOURCE = 0;
    private int SENSITIVITIY = 12;
    private int POSTSAMPLES = 32;
    private int NMEAN = 100;
    private int RESOLUTION = 12;
    
    // Se recibirá del usuario
    private double SAMPLES;
    private double FM;
    
    // Configuración del generador
    private int SIGNAL = 5;
    private int TRIGGER = 9;
    
    // Se recibirá del usuario
    private double AMPLITUDE;
    private double FSIG;
    
    private String[] HANDY;
    
    InitHSC ihsc;
    
    public ControlHandyScope() {
        try {
            ihsc = new InitHSC();
            HANDY = (String[]) ihsc.InitHS(2, HS);
        } catch (MWException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        ControlHandyScope chs = new ControlHandyScope();
        System.out.println(chs.HANDY[0]);
        /*MatlabProxyFactoryOptions options = new MatlabProxyFactoryOptions.Builder()
                .setMatlabLocation("C:\\Program Files\\MATLAB\\MATLAB Production Server\\R2015a\\bin")
                .build();*/
        /*MatlabProxyFactory factory = new MatlabProxyFactory(); 
        try {
            MatlabProxy proxy = factory.getProxy();
            proxy.feval("InitHS", "hs3");
            proxy.disconnect();
        } catch (MatlabConnectionException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MatlabInvocationException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
