/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;
import java.util.List;

/**
 * Clase DTO de la entidad Venta
 * 
 */
public class DTO_Venta {
    /**
     * Id unico de la venta
     */
    private String ID;
    /**
     * Monto total de la venta
     */
    private float montoTotal;
    /**
     * Fecha de entrega de la venta
     */
    private Date fechaEntrega;
    /**
     * Fecha de registro de la venta
     */
    private Date fechaRegistro;
    /**
     * Estado de la venta
     */
    private String Estado;
    /**
     * Lista de los detalles de la venta
     */
    private List<DTO_DetalleVenta> detallesVenta;
    /**
     * Dto dela direccion de la venta
     */
    private DTO_Direccion direccionEntrega;
    /**
     * Dto del cliente de la venta
     */
    private DTO_Cliente cliente;

    /**
     * Constructor vacio
     */
    public DTO_Venta() {
    }

    /**
     * Constructor que inicializa el montototal, fecha de entrega, fecha de registro, el estado de la venta, los detalles
     * de la venta, la direccion de entrega y el cliente
     * @param montoTotal monto total
     * @param fechaEntrega fecha de entrega
     * @param fechaRegistro fecha de registro
     * @param Estado estado del pago
     * @param detallesVenta detalles de la venta
     * @param direccionEntrega direccion de la entrega
     * @param cliente DTO del cliente
     */
    public DTO_Venta(float montoTotal, Date fechaEntrega, Date fechaRegistro, String Estado, List<DTO_DetalleVenta> detallesVenta, DTO_Direccion direccionEntrega, DTO_Cliente cliente) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.Estado = Estado;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }

    /**
     * Contructor que inicializa el id unico de la venta, el monto total de la venta, la fecha de entrega, la fecha de registro
     * el estado del pago, los detalles de la venta, la direccion de entrega y el cliente
     * @param ID id unico de la venta
     * @param montoTotal el monto total de la venta
     * @param fechaEntrega la fecha de entrega
     * @param fechaRegistro la fecha de registro
     * @param Estado el estado del pago
     * @param detallesVenta los detalles de la venta
     * @param direccionEntrega la direcciones de entrega
     * @param cliente el DTO de cliente
     */
    public DTO_Venta(String ID, float montoTotal, Date fechaEntrega, Date fechaRegistro, String Estado, List<DTO_DetalleVenta> detallesVenta, DTO_Direccion direccionEntrega, DTO_Cliente cliente) {
        this.ID = ID;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.Estado = Estado;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }
/**
     * Obtiene el ID de la venta.
     *
     * @return el ID de la venta como un String.
     */
    public String getID() {
        return ID;
    }

    /**
     * Establece el ID de la venta.
     *
     * @param ID el ID de la venta a establecer.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Obtiene el monto total de la venta.
     *
     * @return el monto total de la venta como un float.
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Establece el monto total de la venta.
     *
     * @param montoTotal el monto total a establecer.
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * Obtiene la información del cliente asociado a la venta.
     *
     * @return el objeto DTO_Cliente que contiene la información del cliente.
     */
    public DTO_Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece la información del cliente asociado a la venta.
     *
     * @param cliente el objeto DTO_Cliente que contiene la información del cliente.
     */
    public void setCliente(DTO_Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene la fecha de entrega de la venta.
     *
     * @return la fecha de entrega como un objeto Date.
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha de entrega de la venta.
     *
     * @param fechaEntrega la fecha de entrega a establecer.
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene la fecha de registro de la venta.
     *
     * @return la fecha de registro como un objeto Date.
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Establece la fecha de registro de la venta.
     *
     * @param fechaRegistro la fecha de registro a establecer.
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Obtiene la lista de detalles de la venta.
     *
     * @return una lista de objetos DTO_DetalleVenta, que contienen los detalles de cada producto vendido.
     */
    public List<DTO_DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    /**
     * Establece la lista de detalles de la venta.
     *
     * @param detallesVenta la lista de detalles de venta a establecer.
     */
    public void setDetallesVenta(List<DTO_DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    /**
     * Obtiene la dirección de entrega de la venta.
     *
     * @return el objeto DTO_Direccion que contiene la dirección de entrega.
     */
    public DTO_Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Establece la dirección de entrega de la venta.
     *
     * @param direccionEntrega el objeto DTO_Direccion que contiene la dirección de entrega a establecer.
     */
    public void setDireccionEntrega(DTO_Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    /**
     * Obtiene el estado de la venta.
     *
     * @return el estado de la venta como un String (por ejemplo, "Pendiente", "Completada").
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * Establece el estado de la venta.
     *
     * @param Estado el estado de la venta a establecer (por ejemplo, "Pendiente", "Completada").
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * Representación en formato String de la venta.
     * 
     * @return una cadena que describe la venta incluyendo todos sus detalles.
     */
    @Override
    public String toString() {
        return "DTO_Venta{" + 
               "ID=" + ID + 
               ", montoTotal=" + montoTotal + 
               ", fechaEntrega=" + fechaEntrega + 
               ", fechaRegistro=" + fechaRegistro + 
               ", Estado=" + Estado + 
               ", detallesVenta=" + detallesVenta + 
               ", direccionEntrega=" + direccionEntrega + 
               ", cliente=" + cliente + 
               '}';
    }
    
}
