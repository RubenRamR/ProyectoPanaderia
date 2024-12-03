/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaventa;

import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import DTO.DTO_Venta;

/**
 * Clase subsistema que permite agregar una venta
 * @author NaderCroft
 */
public class FuncionalidadesVenta implements IFuncionalidadesVenta {

    /**
     * Objetos de negocio de ventas
     */
    IVentasBO ventas;

    /**
     * Constructor que inicializa la ventaBO
     */
    public FuncionalidadesVenta() {
        this.ventas = new VentasBO();
    }

    /**
     * Agrega una venta
     * @param venta DTO de la venta
     */
    @Override
    public void agregarVenta(DTO_Venta venta) {
        ventas.agregarVenta(venta);
    }

}