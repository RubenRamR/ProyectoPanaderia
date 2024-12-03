/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaeliminaringrediente;

import DTO.DTO_Ingrediente;

/**
 * Interfaz del subsistema que permite eliminar un ingrediente
 * @author joseq
 */
public interface IFuncionalidadEliminarIngrediente {
    /**
     * Elimina un ingrediente
     * @param ingrediente DTO del ingrediente
     * @return El ingrediente borrado
     */
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente);
    
}
