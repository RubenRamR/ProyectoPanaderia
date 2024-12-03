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
    /**
     * El objeto de negocio de los productos
     */
     private IProductosBO productosBO;

     /**
      * Constructor que inicializa el ProductoBO
      */
    public FuncionalidadAgregarProducto() {
        productosBO = new ProductosBO();
    }

    /**
     * Agrega un producto
     * @param producto DTO del producto
     * @return El producto agregado
     */
    @Override
    public DTO_Producto agregarProducto(DTO_Producto producto) {
        DTO_Producto productoAgregado = productosBO.agregarProducto(producto);
        return productoAgregado;
    }
    
}
