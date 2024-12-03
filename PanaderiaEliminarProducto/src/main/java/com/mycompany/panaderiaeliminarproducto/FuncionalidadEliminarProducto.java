/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaeliminarproducto;

import DTO.DTO_Producto;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.ProductosBO;

/**
 * Clase subsistema que permite eliminar un producto
 * @author joseq
 */
public class FuncionalidadEliminarProducto implements IFuncionalidadEliminarProducto {
    /**
     * Objeto negocio del producto
     */
     private IProductosBO productoBO;

     /**
      * Constructor que inicializa el productoBO
      */
    public FuncionalidadEliminarProducto() {
        this.productoBO = new ProductosBO();
    }

    /**
     * Elimina un producto
     * @param producto DTO del producto
     * @return El producto eliminado
     */
    @Override
    public boolean eliminarProducto(DTO_Producto producto) {
        return productoBO.eliminarProducto(producto);
    }
    
}
