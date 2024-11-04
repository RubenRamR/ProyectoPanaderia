package com.mycompany.panaderiadominiosMapeo;

import java.util.Date;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 * Clase que representa una factura mapeada para persistencia. Contiene
 * atributos como fecha de emisión, fecha de vencimiento, venta asociada y
 * contenido de la factura.
 *
 * 
 */
public class FacturaMapeo {

    private ObjectId id;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private VentaMapeo venta;
    private Binary contenido;

    /**
     * Constructor de la clase FacturaMapeo.
     */
    public FacturaMapeo() {
    }

    /**
     * Constructor de la clase FacturaMapeo.
     *
     * @param fechaEmision Fecha de emisión de la factura.
     * @param fechaVencimiento Fecha de vencimiento de la factura.
     * @param venta Venta asociada a la factura.
     * @param ventaId Identificador de la venta asociada.
     */
    public FacturaMapeo(Date fechaEmision, Date fechaVencimiento, VentaMapeo venta, ObjectId ventaId) {
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
    }

    /**
     * Constructor de la clase FacturaMapeo.
     *
     * @param id Identificador de la factura.
     * @param fechaEmision Fecha de emisión de la factura.
     * @param fechaVencimiento Fecha de vencimiento de la factura.
     * @param venta Venta asociada a la factura.
     * @param ventaId Identificador de la venta asociada.
     */
    public FacturaMapeo(ObjectId id, Date fechaEmision, Date fechaVencimiento, VentaMapeo venta, ObjectId ventaId) {
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
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador de la factura.
     *
     * @param id Identificador de la factura.
     */
    public void setId(ObjectId id) {
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
    public VentaMapeo getVenta() {
        return venta;
    }

    /**
     * Establece la venta asociada a la factura.
     *
     * @param venta Venta asociada a la factura.
     */
    public void setVenta(VentaMapeo venta) {
        this.venta = venta;
    }

    /**
     * Obtiene el contenido de la factura.
     *
     * @return Contenido de la factura.
     */
    public Binary getContenido() {
        return contenido;
    }

    /**
     * Establece el contenido de la factura.
     *
     * @param contenido Contenido de la factura.
     */
    public void setContenido(Binary contenido) {
        this.contenido = contenido;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto FacturaMapeo.
     *
     * @return Representación en cadena de texto del objeto FacturaMapeo.
     */
    @Override
    public String toString() {
        return "FacturaMapeo{" + "id=" + id + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + ", venta=" + venta +  '}';
    }

}
