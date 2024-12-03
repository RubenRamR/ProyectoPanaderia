/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaeliminaringrediente;

import DTO.DTO_Ingrediente;
import com.mycompany.panaderianegocio.IInventarioIngredientesBO;
import com.mycompany.panaderianegocio.InventarioIngredientesBO;

/**
 * Clase Subsistema que permite eliminar un ingrediente
 * @author joseq
 */
public class FuncionalidadEliminarIngrediente implements IFuncionalidadEliminarIngrediente {
    /**
     * Objeto negocio del ingrediente
     */
    private IInventarioIngredientesBO ingredienteBO;

    /**
     * Constructor que inicializa el ingredienteBO
     */
    public FuncionalidadEliminarIngrediente() {
        this.ingredienteBO = new InventarioIngredientesBO();
    }

    /**
     * Elimina un ingrediente
     * @param ingrediente DTO del ingrediente
     * @return El ingrediente borrado
     */
    @Override
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente) {
        return ingredienteBO.eliminarIngrediente(ingrediente);
    }
}
