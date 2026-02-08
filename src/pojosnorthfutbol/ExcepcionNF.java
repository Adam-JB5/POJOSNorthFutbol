/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojosnorthfutbol;

import java.io.Serializable;

/**
 *
 * @author adamj
 */
public class ExcepcionNF extends Exception implements Serializable {

    private String sentenciaSQL;
    private int codigoErrorBD;
    private String mensajeErrorBD;
    private String mensajeErrorUsuario;

    public ExcepcionNF() {

    }

    public ExcepcionNF(String sentenciaSQL, int codigoErrorBD, String mensajeErrorBD, String mensajeErrorUsuario) {
        this.sentenciaSQL = sentenciaSQL;
        this.codigoErrorBD = codigoErrorBD;
        this.mensajeErrorBD = mensajeErrorBD;
        this.mensajeErrorUsuario = mensajeErrorUsuario;
    }

    public String getSentenciaSQL() {
        return sentenciaSQL;
    }

    public void setSentenciaSQL(String sentenciaSQL) {
        this.sentenciaSQL = sentenciaSQL;
    }

    public int getCodigoErrorBD() {
        return codigoErrorBD;
    }

    public void setCodigoErrorBD(int codigoErrorBD) {
        this.codigoErrorBD = codigoErrorBD;
    }

    public String getMensajeErrorBD() {
        return mensajeErrorBD;
    }

    public void setMensajeErrorBD(String mensajeErrorBD) {
        this.mensajeErrorBD = mensajeErrorBD;
    }

    public String getMensajeErrorUsuario() {
        return mensajeErrorUsuario;
    }

    public void setMensajeErrorUsuario(String mensajeErrorUsuario) {
        this.mensajeErrorUsuario = mensajeErrorUsuario;
    }

    public String toString() {
        return "ExcepcionNF{" +
           "sentenciaSQL=" + sentenciaSQL +
           ", codigoErrorBD=" + codigoErrorBD +
           ", mensajeErrorBD=" + mensajeErrorBD +
           ", mensajeErrorUsuario=" + mensajeErrorUsuario +
           '}';
    }
}
