/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.panaderiadominioentidades.Reporte;
import com.mycompany.panaderiadominiosMapeo.ReporteMapeo;
import conversionesPersistencia.ReportesConversiones;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase ReporteDAO Esta clase implementa la interfaz IReporteDAO para
 * proporcionar métodos para guardar, consultar y eliminar reportes en la base
 * de datos.
 *
 */
public class ReporteDAO implements IReporteDAO {

    private IConexion conexion;
    private ReportesConversiones conversor;

    /**
     * Constructor de la clase ReporteDAO. Inicializa la conexión a la base de
     * datos y el conversor de reportes.
     */
    public ReporteDAO() {
        conexion = new Conexion("Reportes", ReporteMapeo.class);
        conversor = new ReportesConversiones();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reporte guardarReporte(Reporte reporte) throws PersistenciaException {
        MongoCollection<ReporteMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(conversor.reporteEntidadAMapeo(reporte));
        return reporte;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Reporte> consultarReportes() throws PersistenciaException {
        MongoCollection<ReporteMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ReporteMapeo> reportes = coleccion.find();
        List<Reporte> reportesE = new ArrayList<>();
        for (ReporteMapeo reporteM : reportes) {
            reportesE.add(conversor.reporteMapeoAEntidad(reporteM));
        }
        return reportesE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminarReporte(Reporte reporte) throws PersistenciaException {
        try {
            MongoCollection<ReporteMapeo> coleccion = conexion.obtenerColeccion();
            coleccion.deleteOne(Filters.eq("_id", new ObjectId(reporte.getId())));
        } catch (Exception e) {
            throw new PersistenciaException("Error al eliminar el reporte: " + e.getMessage());
        }
    }
}
