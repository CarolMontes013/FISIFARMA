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
public class ProveedorArreglo {
    private ArrayList<Proveedor> proveedores;

    public ProveedorArreglo() {
        this.proveedores = new ArrayList<>();
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void eliminarProveedor(Proveedor proveedor) {
        proveedores.remove(proveedor);
    }

    public Proveedor buscarProveedorPorId(int idProveedor) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getIdProveedor() == idProveedor) {
                return proveedor;
            }
        }
        return null;
    }

    public Proveedor buscarProveedorPorNombre(String nombreProveedor) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNombreProveedor().equalsIgnoreCase(nombreProveedor)) {
                return proveedor;
            }
        }
        return null;
    }

    public void listarProveedores() {
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor.getNombreProveedor());
        }
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }    
    
}
