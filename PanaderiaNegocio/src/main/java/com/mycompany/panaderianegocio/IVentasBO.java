/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Excepciones.ConsultarVentasPorFechaException;
import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominiosMapeo.IngredienteMapeo;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * 
 */
public interface IVentasBO {

    /**
     * Agrega una nueva venta en el sistema.
     *
     * @param venta la venta a agregar
     */
    public void agregarVenta(DTO_Venta venta);

    /**
     * Consulta las ventas realizadas en un rango de fechas especificado.
     *
     * @param fechaInicio la fecha de inicio del rango
     * @param fechaFin la fecha de fin del rango
     * @return una lista de ventas realizadas en el rango de fechas especificado
     */
    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin);

    /**
     * Consulta todas las ventas registradas en el sistema.
     *
     * @return una lista de todas las ventas
     */
    public List<DTO_Venta> consultarVentas();

    /**
     * Encuentra una venta específica por su ID.
     *
     * @param idVenta el ID de la venta a encontrar
     * @return la venta correspondiente al ID proporcionado, o null si no se
     * encuentra
     */
    public DTO_Venta encontrarVenta(String idVenta);

    /**
     * Consulta las ventas realizadas por un cliente específico.
     *
     * @param clienteId el ID del cliente
     * @return una lista de ventas realizadas por el cliente
     */
    public List<DTO_Venta> ventasPorCliente(String clienteId);

    /**
     * Consulta las ventas que incluyen una lista específica de productos.
     *
     * @param listaProductos la lista de productos
     * @return una lista de ventas que incluyen los productos especificados
     */
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos);

    /**
     * Consulta las ventas realizadas en un rango de fechas especificado.
     *
     * @param fechaInicio la fecha de inicio del rango
     * @param fechaFin la fecha de fin del rango
     * @return una lista de ventas realizadas en el rango de fechas especificado
     */
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin);

    /**
     * Consulta las ventas utilizando varios filtros: cliente, rango de fechas y
     * lista de productos.
     *
     * @param clienteId el ID del cliente
     * @param fechaInicio la fecha de inicio del rango
     * @param fechaFin la fecha de fin del rango
     * @param listaProductos la lista de productos
     * @return una lista de ventas que cumplen con los filtros especificados
     */
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos);

    public List<DTO_Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin);
    /**
     * Consulta las ventas realizadas en una fecha específica.
     *
     * @param fecha la fecha de consulta
     * @return una lista de ventas realizadas en la fecha especificada
     * @throws ConsultarVentasPorFechaException si ocurre un error durante la
     * consulta
     */
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) throws ConsultarVentasPorFechaException;

    /**
     * Verifica la existencia de los ingredientes necesarios para un producto en
     * el stock.
     *
     * @param producto el producto a verificar
     * @return true si los ingredientes están en stock, false en caso contrario
     */
    public boolean consultarExistenciaIngredientesStock(DTO_Producto producto);

    /**
     * Calcula la cantidad de un ingrediente necesario según el tamaño del
     * producto.
     *
     * @param ingredienteDetalle el detalle del ingrediente
     * @param tamanio el tamaño del producto
     * @return la cantidad calculada del ingrediente
     */
    public Float calcularCantidadIngrediente(DTO_IngredienteDetalle ingredienteDetalle, String tamanio);

    /**
     * Convierte un DTO_Ingrediente a un objeto Ingrediente.
     *
     * @param ingrediente el DTO_Ingrediente que se desea convertir.
     * @return el objeto Ingrediente convertido, o null si ocurre una excepción.
     */
    IngredienteMapeo ConvertirDTOAIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Convierte un objeto Ingrediente a un DTO_Ingrediente.
     *
     * @param ingrediente el objeto Ingrediente que se desea convertir.
     * @return el DTO_Ingrediente convertido, o null si ocurre una excepción.
     */
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente);
}
