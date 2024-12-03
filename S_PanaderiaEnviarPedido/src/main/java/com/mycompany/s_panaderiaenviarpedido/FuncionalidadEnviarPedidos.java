/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_panaderiaenviarpedido;

import DTO.DTO_Venta;
import Excepciones.ConsultarVentasPorFechaException;
import com.mycompany.panaderiadominioentidades.Venta;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase subsistema que permite enviar pedidos
 * @author NaderCroft
 */
public class FuncionalidadEnviarPedidos implements IFuncionalidadEnviarPedido{

    /**
     * Objeto negocio de las ventas
     */
    private IVentasBO ventasBO;

    /**
     * Constructor que inicializa el ventasBO
     */
    public FuncionalidadEnviarPedidos() {
        this.ventasBO = new VentasBO();
    }

     /**
     * Regresa la lista de las ventas que estan dentro del rango de las fechas
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @return Lista de ventas que coincide con los filtros
     */
    @Override
        public List<DTO_Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin){
        return ventasBO.consultarVentasPorRangoFechasEntrega(fechaInicio, fechaFin);
    }

    /**
     * Permite actualizar una ventas
     * @param venta DTO de la venta
     * @return La venta actualizada
     */
    @Override
    public DTO_Venta actualizarVenta(DTO_Venta venta) {
        return ventasBO.actualizarVenta(venta);
    }

    /**
     * Encuentra y regresa la venta que coincida con el id
     * @param idVenta id unico de la venta
     * @return dto de la venta
     */
    @Override
    public DTO_Venta encontrarVentaPorId(String idVenta) {
        return ventasBO.encontrarVentaPorId(idVenta);
    }
    
}
