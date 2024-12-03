/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import conversionesnegocio.ClientesConversiones;
import Exceptions.PersistenciaException;
import com.mycompany.panaderiadaos.ClienteDAO;
import com.mycompany.panaderiadaos.IClienteDAO;
import com.mycompany.panaderiadominioentidades.Cliente;
import DTO.DTO_Cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representa la lógica de negocio para la gestión de clientes.
 * Implementa la interfaz IClientesBO. Proporciona métodos para consultar,
 * agregar, actualizar y encontrar clientes.
 */
public class ClientesBO implements IClientesBO {

    private IClienteDAO clienteDAO;
    private ClientesConversiones conversor;

    /**
     * Constructor por defecto que inicializa las dependencias de DAO y
     * conversor.
     */
    public ClientesBO() {
        this.clienteDAO = new ClienteDAO();
        conversor = new ClientesConversiones();
    }

    /**
     * Consulta todos los clientes existentes.
     *
     * @return una lista de DTO_Cliente representando todos los clientes, o null
     * si ocurre una excepción.
     */
    @Override
    public List<DTO_Cliente> consultarClientes() {
        try {
            List<DTO_Cliente> clientes = conversor.convertirDesdeClientes(clienteDAO.consultarClientes());
            return clientes;
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Agrega un nuevo cliente.
     *
     * @param cliente el DTO_Cliente que se desea agregar.
     * @return el DTO_Cliente agregado con su ID generado, o null si ocurre una
     * excepción.
     */
    @Override
    public DTO_Cliente agregarCliente(DTO_Cliente cliente) {
        try {
            Cliente clienteA = clienteDAO.agregarCliente(conversor.convertirAEntidadaSinID(cliente));
            return conversor.convertirCliente(clienteA);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ClientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    /**
     * Actualiza un cliente existente.
     *
     * @param cliente el DTO_Cliente con los datos actualizados.
     * @return el DTO_Cliente actualizado, o null si ocurre una excepción.
     */
    @Override
    public DTO_Cliente actualizarCliente(DTO_Cliente cliente) {
        try {
            clienteDAO.actualizarCliente(conversor.convertirDtoClienteAEntidadConRfc(cliente));
            return cliente;
        } catch (PersistenciaException e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * Encuentra un cliente basado en sus datos personales.
     *
     * @param apellidoPaterno el apellido paterno del cliente.
     * @param apellidoMaterno el apellido materno del cliente.
     * @param nombres los nombres del cliente.
     * @param telefono el teléfono del cliente.
     * @return el DTO_Cliente encontrado, o null si ocurre una excepción.
     */
    @Override
    public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) {
        try {
            DTO_Cliente cliente = conversor.convertirCliente(clienteDAO.encontrarCliente(apellidoPaterno, apellidoMaterno, nombres, telefono));
            return cliente;
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Encuentra un cliente basado en su ID.
     *
     * @param idCliente el ID del cliente.
     * @return el DTO_Cliente encontrado, o null si ocurre una excepción.
     */
    @Override
    public DTO_Cliente encontrarClienteID(String idCliente) {
        try {
            return conversor.convertirCliente(clienteDAO.encontrarClienteID(idCliente));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Actualiza un cliente en una venta especifica
     * @param cliente la DTO del cliente
     * @return El cliente actualizado, o null si ocurre una excepcion
     */
    @Override
    public DTO_Cliente actualizarClienteEnVentas(DTO_Cliente cliente) {

        try {
            clienteDAO.actualizarCliente(conversor.convertirDtoClienteAEntidad(cliente));
            return cliente;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ClientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    /**
     * actualiza el cliente cuando viene de la venta, incluye rfc
     *
     * @param cliente el DTO_Cliente con los datos actualizados.
     * @return el DTO_Cliente actualizado, o null si ocurre una excepción.
     */
    @Override
    public DTO_Cliente actualizarClienteEnVentasConRFC(DTO_Cliente cliente){
        try {
            clienteDAO.actualizarCliente(conversor.convertirDtoClienteAEntidadConRfc(cliente));
            return cliente;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ClientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
