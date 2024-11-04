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
public class Proveedor {
   
    private int idProveedor;
    private String nombreProveedor;
    private String direccion;
    private String telefono;
    private String correo;
    private String ruc;

    public Proveedor(int idProveedor, String nombreProveedor, String direccion, String telefono, String correo, String ruc) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.ruc = ruc;
    }

    public int getIdProveedor() { 
        return idProveedor; }
    public String getNombreProveedor() { 
        return nombreProveedor; }
    public String getDireccion() { 
        return direccion; }
    public String getTelefono() { 
        return telefono; }
    public String getCorreo() { 
        return correo; }
    public String getRuc() { 
        return ruc; }

    public void setIdProveedor(int idProveedor) { 
        this.idProveedor = idProveedor; }
    public void setNombreProveedor(String nombreProveedor) { 
        this.nombreProveedor = nombreProveedor; }
    public void setDireccion(String direccion) { 
        this.direccion = direccion; }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; }
    public void setCorreo(String correo) { 
        this.correo = correo; }
    public void setRuc(String ruc) { 
        this.ruc = ruc; }
}
