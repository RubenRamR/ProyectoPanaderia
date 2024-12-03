/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiahistorialventas;


import DTO.DTO_Producto;
import DTO.DTO_Venta;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.Date;
import java.util.List;
/**
 * Interfaz del subsistema del historial ventas
 * @author adane
 */
public interface IFuncionalidadHistorialVentas {
    /**
     * Regresa la lista de las ventas que esten dentro del rango de las fechas
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @return Lista de las ventas
     */
     public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin);
     /**
      * Regresa el producto que coincida con el id
      * @param id id unico del producto
      * @return Produco en forma DTO
      */
      public DTO_Producto consultarProducto(String id);
    
}
