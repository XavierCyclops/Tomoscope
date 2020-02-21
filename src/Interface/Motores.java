/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Javier Gonzalez Huerta
 * UNAM 2016
 */
public class Motores {
    //Inicializamos los casos posibles de arduino.
    protected static final String RADIAL = "1";
    protected static final String ABANICO = "2";
    protected static final String ACOMODACION = "3";
    protected static final String MOTOR_2_DERECHA= "4";
    protected static final String MOTOR_2_IZQUIERDA= "5";
    protected static final String MOTOR_1_DORMIR= "6";
    protected static final String MOTOR_2_DORMIR= "7";

    
    //Inicializamos el flujo y variables de conexion
    private OutputStream output = null;
    SerialPort puertoSerial;
    private final String PUERTO = "COM3";
    //Tiempo de espera de conexion
    public static final int TimeW = 2000; //mls
    //serial
    private static final int DATAR = 9600; 
    //Metodo constructor
    public Motores (){
        iniciaConex();
    }
    
    //metodo de inicializacion de conexion
    public final void iniciaConex(){
        CommPortIdentifier IDpuerto = null;
        Enumeration puertoNum = CommPortIdentifier.getPortIdentifiers();
        while(puertoNum.hasMoreElements()){
            CommPortIdentifier actualIdPuerto = (CommPortIdentifier)puertoNum.nextElement();
            if(PUERTO.equals(actualIdPuerto.getName())){
                IDpuerto = actualIdPuerto;

                break;
            }
        }
        if(IDpuerto == null){
            ms("Error de conexion a puerto");
        }
        try{
            puertoSerial = (SerialPort)IDpuerto.open(this.getClass().getName(),TimeW);
            puertoSerial.setSerialPortParams(DATAR,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
            output= puertoSerial.getOutputStream();
        }catch(Exception e){
            msE(e.getMessage());
        }
    }
    
    protected boolean enviaDatos(String dato){
        try{
           output.write(dato.getBytes());
           return true;
        }catch(Exception e){
            msgErr(e.getMessage());
            return false;
        }
    }
    
    public void msgErr(String msg){
        System.out.println("Error De Datos");
        JOptionPane.showMessageDialog(null,"Error de conexion");
    }
    public void msE (String msg){
        System.out.println("Error De Flujo");
    }
    public void ms(String msg){
        System.out.println("Error De Conexion");

    }

    boolean MessageAvaliable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String PrintMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
