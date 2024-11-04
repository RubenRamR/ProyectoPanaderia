package com.mycompany.panaderiadominiosMapeo;

import org.bson.types.ObjectId;

/**
 * Clase que representa el detalle de una venta mapeada para persistencia.
 * Contiene información como el precio, importe, cantidad, detalles del cliente,
 * tamaño del producto, ID del producto y una referencia al objeto Producto.
 * 
 * 
 */
public class DetalleVentaMapeo {

    private float precio;
    private float importe;
    private int cantidad;
    private String detallesCliente;
    private String tamanhoProducto;
    private ObjectId productoId;
    private ProductoMapeo producto;

    /**
     * Constructor de la clase DetalleVentaMapeo.
     */
    public DetalleVentaMapeo() {
    }

    /**
     * Constructor de la clase DetalleVentaMapeo.
     * 
     * @param precio Precio del producto.
     * @param importe Importe total del detalle de venta.
     * @param cantidad Cantidad de productos vendidos.
     * @param detallesCliente Detalles adicionales del cliente.
     * @param tamanhoProducto Tamaño del producto vendido.
     * @param productoId ID del producto vendido.
     */
    public DetalleVentaMapeo(float precio, float importe, int cantidad, String detallesCliente, String tamanhoProducto, ObjectId productoId) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.detallesCliente = detallesCliente;
        this.tamanhoProducto = tamanhoProducto;
        this.productoId = productoId;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return Precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio Precio del producto.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el objeto Producto asociado al detalle de venta.
     * 
     * @return Objeto Producto asociado al detalle de venta.
     */
    public ProductoMapeo getProducto() {
        return producto;
    }

    /**
     * Establece el objeto Producto asociado al detalle de venta.
     * 
     * @param producto Objeto Producto asociado al detalle de venta.
     */
    public void setProducto(ProductoMapeo producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el importe total del detalle de venta.
     * 
     * @return Importe total del detalle de venta.
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Establece el importe total del detalle de venta.
     * 
     * @param importe Importe total del detalle de venta.
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }

    /**
     * Obtiene la cantidad de productos vendidos.
     * 
     * @return Cantidad de productos vendidos.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos vendidos.
     * 
     * @param cantidad Cantidad de productos vendidos.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene los detalles adicionales del cliente.
     * 
     * @return Detalles adicionales del cliente.
     */
    public String getDetallesCliente() {
        return detallesCliente;
    }

    /**
     * Establece los detalles adicionales del cliente.
     * 
     * @param detallesCliente Detalles adicionales del cliente.
     */
    public void setDetallesCliente(String detallesCliente) {
        this.detallesCliente = detallesCliente;
    }

    /**
     * Obtiene el ID del producto vendido.
     * 
     * @return ID del producto vendido.
     */
    public ObjectId getProductoId() {
        return productoId;
    }

    /**
     * Establece el ID del producto vendido.
     * 
     * @param productoId ID del producto vendido.
     */
    public void setProductoId(ObjectId productoId) {
        this.productoId = productoId;
    }

    /**
     * Obtiene el tamaño del producto vendido.
     * 
     * @return Tamaño del producto vendido.
     */
    public String getTamanhoProducto() {
        return tamanhoProducto;
    }

    /**
     * Establece el tamaño del producto vendido.
     * 
     * @param tamanhoProducto Tamaño del producto vendido.
     */
    public void setTamanhoProducto(String tamanhoProducto) {
        this.tamanhoProducto = tamanhoProducto;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto DetalleVentaMapeo.
     * 
     * @return Representación en cadena de texto del objeto DetalleVentaMapeo.
     */
    @Override
    public String toString() {
        return "DetalleVenta{" + "precio=" + precio + ", importe=" + importe + ", cantidad=" + cantidad + ", detallesCliente=" + detallesCliente + ", productoId=" + productoId + '}';
    }

}
