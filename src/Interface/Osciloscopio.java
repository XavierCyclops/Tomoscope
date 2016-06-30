/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ACTECK
 */
public class Osciloscopio {
    
    public int getTRIGGERSOURCE() {
        return TRIGGERSOURCE;
    }

    public void setTRIGGERSOURCE(int TRIGGERSOURCE) {
        this.TRIGGERSOURCE = TRIGGERSOURCE;
    }

    public int getSENSITIVITY() {
        return SENSITIVITY;
    }

    public void setSENSITIVITIY(int SENSITIVITY) {
        this.SENSITIVITY = SENSITIVITY;
    }

    public int getPOSTSAMPLES() {
        return POSTSAMPLES;
    }

    public void setPOSTSAMPLES(int POSTSAMPLES) {
        this.POSTSAMPLES = POSTSAMPLES;
    }

    public int getNMEAN() {
        return NMEAN;
    }

    public void setNMEAN(int NMEAN) {
        this.NMEAN = NMEAN;
    }

    public int getRESOLUTION() {
        return RESOLUTION;
    }

    public void setRESOLUTION(int RESOLUTION) {
        this.RESOLUTION = RESOLUTION;
    }

    public double getSAMPLES() {
        return SAMPLES;
    }

    public void setSAMPLES(double SAMPLES) {
        this.SAMPLES = SAMPLES;
    }

    public double getFM() {
        return FM;
    }

    // Configuración para el HandyScope
    public void setFM(double FM) {
        this.FM = FM;
    }
    private int TRIGGERSOURCE;
    private int SENSITIVITY;
    private int POSTSAMPLES;
    private int NMEAN;
    private int RESOLUTION;

    // Se recibirá del usuario
    private double SAMPLES;
    private double FM;
    
    // Constructor
    public Osciloscopio() {
        this.TRIGGERSOURCE = 0;
        this.SENSITIVITY = 12;
        this.POSTSAMPLES = 32;
        this.NMEAN = 100;
        this.RESOLUTION = 12;
    }
}
