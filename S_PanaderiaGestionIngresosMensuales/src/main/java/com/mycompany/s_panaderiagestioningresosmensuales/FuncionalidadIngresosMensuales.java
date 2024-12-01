/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.s_panaderiagestioningresosmensuales;

import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;

/**
 *
 * @author rramirez
 */
public class FuncionalidadIngresosMensuales implements IFuncionalidadIngresosMensuales {

    IVentasBO ventaBO;

    public FuncionalidadIngresosMensuales() {
        ventaBO = new VentasBO();
    }

    @Override
    public Float calcularIngresosTotales() {
        return ventaBO.calcularIngresosTotales();
    }

}
