/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiaconsultarproductos;

import DTO.DTO_Producto;
import DTO.DTO_Venta;
import java.util.List;

/**
 *
 * @author joseq
 */
public interface IFuncionalidadConsultarProductos {

    public List<DTO_Producto> consultarProductos();

    public DTO_Producto consultarProducto(String id);

    public DTO_Producto consultarProductoPorNombre(String nombre);

    public List<DTO_Producto> consultarProductosCoincidentes(String nombre);

}
