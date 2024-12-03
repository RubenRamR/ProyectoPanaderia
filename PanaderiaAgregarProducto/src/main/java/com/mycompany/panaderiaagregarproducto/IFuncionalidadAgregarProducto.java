/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaagregarproducto;

import DTO.DTO_Producto;

/**
 * Interfaz del subsistema que agrega un producto
 * @author joseq
 */
public interface IFuncionalidadAgregarProducto {
    /**
     * Agrega un producto
     * @param producto DTO del producto
     * @return El producto agregado
     */
    public DTO_Producto agregarProducto(DTO_Producto producto);
    
    
}
