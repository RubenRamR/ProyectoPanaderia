/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiaconsultarproductos;

import DTO.DTO_Producto;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.ProductosBO;
import java.util.List;

/**
 * Clase subsistema que permite interacturar con los productos
 * @author joseq
 */
public class FuncionalidadConsultarProductos implements IFuncionalidadConsultarProductos {
    /**
     * Objeto negocio del producto
     */  
    private IProductosBO productoBO;

    /**
     * Constructor que inicializa el ProductosBO
     */
    public FuncionalidadConsultarProductos() {
        this.productoBO = new ProductosBO();
    }

    /**
     * Regresa la lista de los productos
     * @return Lista de los productos
     */
    @Override
    public List<DTO_Producto> consultarProductos() {
        List<DTO_Producto> pasteles = productoBO.consultarProductos();
        return pasteles;
    }

    /**
     * Regresa un producto dado por el id
     * @param id id unico del producto
     * @return El producto que coincide con el id
     */
    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
        return productoBO.consultarProductoPorNombre(nombre);
    }

    /**
     * Regresa el dto del producto dado por el nombre
     * @param nombre el nombre del producto
     * @return El producto que coincide con el nombre
     */
    @Override
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre) {
        return productoBO.consultarProductosCoincidentes(nombre);

    }

    /**
     * Regresa la lista de los productos que coinciden con el nombre
     * @param nombre El nombre de los productos
     * @return Regresa la lista de los productos
     */
    @Override
    public DTO_Producto consultarProducto(String id) {
        return productoBO.consultarProducto(id);
    }
}
