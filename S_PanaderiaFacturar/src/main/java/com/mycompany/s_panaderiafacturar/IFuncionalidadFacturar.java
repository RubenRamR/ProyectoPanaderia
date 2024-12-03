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
 * Interfaz del subsistema que permite facturar ventas de un cliente
 * @author NaderCroft
 */
public interface IFuncionalidadFacturar {
    /**
     * Regresa la lista de las ventas que coincidan con el id del cliente y que esten dentro del
     * rango de las fechas
     * @param clienteId Id unico del cliente
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @return Lista de ventas dto
     */
    public List<DTO_Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin);
    /**
     * Regresa la lista de todos los clientes
     * @return Lista dto de los clientes
     */
    public List<DTO_Cliente> consultarClientes();
    /**
     * Regresa el cliente que coincida con el id
     * @param idCliente Id unico del cliente
     * @return DTO del cliente
     */
    public DTO_Cliente encontrarClienteID(String idCliente);
}
