/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.s_panaderiafacturar;

import DTO.DTO_Cliente;
import DTO.DTO_Venta;
import java.util.Date;
import java.util.List;

    

/**
 *
 * @author NaderCroft
 */
public interface IFuncionalidadFacturar {
    public List<DTO_Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin);
    
    public List<DTO_Cliente> consultarClientes();
    
    public DTO_Cliente encontrarClienteID(String idCliente);
}
