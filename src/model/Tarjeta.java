/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Tarjeta {
    
    private String numeroTarjeta;
    private String fechaVencimiento;
    private String titular;
    private String cvv;

    public Tarjeta(String numeroTarjeta, String fechaVencimiento, String titular, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.titular = titular;
        this.cvv = cvv;
    }

    public String getNumeroTarjeta() { 
        return numeroTarjeta; }
    public String getFechaVencimiento() { 
        return fechaVencimiento; }
    public String getTitular() { 
        return titular; }
    public String getCvv() { 
        return cvv; }

    public void setNumeroTarjeta(String numeroTarjeta) { 
        this.numeroTarjeta = numeroTarjeta; }
    public void setFechaVencimiento(String fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; }
    public void setTitular(String titular) { 
        this.titular = titular; }
    public void setCvv(String cvv) { 
        this.cvv = cvv; }
}
