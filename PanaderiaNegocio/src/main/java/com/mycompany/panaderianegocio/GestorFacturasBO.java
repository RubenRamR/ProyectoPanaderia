/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Factura;
import com.mycompany.panaderiadominioentidades.Venta;
import conversionesnegocio.FacturasConversiones;
import conversionesnegocio.VentasConversiones;
import DTO.DTO_Factura;
import DTO.DTO_Venta;
import com.mycompany.panaderiadaos.IFacturaDAO;
import com.mycompany.panaderiadaos.FacturaDAO;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representa la lógica de negocio para la gestión de facturas.
 * Implementa la interfaz IGestorFacturasBO. Proporciona métodos para guardar,
 * consultar y eliminar facturas. Además, permite consultar facturas por rango
 * de fechas y por lista de ventas.
 */
public class GestorFacturasBO implements IGestorFacturasBO {

    FacturasConversiones conversor;
    IFacturaDAO facturaDAO;
    VentasConversiones conversorVentas;

    /**
     * Constructor por defecto que inicializa las dependencias de conversores y
     * DAO.
     */
    public GestorFacturasBO() {
        conversor = new FacturasConversiones();
//        facturaDAO = new FacturaDAO();
        facturaDAO = new FacturaDAO();

        conversorVentas = new VentasConversiones();
    }

    /**
     * Guarda una nueva factura en el sistema.
     *
     * <p>
     * Este método recibe un objeto {@link DTO_Factura}, lo convierte a una
     * entidad {@link Factura}, lo guarda utilizando el DAO y luego convierte la
     * entidad guardada nuevamente a un DTO {@link DTO_Factura} antes de
     * devolverla.</p>
     *
     * @param factura El objeto {@link DTO_Factura} que contiene la información
     * de la factura a guardar.
     * @return El objeto {@link DTO_Factura} que representa la factura guardada,
     * o {@code null} si ocurrió un error.
     */
    @Override
    public DTO_Factura guardarFactura(DTO_Factura factura) {
        Factura facturaConv = conversor.facturaDtoAEntidad(factura);
        Factura facturaNueva;
        try {

            facturaNueva = facturaDAO.guardarFactura(facturaConv);
            return conversor.facturaEntidadADto(facturaNueva);
        } catch (PersistenciaException e) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    /**
     * Consulta todas las facturas disponibles en el sistema.
     *
     * <p>
     * Este método obtiene una lista de todas las facturas almacenadas en la
     * base de datos y las convierte en una lista de objetos {@link DTO_Factura}
     * para su uso en la capa de presentación.</p>
     *
     * @return Una lista de objetos {@link DTO_Factura} que representan todas
     * las facturas disponibles. Si ocurre un error, devuelve {@code null}.
     */
    @Override
    public List<DTO_Factura> consultarFacturas() {
        List<DTO_Factura> facturas;
        try {
            facturas = conversor.listaFacturasADto(facturaDAO.consultarFacturas());
            return facturas;
        } catch (PersistenciaException ex) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Elimina una factura del sistema.
     *
     * <p>
     * Este método recibe un objeto {@link DTO_Factura}, lo convierte a una
     * entidad {@link Factura}, y luego lo elimina de la base de datos mediante
     * el DAO.</p>
     *
     * @param factura El objeto {@link DTO_Factura} que representa la factura a
     * eliminar.
     * @throws PersistenciaException Si ocurre un error al intentar eliminar la
     * factura desde la base de datos.
     */
    @Override
    public void eliminarFactura(DTO_Factura factura) throws PersistenciaException {
        try {
            facturaDAO.eliminarFactura(conversor.facturaDtoAEntidad(factura));
        } catch (PersistenciaException ex) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Consulta las facturas dentro de un rango de fechas específico.
     *
     * <p>
     * Este método obtiene las facturas cuyo campo de fecha se encuentra dentro
     * del rango proporcionado (desde {@code desde} hasta {@code hasta}) y las
     * convierte a una lista de objetos {@link DTO_Factura}.</p>
     *
     * @param desde La fecha de inicio del rango.
     * @param hasta La fecha de fin del rango.
     * @return Una lista de objetos {@link DTO_Factura} que representan las
     * facturas dentro del rango de fechas. Si ocurre un error, devuelve
     * {@code null}.
     * @throws PersistenciaException Si ocurre un error al consultar las
     * facturas desde la base de datos.
     */
    @Override
    public List<DTO_Factura> consultarFacturasPorRangoFechas(Date desde, Date hasta) throws PersistenciaException {
        try {
            return conversor.listaFacturasADto(facturaDAO.consultarFacturasPorRangoFechas(desde, hasta));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Obtiene las facturas asociadas a una lista de ventas.
     *
     * <p>
     * Este método recibe una lista de objetos {@link DTO_Venta}, los convierte
     * en entidades {@link Venta}, y luego consulta las facturas asociadas a
     * esas ventas. Finalmente, las convierte de nuevo a objetos
     * {@link DTO_Factura}.</p>
     *
     * @param ventas Una lista de objetos {@link DTO_Venta} que representan las
     * ventas relacionadas con las facturas.
     * @return Una lista de objetos {@link DTO_Factura} asociadas a las ventas
     * proporcionadas. Si ocurre un error, devuelve {@code null}.
     * @throws PersistenciaException Si ocurre un error al consultar las
     * facturas desde la base de datos.
     */
    @Override
    public List<DTO_Factura> facturasPorListaVentas(List<DTO_Venta> ventas) throws PersistenciaException {
        try {
            List<Venta> ventasEnt = conversorVentas.listaVentasDtoAEntidad(ventas);
            return conversor.listaFacturasADto(facturaDAO.facturasPorListaVentas(ventasEnt));
        } catch (PersistenciaException e) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    /**
     * Consulta las facturas con filtros aplicados sobre una lista de ventas y
     * un rango de fechas.
     *
     * <p>
     * Este método consulta las facturas que coinciden con los filtros
     * especificados: una lista de ventas y un rango de fechas (desde
     * {@code desde} hasta {@code hasta}), y las convierte en objetos
     * {@link DTO_Factura}.</p>
     *
     * @param ventas Una lista de objetos {@link DTO_Venta} que representan las
     * ventas relacionadas con las facturas.
     * @param desde La fecha de inicio del rango.
     * @param hasta La fecha de fin del rango.
     * @return Una lista de objetos {@link DTO_Factura} que representan las
     * facturas filtradas según los criterios especificados. Si ocurre un error,
     * devuelve {@code null}.
     * @throws PersistenciaException Si ocurre un error al consultar las
     * facturas desde la base de datos.
     */
    @Override
    public List<DTO_Factura> consultarFacturasConFiltros(List<DTO_Venta> ventas, Date desde, Date hasta) throws PersistenciaException {
        try {
            List<Venta> ventasEnt = conversorVentas.listaVentasDtoAEntidad(ventas);
            return conversor.listaFacturasADto(facturaDAO.consultarFacturasConFiltros(ventasEnt, desde, hasta));
        } catch (PersistenciaException e) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
