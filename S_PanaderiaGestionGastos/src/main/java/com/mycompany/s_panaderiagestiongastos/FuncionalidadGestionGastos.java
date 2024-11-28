/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.s_panaderiagestiongastos;

import com.mycompany.panaderianegocio.IIngredienteBO;
import com.mycompany.panaderianegocio.IngredienteBO;

/**
 *
 * @author rramirez
 */
public class FuncionalidadGestionGastos implements IFuncionalidadGestionGastos {

    IIngredienteBO ingredienteBO;

    public FuncionalidadGestionGastos() {
        ingredienteBO = new IngredienteBO();
    }

    @Override
    public Float calcularMontoTotal() {
        return ingredienteBO.calcularMontoTotal();
    }

}
