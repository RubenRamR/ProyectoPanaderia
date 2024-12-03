/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gte;
import static com.mongodb.client.model.Filters.in;
import static com.mongodb.client.model.Filters.lte;
import com.mycompany.panaderiadominioentidades.Factura;
import com.mycompany.panaderiadominioentidades.Venta;
import com.mycompany.panaderiadominiosMapeo.FacturaMapeo;
import com.mycompany.panaderiadominiosMapeo.VentaMapeo;
import conversionesPersistencia.FacturasConversiones;
import conversionesPersistencia.VentasConversiones;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Clase de tipo DAO para las facturas
 * 
 */
public class FacturaDAO implements IFacturaDAO {
    

    private IConexion conexion;
    private FacturasConversiones conversorFacturas;
    private VentasConversiones conversorVentas;

    /**
     * Constructor por defecto, inicializa la conexión con la base de datos.
     */
    public FacturaDAO() {
        conexion = new Conexion("Facturas", FacturaMapeo.class);
        conversorFacturas = new FacturasConversiones();
        conversorVentas = new VentasConversiones();
    }

    /**
     * Guarda la factura dada en el parámetro en la base de datos.
     *
     * @param factura Factura a guardar.
     * @return La factura que se guardó.
     * @throws PersistenciaException En caso de no poderse guardar la factura.
     */
    @Override
    public Factura guardarFactura(Factura factura) throws PersistenciaException {
        MongoCollection<FacturaMapeo> coleccion = conexion.obtenerColeccion();
        if (factura.getId() == null) {
            ObjectId objectId = new ObjectId();
            factura.setId(objectId.toHexString());
        }
        coleccion.insertOne(conversorFacturas.convertirAFacturaMapeo(factura));
        return factura;
    }

    @Override
    public List<Factura> consultarFacturas() throws PersistenciaException {
        MongoCollection<FacturaMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<FacturaMapeo> reportes = coleccion.find();
        List<Factura> facturasEn = new ArrayList<>();
        for (FacturaMapeo facturaMapeo : reportes) {
            facturasEn.add(conversorFacturas.convertirAFacturaEntidadObjetos(facturaMapeo));
        }
        return facturasEn;
    }

    /**
     * Elimina la factura dada en el parámetro si y solo si coincide con una
     * factura en la base de datos.
     *
     * @param factura Factura que se desea eliminar.
     * @throws PersistenciaException En caso de no poder eliminarse o no haber
     * coincidencias.
     *
     *
     */
    @Override
    public void eliminarFactura(Factura factura) throws PersistenciaException {
        try {
            MongoCollection<FacturaMapeo> coleccion = conexion.obtenerColeccion();
            coleccion.deleteOne(Filters.eq("_id", new ObjectId(factura.getId())));
        } catch (Exception e) {
            throw new PersistenciaException("Error al eliminar el reporte: " + e.getMessage());
        }
    }

    /**
     * Enlista las facturas según el rango de fechas dadas por los parámetros.
     * @param desde Fecha de inicio.
     * @param hasta Fecha de fin.
     * @return Lista filtrada por rango de fechas.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    @Override
    public List<Factura> consultarFacturasPorRangoFechas(Date desde, Date hasta) throws PersistenciaException {
        MongoCollection<FacturaMapeo> coleccion = conexion.obtenerColeccion();
        Bson filtroFecha = and(gte("fechaEmision", desde), lte("fechaEmision", hasta));
        FindIterable<FacturaMapeo> facturasFechas = coleccion.find(filtroFecha);
        List<Factura> facturas = new ArrayList<>();
        for (FacturaMapeo factura : facturasFechas) {
            facturas.add(conversorFacturas.convertirAFacturaEntidadObjetos(factura));
        }
        return facturas;
    }

    /**
     * Enlista las facturas que correspondan a la lista de ventas asignada en el
     * parámetro.
     *
     * @param ventas Lista con las ventas a comparar.
     * @return Lista filtrada por cliente.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    @Override
    public List<Factura> facturasPorListaVentas(List<Venta> ventas) throws PersistenciaException {
        MongoCollection<FacturaMapeo> coleccion = conexion.obtenerColeccion();
        List<VentaMapeo> ventasMapeo = new ArrayList<>();
        for (Venta ventaEnt : ventas) {
            ventasMapeo.add(conversorVentas.convertirAVentaMapeo(ventaEnt));
        }
        List<ObjectId> idsVentas = ventasMapeo.stream().map(VentaMapeo::getId).collect(Collectors.toList());
        Bson filtroVenta = in("ventaid", idsVentas);
        FindIterable<FacturaMapeo> facturasVentas = coleccion.find(filtroVenta);
        List<Factura> facturas = new ArrayList<>();
        for (FacturaMapeo factura : facturasVentas) {
            facturas.add(conversorFacturas.convertirAFacturaEntidad(factura));
        }
        return facturas;
    }

    /**
     * Enlista las facturas con los filtros dados en los parámetros.
     * @param ventas Lista con las ventas a comparar.
     * @param desde Fecha de inicio.
     * @param hasta Fecha de fin.
     * @return Lista filtrada.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    @Override
    public List<Factura> consultarFacturasConFiltros(List<Venta> ventas, Date desde, Date hasta) throws PersistenciaException {
        MongoCollection<FacturaMapeo> coleccion = conexion.obtenerColeccion();
        List<VentaMapeo> ventasMapeo = new ArrayList<>();
        for (Venta ventaEnt : ventas) {
            ventasMapeo.add(conversorVentas.convertirAVentaMapeo(ventaEnt));
        }
        List<ObjectId> idsVentas = ventasMapeo.stream().map(VentaMapeo::getId).collect(Collectors.toList());
        Bson filtroVenta = in("ventaid", idsVentas);
        Bson filtroFecha = and(gte("fechaEmision", desde), lte("fechaEmision", hasta));
        Bson filtroFinal = and(filtroVenta, filtroFecha);
        FindIterable<FacturaMapeo> facturasFiltradas = coleccion.find(filtroFinal);
        List<Factura> facturas = new ArrayList<>();
        for (FacturaMapeo factura : facturasFiltradas) {
            facturas.add(conversorFacturas.convertirAFacturaEntidad(factura));
        }
        return facturas;
    }

}
