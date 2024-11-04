/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominioentidades;

import java.util.Date;
import java.util.List;

public class Venta {

    /**
     * Identificador único de la venta.
     */
    private String id;

    /**
     * Monto total de la venta.
     */
    private float montoTotal;

    /**
     * Fecha en la que se entrega la venta.
     */
    private Date fechaEntrega;

    /**
     * Fecha en la que se registra la venta.
     */
    private Date fechaRegistro;

    /**
     * Estado actual de la venta (en curso, completada, cancelada, etc.).
     */
    private String estado;

    /**
     * Lista de detalles de la venta, que incluyen los productos vendidos y sus
     * cantidades.
     */
    private List<DetalleVenta> detallesVenta;

    /**
     * Dirección a la que se entrega la venta.
     */
    private Direccion direccionEntrega;

    /**
     * Objeto Cliente que representa al cliente que realizó la venta.
     */
    private Cliente cliente;

    /**
     * Constructor sin parámetros.
     */
    public Venta() {
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id Identificador de la venta.
     * @param montoTotal Monto total de la venta.
     * @param fechaEntrega Fecha de entrega de la venta.
     * @param fechaRegistro Fecha de registro de la venta.
     * @param estado Estado actual de la venta.
     * @param clienteid ID del cliente que realizó la venta.
     * @param detallesVenta Lista de detalles de la venta.
     * @param direccionEntrega Dirección de entrega de la venta.
     * @param cliente Objeto Cliente que representa al cliente.
     */
    public Venta(String id, float montoTotal, Date fechaEntrega, Date fechaRegistro, String estado, List<DetalleVenta> detallesVenta, Direccion direccionEntrega, Cliente cliente) {
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
     * @param clienteid ID del cliente que realizó la venta.
     * @param detallesVenta Lista de detalles de la venta.
     * @param direccionEntrega Dirección de entrega de la venta.
     * @param cliente Objeto Cliente que representa al cliente.
     */
    public Venta(float montoTotal, Date fechaEntrega, Date fechaRegistro, String estado, List<DetalleVenta> detallesVenta, Direccion direccionEntrega, Cliente cliente) {
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
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador de la venta.
     *
     * @param id Identificador de la venta.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el objeto Cliente que representa al cliente que realizó la venta.
     *
     * @return Objeto Cliente asociado a la venta.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el objeto Cliente que representa al cliente que realizó la
     * venta.
     *
     * @param cliente Objeto Cliente asociado a la venta.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el monto total de la venta.
     *
     * @return Monto total de la venta.
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Establece el monto total de la venta.
     *
     * @param montoTotal Monto total de la venta.
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * Obtiene la fecha de entrega de la venta.
     *
     * @return Fecha de entrega de la venta.
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha de entrega de la venta.
     *
     * @param fechaEntrega Fecha de entrega de la venta.
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene el estado actual de la venta.
     *
     * @return Estado actual de la venta.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual de la venta.
     *
     * @param estado Estado actual de la venta.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la fecha de registro de la venta.
     *
     * @return Fecha de registro de la venta.
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Establece la fecha de registro de la venta.
     *
     * @param fechaRegistro Fecha de registro de la venta.
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Obtiene la lista de detalles de la venta.
     *
     * @return Lista de detalles de la venta.
     */
    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    /**
     * Establece la lista de detalles de la venta.
     *
     * @param detallesVenta Lista de detalles de la venta.
     */
    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    /**
     * Obtiene la dirección de entrega de la venta.
     *
     * @return Dirección de entrega de la venta.
     */
    public Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Establece la dirección de entrega de la venta.
     *
     * @param direccionEntrega Dirección de entrega de la venta.
     */
    public void setDireccionEntrega(Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    /**
     * Representación en cadena de la venta.
     *
     * @return Representación en cadena de la venta.
     */
    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", montoTotal=" + montoTotal + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", estado=" + estado + ", detallesVenta=" + detallesVenta + ", direccionEntrega=" + direccionEntrega + ", cliente=" + "{" + cliente.getId() + cliente.getNombre() + " " + cliente.getApellidoP() + "}";
    }

}
