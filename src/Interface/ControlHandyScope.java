/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import InitHS.*;
import ConfigHS.*;
import ConfigGeneratorHS3.*;
import com.mathworks.toolbox.javabuilder.*;  // MATLAB Java Builder
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACTECK
 */
public class ControlHandyScope {
    
    private static String HS = "HS3";
    
    // Configuración del generador
    private int SIGNAL = 5;
    private int TRIGGER = 9;
    
    // Se recibirá del usuario
    private double AMPLITUDE;
    private double FSIG;
    
    private Object[] HANDY;
    
    InitHSC ihsc;
    ConfigHSC chsc;
    ConfigGeneratorHS3C config;
    
    public ControlHandyScope() {
        try {
            ihsc = new InitHSC();
            HANDY = ihsc.InitHS(2, HS);
        } catch (MWException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ConfigHS(lib,Samples,Fm)
    // Samples y Fm los pasa el usuario
    private void ConfigurationHS(String lib) {
        try {
            chsc = new ConfigHSC();
            Object[] ConfigHS = chsc.ConfigHS(lib,40,10);
        } catch (MWException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ConfigGeneratorHS3(sDll,Amplitude,Fsig,Fm,Opcion)
    // Amplitude, Fsig, Fm los pasa el usuario
    public void ConfigGenerator(String lib) {
        try {
            config = new ConfigGeneratorHS3C();
            Object[] Conf = config.ConfigGeneratorHS3(1, lib, 30, 10, 10, 2);
            System.out.println(Arrays.toString(Conf));
        } catch (MWException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        ControlHandyScope chs = new ControlHandyScope();
        chs.ConfigurationHS(HS);
        chs.ConfigGenerator(HS);
    }
}
