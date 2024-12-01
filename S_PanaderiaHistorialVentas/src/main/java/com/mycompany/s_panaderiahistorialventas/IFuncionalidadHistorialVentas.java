/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiahistorialventas;


import DTO.DTO_Venta;
import com.mycompany.panaderiadominioentidades.Venta;
import java.util.Date;
import java.util.List;
/**
 *
 * @author adane
 */
public interface IFuncionalidadHistorialVentas {
    
     public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin);
    
}
