/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaconsultaringredientes;

import DTO.DTO_Ingrediente;
import DTO.DTO_Producto;
import java.util.List;

/**
 * Interfaz del subsistema que permite interactuar con los ingredientes
 * @author joseq
 */
public interface IFuncionalidadConsultarIngredientes {

    /**
     * Obtiene la lista de los ingredientes
     * @return Lista de los ingredientes en la base de datos
     */
    List<DTO_Ingrediente> consultarIngredientes();

    /**
     * Consulta los ingredientes que hacen falta
     * @param producto DTO del producto
     * @return los ingredientes que no tiene el producto dado
     */
    List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto);

    /**
     * Obtiene la lista de los ingredientes del dto
     * @param ingrediente DTO del ingrediente
     * @return Lista de los ingredientes del dto
     */
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Obtiene el dto del ingrediente por el nombre 
     * @param ingrediente DTO del producto
     * @return El dto del ingrediente
     */
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente);

}
