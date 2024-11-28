/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Field;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Projections;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominioentidades.Venta;
import com.mycompany.panaderiadominiosMapeo.VentaMapeo;
import conversionesPersistencia.VentasConversiones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Implementa los metodos de la interfaz IVentaDAO
 *
 */
public class VentaDAO implements IVentaDAO {

    private IConexion conexion;
    private VentasConversiones conversor;

    public VentaDAO() {
        conexion = new Conexion("ventas", VentaMapeo.class);
        conversor = new VentasConversiones();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Venta agregarVenta(Venta venta) throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(conversor.convertirAVentaMapeo(venta));
        return venta;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminarVenta(Venta venta) throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
        try {
            coleccion.deleteOne(Filters.eq("_id", new ObjectId(venta.getId())));
        } catch (MongoException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> ventasPorCliente(String clienteId) throws PersistenciaException {

        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

        Bson filtroCliente = eq("cliente._id", new ObjectId(clienteId));

        FindIterable<VentaMapeo> ventasCliente = coleccion.find(filtroCliente);
        List<Venta> ventas = new ArrayList<>();
        for (VentaMapeo venta : ventasCliente) {
            ventas.add(conversor.convertirAVentaEntidad(venta));
        }
        return ventas;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentas() throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<VentaMapeo> ventas = coleccion.find();
        List<Venta> ventasE = new ArrayList<>();
        for (VentaMapeo venta : ventas) {
            ventasE.add(conversor.convertirAVentaEntidad(venta));
        }
        return ventasE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
        Bson filtroRangoFechas = Filters.and(
                Filters.gte("fechaRegistro", fechaInicio),
                Filters.lte("fechaRegistro", fechaFin)
        );

        FindIterable<VentaMapeo> ventasPorRangoFechas = coleccion.find(filtroRangoFechas);
        List<Venta> ventas = new ArrayList<>();
        for (VentaMapeo venta : ventasPorRangoFechas) {
            ventas.add(conversor.convertirAVentaEntidad(venta));
        }
        return ventas;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentasPorFecha(Date fecha) throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
        Bson filtro = Filters.eq("fechaRegistro", fecha);

        FindIterable<VentaMapeo> ventasPorFecha = coleccion.find(filtro);
        List<Venta> ventas = new ArrayList<>();
        for (VentaMapeo venta : ventasPorFecha) {
            ventas.add(conversor.convertirAVentaEntidad(venta));
        }
        return ventas;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Venta encontrarVenta(String idVenta) throws PersistenciaException {
        try {
            ObjectId objectIdVenta = new ObjectId(idVenta);

            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
            List<Bson> pipeline = Arrays.asList(
                    Aggregates.match(Filters.eq("_id", objectIdVenta)),
                    Aggregates.lookup("clientes", "cliente._id", "_id", "cliente"),
                    Aggregates.addFields(new Field<>("cliente", new Document("$arrayElemAt", Arrays.asList("$cliente", 0)))),
                    Aggregates.lookup("productos", "detallesVenta.productoId", "_id", "producto"),
                    Aggregates.addFields(new Field<>("detallesVenta.producto", new Document("$arrayElemAt", Arrays.asList("$producto", 0)))),
                    Aggregates.project(Projections.fields(
                            Projections.include("_id", "clienteid", "cliente", "detallesVenta", "direccionEntrega", "estado", "fechaEntrega", "fechaRegistro", "montoTotal")
                    ))
            );
            AggregateIterable<VentaMapeo> resultados = coleccion.aggregate(pipeline);
            VentaMapeo ventaEncontrada = resultados.first();
            if (ventaEncontrada == null) {
                return null; // La venta no fue encontrada
            }
            Venta venta = conversor.convertirAVentaEntidadObjetos(ventaEncontrada);
            return venta;
        } catch (IllegalArgumentException e) {
            throw new PersistenciaException("ID de venta no válido: " + idVenta);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentasPorProductos(List<Producto> listaProductos) throws PersistenciaException {
        try {
            List<ObjectId> idsProductos = listaProductos.stream()
                    .map(producto -> new ObjectId(producto.getId()))
                    .collect(Collectors.toList());

            Bson filtro = Filters.in("detallesVenta.productoId", idsProductos);

            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
            List<Bson> pipeline = Arrays.asList(
                    Aggregates.match(filtro),
                    Aggregates.lookup("clientes", "cliente._id", "_id", "cliente"), // Lookup para obtener la información del cliente
                    Aggregates.addFields(new Field<>("cliente", new Document("$arrayElemAt", Arrays.asList("$cliente", 0)))),
                    Aggregates.project(Projections.fields(
                            Projections.include("_id", "cliente", "detallesVenta", "direccionEntrega", "estado", "fechaEntrega", "fechaRegistro", "montoTotal")
                    ))
            );

            AggregateIterable<VentaMapeo> resultados = coleccion.aggregate(pipeline);
            List<Venta> ventas = new ArrayList<>();
            for (VentaMapeo venta : resultados) {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }
            return ventas;
        } catch (IllegalArgumentException e) {
            throw new PersistenciaException("Error al consultar ventas por productos: " + e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<Producto> listaProductos) throws PersistenciaException {
        try {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            List<Bson> filtros = new ArrayList<>();

            if (clienteId != null && !clienteId.isEmpty()) {
                filtros.add(eq("cliente._id", new ObjectId(clienteId)));
            }

            if (fechaInicio != null && fechaFin != null) {
                Bson filtroRangoFechas = Filters.and(
                        Filters.gte("fechaRegistro", fechaInicio),
                        Filters.lte("fechaRegistro", fechaFin)
                );
                filtros.add(filtroRangoFechas);
            }

            // Filtro por productos
            List<ObjectId> idsProductos = null;
            if (listaProductos != null && !listaProductos.isEmpty()) {
                idsProductos = listaProductos.stream()
                        .map(producto -> new ObjectId(producto.getId()))
                        .collect(Collectors.toList());

                filtros.add(Filters.in("detallesVenta.productoId", idsProductos));
            }

            Bson filtroFinal = Filters.and(filtros);

            FindIterable<VentaMapeo> ventasFiltradas = coleccion.find(filtroFinal);
            List<Venta> ventas = new ArrayList<>();
            for (VentaMapeo venta : ventasFiltradas) {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }

            return ventas;
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar ventas con filtros: " + e.getMessage());
        }
    }
    
    @Override
    public Float calcularIngresosTotales() throws PersistenciaException{
        return Float.MAX_VALUE;
    }
    
    @Override
    public List<Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) throws PersistenciaException {
        try {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            List<Bson> filtros = new ArrayList<>();

            if (clienteId != null && !clienteId.isEmpty()) {
                filtros.add(eq("cliente._id", new ObjectId(clienteId)));
            }

            if (fechaInicio != null && fechaFin != null) {
                Bson filtroRangoFechas = Filters.and(
                        Filters.gte("fechaRegistro", fechaInicio),
                        Filters.lte("fechaRegistro", fechaFin)
                );
                filtros.add(filtroRangoFechas);
            }

            Bson filtroFinal = Filters.and(filtros);

            FindIterable<VentaMapeo> ventasFiltradas = coleccion.find(filtroFinal);
            List<Venta> ventas = new ArrayList<>();
            for (VentaMapeo venta : ventasFiltradas) {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }

            return ventas;
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar ventas con filtros: " + e.getMessage());
        }
    }
}
