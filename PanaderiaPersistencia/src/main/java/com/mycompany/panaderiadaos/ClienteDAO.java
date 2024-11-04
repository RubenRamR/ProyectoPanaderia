/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Accumulators.push;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;
import com.mycompany.panaderiadominioentidades.Cliente;
import com.mycompany.panaderiadominiosMapeo.ClienteMapeo;
import conversionesPersistencia.ClientesConversiones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


public class ClienteDAO implements IClienteDAO {

    private IConexion conexion;
    private ClientesConversiones conversor;

    public ClienteDAO() {
        conexion = new Conexion("clientes", ClienteMapeo.class);
        conversor = new ClientesConversiones();

    }

    /**
     * Permite agregar un cliente a la base de datos. Convierte el cliente dado
     * en el parámetro a su versión mapeada para la base de datos. Si la
     * operación se completa con éxito, devuelve el objeto Cliente con su ID
     * actualizado. En caso de error, lanza una excepción PersistenciaException.
     *
     * @param cliente El cliente a agregar.
     * @return El cliente que fue agregado.
     * @throws PersistenciaException En caso de no poder se agregado a la BD.
     */
    @Override
    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            ClienteMapeo clienteMapeo = conversor.convertirClienteAMapeoAgregar(cliente);
            coleccion.insertOne(clienteMapeo);
            cliente.setId(clienteMapeo.getId().toString());
            return cliente;
        } catch (Exception e) {
            throw new PersistenciaException("Error al agregar cliente: " + e.getMessage());
        }
    }

    /**
     * Actualiza un cliente existente en la base de datos con la información del
     * cliente dado en el parámetro siempre y cuando el id coincida. Utilizando
     * UpdateReuslt, confirmamos que el cliente fue actualizado, encaso de no
     * poder efectuarse dicha acción, puede arrojar PersistenciaExcepcion
     * dependiendo el caso.
     *
     * @param cliente El cliente que tiene los datos que necesitan ser
     * actualizados.
     * @return El cliente que fue actualizado.
     * @throws PersistenciaException En casi de que no se haya podido actualizar
     * el cliente o hubiese un error al respecto.
     */
    @Override
    public Cliente actualizarCliente(Cliente cliente) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            ClienteMapeo clienteActualizado = conversor.convertirClienteAMapeoConRFC(cliente);

            UpdateResult result;
            Bson filter = eq("_id", clienteActualizado.getId());

            // Crear y aplicar cada operación de actualización individualmente
            coleccion.updateOne(filter, set("nombre", clienteActualizado.getNombre()));
            coleccion.updateOne(filter, set("apellidoP", clienteActualizado.getApellidoP()));
            coleccion.updateOne(filter, set("apellidoM", clienteActualizado.getApellidoM()));
            coleccion.updateOne(filter, set("telefono", clienteActualizado.getTelefono()));
            coleccion.updateOne(filter, set("direcciones", clienteActualizado.getDirecciones()));

            if (cliente.getRfc() != null) {
                result = coleccion.updateOne(filter, set("rfc", cliente.getRfc()));
            } else {
                // Reemplazar el documento si rfc es null
                result = coleccion.replaceOne(filter, clienteActualizado);
            }

            if (result.getMatchedCount() == 1) {
                return cliente;
            } else {
                throw new PersistenciaException("No se pudo actualizar el cliente con ID: " + cliente.getId());
            }
        } catch (MongoException e) {
            throw new PersistenciaException("Error al actualizar cliente en la base de datos: " + e.getMessage());
        } catch (Exception e) {
            throw new PersistenciaException("Error inesperado al actualizar cliente: " + e.getMessage());
        }
    }

    /**
     * Recupera y obtiene a todos los clientes registrados en la base de datos,
     * covirtiendo las instancias de ClienteMapeo a Cliente. En caso de
     * cualquier error en la consulta, nos lanza PersistenciaException.
     *
     * @return Lista con todos los clientes consultados.
     * @throws PersistenciaException Si ocurrió un error con la consulta.
     */
    @Override
    public List<Cliente> consultarClientes() throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            FindIterable<ClienteMapeo> clientesConsulta = coleccion.find();
            List<Cliente> listaClientes = new ArrayList<>();

            for (ClienteMapeo cliente : clientesConsulta) {
                listaClientes.add(conversor.convertirCliente(cliente)); //Pendiende de si modificamos la conversión para el rfc
            }

            return listaClientes;
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar clientes: " + e.getMessage());
        }
    }

    /**
     * Busca un cliente que coincida con los datos dados en el parámetro, en
     * este caso siendo los apellidos, el nombre y el teléfono.
     *
     * @param apellidoPaterno Apellido paterno del cliente.
     * @param apellidoMaterno Apellido materno del cliente.
     * @param nombres Nombre(s) del cliente.
     * @param telefono Teléfono del cliente.
     * @return El cliente que coincida con la búsqueda realizada.
     * @throws PersistenciaException En caso de no haber coincidencias o haber
     * falla en la base de datos.
     */
    @Override
    public Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            BasicDBObject filtro = new BasicDBObject();
            filtro.put("apellidoP", apellidoPaterno);
            filtro.put("apellidoM", apellidoMaterno);
            filtro.put("nombre", nombres);
            filtro.put("telefono", telefono);
            Cliente clienteEncontrado = conversor.convertirCliente(coleccion.find(filtro).first());
            return clienteEncontrado;
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar cliente: " + e.getMessage());
        }
    }

    /**
     * Busca un cliente que coincida con los datos dados en el parámetro, en
     * este caso siendo el identificador del cliente.
     *
     * @param idCliente Identificador del cliente a encontrar.
     * @return El cliente que coincida con la búsqueda realizada.
     * @throws PersistenciaException En caso de no haber coincidencias o haber
     * falla en la base de datos.
     */
    @Override
    public Cliente encontrarClienteID(String idCliente) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            ClienteMapeo resultado = coleccion.find(eq("_id", new ObjectId(idCliente))).first();
            if (resultado != null) {
                return conversor.convertirCliente(resultado);
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar cliente por ID: " + e.getMessage());
        }
    }
}
