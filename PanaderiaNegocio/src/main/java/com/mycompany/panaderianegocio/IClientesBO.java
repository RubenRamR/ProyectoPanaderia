/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderianegocio;

import DTO.DTO_Cliente;
import java.util.List;

/**
 * Clase de tipo intefaz que implementa los metodos de ClientesDAO
 * @author Nadercroft
 */
public interface IClientesBO {

    /**
     * Consulta todos los clientes existentes.
     *
     * @return una lista de DTO_Cliente representando todos los clientes, o null
     * si ocurre una excepción.
     */
    public List<DTO_Cliente> consultarClientes();

    /**
     * Agrega un nuevo cliente.
     *
     * @param clientes el DTO_Cliente que se desea agregar.
     * @return el DTO_Cliente agregado con su ID generado, o null si ocurre una
     * excepción.
     */
    public DTO_Cliente agregarCliente(DTO_Cliente clientes);

    /**
     * Encuentra un cliente basado en sus datos personales.
     *
     * @param apellidoPaterno el apellido paterno del cliente.
     * @param apellidoMaterno el apellido materno del cliente.
     * @param nombres los nombres del cliente.
     * @param telefono el teléfono del cliente.
     * @return el DTO_Cliente encontrado, o null si ocurre una excepción.
     */
    public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono);

    /**
     * Encuentra un cliente basado en su ID.
     *
     * @param idCliente el ID del cliente.
     * @return el DTO_Cliente encontrado, o null si ocurre una excepción.
     */
    public DTO_Cliente encontrarClienteID(String idCliente);

    /**
     * Actualiza un cliente existente.
     *
     * @param cliente el DTO_Cliente con los datos actualizados.
     * @return el DTO_Cliente actualizado, o null si ocurre una excepción.
     */
    public DTO_Cliente actualizarCliente(DTO_Cliente cliente);

    /**
     * actusliza el cliente cuando viene de la venta
     *
     * @param cliente el DTO_Cliente con los datos actualizados.
     * @return el DTO_Cliente actualizado, o null si ocurre una excepción.
     */
    public DTO_Cliente actualizarClienteEnVentas(DTO_Cliente cliente);
    
    /**
     * Actualiza el cliente cuando viene de la venta, incluye rfc.
     *
     * @param cliente el DTO_Cliente con los datos actualizados.
     * @return el DTO_Cliente actualizado, o null si ocurre una excepción.
     */
    public DTO_Cliente actualizarClienteEnVentasConRFC(DTO_Cliente cliente);
}
