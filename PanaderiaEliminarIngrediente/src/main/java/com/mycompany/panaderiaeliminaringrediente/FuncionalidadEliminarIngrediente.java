/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaeliminaringrediente;

import DTO.DTO_Ingrediente;
import com.mycompany.panaderianegocio.IInventarioIngredientesBO;
import com.mycompany.panaderianegocio.InventarioIngredientesBO;

/**
 *
 * @author joseq
 */
public class FuncionalidadEliminarIngrediente implements IFuncionalidadEliminarIngrediente {
    private IInventarioIngredientesBO ingredienteBO;

    public FuncionalidadEliminarIngrediente() {
        this.ingredienteBO = new InventarioIngredientesBO();
    }

    @Override
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente) {
        return ingredienteBO.eliminarIngrediente(ingrediente);
    }
}
