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
public class Usuario {
    private String correo;
    private String contraseña;
    private int id;
    private String nombreCompleto;
    private boolean esAdministrador;

    public Usuario(String correo, String contraseña, int id, String nombreCompleto, boolean esAdministrador) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.esAdministrador = esAdministrador;
    }

    public String getCorreo() { 
        return correo; }
    public String getContraseña() { 
        return contraseña; }
    public int getId() { return id; }
    public String getNombreCompleto() { 
        return nombreCompleto; }
    public boolean esAdministrador() { 
        return esAdministrador; }

    public void setCorreo(String correo) { 
        this.correo = correo; }
    public void setContraseña(String contraseña) { 
        this.contraseña = contraseña; }
    public void setId(int id) { 
        this.id = id; }
    public void setNombreCompleto(String nombreCompleto) { 
        this.nombreCompleto = nombreCompleto; }
    public void setEsAdministrador(boolean esAdministrador) { 
        this.esAdministrador = esAdministrador; }
}