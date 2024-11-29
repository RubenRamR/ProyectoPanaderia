/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import conversionesnegocio.ProductosConversiones;
import conversionesnegocio.VentasConversiones;
import Excepciones.ConsultarVentasPorFechaException;
import Exceptions.PersistenciaException;
import com.mycompany.panaderiadaos.IIngredienteDAO;
import com.mycompany.panaderiadaos.IVentaDAO;
import com.mycompany.panaderiadaos.IngredienteDAO;
import com.mycompany.panaderiadaos.VentaDAO;
import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominiosMapeo.IngredienteMapeo;
import conversionesnegocio.IngredienteConversiones;
import DTO.DTO_DetalleVenta;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class VentasBO implements IVentasBO {

    private IVentaDAO ventaDAO;
    private VentasConversiones conversor;
    private ProductosConversiones conversorp;
    private IIngredienteDAO ingredientesDAO;
    private IngredienteConversiones conversorIngrediente;

    public VentasBO() {
        this.ventaDAO = new VentaDAO();
        this.conversor = new VentasConversiones();
        this.conversorp = new ProductosConversiones();
        ingredientesDAO = new IngredienteDAO();
        conversorIngrediente = new IngredienteConversiones();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void agregarVenta(DTO_Venta venta) {
        try {
            ventaDAO.agregarVenta(conversor.convertirDTOAgregar(venta));
            for (DTO_DetalleVenta detalle : venta.getDetallesVenta()) {
                for (DTO_IngredienteDetalle ingrediente : detalle.getProducto().getIngredientes()) {
                    Ingrediente ingredienteConsultado = ingredientesDAO.consultarPorNombre(ingrediente.getNombre());

                    DTO_Ingrediente ingredienteDTO = new DTO_Ingrediente();
                    ingredienteDTO.setId(ingredienteConsultado.getId());
                    ingredienteDTO.setCantidad(ingredienteConsultado.getCantidad());
                    ingredienteDTO.setNombre(ingredienteConsultado.getNombre());
                    ingredienteDTO.setPrecio(ingredienteConsultado.getPrecio());

                    ingredientesDAO.actualizar(ConvertirDTOAIngrediente(ingredienteDTO));
                }
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(VentasBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin));
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> consultarVentas() {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentas());
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Venta encontrarVenta(String idVenta) {
        try {
            return conversor.convertirADTO(ventaDAO.encontrarVenta(idVenta));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> ventasPorCliente(String clienteId) {
        try {
            return conversor.convertirListaADTO(ventaDAO.ventasPorCliente(clienteId));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos) {
        try {
            List<Producto> productos = conversorp.convertirListaProductosEntidad(listaProductos);
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorProductos(productos));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos) {
        try {
            List<Producto> productos = conversorp.convertirListaProductosEntidad(listaProductos);
            return conversor.convertirListaADTO(ventaDAO.consultarVentasConFiltros(clienteId, fechaInicio, fechaFin, productos));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) throws ConsultarVentasPorFechaException {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorFecha(fecha));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean consultarExistenciaIngredientesStock(DTO_Producto producto) {
        try {
            List<String> ingredientesNombres = new ArrayList<>();
            List<DTO_IngredienteDetalle> ingredientesDetalles = producto.getIngredientes();

            for (DTO_IngredienteDetalle ingredienteDetalle : ingredientesDetalles) {
                ingredientesNombres.add(ingredienteDetalle.getNombre());
            }

            List<Ingrediente> ingredientesConsultados = ingredientesDAO.consultarCantidadesIngredientesInventario(ingredientesNombres);

            for (Ingrediente ingrediente : ingredientesConsultados) {
                Optional<DTO_IngredienteDetalle> ingredienteDetalleConsultado = ingredientesDetalles.stream().filter(p -> p.getNombre().equalsIgnoreCase(ingrediente.getNombre())).findAny();
                if (ingredienteDetalleConsultado.isPresent()) {
                    float cantidadNecesaria = calcularCantidadIngrediente(ingredienteDetalleConsultado.get(), producto.getTamanio());
                    if (cantidadNecesaria > ingrediente.getCantidad()) {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            return true;
        } catch (PersistenciaException ex) {
            Logger.getLogger(VentasBO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float calcularCantidadIngrediente(DTO_IngredienteDetalle ingredienteDetalle, String tamanio) {
        
        return 0f;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IngredienteMapeo ConvertirDTOAIngrediente(DTO_Ingrediente ingredienteDTO) {
        IngredienteMapeo ingrediente = new IngredienteMapeo();
        ingrediente.setCantidad(ingredienteDTO.getCantidad());
        ingrediente.setNombre(ingredienteDTO.getNombre());
        ingrediente.setPrecio(ingredienteDTO.getPrecio());

        return ingrediente;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente) {
        DTO_Ingrediente dtoIngrediente = new DTO_Ingrediente();
        dtoIngrediente.setId(ingrediente.getId());

        dtoIngrediente.setCantidad(ingrediente.getCantidad());
        dtoIngrediente.setNombre(ingrediente.getNombre());
        dtoIngrediente.setPrecio(ingrediente.getPrecio());

        return dtoIngrediente;
    }

    @Override
    public List<DTO_Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorClienteFecha(clienteId, fechaInicio, fechaFin));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public DTO_Venta actualizarVenta(DTO_Venta venta) {
        
       try {
        // Convertir el DTO a entidad
        Venta ventaConvertida = conversor.convertirDTOAgregar(venta);
        
        // Actualizar la venta en la base de datos
        Venta ventaActualizada = ventaDAO.actualizarVenta(ventaConvertida);
        
        // Convertir la entidad actualizada nuevamente a DTO y retornarla
        return conversor.convertirADTO(ventaActualizada);
    } catch (PersistenciaException ex) {
        Logger.getLogger(VentasBO.class.getName()).log(Level.SEVERE, "Error al actualizar la venta: ", ex);
        return null;
    }
    }

    @Override
    public List<DTO_Venta> consultarVentasPendiente(int pagina, int cantidad) {
         try {
        List<Venta> ventas = ventaDAO.consultarVentasPendiente(pagina, cantidad);
        return conversor.convertirListaADTO(ventas);
    } catch (PersistenciaException ex) {
        Logger.getLogger(VentasBO.class.getName()).log(Level.SEVERE, "Error al consultar ventas pendientes: ", ex);
        return new ArrayList<>();
    }
    }

    @Override
    public DTO_Venta encontrarVentaPorId(String idVenta) {
        try {
        Venta venta = ventaDAO.encontrarVentaPorId(idVenta);
        return conversor.convertirADTO(venta);
    } catch (PersistenciaException ex) {
        Logger.getLogger(VentasBO.class.getName()).log(Level.SEVERE, "Error al buscar la venta por ID: ", ex);
        return null;
    }
    }
    
    
}
