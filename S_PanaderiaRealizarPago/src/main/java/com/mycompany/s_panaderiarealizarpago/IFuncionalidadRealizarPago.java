/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiarealizarpago;

import DTO.DTO_Venta;
import java.util.List;

/**
 *
 * @author adane
 */
public interface IFuncionalidadRealizarPago {
    
    public List<DTO_Venta> consultarVentasPendiente();
    
    public void actualizarVenta(DTO_Venta venta);
    
}
