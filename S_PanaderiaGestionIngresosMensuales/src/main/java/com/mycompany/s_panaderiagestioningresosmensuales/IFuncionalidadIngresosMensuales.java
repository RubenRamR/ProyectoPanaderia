/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiagestioningresosmensuales;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author rramirez
 */
public interface IFuncionalidadIngresosMensuales {

    public List<Integer> obtenerAniosVentas();

    public List<Integer> obtenerMesesVentas();

    public Document consultarVentasPorMes(int anio, int mes);

}
