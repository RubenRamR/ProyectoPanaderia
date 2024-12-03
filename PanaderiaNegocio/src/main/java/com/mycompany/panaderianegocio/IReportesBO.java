/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import DTO.DTO_Reporte;
import java.util.List;

/**
 * Clase de tipo interfaz que implementa los metodos de ReportesDAO
 * 
 */
public interface IReportesBO {

    /**
     * Guarda un nuevo reporte en el sistema.
     *
     * @param reporte el reporte a guardar
     * @return el reporte guardado con cualquier información adicional generada
     * (e.g., ID)
     */
    public DTO_Reporte guardarReporte(DTO_Reporte reporte);

    /**
     * Consulta todos los reportes disponibles en el sistema.
     *
     * @return una lista de todos los reportes
     */
    public List<DTO_Reporte> consultarReportes();

    /**
     * Elimina un reporte específico del sistema.
     *
     * @param reporte el reporte a eliminar
     */
    public void eliminarReporte(DTO_Reporte reporte);
}
