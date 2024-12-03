/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiagestioningresosmensuales;

import java.util.List;
import org.bson.Document;

/**
 * Interfaz del subsistema IngresosMensuales
 * @author rramirez
 */
public interface IFuncionalidadIngresosMensuales {

    /**
     * Obtiene todas las ventas de un anio
     * @return lista de las ventas
     */
    public List<Integer> obtenerAniosVentas();

    /**
     * Obtiene las ventas de los meses
     * @return Lista de las ventas
     */
    public List<Integer> obtenerMesesVentas();

    /**
     * Regresa el documento de las ventas por el mes con paginacion
     * @param anio anio de la ventas
     * @param mes mes de las ventas
     * @return Documento con los filtros
     */
    public Document consultarVentasPorMes(int anio, int mes);

}
