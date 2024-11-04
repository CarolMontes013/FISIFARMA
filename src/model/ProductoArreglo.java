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
public class ProductoArreglo {
    private ArrayList<Producto> productos;

    public ProductoArreglo() {
        this.productos = new ArrayList<>();
    }

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

    public Producto buscarProductoPorNombre(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}