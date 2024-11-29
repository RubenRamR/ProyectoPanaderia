/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_panaderiarealizarpago;

import DTO.DTO_Venta;
import com.mycompany.panaderianegocio.IVentasBO;
import java.util.List;

/**
 *
 * @author adane
 */
public class FuncionalidadRealizarPago implements IFuncionalidadRealizarPago{
    
    private IVentasBO ventabo;

    public FuncionalidadRealizarPago(IVentasBO ventabo) {
        this.ventabo = ventabo;
    }
    
    

    @Override
    public List<DTO_Venta> consultarVentasPendiente() {
        return ventabo.consultarVentasPendiente();
        
    }

    @Override
    public void actualizarVenta(DTO_Venta venta) {
        ventabo.actualizarVenta(venta);
        
    }
    
}
