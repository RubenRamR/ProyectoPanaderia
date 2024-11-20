/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaactualizaringrediente;

import DTO.DTO_Ingrediente;
import com.mycompany.panaderianegocio.IInventarioIngredientesBO;
import com.mycompany.panaderianegocio.InventarioIngredientesBO;

/**
 *
 * @author joseq
 */
public class FuncionalidadActualizarIngrediente implements IFuncionalidadActualizarIngrediente{
    
     private IInventarioIngredientesBO inventarioBO;

    public FuncionalidadActualizarIngrediente() {
        this.inventarioBO = new InventarioIngredientesBO();
    }

    @Override
    public DTO_Ingrediente actualizarIngrediente(DTO_Ingrediente ingrediente) throws Exception {
        if (ingrediente.getCantidad() < 0) {
            throw new Exception("No se pudó actualizar");
        }
        return inventarioBO.actualizarIngrediente(ingrediente);

    }
    
}
