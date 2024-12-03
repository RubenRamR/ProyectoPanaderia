/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaactualizarproducto;

import DTO.DTO_Producto;

/**
 * Interfaz del subsistema ActualizarProducto
 * @author joseq
 */
public interface IFuncionalidadActualizarProducto {
    /**
     * Actualiza un producto
     * @param producto DTO del producto
     * @return El producto actualizado
     */
    public DTO_Producto actualizarProducto(DTO_Producto producto);

    
}
