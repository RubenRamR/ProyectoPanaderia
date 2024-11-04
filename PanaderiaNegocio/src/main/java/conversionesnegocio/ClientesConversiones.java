/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominioentidades.Cliente;
import com.mycompany.panaderiadominioentidades.Direccion;
import DTO.DTO_Cliente;
import DTO.DTO_Direccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class ClientesConversiones {

    public ClientesConversiones() {

    }

    /**
     * Convierte un DTO_Cliente a un objeto Cliente sin ID.
     *
     * @param cliente el DTO_Cliente a convertir
     * @return el objeto Cliente resultante
     */
    public Cliente convertirAEntidadaSinID(DTO_Cliente cliente) {
        Cliente entidadCliente = new Cliente();
        entidadCliente.setNombre(cliente.getNombre());
        entidadCliente.setApellidoP(cliente.getApellidoP());
        entidadCliente.setApellidoM(cliente.getApellidoM());
        entidadCliente.setTelefono(cliente.getTelefono());

        if (cliente.getDirecciones() != null) {
            List<Direccion> direcciones = new ArrayList<>();
            for (DTO_Direccion dtoDireccion : cliente.getDirecciones()) {
                Direccion direccion = new Direccion();
                direccion.setColonia(dtoDireccion.getColonia());
                direccion.setCalle(dtoDireccion.getCalle());
                direccion.setNumExterior(dtoDireccion.getNumExterior());
                direcciones.add(direccion);
            }
            entidadCliente.setDirecciones(direcciones);
        } else {
            entidadCliente.setDirecciones(new ArrayList<>());
        }

        return entidadCliente;

    }

    /**
     * Convierte un objeto Cliente a un DTO_Cliente.
     *
     * @param cliente el Cliente a convertir
     * @return el DTO_Cliente resultante
     */
    public DTO_Cliente convertirCliente(Cliente cliente) {
        DTO_Cliente dtoCliente = new DTO_Cliente();
        dtoCliente.setID(cliente.getId());
        dtoCliente.setNombre(cliente.getNombre());
        dtoCliente.setApellidoP(cliente.getApellidoP());
        dtoCliente.setApellidoM(cliente.getApellidoM());
        dtoCliente.setTelefono(cliente.getTelefono());

        if (cliente.getDirecciones() != null) {
            List<DTO_Direccion> direcciones = new ArrayList<>();
            for (Direccion direccion : cliente.getDirecciones()) {
                DTO_Direccion dtoDireccion = new DTO_Direccion();
                dtoDireccion.setColonia(direccion.getColonia());
                dtoDireccion.setCalle(direccion.getCalle());
                dtoDireccion.setNumExterior(direccion.getNumExterior());
                direcciones.add(dtoDireccion);
            }
            dtoCliente.setDirecciones(direcciones);
        } else {
            dtoCliente.setDirecciones(new ArrayList<>());
        }

        return dtoCliente;
    }

    /**
     * Convierte un DTO_Cliente a un objeto Cliente con ID.
     *
     * @param dtoCliente el DTO_Cliente a convertir
     * @return el objeto Cliente resultante
     */
    public Cliente convertirDtoClienteAEntidad(DTO_Cliente dtoCliente) {
        Cliente cliente = new Cliente();
        cliente.setId(dtoCliente.getID());
        cliente.setNombre(dtoCliente.getNombre());
        cliente.setApellidoP(dtoCliente.getApellidoP());
        cliente.setApellidoM(dtoCliente.getApellidoM());
        cliente.setTelefono(dtoCliente.getTelefono());
        if (dtoCliente.getDirecciones() != null) {
            List<Direccion> direcciones = new ArrayList<>();
            for (DTO_Direccion dtoDireccion : dtoCliente.getDirecciones()) {
                Direccion direccion = new Direccion();
                direccion.setColonia(dtoDireccion.getColonia());
                direccion.setCalle(dtoDireccion.getCalle());
                direccion.setNumExterior(dtoDireccion.getNumExterior());
                direcciones.add(direccion);
            }
            cliente.setDirecciones(direcciones);

        } else {
            cliente.setDirecciones(new ArrayList<>());
        }
        return cliente;

    }

    /**
     * Convierte un Cliente a un DTO_Cliente incluyendo el RFC.
     *
     * @param cliente el Cliente a convertir
     * @return el DTO_Cliente resultante con el RFC
     */
    public DTO_Cliente convertirClienteADtoConRfc(Cliente cliente) {
        DTO_Cliente dtoCliente = convertirCliente(cliente);
        dtoCliente.setRfc(cliente.getRfc());
        return dtoCliente;
    }

    /**
     * Convierte un DTO_Cliente a un objeto Cliente con RFC.
     *
     * @param dtoCliente el DTO_Cliente a convertir
     * @return el objeto Cliente resultante con RFC
     */
    public Cliente convertirDtoClienteAEntidadConRfc(DTO_Cliente dtoCliente) {
        Cliente cliente = convertirDtoClienteAEntidad(dtoCliente);
        cliente.setRfc(dtoCliente.getRfc());
        return cliente;
    }

    /**
     * Convierte una lista de objetos Cliente a una lista de DTOs de Cliente.
     *
     * @param clientes la lista de Clientes a convertir
     * @return la lista de DTOs de Cliente resultante
     */
    public List<DTO_Cliente> convertirDesdeClientes(List<Cliente> clientes) {
        List<DTO_Cliente> dtosClientes = new ArrayList<>();
        for (Cliente cliente : clientes) {
            dtosClientes.add(convertirCliente(cliente));
        }
        return dtosClientes;
    }
}
