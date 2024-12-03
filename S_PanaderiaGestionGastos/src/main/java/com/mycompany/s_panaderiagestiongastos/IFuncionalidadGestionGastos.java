/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiagestiongastos;

/**
 * Interfaz del subsistema que permite gestionar gastos
 * @author rramirez
 */
public interface IFuncionalidadGestionGastos {

    /**
     * Calcula el monto total de las ventas
     * @return monto total en float
     */
    public Float calcularMontoTotal();
    /**
     * Calcula los ingresos totales de las ventas
     * @return ingresos totales en float
     */
    public Float calcularIngresosTotales();
}
