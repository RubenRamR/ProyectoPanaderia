/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_panaderiahistorialventas;

import DTO.DTO_Venta;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adane
 */
public class FuncionalidadHistorialVentas implements IFuncionalidadHistorialVentas{
    
    private IVentasBO ventabo;

    public FuncionalidadHistorialVentas() {
        this.ventabo = new VentasBO();
    }
    
    

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        return this.ventabo.consultarVentasPorRangoFecha(fechaInicio, fechaFin);
    }
    
}
