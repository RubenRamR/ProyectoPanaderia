/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaventa;

import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import DTO.DTO_Venta;


public class FuncionalidadesVenta implements IFuncionalidadesVenta {

    IVentasBO ventas;

    public FuncionalidadesVenta() {
        this.ventas = new VentasBO();
    }

    @Override
    public void agregarVenta(DTO_Venta venta) {
        ventas.agregarVenta(venta);
    }

}
