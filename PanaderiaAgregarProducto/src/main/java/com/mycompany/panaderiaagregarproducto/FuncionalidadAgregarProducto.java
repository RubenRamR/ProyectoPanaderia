/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaagregarproducto;

import DTO.DTO_Producto;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.ProductosBO;

/**
 *
 * @author joseq
 */
public class FuncionalidadAgregarProducto implements IFuncionalidadAgregarProducto {
    
     private IProductosBO productosBO;

    public FuncionalidadAgregarProducto() {
        productosBO = new ProductosBO();
    }

    @Override
    public DTO_Producto agregarProducto(DTO_Producto producto) {
        DTO_Producto productoAgregado = productosBO.agregarProducto(producto);
        return productoAgregado;
    }
    
}
