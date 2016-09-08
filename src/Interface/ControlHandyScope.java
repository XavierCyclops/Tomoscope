/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import InitHS.*;
import ConfigHS.*;
import ConfigGeneratorHS3.*;
import AdquirirHS.*;
import Abrir_flujo.*;
import Cerrar_flujo.*;
import com.mathworks.toolbox.javabuilder.*;  // MATLAB Java Builder
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Javier Gonzalez Huerta
 * @author Javier Juárez Carrillo
 * UNAM 2016
 */
public class ControlHandyScope {
    
    private static String HS = "HS3";
    
    // Configuración del generador
    private int SIGNAL = 5;
    private int TRIGGER = 9;
    
    // Se recibirá del usuario
    private double AMPLITUDE;
    private double FSIG;
    
    private static Object[] HANDY;
    
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
    // Samples 120000, 0 <= Fm <= 50000
    public void ConfigurationHS(String lib, double Samples, double Fm) {
        try {
            chsc = new ConfigHSC();
            Object[] ConfigHS = chsc.ConfigHS(lib,Samples,Fm);
            System.out.println(Arrays.toString(ConfigHS));
        } catch (MWException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ConfigGeneratorHS3(sDll,Amplitude,Fsig,Fm,Opcion)
    // Amplitude, Fsig, Fm los pasa el usuario
    public void ConfigGenerator(String lib, int amplitude, double fsig, double fm, byte opc) {
        try {
            config = new ConfigGeneratorHS3C();
            Object[] Conf = config.ConfigGeneratorHS3(1, lib, amplitude, fsig, fm, opc);
            System.out.println(Arrays.toString(Conf));
        } catch (MWException ex) {
            Logger.getLogger(ControlHandyScope.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        ControlHandyScope chs = new ControlHandyScope();
        //chs.ConfigurationHS(HS);
        //chs.ConfigGenerator(HS);
        //System.out.println(Arrays.toString(HANDY));
    }
}
