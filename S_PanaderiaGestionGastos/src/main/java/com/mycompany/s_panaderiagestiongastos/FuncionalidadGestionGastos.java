/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.s_panaderiagestiongastos;

import com.mycompany.panaderianegocio.IIngredienteBO;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.IngredienteBO;
import com.mycompany.panaderianegocio.VentasBO;

/**
 * Clase subsistema que permite gestionar gastos
 * @author rramirez
 */
public class FuncionalidadGestionGastos implements IFuncionalidadGestionGastos {

    /**
     * Objeto de negocio de los ingredientes
     */
    IIngredienteBO ingredienteBO;
    /**
     * Objetos de negocio de las ventas
     */
    IVentasBO ventaBO;

    /**
     * Constructor que inicializa el ingredienteBO y ventaBO
     */
    public FuncionalidadGestionGastos() {
        ingredienteBO = new IngredienteBO();
        ventaBO = new VentasBO();
    }

    /**
     * Calcula el monto total de las ventas
     * @return monto total en float
     */
    @Override
    public Float calcularMontoTotal() {
        return ingredienteBO.calcularMontoTotal();
    }

    /**
     * Calcula los ingresos totales de las ventas
     * @return ingresos totales en float
     */
    @Override
    public Float calcularIngresosTotales() {
        return ventaBO.calcularIngresosTotales();
    }

}
