/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaconsultaringredientes;

import DTO.DTO_Ingrediente;
import DTO.DTO_Producto;
import com.mycompany.panaderianegocio.IIngredienteBO;
import com.mycompany.panaderianegocio.IInventarioIngredientesBO;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.IngredienteBO;
import com.mycompany.panaderianegocio.InventarioIngredientesBO;
import com.mycompany.panaderianegocio.ProductosBO;
import java.util.List;

/**
 * Clase Subsistema que permite interactuar con los ingredientes de la base de datos
 * @author joseq
 */
public class FuncionalidadConsultarIngredientes implements IFuncionalidadConsultarIngredientes{
    /**
     * Interfaz del inventarioIngredientes
     */
     private IInventarioIngredientesBO inventarioIngredientesBO;
     /**
      * Interfaz del productosBO
      */
    private IProductosBO productoBO;

    /**
     * Constructor que inicializa el inventarioIngredientesBO y productosBO
     */
    public FuncionalidadConsultarIngredientes() {
        inventarioIngredientesBO = new InventarioIngredientesBO();
        productoBO = new ProductosBO();
    }

    /**
     * Obtiene la lista de los ingredientes
     * @return Lista de los ingredientes en la base de datos
     */
    @Override
    public List<DTO_Ingrediente> consultarIngredientes() {
        return inventarioIngredientesBO.consultarIngredientes();
    }

    /**
     * Consulta los ingredientes que hacen falta
     * @param producto DTO del producto
     * @return los ingredientes que no tiene el producto dado
     */
    @Override
    public List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto) {
        return this.productoBO.consultarIngredientesFaltantes(producto);
    }

    /**
     * Obtiene la lista de los ingredientes del dto
     * @param ingrediente DTO del ingrediente
     * @return Lista de los ingredientes del dto
     */
    @Override
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente) {
        List<DTO_Ingrediente> ingredienteNuevo = inventarioIngredientesBO.consultarIngrediente(ingrediente);
        return ingredienteNuevo;
    }

    /**
     * Obtiene el dto del ingrediente por el nombre 
     * @param ingrediente DTO del producto
     * @return El dto del ingrediente
     */
    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente) {
        return inventarioIngredientesBO.consultarIngredientePorNombre(ingrediente);
    }
}
