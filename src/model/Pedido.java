/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Pedido {
    private int idOrden;
    private String fechaCompra;
    private String nombreCliente;
    private int idCliente;
    private ArrayList<Producto> productos; // Lista de productos en el pedido

    public Pedido(int idOrden, String fechaCompra, String nombreCliente, int idCliente) {
        this.idOrden = idOrden;
        this.fechaCompra = fechaCompra;
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.productos = new ArrayList<>();
    }

    // Getters y Setters
    public int getIdOrden() { 
        return idOrden; }
    public String getFechaCompra() { 
        return fechaCompra; }
    public String getNombreCliente() { 
        return nombreCliente; }
    public int getIdCliente() { 
        return idCliente; }
    public ArrayList<Producto> getProductos() { 
        return productos; }

    public void setIdOrden(int idOrden) { 
        this.idOrden = idOrden; }
    public void setFechaCompra(String fechaCompra) { 
        this.fechaCompra = fechaCompra; }
    public void setNombreCliente(String nombreCliente) { 
        this.nombreCliente = nombreCliente; }
    public void setIdCliente(int idCliente) { 
        this.idCliente = idCliente; }

 
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public Producto buscarProductoPorId(int idProducto) {
        for (Producto producto : productos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        return null;
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombreProducto());
        }
    }
}
