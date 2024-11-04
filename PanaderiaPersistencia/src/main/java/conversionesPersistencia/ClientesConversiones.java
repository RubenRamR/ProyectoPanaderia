/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.panaderiadominioentidades.Cliente;
import com.mycompany.panaderiadominiosMapeo.DireccionMapeo;
import com.mycompany.panaderiadominiosMapeo.ClienteMapeo;
import com.mycompany.panaderiadominioentidades.Direccion;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class ClientesConversiones {

    /**
     * Crea una nueva instancia de la clase ClientesConversiones.
     */
    public ClientesConversiones() {
    }

    /**
     * Convierte un objeto ClienteMapeo a un objeto Cliente.
     *
     * @param cliente El objeto ClienteMapeo a convertir.
     * @return El objeto Cliente convertido.
     */
    public Cliente convertirCliente(ClienteMapeo cliente) {
        Cliente Cliente = new Cliente();
        Cliente.setId(cliente.getId().toString());
        Cliente.setNombre(cliente.getNombre());
        Cliente.setApellidoP(cliente.getApellidoP());
        Cliente.setApellidoM(cliente.getApellidoM());
        Cliente.setTelefono(cliente.getTelefono());
        if (cliente.getDirecciones() != null) {
            List<Direccion> direcciones = new ArrayList<>();
            for (DireccionMapeo direccion : cliente.getDirecciones()) {
                Direccion direccionE = new Direccion();
                direccionE.setColonia(direccion.getColonia());
                direccionE.setCalle(direccion.getCalle());
                direccionE.setNumExterior(direccion.getNumExterior());
                direcciones.add(direccionE);
            }
            Cliente.setDirecciones(direcciones);
        } else {
            Cliente.setDirecciones(new ArrayList<>());
        }

        return Cliente;
    }

    /**
     * Convierte un objeto Cliente a un objeto ClienteMapeo.
     *
     * @param cliente El objeto Cliente a convertir.
     * @return El objeto ClienteMapeo convertido.
     */
    public ClienteMapeo convertirClienteAMapeo(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteMapeo clienteMapeo = new ClienteMapeo();
        clienteMapeo.setId(new ObjectId(cliente.getId()));
        clienteMapeo.setNombre(cliente.getNombre());
        clienteMapeo.setApellidoP(cliente.getApellidoP());
        clienteMapeo.setApellidoM(cliente.getApellidoM());
        clienteMapeo.setTelefono(cliente.getTelefono());

        if (cliente.getDirecciones() != null) {
            List<DireccionMapeo> direccionesMapeo = new ArrayList<>();
            for (Direccion direccion : cliente.getDirecciones()) {
                DireccionMapeo direccionMapeo = new DireccionMapeo();
                direccionMapeo.setColonia(direccion.getColonia());
                direccionMapeo.setCalle(direccion.getCalle());
                direccionMapeo.setNumExterior(direccion.getNumExterior());
                direccionesMapeo.add(direccionMapeo);
            }
            clienteMapeo.setDirecciones(direccionesMapeo);
        } else {
            clienteMapeo.setDirecciones(new ArrayList<>());
        }

        return clienteMapeo;
    }

    /**
     * Convierte un objeto Cliente a un objeto ClienteMapeo para agregar.
     *
     * @param cliente El objeto Cliente a convertir.
     * @return El objeto ClienteMapeo convertido.
     */
    public ClienteMapeo convertirClienteAMapeoAgregar(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteMapeo clienteMapeo = new ClienteMapeo();
        clienteMapeo.setNombre(cliente.getNombre());
        clienteMapeo.setApellidoP(cliente.getApellidoP());
        clienteMapeo.setApellidoM(cliente.getApellidoM());
        clienteMapeo.setTelefono(cliente.getTelefono());

        if (cliente.getDirecciones() != null) {
            List<DireccionMapeo> direccionesMapeo = new ArrayList<>();
            for (Direccion direccion : cliente.getDirecciones()) {
                DireccionMapeo direccionMapeo = new DireccionMapeo();
                direccionMapeo.setColonia(direccion.getColonia());
                direccionMapeo.setCalle(direccion.getCalle());
                direccionMapeo.setNumExterior(direccion.getNumExterior());
                direccionesMapeo.add(direccionMapeo);
            }
            clienteMapeo.setDirecciones(direccionesMapeo);
        } else {
            clienteMapeo.setDirecciones(new ArrayList<>());
        }

        return clienteMapeo;
    }

    /**
     * Convierte un objeto ClienteMapeo a un objeto Cliente, incluyendo el RFC.
     *
     * @param cliente El objeto ClienteMapeo a convertir.
     * @return El objeto Cliente convertido.
     */
    public Cliente convertirClienteConRFC(ClienteMapeo cliente) {
        Cliente Cliente = new Cliente();
        Cliente.setId(cliente.getId().toString());
        Cliente.setNombre(cliente.getNombre());
        Cliente.setApellidoP(cliente.getApellidoP());
        Cliente.setApellidoM(cliente.getApellidoM());
        Cliente.setTelefono(cliente.getTelefono());
        Cliente.setRfc(cliente.getRfc());

        List<Direccion> direcciones = new ArrayList<>();
        for (DireccionMapeo direccion : cliente.getDirecciones()) {
            Direccion direccionE = new Direccion();
            direccionE.setColonia(direccion.getColonia());
            direccionE.setCalle(direccion.getCalle());
            direccionE.setNumExterior(direccion.getNumExterior());
            direcciones.add(direccionE);
        }

        Cliente.setDirecciones(direcciones);

        return Cliente;
    }

    /**
     * Convierte un objeto Cliente a un objeto ClienteMapeo, incluyendo el RFC.
     *
     * @param cliente El objeto Cliente a convertir.
     * @return El objeto ClienteMapeo convertido.
     */
    public ClienteMapeo convertirClienteAMapeoConRFC(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteMapeo clienteMapeo = new ClienteMapeo();
        clienteMapeo.setId(new ObjectId(cliente.getId()));
        clienteMapeo.setNombre(cliente.getNombre());
        clienteMapeo.setApellidoP(cliente.getApellidoP());
        clienteMapeo.setApellidoM(cliente.getApellidoM());
        clienteMapeo.setTelefono(cliente.getTelefono());
        cliente.setRfc(cliente.getRfc());

        List<DireccionMapeo> direccionesMapeo = new ArrayList<>();
        for (Direccion direccion : cliente.getDirecciones()) {
            DireccionMapeo direccionMapeo = new DireccionMapeo();
            direccionMapeo.setColonia(direccion.getColonia());
            direccionMapeo.setCalle(direccion.getCalle());
            direccionMapeo.setNumExterior(direccion.getNumExterior());
            direccionesMapeo.add(direccionMapeo);
        }

        clienteMapeo.setDirecciones(direccionesMapeo);

        return clienteMapeo;
    }

    /**
     * Convierte una lista de objetos ClienteMapeo a una lista de objetos
     * Cliente.
     *
     * @param clientesMapeo La lista de objetos ClienteMapeo a convertir.
     * @return La lista de objetos Cliente convertida.
     */
    public List<Cliente> convertirDesdeClientes(List<ClienteMapeo> clientesMapeo) {
        List<Cliente> clientes = new ArrayList<>();
        for (ClienteMapeo clienteMapeo : clientesMapeo) {
            Cliente cliente = convertirCliente(clienteMapeo);
            clientes.add(cliente);
        }
        return clientes;
    }

}
