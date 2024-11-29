/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiarealizarpago;

import DTO.DTO_Venta;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.List;

/**
 *
 * @author adane
 */
public interface IFuncionalidadRealizarPago {
    
    public List<DTO_Venta> consultarVentasPendiente(int pagina, int cantidad);
    
    public void actualizarVenta(DTO_Venta venta);
    
    public DTO_Venta encontrarVentaPorId(String idVenta);
    
}
