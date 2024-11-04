/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;


public class DTO_Factura {

    /**
     * Clase que representa una factura emitida por la pastelería.
     */
    /**
     * Identificador único de la factura.
     */
    private String id;

    /**
     * Fecha de emisión de la factura.
     */
    private Date fechaEmision;

    /**
     * Fecha de vencimiento de la factura.
     */
    private Date fechaVencimiento;

    /**
     * Venta asociada a la factura.
     */
    private DTO_Venta venta;

    /**
     * Donde se guardará la factura
     */
    private byte[] bytesContenido;

    /**
     * Constructor por defecto de la clase Factura.
     */
    public DTO_Factura() {
    }

    /**
     * Constructor de la clase Factura.
     *
     * @param fechaEmision Fecha de emisión de la factura.
     * @param fechaVencimiento Fecha de vencimiento de la factura.
     * @param venta Venta asociada a la factura.
     */
    public DTO_Factura(Date fechaEmision, Date fechaVencimiento, DTO_Venta venta) {
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
    }

    /**
     * Constructor de la clase Factura.
     *
     * @param id Identificador único de la factura.
     * @param fechaEmision Fecha de emisión de la factura.
     * @param fechaVencimiento Fecha de vencimiento de la factura.
     * @param venta Venta asociada a la factura.
     */
    public DTO_Factura(String id, Date fechaEmision, Date fechaVencimiento, DTO_Venta venta) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
    }

    /**
     * Obtiene el identificador de la factura.
     *
     * @return Identificador de la factura.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador de la factura.
     *
     * @param id Identificador de la factura.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha de emisión de la factura.
     *
     * @return Fecha de emisión de la factura.
     */
    public Date getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece la fecha de emisión de la factura.
     *
     * @param fechaEmision Fecha de emisión de la factura.
     */
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Obtiene la fecha de vencimiento de la factura.
     *
     * @return Fecha de vencimiento de la factura.
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la factura.
     *
     * @param fechaVencimiento Fecha de vencimiento de la factura.
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene la venta asociada a la factura.
     *
     * @return Venta asociada a la factura.
     */
    public DTO_Venta getVenta() {
        return venta;
    }

    /**
     * Establece la venta asociada a la factura.
     *
     * @param venta Venta asociada a la factura.
     */
    public void setVenta(DTO_Venta venta) {
        this.venta = venta;
    }

    /**
     * Obtiene el contenido de la factura en bytes.
     *
     * @return Contenido de la factura en bytes.
     */
    public byte[] getBytesContenido() {
        return bytesContenido;
    }

    /**
     * Establece el contenido de de la factura en bytes.
     *
     * @param bytesContenido Contenido de la factura en bytes.
     */
    public void setBytesContenido(byte[] bytesContenido) {
        this.bytesContenido = bytesContenido;
    }

    /**
     * Devuelve una representación en cadena del objeto Factura.
     *
     * @return Representación en cadena del objeto Factura.
     */
    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + ", venta=" + venta + '}';
    }

}
