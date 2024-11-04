
package model;

/**
 *
 * @author ASUS
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String tipoProducto; // "Medicamento", "Vitaminas", "Suplementos"
    private String proveedor;
    private double precioUnitario;
    private int stock;
    private String fechaVencimiento; 

    public Producto(int idProducto, String nombreProducto, String tipoProducto, String proveedor, double precioUnitario, int stock, String fechaVencimiento) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.proveedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdProducto() { 
        return idProducto; }
    public String getNombreProducto() { 
        return nombreProducto; }
    public String getTipoProducto() { 
        return tipoProducto; }
    public String getProveedor() { 
        return proveedor; }
    public double getPrecioUnitario() { 
        return precioUnitario; }
    public int getStock() { 
        return stock; }
    public String getFechaVencimiento() { 
        return fechaVencimiento; }

    public void setIdProducto(int idProducto) { 
        this.idProducto = idProducto; }
    public void setNombreProducto(String nombreProducto) { 
        this.nombreProducto = nombreProducto; }
    public void setTipoProducto(String tipoProducto) { 
        this.tipoProducto = tipoProducto; }
    public void setProveedor(String proveedor) { 
        this.proveedor = proveedor; }
    public void setPrecioUnitario(double precioUnitario) { 
        this.precioUnitario = precioUnitario; }
    public void setStock(int stock) { 
        this.stock = stock; }
    public void setFechaVencimiento(String fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; }
}
