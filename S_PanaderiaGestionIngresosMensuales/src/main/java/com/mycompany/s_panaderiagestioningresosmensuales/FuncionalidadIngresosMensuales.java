/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.s_panaderiagestioningresosmensuales;

import ConexionBD.ConexionMongoBD;
import com.mongodb.client.MongoCollection;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import java.util.List;
import org.bson.Document;

/**
 * Clase Subsistema ingresos mensuales que permite calcular los ingresos mensuales
 * @author rramirez
 */
public class FuncionalidadIngresosMensuales implements IFuncionalidadIngresosMensuales {

    IVentasBO ventaBO;
    ConexionMongoBD co = new ConexionMongoBD("localhost", 27017, "panaderia");
    IVentasBO vBO = new VentasBO(co.getColeccionVentas());

    /**
     * Constructor que inicializa la ventaBO
     */
    public FuncionalidadIngresosMensuales() {
        ventaBO = new VentasBO();
    }

    /**
     * Constructor que inicializa la collecion
     * @param coleccion coleccion de mongo
     */
    public FuncionalidadIngresosMensuales(MongoCollection<Document> coleccion) {
        this.vBO = new VentasBO(coleccion);
    }

    /**
     * Obtiene todas las ventas de un anio
     * @return lista de las ventas
     */
    @Override
    public List<Integer> obtenerAniosVentas() {
        return ventaBO.obtenerAniosVentas();
    }

     /**
     * Obtiene las ventas de los meses
     * @return Lista de las ventas
     */
    @Override
    public List<Integer> obtenerMesesVentas() {
        return ventaBO.obtenerMesesVentas();
    }

    /**
     * Regresa el documento de las ventas por el mes con paginacion
     * @param anio anio de la ventas
     * @param mes mes de las ventas
     * @return Documento con los filtros
     */
    @Override
    public Document consultarVentasPorMes(int anio, int mes) {
        return vBO.consultarVentasPorMes(anio, mes);
    }

}
