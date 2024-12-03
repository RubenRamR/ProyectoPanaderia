/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadagregarclientes;

import DTO.DTO_Cliente;

/**
 * Interfaz del subsistema Agregar Clientes
 * @author joseq
 */
public interface IFuncionalidadAgregarClientes {
    /**
     * Agrega un Cliente
     * @param cliente DTO del cliente
     * @return El cliente agregado
     */
    public DTO_Cliente agregarCliente(DTO_Cliente cliente);
}
