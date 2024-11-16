/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadagregarclientes;

import DTO.DTO_Cliente;
import com.mycompany.panaderianegocio.ClientesBO;
import com.mycompany.panaderianegocio.IClientesBO;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;



/**
 *
 * @author joseq
 */
public class FuncionalidadAgregarClientes implements IFuncionalidadAgregarClientes {
    
    private IClientesBO clientesBO;

    public FuncionalidadAgregarClientes() {
        this.clientesBO = new ClientesBO();
    }

    @Override
    public DTO_Cliente agregarCliente(DTO_Cliente cliente) {
        return clientesBO.agregarCliente(cliente);

    }
    
}
