/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadaos.IReporteDAO;
import com.mycompany.panaderiadaos.ReporteDAO;
import com.mycompany.panaderiadominioentidades.Reporte;
import conversionesnegocio.ReportesConversiones;
import DTO.DTO_Reporte;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class ReportesBO implements IReportesBO {

    ReportesConversiones conversor;
    IReporteDAO reporteDAO;

    public ReportesBO() {
        conversor = new ReportesConversiones();
        reporteDAO = new ReporteDAO();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Reporte guardarReporte(DTO_Reporte reporte) {
        Reporte reporteConvertido = conversor.reporteDtoAEntidad(reporte);
        Reporte reporteNuevo;
        try {
            reporteNuevo = reporteDAO.guardarReporte(reporteConvertido);
            return conversor.reporteEntidadADto(reporteNuevo);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ReportesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Reporte> consultarReportes() {
        List<DTO_Reporte> reportes;
        try {
            reportes = conversor.reportesADto(reporteDAO.consultarReportes());
            return reportes;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ReportesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminarReporte(DTO_Reporte reporte) {
        try {
            reporteDAO.eliminarReporte(conversor.reporteDtoAEntidad(reporte));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ReportesBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
