/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaconsultarproductos;

import DTO.DTO_Producto;
import DTO.DTO_Venta;
import java.util.List;

/**
 * Interfaz del subsistema que permite interactuar con los productos de la base de datos
 * @author joseq
 */
public interface IFuncionalidadConsultarProductos {

    /**
     * Regresa la lista de los productos
     * @return Lista de los productos
     */
    public List<DTO_Producto> consultarProductos();

    /**
     * Regresa un producto dado por el id
     * @param id id unico del producto
     * @return El producto que coincide con el id
     */
    public DTO_Producto consultarProducto(String id);

    /**
     * Regresa el dto del producto dado por el nombre
     * @param nombre el nombre del producto
     * @return El producto que coincide con el nombre
     */
    public DTO_Producto consultarProductoPorNombre(String nombre);

    /**
     * Regresa la lista de los productos que coinciden con el nombre
     * @param nombre El nombre de los productos
     * @return Regresa la lista de los productos
     */
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre);

}
