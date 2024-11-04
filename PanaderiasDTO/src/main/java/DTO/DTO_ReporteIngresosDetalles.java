/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


public class DTO_ReporteIngresosDetalles {
    private String fechaVenta;
    private String cantidadVentas;
    private String gananciasDia;
    private String fechaCompra;
    private String nombreCliente;
    private String totalDeCompra;

    public DTO_ReporteIngresosDetalles() {
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(String cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public String getGananciasDia() {
        return gananciasDia;
    }

    public void setGananciasDia(String gananciasDia) {
        this.gananciasDia = gananciasDia;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTotalDeCompra() {
        return totalDeCompra;
    }

    public void setTotalDeCompra(String totalDeCompra) {
        this.totalDeCompra = totalDeCompra;
    }
    
}
