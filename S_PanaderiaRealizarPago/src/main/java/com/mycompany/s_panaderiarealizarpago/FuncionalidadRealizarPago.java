/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_panaderiarealizarpago;

import DTO.DTO_Venta;

import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import java.util.List;

/**
 * Clase Subsistema realizar pago
 *
 * @author adane
 */
public class FuncionalidadRealizarPago implements IFuncionalidadRealizarPago {

    /**
     * Objetos de negocio de las ventas
     */
    private IVentasBO ventabo;

    /**
     * Constructor que inicializa la ventasBO
     */
    public FuncionalidadRealizarPago() {
        this.ventabo = new VentasBO();
    }

    /**
     * Lista de ventas con paginacion
     *
     * @param pagina pagina
     * @param cantidad cantidad
     * @return Lista de las ventas
     */
    @Override
    public List<DTO_Venta> consultarVentasPendiente(int pagina, int cantidad) {
        return ventabo.consultarVentasPendiente(pagina, cantidad);

    }

    /**
     * Actualiza un venta
     *
     * @param venta DTO de la venta
     */
    @Override
    public void actualizarVenta(DTO_Venta venta) {
        ventabo.actualizarVenta(venta);

    }

    /**
     * Regresa la venta que coincida con el id
     *
     * @param idVenta id unico
     * @return DTO de la venta
     */
    @Override
    public DTO_Venta encontrarVentaPorId(String idVenta) {
        return ventabo.encontrarVentaPorId(idVenta);
    }

}
