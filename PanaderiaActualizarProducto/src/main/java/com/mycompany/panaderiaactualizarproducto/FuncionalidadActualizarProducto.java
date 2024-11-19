/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaactualizarproducto;

import DTO.DTO_Producto;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.ProductosBO;

/**
 *
 * @author joseq
 */
public class FuncionalidadActualizarProducto implements IFuncionalidadActualizarProducto{
    
    private IProductosBO productosBO;

    public FuncionalidadActualizarProducto() {
        productosBO = new ProductosBO();
    }

    @Override
    public DTO_Producto actualizarProducto(DTO_Producto producto) {
        return productosBO.actualizarProducto(producto);
    }
    
}
