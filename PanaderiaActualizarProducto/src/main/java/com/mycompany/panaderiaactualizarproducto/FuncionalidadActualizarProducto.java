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
    /**
     * Objeto de negocio de los productos
     */
    private IProductosBO productosBO;

    /**
     * Constructor que inicializa el productoBO
     */
    public FuncionalidadActualizarProducto() {
        productosBO = new ProductosBO();
    }

    /**
     * Actualiza un producto
     * @param producto DTO del producto
     * @return El producto actualizado
     */
    @Override
    public DTO_Producto actualizarProducto(DTO_Producto producto) {
        return productosBO.actualizarProducto(producto);
    }
    
}
