/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominioentidades.Reporte;
import DTO.DTO_Reporte;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase ReportesConversiones proporciona métodos para convertir entre
 * objetos Reporte y DTOs relacionados. Permite la conversión de reportes entre
 * entidades y DTOs, y viceversa. También incluye un método para convertir
 * listas de reportes a listas de DTOs de reportes.
 *
 * 
 */
public class ReportesConversiones {

    public ReportesConversiones() {
    }

    /**
     * Convierte un objeto Reporte a un DTO_Reporte.
     *
     * @param reporte el Reporte a convertir
     * @return el DTO_Reporte resultante
     */
    public DTO_Reporte reporteEntidadADto(Reporte reporte) {
        DTO_Reporte dtoReporte = new DTO_Reporte();
        dtoReporte.setId(reporte.getId());
        dtoReporte.setNombre(reporte.getNombre());
        dtoReporte.setCategoria(reporte.getCategoria());
        dtoReporte.setTipo(reporte.getTipo());
        dtoReporte.setFechaExpedicion(reporte.getFechaExpedicion());
        dtoReporte.setBytesContenido(reporte.getBytesContenido());
        return dtoReporte;
    }

    /**
     * Convierte un DTO_Reporte a un objeto Reporte.
     *
     * @param Dtoreporte el DTO_Reporte a convertir
     * @return el Reporte resultante
     */
    public Reporte reporteDtoAEntidad(DTO_Reporte Dtoreporte) {
        Reporte reporte = new Reporte();
        reporte.setId(Dtoreporte.getId());
        reporte.setNombre(Dtoreporte.getNombre());
        reporte.setTipo(Dtoreporte.getTipo());
        reporte.setCategoria(Dtoreporte.getCategoria());
        reporte.setFechaExpedicion(Dtoreporte.getFechaExpedicion());
        reporte.setBytesContenido(Dtoreporte.getBytesContenido());
        return reporte;
    }

    /**
     * Convierte una lista de objetos Reporte a una lista de DTO_Reporte.
     *
     * @param reportes la lista de Reportes a convertir
     * @return la lista de DTO_Reporte resultante
     */
    public List<DTO_Reporte> reportesADto(List<Reporte> reportes) {
        List<DTO_Reporte> reportesDto = new ArrayList<>();
        for (Reporte reporte : reportes) {
            DTO_Reporte reporteDto = new DTO_Reporte();
            reporteDto.setId(reporte.getId());
            reporteDto.setNombre(reporte.getNombre());
            reporteDto.setTipo(reporte.getTipo());
            reporteDto.setCategoria(reporte.getCategoria());
            reporteDto.setFechaExpedicion(reporte.getFechaExpedicion());
            reporteDto.setBytesContenido(reporte.getBytesContenido());
            reportesDto.add(reporteDto);
        }
        return reportesDto;
    }
}
