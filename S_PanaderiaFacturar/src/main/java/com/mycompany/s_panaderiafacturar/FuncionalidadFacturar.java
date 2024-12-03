/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_panaderiafacturar;

import DTO.DTO_Cliente;
import DTO.DTO_Venta;
import com.mycompany.panaderianegocio.ClientesBO;
import com.mycompany.panaderianegocio.IClientesBO;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import java.util.Date;
import java.util.List;

/**
 * Clase del subsistema que permite facturar ventas de un cliente
 * @author NaderCroft
 */
public class FuncionalidadFacturar implements IFuncionalidadFacturar{
    /**
     * Objeto de negocio de ventas
     */
    private IVentasBO ventasBO;
    /**
     * Objeto de negocio de clientes
     */
    private IClientesBO clienteBO;

    /**
     * Constructorq que inicializa el ventasBO y clientesBO
     */
    public FuncionalidadFacturar() {
        this.ventasBO = new VentasBO();
        this.clienteBO = new ClientesBO();
    }
    /**
     * Regresa la lista de las ventas que coincidan con el id del cliente y que esten dentro del
     * rango de las fechas
     * @param clienteId Id unico del cliente
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @return Lista de ventas dto
     */
    @Override
    public List<DTO_Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) {
        return ventasBO.consultarVentasPorClienteFecha(clienteId, fechaInicio, fechaFin);
    }

    /**
     * Regresa la lista de todos los clientes
     * @return Lista dto de los clientes
     */
    @Override
    public List<DTO_Cliente> consultarClientes() {
        return clienteBO.consultarClientes();
    }

    /**
     * Regresa el cliente que coincida con el id
     * @param idCliente Id unico del cliente
     * @return DTO del cliente
     */
    @Override
    public DTO_Cliente encontrarClienteID(String idCliente) {
        return clienteBO.encontrarClienteID(idCliente);
    }
}
