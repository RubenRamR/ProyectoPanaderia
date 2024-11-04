/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Cliente;
import java.util.List;


public interface IClienteDAO {
    

    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException;

    public Cliente actualizarCliente(Cliente cliente) throws PersistenciaException;

    public List<Cliente> consultarClientes() throws PersistenciaException;

    public Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) throws PersistenciaException;

    public Cliente encontrarClienteID(String idCliente) throws PersistenciaException;
}
