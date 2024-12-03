/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaagregaringrediente;

import DTO.DTO_Ingrediente;
import com.mycompany.panaderianegocio.IInventarioIngredientesBO;
import com.mycompany.panaderianegocio.InventarioIngredientesBO;

/**
 * Clase del subsistema que agrega un ingrediente
 * @author joseq
 */
public class FuncionalidadAgregarIngrediente implements IFuncionalidadAgregarIngrediente{
    /**
     * Objeto de negocio inventario Ingredientes
     */
    private IInventarioIngredientesBO inventarioIngredientesBO;

    /**
     * Constructor que inicializa el InventarioIngredienteBO
     */
    public FuncionalidadAgregarIngrediente() {
        inventarioIngredientesBO = new InventarioIngredientesBO();
    }

    /**
         * Agrega un ingrediente
         * @param ingrediente DTO del ingrediente
         * @return El ingrediente agregado
         * @throws Exception Por si ocurre un error
         */
    @Override
    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente) throws Exception {

        if (inventarioIngredientesBO.validarExistencia(ingrediente) != null) {
            throw new Exception("El ingrediente ya se encuentra agregado");
        }
        DTO_Ingrediente ingredienteNuevo = inventarioIngredientesBO.agregarIngrediente(ingrediente);
        return ingredienteNuevo;
    }
    
}
