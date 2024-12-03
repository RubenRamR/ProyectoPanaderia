/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.BsonField;
import com.mongodb.client.model.Field;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominioentidades.Venta;
import com.mycompany.panaderiadominiosMapeo.VentaMapeo;
import conversionesPersistencia.VentasConversiones;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
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
    private MongoCollection<Document> coleccion;

    public VentaDAO() {
        conexion = new Conexion("ventas", VentaMapeo.class);
        conversor = new VentasConversiones();
    }

    public VentaDAO(MongoCollection<Document> coleccion) {
        this.coleccion = coleccion;
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
        try
        {
            coleccion.deleteOne(Filters.eq("_id", new ObjectId(venta.getId())));
        } catch (MongoException e)
        {
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
        for (VentaMapeo venta : ventasCliente)
        {
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
        for (VentaMapeo venta : ventas)
        {
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
        for (VentaMapeo venta : ventasPorRangoFechas)
        {
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
        for (VentaMapeo venta : ventasPorFecha)
        {
            ventas.add(conversor.convertirAVentaEntidad(venta));
        }
        return ventas;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Venta encontrarVenta(String idVenta) throws PersistenciaException {
        try
        {
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
            if (ventaEncontrada == null)
            {
                return null; // La venta no fue encontrada
            }
            Venta venta = conversor.convertirAVentaEntidadObjetos(ventaEncontrada);
            return venta;
        } catch (IllegalArgumentException e)
        {
            throw new PersistenciaException("ID de venta no válido: " + idVenta);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentasPorProductos(List<Producto> listaProductos) throws PersistenciaException {
        try
        {
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
            for (VentaMapeo venta : resultados)
            {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }
            return ventas;
        } catch (IllegalArgumentException e)
        {
            throw new PersistenciaException("Error al consultar ventas por productos: " + e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<Producto> listaProductos) throws PersistenciaException {
        try
        {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            List<Bson> filtros = new ArrayList<>();

            if (clienteId != null && !clienteId.isEmpty())
            {
                filtros.add(eq("cliente._id", new ObjectId(clienteId)));
            }

            if (fechaInicio != null && fechaFin != null)
            {
                Bson filtroRangoFechas = Filters.and(
                        Filters.gte("fechaRegistro", fechaInicio),
                        Filters.lte("fechaRegistro", fechaFin)
                );
                filtros.add(filtroRangoFechas);
            }

            // Filtro por productos
            List<ObjectId> idsProductos = null;
            if (listaProductos != null && !listaProductos.isEmpty())
            {
                idsProductos = listaProductos.stream()
                        .map(producto -> new ObjectId(producto.getId()))
                        .collect(Collectors.toList());

                filtros.add(Filters.in("detallesVenta.productoId", idsProductos));
            }

            Bson filtroFinal = Filters.and(filtros);

            FindIterable<VentaMapeo> ventasFiltradas = coleccion.find(filtroFinal);
            List<Venta> ventas = new ArrayList<>();
            for (VentaMapeo venta : ventasFiltradas)
            {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }

            return ventas;
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al consultar ventas con filtros: " + e.getMessage());
        }
    }

    /**
     * Calcula los ingresos totales del sistema.
     *
     * Este método calcula la suma total de todos los ingresos generados por las
     * ventas registradas en el sistema. Si ocurre algún problema durante el
     * cálculo, se lanza una excepción PersistenciaException.
     *
     * @return El total de ingresos generados por todas las ventas registradas,
     * representado como un valor de tipo Float.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * cálculo.
     */
    @Override
    public Float calcularIngresosTotales() throws PersistenciaException {
        try
        {
            // Obtén la colección de ventas
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            // Obtén todas las ventas
            List<VentaMapeo> ventas = coleccion.find().into(new ArrayList<>());

            // Suma los montos totales de todas las ventas
            Float ingresosTotales = 0f;
            for (VentaMapeo venta : ventas)
            {
                ingresosTotales += venta.getMontoTotal(); // Sumar el monto total de cada venta
            }

            return ingresosTotales; // Devuelve la suma total
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al calcular los ingresos totales: ");
        }
    }

    /**
     * Consulta las ventas de un cliente en un rango de fechas específico.
     *
     * Este método permite obtener todas las ventas realizadas por un cliente
     * dentro de un rango de fechas determinado. Si ocurre algún problema
     * durante la consulta, se lanza una excepción PersistenciaException.
     *
     * @param clienteId El ID único del cliente cuyas ventas se desean
     * consultar.
     * @param fechaInicio La fecha de inicio del rango de fechas para la
     * consulta.
     * @param fechaFin La fecha de fin del rango de fechas para la consulta.
     * @return Una lista de objetos Venta que representan las ventas realizadas
     * por el cliente en el rango de fechas proporcionado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * consulta.
     */
    @Override
    public List<Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) throws PersistenciaException {
        try
        {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            List<Bson> filtros = new ArrayList<>();

            if (clienteId != null && !clienteId.isEmpty())
            {
                filtros.add(eq("cliente._id", new ObjectId(clienteId)));
            }

            if (fechaInicio != null && fechaFin != null)
            {
                Bson filtroRangoFechas = Filters.and(
                        Filters.gte("fechaRegistro", fechaInicio),
                        Filters.lte("fechaRegistro", fechaFin)
                );
                filtros.add(filtroRangoFechas);
            }

            Bson filtroFinal = Filters.and(filtros);

            FindIterable<VentaMapeo> ventasFiltradas = coleccion.find(filtroFinal);
            List<Venta> ventas = new ArrayList<>();
            for (VentaMapeo venta : ventasFiltradas)
            {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }

            return ventas;
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al consultar ventas con filtros: " + e.getMessage());
        }
    }

    /**
     * Actualiza una venta existente en la base de datos.
     *
     * @param venta La venta con los datos actualizados.
     * @throws PersistenciaException Si ocurre un error al intentar actualizar
     * la venta.
     */
    @Override
    public Venta actualizarVenta(Venta venta) throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

        // Validar el ID antes de usar ObjectId
        if (venta.getId() == null || !ObjectId.isValid(venta.getId()))
        {
            throw new PersistenciaException("El ID de la venta es inválido: " + venta.getId());
        }

        // Crear el ObjectId a partir del ID validado
        ObjectId objectId = new ObjectId(venta.getId());

        try
        {
            // Actualizar la venta en la base de datos
            VentaMapeo ventaActualizado = coleccion.findOneAndReplace(
                    eq("_id", objectId),
                    conversor.convertirAVentaMapeo(venta)
            );

            // Convertir el resultado y retornarlo
            return conversor.convertirAVentaEntidad(ventaActualizado);

        } catch (Exception e)
        {
            throw new PersistenciaException("Error al actualizar: " + e.getMessage());
        }
    }

    /**
     * Consulta las ventas pendientes de ser procesadas, con soporte para
     * paginación.
     *
     * Este método consulta las ventas que están pendientes de ser procesadas.
     * Permite la paginación, es decir, controlar cuántas ventas se devuelven en
     * cada página de resultados.
     *
     * @param pagina El número de página que se desea consultar (basado en
     * cero).
     * @param cantidad La cantidad de ventas a devolver por página.
     * @return Una lista de objetos Venta que representan las ventas pendientes
     * en la página solicitada.
     * @throws PersistenciaException Si ocurre un error durante la consulta.
     */
    @Override
    public List<Venta> consultarVentasPendiente(int pagina, int cantidad) throws PersistenciaException {
        try
        {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
            List<Bson> filtros = new ArrayList<>();
            filtros.add(eq("estado", "Pendiente")); // Filtro por estado pendiente

            // Crear filtro final
            Bson filtroFinal = Filters.and(filtros);

            // Aplicar paginación con skip() y limit()
            FindIterable<VentaMapeo> ventasFiltradas = coleccion.find(filtroFinal)
                    .skip((pagina - 1) * cantidad)
                    .limit(cantidad);

            List<Venta> ventas = new ArrayList<>();
            for (VentaMapeo venta : ventasFiltradas)
            {
                ventas.add(conversor.convertirAVentaEntidad(venta));
            }

            return ventas;
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al consultar ventas pendientes: " + e.getMessage());
        }
    }

    /**
     * Encuentra una venta específica utilizando su ID único.
     *
     * Este método permite obtener los detalles de una venta a partir de su ID
     * único. Si no se encuentra ninguna venta con ese ID, puede devolver
     * `null`. Si ocurre algún problema durante la consulta, se lanza una
     * excepción PersistenciaException.
     *
     * @param idVenta El ID único de la venta a buscar.
     * @return El objeto Venta que corresponde al ID proporcionado, o `null` si
     * no se encuentra ninguna venta con ese ID.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * búsqueda.
     */
    @Override
    public Venta encontrarVentaPorId(String idVenta) throws PersistenciaException {
        try
        {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
            VentaMapeo ventaMapeo = coleccion.find(eq("_id", new ObjectId(idVenta))).first();

            if (ventaMapeo == null)
            {
                throw new PersistenciaException("No se encontró la venta con el ID especificado.");
            }

            return conversor.convertirAVentaEntidad(ventaMapeo);
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al buscar la venta por ID: " + e.getMessage());
        }
    }

    /**
     * Obtiene una lista de los años en los que se han registrado ventas.
     *
     * Este método consulta los años en los que se han realizado ventas,
     * retornando una lista de años. Si ocurre algún problema durante la
     * consulta, se lanza una excepción PersistenciaException.
     *
     * @return Una lista de enteros que representan los años en los que se han
     * registrado ventas.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * consulta.
     */
    @Override
    public List<Integer> obtenerAniosVentas() throws PersistenciaException {
        List<Integer> anios = new ArrayList<>();
        try
        {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            List<VentaMapeo> resultados = coleccion.find()
                    .projection(Projections.fields(Projections.include("fechaRegistro")))
                    .into(new ArrayList<>());

            for (VentaMapeo venta : coleccion.find())
            {
                Date fechaRegistro = venta.getFechaRegistro();
                if (fechaRegistro != null)
                {
                    int anio = fechaRegistro.toInstant().atZone(ZoneId.systemDefault()).getYear();
                    if (!anios.contains(anio))
                    {
                        anios.add(anio);
                    }
                }
            }
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al obtener los años de las ventas");
        }
        return anios;
    }

    /**
     * Consulta las ventas realizadas dentro de un rango de fechas de entrega.
     *
     * Este método obtiene todas las ventas cuya fecha de entrega se encuentra
     * dentro de un rango de fechas determinado. Si ocurre algún problema
     * durante la consulta, se lanza una excepción PersistenciaException.
     *
     * @param fechaInicio La fecha de inicio del rango de fechas de entrega.
     * @param fechaFin La fecha de fin del rango de fechas de entrega.
     * @return Una lista de objetos Venta que representan las ventas cuya fecha
     * de entrega está dentro del rango proporcionado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * consulta.
     */
    @Override
    public List<Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin) throws PersistenciaException {
        MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();
        Bson filtroRangoFechas = Filters.and(
                Filters.gte("fechaEntrega", fechaInicio),
                Filters.lte("fechaEntrega", fechaFin)
        );

        FindIterable<VentaMapeo> ventasPorRangoFechas = coleccion.find(filtroRangoFechas);
        List<Venta> ventas = new ArrayList<>();
        for (VentaMapeo venta : ventasPorRangoFechas)
        {
            ventas.add(conversor.convertirAVentaEntidad(venta));
        }
        return ventas;
    }

    /**
     * Consulta las ventas realizadas en un mes específico de un año.
     *
     * Este método consulta las ventas que se realizaron en un mes y año
     * específicos, devolviendo un objeto `Document` que contiene la información
     * de las ventas para ese mes.
     *
     * @param anio El año en el que se realizaron las ventas a consultar.
     * @param mes El mes en el que se realizaron las ventas a consultar.
     * @return Un objeto `Document` que contiene la información de las ventas
     * para el mes y año solicitados.
     */
    @Override
    public Document consultarVentasPorMes(int anio, int mes) {
        // Crear las fechas de inicio y fin del mes
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, 1, 0, 0, 0);
        Date fechaInicio = calendar.getTime();
        calendar.set(Calendar.MONTH, mes); // Primer día del siguiente mes
        Date fechaFin = calendar.getTime();

        // Crear el pipeline de consulta
        Document match = new Document("$match", new Document("fechaRegistro",
                new Document("$gte", fechaInicio).append("$lt", fechaFin)));
        Document group = new Document("$group", new Document("_id", null)
                .append("totalVentas", new Document("$sum", 1))
                .append("totalMonto", new Document("$sum", "$montoTotal")));

        AggregateIterable<Document> resultado = coleccion.aggregate(Arrays.asList(match, group));
        return resultado.first(); // Retorna el primer documento o null si no hay resultados
    }

    /**
     * Obtiene una lista de los meses en los que se han registrado ventas.
     *
     * Este método consulta todos los meses en los que se han realizado ventas,
     * retornando una lista de enteros que representan los meses. Si ocurre
     * algún problema durante la consulta, se lanza una excepción
     * PersistenciaException.
     *
     * @return Una lista de enteros que representan los meses en los que se han
     * registrado ventas.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * consulta.
     */
    @Override
    public List<Integer> obtenerMesesVentas() throws PersistenciaException {
        List<Integer> meses = new ArrayList<>();
        try
        {
            MongoCollection<VentaMapeo> coleccion = conexion.obtenerColeccion();

            List<VentaMapeo> resultados = coleccion.find()
                    .projection(Projections.fields(Projections.include("fechaRegistro")))
                    .into(new ArrayList<>());

            for (VentaMapeo venta : coleccion.find())
            {
                Date fechaRegistro = venta.getFechaRegistro();
                if (fechaRegistro != null)
                {
                    int mes = fechaRegistro.toInstant().atZone(ZoneId.systemDefault()).getMonthValue();
                    if (!meses.contains(mes))
                    {
                        meses.add(mes);
                    }
                }
            }
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al obtener los meses de las ventas");
        }
        return meses;
    }

}
