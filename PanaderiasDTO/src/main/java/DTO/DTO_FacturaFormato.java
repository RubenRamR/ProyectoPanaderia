/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 * DTO de la entidad Factura Formato
 *
 */
public class DTO_FacturaFormato {

    /**
     * Nombre del cliente
     */
    String nombreCliente;
    /**
     * RFC del cliente
     */
    String rfcCliente;
    /**
     * Direccion del cliente
     */
    String direccionCliente;
    /**
     * Fecha de vencimiento de la factura
     */
    String fechaVencimiento;
    /**
     * Fecha de emision de la factura
     */
    String fechaEmision;
    /**
     * total de la venta
     */
    String total;
    /**
     * Subtotal de la venta
     */
    String subtotal;
    /**
     * Iva de la venta
     */
    String iva;
    /**
     * Lista de los detalles de la venta Reporte
     */
    List<DTO_DetallesVentaReporte> detallesVenta;

    /**
     * Constructor vacio
     */
    public DTO_FacturaFormato() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     *
     * @param nombreCliente nombre del cliente
     * @param rfcCliente Rfc del cliente
     * @param direccionCliente Direccion del cliente
     * @param fechaVencimiento Fecha de vencimiento de la factura
     * @param fechaEmision Fecha de emision de la factura
     * @param total Total de la factura
     * @param subtotal Subtotal de la venta
     * @param iva iva dela venta
     * @param detallesVenta Detalle de la venta
     */
    public DTO_FacturaFormato(String nombreCliente, String rfcCliente, String direccionCliente, String fechaVencimiento, String fechaEmision, String total, String subtotal, String iva, List<DTO_DetallesVentaReporte> detallesVenta) {
        this.nombreCliente = nombreCliente;
        this.rfcCliente = rfcCliente;
        this.direccionCliente = direccionCliente;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaEmision = fechaEmision;
        this.total = total;
        this.subtotal = subtotal;
        this.iva = iva;
        this.detallesVenta = detallesVenta;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * Este método devuelve el nombre del cliente asociado con la venta. Se
     * utiliza para obtener el valor almacenado en el atributo `nombreCliente`.
     *
     * @return El nombre del cliente como un valor de tipo `String`.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el nombre del cliente.
     *
     * Este método permite establecer el nombre del cliente asociado con la
     * venta. El valor proporcionado se guarda en el atributo `nombreCliente`.
     *
     * @param nombreCliente El nombre del cliente como un valor de tipo
     * `String`.
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el RFC del cliente.
     *
     * Este método devuelve el RFC del cliente asociado con la venta. Se usa
     * para obtener el valor almacenado en el atributo `rfcCliente`.
     *
     * @return El RFC del cliente como un valor de tipo `String`.
     */
    public String getRfcCliente() {
        return rfcCliente;
    }

    /**
     * Establece el RFC del cliente.
     *
     * Este método permite establecer el RFC del cliente asociado con la venta.
     * El valor proporcionado se guarda en el atributo `rfcCliente`.
     *
     * @param rfcCliente El RFC del cliente como un valor de tipo `String`.
     */
    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * Este método devuelve la dirección del cliente asociado con la venta. Se
     * utiliza para obtener el valor almacenado en el atributo
     * `direccionCliente`.
     *
     * @return La dirección del cliente como un valor de tipo `String`.
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * Establece la dirección del cliente.
     *
     * Este método permite establecer la dirección del cliente asociado con la
     * venta. El valor proporcionado se guarda en el atributo
     * `direccionCliente`.
     *
     * @param direccionCliente La dirección del cliente como un valor de tipo
     * `String`.
     */
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    /**
     * Obtiene la fecha de vencimiento de la venta.
     *
     * Este método devuelve la fecha de vencimiento de la venta. Se usa para
     * obtener el valor almacenado en el atributo `fechaVencimiento`.
     *
     * @return La fecha de vencimiento como un valor de tipo `String`.
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la venta.
     *
     * Este método permite establecer la fecha de vencimiento de la venta. El
     * valor proporcionado se guarda en el atributo `fechaVencimiento`.
     *
     * @param fechaVencimiento La fecha de vencimiento como un valor de tipo
     * `String`.
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene la fecha de emisión de la venta.
     *
     * Este método devuelve la fecha de emisión de la venta. Se usa para obtener
     * el valor almacenado en el atributo `fechaEmision`.
     *
     * @return La fecha de emisión como un valor de tipo `String`.
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece la fecha de emisión de la venta.
     *
     * Este método permite establecer la fecha de emisión de la venta. El valor
     * proporcionado se guarda en el atributo `fechaEmision`.
     *
     * @param fechaEmision La fecha de emisión como un valor de tipo `String`.
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Obtiene el total de la venta.
     *
     * Este método devuelve el total de la venta, que incluye el subtotal y los
     * impuestos. Se usa para obtener el valor almacenado en el atributo
     * `total`.
     *
     * @return El total de la venta como un valor de tipo `String`.
     */
    public String getTotal() {
        return total;
    }

    /**
     * Establece el total de la venta.
     *
     * Este método permite establecer el total de la venta, que incluye el
     * subtotal y los impuestos. El valor proporcionado se guarda en el atributo
     * `total`.
     *
     * @param total El total de la venta como un valor de tipo `String`.
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Obtiene el subtotal de la venta.
     *
     * Este método devuelve el subtotal de la venta, que es el monto antes de
     * agregar impuestos. Se usa para obtener el valor almacenado en el atributo
     * `subtotal`.
     *
     * @return El subtotal de la venta como un valor de tipo `String`.
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * Establece el subtotal de la venta.
     *
     * Este método permite establecer el subtotal de la venta, que es el monto
     * antes de agregar impuestos. El valor proporcionado se guarda en el
     * atributo `subtotal`.
     *
     * @param subtotal El subtotal de la venta como un valor de tipo `String`.
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Obtiene el monto del IVA (Impuesto al Valor Agregado) de la venta.
     *
     * Este método devuelve el monto del IVA de la venta. Se usa para obtener el
     * valor almacenado en el atributo `iva`.
     *
     * @return El monto del IVA de la venta como un valor de tipo `String`.
     */
    public String getIva() {
        return iva;
    }

    /**
     * Establece el monto del IVA (Impuesto al Valor Agregado) de la venta.
     *
     * Este método permite establecer el monto del IVA de la venta. El valor
     * proporcionado se guarda en el atributo `iva`.
     *
     * @param iva El monto del IVA de la venta como un valor de tipo `String`.
     */
    public void setIva(String iva) {
        this.iva = iva;
    }

    /**
     * Obtiene la lista de detalles de la venta.
     *
     * Este método devuelve una lista de objetos `DTO_DetallesVentaReporte`, que
     * representan los detalles de cada producto o servicio vendido en la venta.
     *
     * @return La lista de detalles de la venta como un valor de tipo
     * `List<DTO_DetallesVentaReporte>`.
     */
    public List<DTO_DetallesVentaReporte> getDetallesVenta() {
        return detallesVenta;
    }

    /**
     * Establece la lista de detalles de la venta.
     *
     * Este método permite establecer la lista de detalles de la venta. Cada
     * detalle representa un producto o servicio vendido, con sus respectivas
     * características.
     *
     * @param detallesVenta La lista de detalles de la venta como un valor de
     * tipo `List<DTO_DetallesVentaReporte>`.
     */
    public void setDetallesVenta(List<DTO_DetallesVentaReporte> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

}
