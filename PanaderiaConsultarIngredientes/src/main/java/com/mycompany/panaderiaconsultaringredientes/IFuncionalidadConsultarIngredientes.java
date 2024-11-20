/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaconsultaringredientes;

import DTO.DTO_Ingrediente;
import DTO.DTO_Producto;
import java.util.List;

/**
 *
 * @author joseq
 */
public interface IFuncionalidadConsultarIngredientes {
  List<DTO_Ingrediente> consultarIngredientes();

    List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto);

    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente);

    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente);

   
}
