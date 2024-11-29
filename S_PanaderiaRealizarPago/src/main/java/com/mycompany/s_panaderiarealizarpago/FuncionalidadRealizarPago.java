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
 *
 * @author adane
 */
public class FuncionalidadRealizarPago implements IFuncionalidadRealizarPago{
    
    private IVentasBO ventabo;

    public FuncionalidadRealizarPago() {
        this.ventabo = new VentasBO();
    }
    
    

    @Override
    public List<DTO_Venta> consultarVentasPendiente(int pagina, int cantidad) {
        return ventabo.consultarVentasPendiente(pagina,cantidad);
        
    }

    @Override
    public void actualizarVenta(DTO_Venta venta) {
        ventabo.actualizarVenta(venta);
        
    }

    @Override
    public DTO_Venta encontrarVentaPorId(String idVenta) {
        return ventabo.encontrarVentaPorId(idVenta);
    }
    
}
