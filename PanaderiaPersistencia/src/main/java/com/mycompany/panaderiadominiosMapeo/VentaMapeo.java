/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominiosMapeo;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * 
 */
public class VentaMapeo {

    private ObjectId id;
    private float montoTotal;
    private Date fechaEntrega;
    private Date fechaRegistro;
    private String estado;
    private List<DetalleVentaMapeo> detallesVenta;
    private DireccionMapeo direccionEntrega;
    private ClienteMapeo cliente;
    private Integer numeroVentas;

    

    /**
     * Constructor sin parámetros.
     */
    public VentaMapeo() {
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id Identificador de la venta.
     * @param montoTotal Monto total de la venta.
     * @param fechaEntrega Fecha de entrega de la venta.
     * @param fechaRegistro Fecha de registro de la venta.
     * @param estado Estado actual de la venta.
     * @param detallesVenta Lista de detalles de la venta.
     * @param direccionEntrega Dirección de entrega de la venta.
     * @param cliente Objeto Cliente que representa al cliente.
     */
    public VentaMapeo(ObjectId id, float montoTotal, Date fechaEntrega, Date fechaRegistro, String estado, List<DetalleVentaMapeo> detallesVenta, DireccionMapeo direccionEntrega, ClienteMapeo cliente) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }

    /**
     * Constructor con algunos parámetros.
     *
     * @param montoTotal Monto total de la venta.
     * @param fechaEntrega Fecha de entrega de la venta.
     * @param fechaRegistro Fecha de registro de la venta.
     * @param estado Estado actual de la venta.
     * @param detallesVenta Lista de detalles de la venta.
     * @param direccionEntrega Dirección de entrega de la venta.
     * @param cliente Objeto Cliente que representa al cliente.
     */
    public VentaMapeo(float montoTotal, Date fechaEntrega, Date fechaRegistro, String estado, List<DetalleVentaMapeo> detallesVenta, DireccionMapeo direccionEntrega, ClienteMapeo cliente) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }

    /**
     * Obtiene el identificador de la venta.
     *
     * @return Identificador de la venta.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador de la venta.
     *
     * @param id Identificador de la venta.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el objeto Cliente que representa al cliente que realizó la venta.
     *
     * @return Objeto Cliente asociado a la venta.
     */
    public ClienteMapeo getCliente() {
        return cliente;
    }

    /**
     * Establece el objeto Cliente que representa al cliente que realizó la
     * venta.
     *
     * @param cliente Objeto Cliente asociado a la venta.
     */
    public void setCliente(ClienteMapeo cliente) {
        this.cliente = cliente;
    }

    /**
     * Devuelve el monto total de la venta.
     *
     * @return El monto total de la venta.
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Establece el monto total de la venta.
     *
     * @param montoTotal El monto total de la venta a establecer.
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * Devuelve la fecha de entrega de la venta.
     *
     * @return La fecha de entrega de la venta.
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Devuelve el estado de la venta.
     *
     * @return El estado de la venta.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la venta.
     *
     * @param estado El estado de la venta a establecer.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Establece la fecha de entrega de la venta.
     *
     * @param fechaEntrega La fecha de entrega de la venta a establecer.
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Devuelve la fecha de registro de la venta.
     *
     * @return La fecha de registro de la venta.
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Establece la fecha de registro de la venta.
     *
     * @param fechaRegistro La fecha de registro de la venta a establecer.
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    /**
     * Devuelve la lista de detalles de venta de la venta.
     *
     * @return La lista de detalles de venta de la venta.
     */
    public List<DetalleVentaMapeo> getDetallesVenta() {
        return detallesVenta;
    }

    /**
     * Establece la lista de detalles de venta de la venta.
     *
     * @param detallesVenta La lista de detalles de venta de la venta a
     * establecer.
     */
    public void setDetallesVenta(List<DetalleVentaMapeo> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    /**
     * Devuelve la dirección de entrega de la venta.
     *
     * @return La dirección de entrega de la venta.
     */
    public DireccionMapeo getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Establece la dirección de entrega de la venta.
     *
     * @param direccionEntrega La dirección de entrega de la venta a establecer.
     */
    public void setDireccionEntrega(DireccionMapeo direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
    
    public Integer getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(Integer numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    /**
     * Devuelve una representación en cadena de la venta, incluyendo sus
     * atributos.
     *
     * @return Una cadena que representa la venta.
     */
    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", montoTotal=" + montoTotal + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", Cliente=" +"{"+cliente.getId()+cliente.getNombre()+" "+cliente.getApellidoP()+"}"  + ", detallesVenta=" + detallesVenta + ", direccionEntrega=" + direccionEntrega + '}';
    }

    
}
