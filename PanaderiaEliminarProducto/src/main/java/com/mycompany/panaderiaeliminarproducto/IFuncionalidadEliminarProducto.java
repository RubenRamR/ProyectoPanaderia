/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaeliminarproducto;

import DTO.DTO_Producto;

/**
 * Interfaz del subsistema Eliminar producto
 * @author joseq
 */
public interface IFuncionalidadEliminarProducto {
    /**
     * Elimina un producto
     * @param producto DTO del producto
     * @return El producto eliminado
     */ 
    public boolean eliminarProducto(DTO_Producto producto);
    
}
