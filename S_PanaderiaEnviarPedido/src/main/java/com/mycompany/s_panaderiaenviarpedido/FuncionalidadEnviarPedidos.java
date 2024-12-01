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
 *
 * @author NaderCroft
 */
public class FuncionalidadEnviarPedidos implements IFuncionalidadEnviarPedido{

    private IVentasBO ventasBO;

    public FuncionalidadEnviarPedidos() {
        this.ventasBO = new VentasBO();
    }

    @Override
        public List<DTO_Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin){
        return ventasBO.consultarVentasPorRangoFechasEntrega(fechaInicio, fechaFin);
    }

    @Override
    public DTO_Venta actualizarVenta(DTO_Venta venta) {
        return ventasBO.actualizarVenta(venta);
    }

    @Override
    public DTO_Venta encontrarVentaPorId(String idVenta) {
        return ventasBO.encontrarVentaPorId(idVenta);
    }
    
}
