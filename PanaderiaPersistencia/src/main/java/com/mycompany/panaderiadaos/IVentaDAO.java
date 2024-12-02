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

    public Float calcularIngresosTotales() throws PersistenciaException;

    public List<Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) throws PersistenciaException;

    public Venta actualizarVenta(Venta venta) throws PersistenciaException;

    public List<Venta> consultarVentasPendiente(int pagina, int cantidad) throws PersistenciaException;

    public Venta encontrarVentaPorId(String idVenta) throws PersistenciaException;

    public List<Venta> consultarVentasPorRangoFechasEntrega(Date fechaInicio, Date fechaFin) throws PersistenciaException;

    public List<Integer> obtenerAniosVentas() throws PersistenciaException;

    public Document consultarVentasPorMes(int anio, int mes);

    public List<Integer> obtenerMesesVentas() throws PersistenciaException;

}
