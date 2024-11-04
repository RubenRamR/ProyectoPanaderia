/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.panaderiadominioentidades.Reporte;
import com.mycompany.panaderiadominiosMapeo.ReporteMapeo;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.bson.types.Binary;

/**
 * Clase para realizar conversiones entre objetos Reporte y ReporteMapeo.
 */
public class ReportesConversiones {

    /**
     * Constructor de la clase ReportesConversiones.
     */
    public ReportesConversiones() {
    }

    /**
     * Convierte un objeto Reporte a un objeto ReporteMapeo.
     *
     * @param reporte El objeto Reporte a convertir.
     * @return El objeto ReporteMapeo convertido.
     */
    public ReporteMapeo reporteEntidadAMapeo(Reporte reporte) {
        // Crea una nueva instancia de ReporteMapeo.
        ReporteMapeo reporteMapeo = new ReporteMapeo();
        // Establece la categoría del reporte mapeado.
        reporteMapeo.setCategoria(reporte.getCategoria());
        // Establece el nombre del reporte mapeado.
        reporteMapeo.setNombre(reporte.getNombre());
        // Establece el tipo del reporte mapeado.
        reporteMapeo.setTipo(reporte.getTipo());
        // Establece el contenido del reporte mapeado.
        reporteMapeo.setContenido(new Binary(reporte.getBytesContenido()));
        // Establece la fecha de expedición del reporte mapeado.
        reporteMapeo.setFechaExpedicion(reporte.getFechaExpedicion());
        // Retorna el reporte mapeado.
        return reporteMapeo;
    }

    /**
     * Convierte un objeto ReporteMapeo a un objeto Reporte.
     *
     * @param reporte El objeto ReporteMapeo a convertir.
     * @return El objeto Reporte convertido.
     */
    public Reporte reporteMapeoAEntidad(ReporteMapeo reporte) {
        // Crea una nueva instancia de Reporte.
        Reporte reporteE = new Reporte();
        // Establece el ID del reporte.
        reporteE.setId(reporte.getId().toString());
        // Establece la categoría del reporte.
        reporteE.setCategoria(reporte.getCategoria());
        // Establece el nombre del reporte.
        reporteE.setNombre(reporte.getNombre());
        // Establece el tipo del reporte.
        reporteE.setTipo(reporte.getTipo());
        // Establece la fecha de expedición del reporte.
        reporteE.setFechaExpedicion(reporte.getFechaExpedicion());
        // Obtiene el contenido del reporte mapeado en formato Base64.
        byte[] contenidoBytes64 = reporte.getContenido().getData();
        String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
        // Decodifica el contenido Base64 y lo establece en el reporte.
        byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
        reporteE.setBytesContenido(contenidoBytes);
        // Retorna el reporte convertido.
        return reporteE;
    }

    /**
     * Convierte una lista de objetos ReporteMapeo a una lista de objetos
     * Reporte.
     *
     * @param reportes La lista de objetos ReporteMapeo a convertir.
     * @return La lista de objetos Reporte convertida.
     */
    public List<Reporte> listaMapeosAEntidad(List<ReporteMapeo> reportes) {
        // Crea una nueva lista para almacenar los reportes convertidos.
        List<Reporte> reportesE = new ArrayList<>();
        // Itera sobre la lista de reportes mapeados y los convierte individualmente.
        for (ReporteMapeo reporteM : reportes) {
            Reporte reporte = new Reporte();
            reporte.setId(reporteM.getId().toHexString());
            reporte.setNombre(reporteM.getNombre());
            reporte.setCategoria(reporteM.getCategoria());
            reporte.setTipo(reporteM.getTipo());
            reporte.setFechaExpedicion(reporteM.getFechaExpedicion());
            byte[] contenidoBytes64 = reporteM.getContenido().getData();
            String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
            byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
            reporte.setBytesContenido(contenidoBytes);
            reportesE.add(reporte);
        }
        // Retorna la lista de reportes convertidos.
        return reportesE;
    }
}
