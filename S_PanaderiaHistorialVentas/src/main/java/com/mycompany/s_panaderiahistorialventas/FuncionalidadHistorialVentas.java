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
 *
 * @author adane
 */
public class FuncionalidadHistorialVentas implements IFuncionalidadHistorialVentas{
    
    private IVentasBO ventabo;
    private IProductosBO productosBO;

    public FuncionalidadHistorialVentas() {
        this.ventabo = new VentasBO();
        this.productosBO = new ProductosBO();
    }
    
    

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        return this.ventabo.consultarVentasPorRangoFecha(fechaInicio, fechaFin);
    }

    @Override
    public DTO_Producto consultarProducto(String id) {
        return this.productosBO.consultarProducto(id);
    }
    
    
    
}
