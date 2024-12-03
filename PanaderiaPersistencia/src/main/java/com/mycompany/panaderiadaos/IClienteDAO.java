/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Cliente;
import java.util.List;

/**
 * Interfaz para la clienteDAO
 * 
 */
public interface IClienteDAO {

    /**
     * Agrega un nuevo cliente al sistema.
     *
     * Este método recibe un objeto de tipo Cliente y lo agrega a la base de
     * datos. Si ocurre algún problema durante el proceso de persistencia, se
     * lanza una excepción PersistenciaException.
     *
     * @param cliente El objeto Cliente que se va a agregar al sistema.
     * @return El objeto Cliente que ha sido agregado, con su información
     * actualizada (puede incluir un ID generado por la base de datos, por
     * ejemplo).
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * persistencia.
     */
    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException;

    /**
     * Actualiza los datos de un cliente existente en el sistema.
     *
     * Este método recibe un objeto de tipo Cliente con los datos actualizados y
     * los guarda en la base de datos. Si ocurre algún problema durante el
     * proceso de persistencia, se lanza una excepción PersistenciaException.
     *
     * @param cliente El objeto Cliente que contiene los datos actualizados.
     * @return El objeto Cliente actualizado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * persistencia.
     */
    public Cliente actualizarCliente(Cliente cliente) throws PersistenciaException;

    /**
     * Consulta todos los clientes almacenados en el sistema.
     *
     * Este método devuelve una lista de todos los objetos Cliente almacenados
     * en la base de datos. Si ocurre algún problema durante la consulta, se
     * lanza una excepción PersistenciaException.
     *
     * @return Una lista de objetos Cliente que representa todos los clientes
     * registrados en el sistema.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * consulta.
     */
    public List<Cliente> consultarClientes() throws PersistenciaException;

    /**
     * Encuentra un cliente específico utilizando su apellido paterno, apellido
     * materno, nombres y teléfono.
     *
     * Este método realiza una búsqueda de un cliente en la base de datos
     * utilizando los parámetros proporcionados. Si se encuentra el cliente, se
     * retorna el objeto Cliente correspondiente. Si ocurre algún problema
     * durante la búsqueda, se lanza una excepción PersistenciaException.
     *
     * @param apellidoPaterno El apellido paterno del cliente a buscar.
     * @param apellidoMaterno El apellido materno del cliente a buscar.
     * @param nombres Los nombres del cliente a buscar.
     * @param telefono El teléfono del cliente a buscar.
     * @return El objeto Cliente que corresponde a los parámetros
     * proporcionados.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * búsqueda.
     */
    public Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) throws PersistenciaException;

    /**
     * Encuentra un cliente específico utilizando su ID único.
     *
     * Este método realiza una búsqueda de un cliente en la base de datos
     * utilizando su ID único. Si se encuentra el cliente, se retorna el objeto
     * Cliente correspondiente. Si ocurre algún problema durante la búsqueda, se
     * lanza una excepción PersistenciaException.
     *
     * @param idCliente El ID único del cliente a buscar.
     * @return El objeto Cliente que corresponde al ID proporcionado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de
     * búsqueda.
     */
    public Cliente encontrarClienteID(String idCliente) throws PersistenciaException;
}
