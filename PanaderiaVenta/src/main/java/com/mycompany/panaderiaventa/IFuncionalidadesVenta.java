/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaventa;

import DTO.DTO_Venta;

/**
 * Interfaz del subsistema Venta
 * 
 */
public interface IFuncionalidadesVenta {
    /**
     * Agrega una venta
     * @param venta DTO de la venta
     */
    public void agregarVenta(DTO_Venta venta);
}
