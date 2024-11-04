/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;


public class DTO_ReciboFormato {
   String nombre;
   String fechaCompra;
   String total;
   List<DTO_DetallesVentaReporte> detallesVenta;
    public DTO_ReciboFormato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public List<DTO_DetallesVentaReporte> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DTO_DetallesVentaReporte> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
   
}
