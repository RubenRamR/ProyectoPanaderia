/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;


public class DTO_FacturaFormato {
    
    String nombreCliente;
    String rfcCliente;
    String direccionCliente;
    String fechaVencimiento;
    String fechaEmision;
    String total;
    String subtotal;
    String iva;
    List <DTO_DetallesVentaReporte> detallesVenta;

    public DTO_FacturaFormato() {
    }

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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRfcCliente() {
        return rfcCliente;
    }

    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public List<DTO_DetallesVentaReporte> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DTO_DetallesVentaReporte> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    
    
}
