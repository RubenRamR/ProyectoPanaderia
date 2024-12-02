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
 *
 * @author NaderCroft
 */
public class FuncionalidadFacturar implements IFuncionalidadFacturar{
    private IVentasBO ventasBO;
    private IClientesBO clienteBO;

    public FuncionalidadFacturar() {
        this.ventasBO = new VentasBO();
        this.clienteBO = new ClientesBO();
    }
    
    @Override
    public List<DTO_Venta> consultarVentasPorClienteFecha(String clienteId, Date fechaInicio, Date fechaFin) {
        return ventasBO.consultarVentasPorClienteFecha(clienteId, fechaInicio, fechaFin);
    }

    @Override
    public List<DTO_Cliente> consultarClientes() {
        return clienteBO.consultarClientes();
    }

    @Override
    public DTO_Cliente encontrarClienteID(String idCliente) {
        return clienteBO.encontrarClienteID(idCliente);
    }
}
