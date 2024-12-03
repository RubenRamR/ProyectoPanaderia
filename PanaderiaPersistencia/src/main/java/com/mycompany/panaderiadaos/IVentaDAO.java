/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominioentidades.Venta;
import com.mycompany.panaderiadominiosMapeo.VentaMapeo;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.bson.Document;

/**
 * Interfaz IVentaDAO Esta interfaz define los métodos para realizar operaciones
 * relacionadas con las ventas en la base de datos.
 *
 */
public interface IVentaDAO {

    /**
     * Agrega una venta a la base de datos.
     *
     * @param venta La venta que se va a agregar.
     * @return La venta agregada.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Venta agregarVenta(Venta venta) throws PersistenciaException;

    /**
     * Elimina una venta de la base de datos.
     *
     * @param venta La venta que se va a eliminar.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public void eliminarVenta(Venta venta) throws PersistenciaException;

    /**
     * Consulta todas las ventas almacenadas en la base de datos.
     *
     * @return Una lista de ventas.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Venta> consultarVentas() throws PersistenciaException;

    /**
     * Consulta las ventas realizadas por un cliente específico.
     *
     * @param clienteId El ID del cliente.
     * @return Una lista de ventas del cliente.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Venta> ventasPorCliente(String clienteId) throws PersistenciaException;

    /**
     * Consulta las ventas realizadas en un rango de fechas específico.
     *
     * @param fechaInicio La fecha de inicio del rango.
     * @param fechaFin La fecha de fin del rango.
     * @return Una lista de ventas dentro del rango de fechas.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) throws PersistenciaException;

    /**
     * Consulta las ventas realizadas en una fecha específica.
     *
     * @param fecha La fecha de las ventas a consultar.
     * @return Una lista de ventas realizadas en la fecha especificada.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Venta> consultarVentasPorFecha(Date fecha) throws PersistenciaException;

    /**
     * Encuentra una venta por su ID.
     *
     * @param idVenta El ID de la venta a encontrar.
     * @return La venta encontrada, o null si no se encuentra ninguna venta con
     * el ID especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Venta encontrarVenta(String idVenta) throws PersistenciaException;

    /**
     * Consulta las ventas que incluyen ciertos productos.
     *
     * @param listaProductos La lista de productos para buscar en las ventas.
     * @return Una lista de ventas que incluyen los productos especificados.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Venta> consultarVentasPorProductos(List<Producto> listaProductos) throws PersistenciaException;

    /**
     * Consulta las ventas con filtros combinados.
     *
     * @param clienteId El ID del cliente.
     * @param fechaInicio La fecha de inicio del rango.
     * @param fechaFin La fecha de fin del rango.
     * @param listaProductos La lista de productos para buscar en las ventas.
     * @return Una lista de ventas que cumplen con los filtros especificados.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<Producto> listaProductos) throws PersistenciaException;

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
    public Float calcularIngresosTotales() throws PersistenciaException;

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
    public List<Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) throws PersistenciaException;

    /**
     * Actualiza los detalles de una venta existente.
     *
     * Este método recibe un objeto de tipo Venta con los datos actualizados y
     * los guarda en la base de datos. Si ocurre algún problema durante la
     * actualización, se lanza una excepción PersistenciaException.
     *
     * @param venta El objeto Venta que contiene los datos actualizados.
     * @return El objeto Venta actualizado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * actualización.
     */
    public Venta actualizarVenta(Venta venta) throws PersistenciaException;

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
    public List<Venta> consultarVentasPendiente(int pagina, int cantidad) throws PersistenciaException;

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
    public Venta encontrarVentaPorId(String idVenta) throws PersistenciaException;

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
    public List<Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin) throws PersistenciaException;

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
    public List<Integer> obtenerAniosVentas() throws PersistenciaException;

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
    public Document consultarVentasPorMes(int anio, int mes);

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
    public List<Integer> obtenerMesesVentas() throws PersistenciaException;

}
