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
 * Clase del subsistema que agrega un cliente
 * @author joseq
 */
public class FuncionalidadAgregarClientes implements IFuncionalidadAgregarClientes {
    /**
     * Objeto de negocio del cliente
     */
    private IClientesBO clientesBO;

    /**
     * Constructor que inicializa el clienteBo
     */
    public FuncionalidadAgregarClientes() {
        this.clientesBO = new ClientesBO();
    }

    /**
     * Agrega un Cliente
     * @param cliente DTO del cliente
     * @return El cliente agregado
     */
    @Override
    public DTO_Cliente agregarCliente(DTO_Cliente cliente) {
        return clientesBO.agregarCliente(cliente);

    }
    
}
