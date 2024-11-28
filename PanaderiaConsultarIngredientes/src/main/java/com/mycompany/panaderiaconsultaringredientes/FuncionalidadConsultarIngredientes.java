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
 *
 * @author joseq
 */
public class FuncionalidadConsultarIngredientes implements IFuncionalidadConsultarIngredientes{
    
     private IInventarioIngredientesBO inventarioIngredientesBO;
    private IProductosBO productoBO;

    public FuncionalidadConsultarIngredientes() {
        inventarioIngredientesBO = new InventarioIngredientesBO();
        productoBO = new ProductosBO();
    }

    @Override
    public List<DTO_Ingrediente> consultarIngredientes() {
        return inventarioIngredientesBO.consultarIngredientes();
    }

    @Override
    public List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto) {
        return this.productoBO.consultarIngredientesFaltantes(producto);
    }

    @Override
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente) {
        List<DTO_Ingrediente> ingredienteNuevo = inventarioIngredientesBO.consultarIngrediente(ingrediente);
        return ingredienteNuevo;
    }

    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente) {
        return inventarioIngredientesBO.consultarIngredientePorNombre(ingrediente);
    }
}
