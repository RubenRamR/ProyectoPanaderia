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
     * {@inheritDoc}
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
     * {@inheritDoc}
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
     * {@inheritDoc}
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
     * {@inheritDoc}
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
     * {@inheritDoc}
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
     * {@inheritDoc}
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
