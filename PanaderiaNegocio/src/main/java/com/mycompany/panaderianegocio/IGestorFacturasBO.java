/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import DTO.DTO_Factura;
import DTO.DTO_Venta;
import java.util.Date;
import java.util.List;


public interface IGestorFacturasBO {

    /**
     * Guarda la factura dada en el parámetro en la base de datos.
     *
     * @param factura Factura a guardar.
     * @return La factura que se guardó.
     */
    public DTO_Factura guardarFactura(DTO_Factura factura);

    /**
     * Extrae las facturas existentes de la base de datos como una lista.
     *
     * @return Lista de facturas.
     */
    public List<DTO_Factura> consultarFacturas();

    /**
     * Elimina la factura dada en el parámetro si y solo si coincide con una
     * factura en la base de datos.
     *
     * @param factura Factura que se desea eliminar.
     * @throws PersistenciaException En caso de no poder eliminarse o no haber
     * coincidencias.
     */
    public void eliminarFactura(DTO_Factura factura) throws PersistenciaException;
    
    /**
     * Enlista las facturas según el rango de fechas dadas por los parámetros.
     * @param desde Fecha de inicio.
     * @param hasta Fecha de fin.
     * @return Lista filtrada por rango de fechas.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<DTO_Factura> consultarFacturasPorRangoFechas(Date desde, Date hasta) throws PersistenciaException;
    
    /**
     * Enlista las facturas que correspondan a la lista de ventas asignada en el parámetro.
     * @param ventas Lista con las ventas a comparar.
     * @return Lista filtrada por cliente.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<DTO_Factura> facturasPorListaVentas(List<DTO_Venta> ventas) throws PersistenciaException;
    
    /**
     * Enlista las facturas con los filtros dados en los parámetros.
     * @param ventas Lista con las ventas a comparar.
     * @param desde Fecha de inicio.
     * @param hasta Fecha de fin.
     * @return Lista filtrada.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<DTO_Factura> consultarFacturasConFiltros(List<DTO_Venta> ventas, Date desde, Date hasta) throws PersistenciaException;

}
