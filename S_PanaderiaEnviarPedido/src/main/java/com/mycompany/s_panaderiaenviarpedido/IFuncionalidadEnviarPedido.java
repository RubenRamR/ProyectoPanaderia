/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiaenviarpedido;

import DTO.DTO_Venta;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.Date;
import java.util.List;

/**
 * Interfaz del subsistema Enviar pedido
 * @author NaderCroft
 */
public interface IFuncionalidadEnviarPedido {
    /**
     * Regresa la lista de las ventas que estan dentro del rango de las fechas
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @return Lista de ventas que coincide con los filtros
     */
    public List<DTO_Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin);
    /**
     * Permite actualizar una ventas
     * @param venta DTO de la venta
     * @return La venta actualizada
     */
    public DTO_Venta actualizarVenta(DTO_Venta venta);
    /**
     * Encuentra y regresa la venta que coincida con el id
     * @param idVenta id unico de la venta
     * @return dto de la venta
     */
    public DTO_Venta encontrarVentaPorId(String idVenta);
    
}
