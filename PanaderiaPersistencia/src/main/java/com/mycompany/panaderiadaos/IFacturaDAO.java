/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Factura;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.Date;
import java.util.List;


public interface IFacturaDAO {

    /**
     * Guarda la factura dada en el parámetro en la base de datos.
     *
     * @param factura Factura a guardar.
     * @return La factura que se guardó.
     * @throws PersistenciaException En caso de no poderse guardar la factura.
     */
    public Factura guardarFactura(Factura factura) throws PersistenciaException;

    /**
     * Extrae las facturas existentes de la base de datos como una lista.
     *
     * @return Lista de facturas.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<Factura> consultarFacturas() throws PersistenciaException;

    /**
     * Elimina la factura dada en el parámetro si y solo si coincide con una
     * factura en la base de datos.
     *
     * @param factura Factura que se desea eliminar.
     * @throws PersistenciaException En caso de no poder eliminarse o no haber
     * coincidencias.
     */
    public void eliminarFactura(Factura factura) throws PersistenciaException;
    
    /**
     * Enlista las facturas según el rango de fechas dadas por los parámetros.
     * @param desde Fecha de inicio.
     * @param hasta Fecha de fin.
     * @return Lista filtrada por rango de fechas.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<Factura> consultarFacturasPorRangoFechas(Date desde, Date hasta) throws PersistenciaException;
    
    /**
     * Enlista las facturas que correspondan a la lista de ventas asignada en el parámetro.
     * @param ventas Lista con las ventas a comparar.
     * @return Lista filtrada por cliente.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<Factura> facturasPorListaVentas(List<Venta> ventas) throws PersistenciaException;
    
    /**
     * Enlista las facturas con los filtros dados en los parámetros.
     * @param ventas Lista con las ventas a comparar.
     * @param desde Fecha de inicio.
     * @param hasta Fecha de fin.
     * @return Lista filtrada.
     * @throws PersistenciaException En caso de no poder consultar las facturas.
     */
    public List<Factura> consultarFacturasConFiltros(List<Venta> ventas, Date desde, Date hasta) throws PersistenciaException;
}
