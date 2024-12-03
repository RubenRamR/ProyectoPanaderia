/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiarealizarpago;

import DTO.DTO_Venta;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.List;

/**
 * Interfaz del subsistema realizarPago
 * @author adane
 */
public interface IFuncionalidadRealizarPago {
    /**
     * Lista de ventas con paginacion
     * @param pagina pagina
     * @param cantidad cantidad
     * @return Lista de las ventas
     */
    public List<DTO_Venta> consultarVentasPendiente(int pagina, int cantidad);
    /**
     * Actualiza un venta
     * @param venta DTO de la venta
     */
    public void actualizarVenta(DTO_Venta venta);
    /**
     * Regresa la venta que coincida con el id
     * @param idVenta id unico
     * @return DTO de la venta
     */
    public DTO_Venta encontrarVentaPorId(String idVenta);
    
}
