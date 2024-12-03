/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


public class DTO_ReporteVentasFormato {
    String fechaCompra;
    String fechaEntrega;
    String estado;
    String total;

    /**
     * Constructor por defecto de DTO_ReporteVentasFormato.
     */
    public DTO_ReporteVentasFormato() {
        // Constructor por defecto
    }

    /**
     * Obtiene la fecha de compra de la transacción.
     *
     * @return la fecha de compra como un String
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Establece la fecha de compra de la transacción.
     *
     * @param fechaCompra la fecha de compra a establecer
     */
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * Obtiene la fecha de entrega de la transacción.
     *
     * @return la fecha de entrega como un String
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha de entrega de la transacción.
     *
     * @param fechaEntrega la fecha de entrega a establecer
     */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene el estado de la transacción.
     *
     * @return el estado de la transacción como un String
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la transacción.
     *
     * @param estado el estado a establecer
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el monto total de la venta.
     *
     * @return el monto total como un String
     */
    public String getTotal() {
        return total;
    }

    /**
     * Establece el monto total de la venta.
     *
     * @param total el monto total a establecer
     */
    public void setTotal(String total) {
        this.total = total;
    }
   
   
}
