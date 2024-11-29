/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.s_panaderiagestiongastos;

import com.mycompany.panaderianegocio.IIngredienteBO;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.IngredienteBO;
import com.mycompany.panaderianegocio.VentasBO;

/**
 *
 * @author rramirez
 */
public class FuncionalidadGestionGastos implements IFuncionalidadGestionGastos {

    IIngredienteBO ingredienteBO;
    IVentasBO ventaBO;

    public FuncionalidadGestionGastos() {
        ingredienteBO = new IngredienteBO();
        ventaBO = new VentasBO();
    }

    @Override
    public Float calcularMontoTotal() {
        return ingredienteBO.calcularMontoTotal();
    }

    @Override
    public Float calcularIngresosTotales() {
        return ventaBO.calcularIngresosTotales();
    }

}
