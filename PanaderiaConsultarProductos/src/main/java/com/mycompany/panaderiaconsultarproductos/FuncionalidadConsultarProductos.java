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
 *
 * @author joseq
 */
public class FuncionalidadConsultarProductos implements IFuncionalidadConsultarProductos {
      private IProductosBO productoBO;

    public FuncionalidadConsultarProductos() {
        this.productoBO = new ProductosBO();
    }

    @Override
    public List<DTO_Producto> consultarProductos() {
        List<DTO_Producto> pasteles = productoBO.consultarProductos();
        return pasteles;
    }

    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
        return productoBO.consultarProductoPorNombre(nombre);
    }

    @Override
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre) {
        return productoBO.consultarProductosCoincidentes(nombre);

    }

    @Override
    public DTO_Producto consultarProducto(String id) {
        return productoBO.consultarProducto(id);
    }
}
