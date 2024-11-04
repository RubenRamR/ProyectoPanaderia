/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominioentidades;

/**
 * Clase que representa un detalle de venta en la pastelería.
 */
public class DetalleVenta {
    
    /** Precio unitario del producto en el detalle de venta. */
    private float precio;
    
    /** Importe total del detalle de venta. */
    private float importe;
    
    /** Cantidad de productos vendidos en el detalle de venta. */
    private int cantidad;
    
    /** Detalles adicionales del cliente para el detalle de venta. */
    private String detallesCliente;
    
    /** Tamaño del producto en el detalle de venta. */
    private String tamanhoProducto;
    
    /** Identificador del producto asociado al detalle de venta. */
    private String productoId;
    
    /** Producto asociado al detalle de venta. */
    private Producto producto;

    /**
     * Constructor por defecto de la clase DetalleVenta.
     */
    public DetalleVenta() {
    }

    /**
     * Constructor de la clase DetalleVenta.
     * @param precio Precio unitario del producto en el detalle de venta.
     * @param importe Importe total del detalle de venta.
     * @param cantidad Cantidad de productos vendidos en el detalle de venta.
     * @param detallesCliente Detalles adicionales del cliente para el detalle de venta.
     * @param tamanhoProducto Tamaño del producto en el detalle de venta.
     * @param productoId Identificador del producto asociado al detalle de venta.
     */
    public DetalleVenta(float precio, float importe, int cantidad, String detallesCliente, String tamanhoProducto, String productoId) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.detallesCliente = detallesCliente;
        this.tamanhoProducto = tamanhoProducto;
        this.productoId = productoId;
    }

    /**
     * Obtiene el precio unitario del producto en el detalle de venta.
     * @return Precio unitario del producto en el detalle de venta.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio unitario del producto en el detalle de venta.
     * @param precio Precio unitario del producto en el detalle de venta.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el producto asociado al detalle de venta.
     * @return Producto asociado al detalle de venta.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto asociado al detalle de venta.
     * @param producto Producto asociado al detalle de venta.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el importe total del detalle de venta.
     * @return Importe total del detalle de venta.
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Establece el importe total del detalle de venta.
     * @param importe Importe total del detalle de venta.
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }

    /**
     * Obtiene la cantidad de productos vendidos en el detalle de venta.
     * @return Cantidad de productos vendidos en el detalle de venta.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos vendidos en el detalle de venta.
     * @param cantidad Cantidad de productos vendidos en el detalle de venta.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene los detalles adicionales del cliente para el detalle de venta.
     * @return Detalles adicionales del cliente para el detalle de venta.
     */
    public String getDetallesCliente() {
        return detallesCliente;
    }

    /**
     * Establece los detalles adicionales del cliente para el detalle de venta.
     * @param detallesCliente Detalles adicionales del cliente para el detalle de venta.
     */
    public void setDetallesCliente(String detallesCliente) {
        this.detallesCliente = detallesCliente;
    }

    /**
     * Obtiene el identificador del producto asociado al detalle de venta.
     * @return Identificador del producto asociado al detalle de venta.
     */
    public String getProductoId() {
        return productoId;
    }

    /**
     * Establece el identificador del producto asociado al detalle de venta.
     * @param productoId Identificador del producto asociado al detalle de venta.
     */
    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    /**
     * Obtiene el tamaño del producto en el detalle de venta.
     * @return Tamaño del producto en el detalle de venta.
     */
    public String getTamanhoProducto() {
        return tamanhoProducto;
    }

    /**
     * Establece el tamaño del producto en el detalle de venta.
     * @param tamanhoProducto Tamaño del producto en el detalle de venta.
     */
    public void setTamanhoProducto(String tamanhoProducto) {
        this.tamanhoProducto = tamanhoProducto;
    }

    /**
     * Devuelve una representación en cadena del objeto DetalleVenta.
     * @return Representación en cadena del objeto DetalleVenta.
     */
    @Override
    public String toString() {
        return "DetalleVenta{" + "precio=" + precio + ", importe=" + importe + ", cantidad=" + cantidad + ", detallesCliente=" + detallesCliente + ", productoId=" + productoId + '}';
    }

}
