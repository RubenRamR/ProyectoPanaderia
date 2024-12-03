/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;
/**
 * DTO de los reportes
 * 
 */
public class DTO_ReporteIngresosFormato {

    /**
     * Ingresos totales del reporte
     */
    private String ingresosTotales;
    /**
     * Fecha inicial 
     */
    private String fechaInicial;
    /**
     * fecha final
     */
    private String fechaFinal;
    /**
     * Lista del reporte
     */
    private List<DTO_ReporteIngresosDetalles> listaDetalles;

    /**
     * Constructor vacío de la clase DTO_ReporteIngresosFormato.
     *
     * Este constructor inicializa un objeto de la clase sin valores
     * predefinidos. Se utiliza para crear una instancia vacía que luego puede
     * ser configurada mediante los métodos `set`.
     */
    public DTO_ReporteIngresosFormato() {
    }

    /**
     * Obtiene los ingresos totales reportados.
     *
     * Este método devuelve los ingresos totales generados durante el período
     * del reporte. Los ingresos se devuelven como un valor de tipo `String`, lo
     * que sugiere que el valor puede incluir símbolos monetarios o un formato
     * específico.
     *
     * @return Los ingresos totales como un valor de tipo `String`.
     */
    public String getIngresosTotales() {
        return ingresosTotales;
    }

    /**
     * Establece los ingresos totales reportados.
     *
     * Este método permite establecer los ingresos totales generados durante el
     * período del reporte. El valor proporcionado se guarda en el atributo
     * `ingresosTotales` de tipo `String`.
     *
     * @param ingresosTotales Los ingresos totales como un valor de tipo
     * `String`.
     */
    public void setIngresosTotales(String ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    /**
     * Obtiene la fecha de inicio del reporte.
     *
     * Este método devuelve la fecha de inicio del período que cubre el reporte.
     * La fecha está representada como una cadena de texto (`String`).
     *
     * @return La fecha de inicio del reporte como un valor de tipo `String`.
     */
    public String getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Establece la fecha de inicio del reporte.
     *
     * Este método permite establecer la fecha de inicio del período que cubre
     * el reporte. El valor proporcionado se guarda en el atributo
     * `fechaInicial` de tipo `String`.
     *
     * @param fechaInicial La fecha de inicio del reporte como un valor de tipo
     * `String`.
     */
    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * Obtiene la fecha de finalización del reporte.
     *
     * Este método devuelve la fecha de finalización del período que cubre el
     * reporte. La fecha está representada como una cadena de texto (`String`).
     *
     * @return La fecha de finalización del reporte como un valor de tipo
     * `String`.
     */
    public String getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Establece la fecha de finalización del reporte.
     *
     * Este método permite establecer la fecha de finalización del período que
     * cubre el reporte. El valor proporcionado se guarda en el atributo
     * `fechaFinal` de tipo `String`.
     *
     * @param fechaFinal La fecha de finalización del reporte como un valor de
     * tipo `String`.
     */
    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * Obtiene la lista de detalles del reporte de ingresos.
     *
     * Este método devuelve una lista de objetos de tipo
     * `DTO_ReporteIngresosDetalles`, que contienen información detallada sobre
     * las ventas, ganancias y compras durante el período del reporte.
     *
     * @return Una lista de objetos `DTO_ReporteIngresosDetalles` como un valor
     * de tipo `List<DTO_ReporteIngresosDetalles>`.
     */
    public List<DTO_ReporteIngresosDetalles> getListaDetalles() {
        return listaDetalles;
    }

    /**
     * Establece la lista de detalles del reporte de ingresos.
     *
     * Este método permite establecer la lista de objetos
     * `DTO_ReporteIngresosDetalles`, los cuales contienen información detallada
     * sobre las ventas y otros datos relacionados con los ingresos en el
     * período del reporte.
     *
     * @param listaDetalles La lista de detalles como un valor de tipo
     * `List<DTO_ReporteIngresosDetalles>`.
     */
    public void setListaDetalles(List<DTO_ReporteIngresosDetalles> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

}
