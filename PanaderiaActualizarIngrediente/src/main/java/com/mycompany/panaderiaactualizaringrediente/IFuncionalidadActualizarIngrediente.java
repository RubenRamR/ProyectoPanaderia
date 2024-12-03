/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaactualizaringrediente;

import DTO.DTO_Ingrediente;

/**
 * Interfaz del subsistema FuncionalidadActualizarIngrediente
 * @author joseq
 */
public interface IFuncionalidadActualizarIngrediente {
    
    /**
     * Actualiza un ingrediente
     * @param ingrediente DTO del ingrediente
     * @return El ingrediente actualizado
     * @throws Exception Por si ocurre un error
     */
    public DTO_Ingrediente actualizarIngrediente(DTO_Ingrediente ingrediente) throws Exception;
    
}
