/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;
import java.util.List;


public class DTO_Venta {
    private String ID;
    private float montoTotal;
    private Date fechaEntrega;
    private Date fechaRegistro;
    private String Estado;
    private List<DTO_DetalleVenta> detallesVenta;  
    private DTO_Direccion direccionEntrega;
    private DTO_Cliente cliente;

    public DTO_Venta() {
    }

    public DTO_Venta(float montoTotal, Date fechaEntrega, Date fechaRegistro, String Estado, List<DTO_DetalleVenta> detallesVenta, DTO_Direccion direccionEntrega, DTO_Cliente cliente) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.Estado = Estado;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }

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


   
 
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public DTO_Cliente getCliente() {
        return cliente;
    }

    public void setCliente(DTO_Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

  


    public List<DTO_DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DTO_DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public DTO_Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(DTO_Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "DTO_Venta{" + "ID=" + ID + ", montoTotal=" + montoTotal + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", Estado=" + Estado + ", detallesVenta=" + detallesVenta + ", direccionEntrega=" + direccionEntrega + ", cliente=" + cliente + '}';
    }

    

    
}
