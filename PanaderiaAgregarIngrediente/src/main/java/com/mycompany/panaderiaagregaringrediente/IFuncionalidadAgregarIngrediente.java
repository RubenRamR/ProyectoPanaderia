/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaagregaringrediente;

import DTO.DTO_Ingrediente;

/**
 * Interfaz del subsistema Agregar Ingrediente
 * @author joseq
 */
public interface IFuncionalidadAgregarIngrediente {
    
        /**
         * Agrega un ingrediente
         * @param ingrediente DTO del ingrediente
         * @return El ingrediente agregado
         * @throws Exception Por si ocurre un error
         */
        public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente) throws Exception;
}
