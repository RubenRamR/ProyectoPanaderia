/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;


public class DTO_ReporteIngresosFormato {

    private String ingresosTotales;
    private String fechaInicial;
    private String fechaFinal;
    private List<DTO_ReporteIngresosDetalles> listaDetalles;

    public DTO_ReporteIngresosFormato() {
    }

    public String getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(String ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public List<DTO_ReporteIngresosDetalles> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<DTO_ReporteIngresosDetalles> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }
    
    

}
