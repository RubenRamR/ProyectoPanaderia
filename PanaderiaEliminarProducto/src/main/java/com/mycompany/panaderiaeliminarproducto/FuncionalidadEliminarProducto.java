/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaeliminarproducto;

import DTO.DTO_Producto;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.ProductosBO;

/**
 *
 * @author joseq
 */
public class FuncionalidadEliminarProducto implements IFuncionalidadEliminarProducto {
    
     private IProductosBO productoBO;

    public FuncionalidadEliminarProducto() {
        this.productoBO = new ProductosBO();
    }

    @Override
    public boolean eliminarProducto(DTO_Producto producto) {
        return productoBO.eliminarProducto(producto);
    }
    
}
