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
public class Cliente {
    
    private int idCliente;
    private String nombre;
    private int idOrden;
    private int idFactura;

    public Cliente(int idCliente, String nombre, int idOrden, int idFactura) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.idOrden = idOrden;
        this.idFactura = idFactura;
    }

    public int getIdCliente() { 
        return idCliente; }
    public String getNombre() { 
        return nombre; }
    public int getIdOrden() { 
        return idOrden; }
    public int getIdFactura() { 
        return idFactura; }

    public void setIdCliente(int idCliente) { 
        this.idCliente = idCliente; }
    public void setNombre(String nombre) { 
        this.nombre = nombre; }
    public void setIdOrden(int idOrden) { 
        this.idOrden = idOrden; }
    public void setIdFactura(int idFactura) { 
        this.idFactura = idFactura; }
}
