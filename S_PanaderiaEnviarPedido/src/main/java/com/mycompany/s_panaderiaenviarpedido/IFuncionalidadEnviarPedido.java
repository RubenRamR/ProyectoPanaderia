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
 *
 * @author NaderCroft
 */
public interface IFuncionalidadEnviarPedido {
    public List<DTO_Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin);
    public DTO_Venta actualizarVenta(DTO_Venta venta);
    public DTO_Venta encontrarVentaPorId(String idVenta);
    
}
