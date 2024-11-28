/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import conversionesnegocio.ProductosConversiones;
import com.mycompany.panaderiadaos.IIngredienteDAO;
import com.mycompany.panaderiadaos.IProductoDAO;
import com.mycompany.panaderiadaos.IngredienteDAO;
import com.mycompany.panaderiadaos.ProductoDAO;
import com.mycompany.panaderiadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominiosMapeo.ProductoMapeo;
import conversionesnegocio.IngredienteConversiones;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de negocio que implementa la interfaz IProductosBO y gestiona las
 * operaciones relacionadas con los productos y sus ingredientes. Proporciona
 * métodos para agregar, actualizar, consultar y eliminar productos, así como
 * para gestionar ingredientes y detalles de productos.
 */
public class ProductosBO implements IProductosBO {

    private IProductoDAO productoDAO;
    private IIngredienteDAO ingredienteDAO;
    private ProductosConversiones conversor;
    private IngredienteConversiones conversorIngredientes;

    /**
     * Constructor por defecto que inicializa las dependencias de DAO y
     * conversiones. Crea instancias de ProductoDAO, IngredienteDAO,
     * ProductosConversiones y IngredienteConversiones.
     */
    public ProductosBO() {
        this.productoDAO = new ProductoDAO();
        this.ingredienteDAO = new IngredienteDAO();
        this.conversor = new ProductosConversiones();
        this.conversorIngredientes = new IngredienteConversiones();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Producto agregarProducto(DTO_Producto producto) {
        try {
            Producto productoConvertido = this.convertirDTOAProducto(producto);
            Producto producoNuevo = productoDAO.agregarProducto(productoConvertido);
            return conversor.convertirProducto(producoNuevo);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Producto actualizarProducto(DTO_Producto producto) {
        try {
            Producto productoConvertido = this.convertirDTOAProducto(producto);
            Producto producoActualizado = productoDAO.actualizar(productoConvertido);
            return conversor.convertirProducto(producoActualizado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Producto> consultarProductos() {
        try {
            List<DTO_Producto> listaProductos = conversor.convertirListaProductos(productoDAO.consultarProductos());
            return listaProductos;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
        try {
            Producto productoConsultado = productoDAO.consultarPorNombre(nombre);
            if (productoConsultado == null) {
                return null;
            }
            return conversor.convertirProducto(productoConsultado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Producto consultarProducto(String id) {
        try {
            Producto productoConsultado = productoDAO.consultar(id);
            if (productoConsultado == null) {
                return null;
            }
            return conversor.convertirProducto(productoConsultado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductoMapeo convertirDTOAProductoMapeo(DTO_Producto producto) {
        ProductoMapeo productoNuevo = new ProductoMapeo();
        productoNuevo.setDescripcion(producto.getDescripcion());

        productoNuevo.setNombre(producto.getNombre());
        productoNuevo.setPrecio(producto.getPrecio());

        for (DTO_IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            productoNuevo.addIngredienteDetalle(convertirDTOAIngredienteDetalleMapeo(ingredienteDetalle));
        }
        return productoNuevo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IngredienteDetalleMapeo convertirDTOAIngredienteDetalleMapeo(DTO_IngredienteDetalle ingredienteDetalle) {
        IngredienteDetalleMapeo ingredienteDetalleNuevo = new IngredienteDetalleMapeo();
        ingredienteDetalleNuevo.setCantidad(ingredienteDetalle.getCantidad());
        ingredienteDetalleNuevo.setNombre(ingredienteDetalle.getNombre());
        //ingredienteDetalleNuevo.setIngredienteId(ingredienteDetalle.getIngredienteId());
        return ingredienteDetalleNuevo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(String nombre) {
        try {
            return conversorIngredientes.convertir(ingredienteDAO.consultarPorNombre(nombre));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
public Producto convertirDTOAProducto(DTO_Producto producto) {
    Float precio = 0F;
    Producto productoNuevo = new Producto();
    productoNuevo.setDescripcion(producto.getDescripcion());

    if (producto.getId() != null) {
        productoNuevo.setId(producto.getId());
    }

    productoNuevo.setNombre(producto.getNombre());
    productoNuevo.setPrecio(producto.getPrecio());

    for (DTO_IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
        // Consultar ingrediente por nombre
        DTO_Ingrediente ingredienteConsultado = consultarIngredientePorNombre(ingredienteDetalle.getNombre());

        // Verificar si el ingrediente fue encontrado
        if (ingredienteConsultado != null) {
            precio += ingredienteConsultado.getPrecio() * ingredienteDetalle.getCantidad();
            ingredienteDetalle.setIngredienteId(ingredienteConsultado.getId());
            productoNuevo.addIngredienteDetalle(convertirDTOAIngredienteDetalle(ingredienteDetalle));
        } else {
            // Manejo de caso cuando el ingrediente no se encuentra
            System.out.println("Ingrediente no encontrado: " + ingredienteDetalle.getNombre());
            // Aquí puedes decidir qué hacer si no se encuentra el ingrediente, como lanzar una excepción o asignar un precio por defecto
            // Ejemplo:
            // precio += 0F; // Si prefieres no afectar el precio
        }
    }

    productoNuevo.setPrecio(precio + 50F);
    return productoNuevo;
}

    /**
     * {@inheritDoc}
     */
    @Override
    public IngredienteDetalle convertirDTOAIngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle) {
        IngredienteDetalle ingredienteDetalleNuevo = new IngredienteDetalle();
        ingredienteDetalleNuevo.setCantidad(ingredienteDetalle.getCantidad());
        ingredienteDetalleNuevo.setNombre(ingredienteDetalle.getNombre());
        ingredienteDetalleNuevo.setIngredienteId(ingredienteDetalle.getIngredienteId());
        return ingredienteDetalleNuevo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float calcularCosto(List<IngredienteDetalle> productos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean eliminarProducto(DTO_Producto producto) {
        try {
            return productoDAO.eliminarProducto(convertirDTOAProductoMapeo(producto));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto) {
        try {
            List<DTO_IngredienteDetalle> ingredientes = producto.getIngredientes();
            List<String> ids = new ArrayList();
            for (DTO_IngredienteDetalle ingrediente : ingredientes) {
                ids.add(consultarIngredientePorNombre(ingrediente.getNombre()).getId());
            }
            return this.conversorIngredientes.convertir(this.ingredienteDAO.consultarIngredientesFaltantes(ids));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre) {
        try {
            return conversor.convertirListaProductos(productoDAO.consultarProductosCoincidentes(nombre));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Producto> consultarListaProductosConStock() {
        try {
            List<Ingrediente> ingredientesDisponibles = ingredienteDAO.consultarIngredientesConStock();
            List<Producto> productos = productoDAO.consultarProductos();
            List<DTO_Producto> productosDTO = new ArrayList<>();

            for (Producto producto : productos) {
                boolean disponible = false;
                for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {

                    for (Ingrediente ingrediente : ingredientesDisponibles) {
                        if (ingrediente.getNombre().equalsIgnoreCase(ingredienteDetalle.getNombre())) {
                            if (ingrediente.getCantidad() > ingredienteDetalle.getCantidad()) {
                                disponible = true;
                            }
                        }
                    }
                    if (!disponible) {
                        break;
                    }

                }

                if (!disponible) {
                    break;
                }
                if (disponible) {
                    productosDTO.add(conversor.convertirProducto(producto));
                }
                disponible = false;

            }
            return productosDTO;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
