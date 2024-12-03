/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_panaderiahistorialventas;

import DTO.DTO_Producto;
import DTO.DTO_Venta;
import com.mycompany.panaderianegocio.IProductosBO;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.ProductosBO;
import com.mycompany.panaderianegocio.VentasBO;
import java.util.Date;
import java.util.List;

/**
 * Clase subsistema historial ventas
 * @author adane
 */
public class FuncionalidadHistorialVentas implements IFuncionalidadHistorialVentas{
    /**
     * Objeto de negocio de ventas
     */
    private IVentasBO ventabo;
    /**
     * Objetos de negocio de productos
     */
    private IProductosBO productosBO;

    /**
     * Constructor que inicializa la ventaBO y el productoBO
     */
    public FuncionalidadHistorialVentas() {
        this.ventabo = new VentasBO();
        this.productosBO = new ProductosBO();
    }

    /**
     * Regresa la lista de las ventas que esten dentro del rango de las fechas
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @return Lista de las ventas
     */
    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        return this.ventabo.consultarVentasPorRangoFecha(fechaInicio, fechaFin);
    }

    /**
      * Regresa el producto que coincida con el id
      * @param id id unico del producto
      * @return Produco en forma DTO
      */
    @Override
    public DTO_Producto consultarProducto(String id) {
        return this.productosBO.consultarProducto(id);
    }
    
    
    
}
