/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DTO.DTO_Cliente;
import DTO.DTO_DetalleVenta;
import DTO.DTO_Direccion;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import Presentación.Presentacion_DlgAgregarDireccion;
import Presentación.Presentacion_DlgAgregarPan;
import Presentación.Presentacion_DlgCobrarVenta;
import Presentación.Presentacion_DlgConfirmacionPago;
import Presentación.Presentacion_DlgDatosCliente;
import Presentación.Presentacion_DlgDirecciones;
import Presentación.Presentacion_DlgListaClientes;
import Presentación.Presentacion_MenuPrincipal;
import Presentación.Presentacion_ProductosVenta;
import javax.swing.JFrame;

/**
 *
 * @author joseq
 */
public class ControlAgregarVenta {

    private static ControlAgregarVenta instance;
    private DTO_Producto producto;
    private DTO_Venta venta;
    private DTO_DetalleVenta detalleVenta;
    private boolean nuevaDireccion;
    private String ventanaAnterior;

    public ControlAgregarVenta() {
        this.producto = producto;
        this.venta = venta;
        this.nuevaDireccion = false;
    }

    public static ControlAgregarVenta getInstance() {
        if (instance == null) {
            instance = new ControlAgregarVenta();
        }
        return instance;
    }
    //Agregar esos DLG

    public void mostrarAgregarPan() {
        Presentacion_DlgAgregarPan dlgpan = new Presentacion_DlgAgregarPan(null,true);
        
    }

    public void mostrarAgregarDireccion() {
        Presentacion_DlgAgregarDireccion dir = new Presentacion_DlgAgregarDireccion(null, true);
    }

    public void mostrarDatosClientes() {
        Presentacion_DlgDatosCliente dlgcliente = new Presentacion_DlgDatosCliente(null, true);
    }

    public void mostrarListaClientes() {
        Presentacion_DlgListaClientes dlgListaClientes = new Presentacion_DlgListaClientes(null, true);
    }

    public void mostrarListaDirecciones() {
        Presentacion_DlgDirecciones dlgdireccion = new Presentacion_DlgDirecciones(null, true);
    }

    public void mostrarProductosVenta() {
        Presentacion_ProductosVenta p = new Presentacion_ProductosVenta();
        p.setVisible(true);
    }

    public void mostrarMenu() {
        Presentacion_MenuPrincipal m = new Presentacion_MenuPrincipal();
        m.setVisible(true);
    }

    public void mostrarCobrarVenta() {
        Presentacion_DlgCobrarVenta dlgcobrarventa = new Presentacion_DlgCobrarVenta(null, true);
    }

    public void mostrarConfirmacionPago() {
        Presentacion_DlgConfirmacionPago dlgPagoEfectivo = new Presentacion_DlgConfirmacionPago(null, true);
    }

    public DTO_Producto getProducto() {
        return producto;
    }

    public void setProducto(DTO_Producto producto) {
        this.producto = producto;
    }

    public DTO_Venta getVenta() {

        return venta;
    }

    public void setVenta(DTO_Venta venta) {
        this.venta = venta;
    }

    public boolean isNuevaDireccion() {
        return nuevaDireccion;
    }

    public void setNuevaDireccion(boolean nuevaDireccion) {
        this.nuevaDireccion = nuevaDireccion;
    }

    public String getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(String ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    public DTO_DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DTO_DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    
}
