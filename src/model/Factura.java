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
public class Factura {

    private int idFactura;
    private Pedido pedido;
    private double montoTotal;
    private String fechaEmision;

    public Factura(int idFactura, Pedido pedido, double montoTotal, String fechaEmision) {
        this.idFactura = idFactura;
        this.pedido = pedido;
        this.montoTotal = montoTotal;
        this.fechaEmision = fechaEmision;
    }

    public int getIdFactura() { 
        return idFactura; }
    public Pedido getPedido() { 
        return pedido; }
    public double getMontoTotal() { 
        return montoTotal; }
    public String getFechaEmision() { 
        return fechaEmision; }

    public void setIdFactura(int idFactura) { 
        this.idFactura = idFactura; }
    public void setPedido(Pedido pedido) { 
        this.pedido = pedido; }
    public void setMontoTotal(double montoTotal) { 
        this.montoTotal = montoTotal; }
    public void setFechaEmision(String fechaEmision) { 
        this.fechaEmision = fechaEmision; }
}
