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
 *
 * @author rramirez
 */
public class FuncionalidadIngresosMensuales implements IFuncionalidadIngresosMensuales {

    IVentasBO ventaBO;
    ConexionMongoBD co = new ConexionMongoBD("localhost", 27017, "panaderia");
    IVentasBO vBO = new VentasBO(co.getColeccionVentas());

    public FuncionalidadIngresosMensuales() {
        ventaBO = new VentasBO();
    }

    public FuncionalidadIngresosMensuales(MongoCollection<Document> coleccion) {
        this.vBO = new VentasBO(coleccion);
    }

    @Override
    public List<Integer> obtenerAniosVentas() {
        return ventaBO.obtenerAniosVentas();
    }

    @Override
    public List<Integer> obtenerMesesVentas() {
        return ventaBO.obtenerMesesVentas();
    }

    @Override
    public Document consultarVentasPorMes(int anio, int mes) {
        return vBO.consultarVentasPorMes(anio, mes);
    }

}
