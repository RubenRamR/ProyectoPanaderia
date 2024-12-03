/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActualizarCliente;

import DTO.DTO_Cliente;
import com.mycompany.panaderianegocio.ClientesBO;
import com.mycompany.panaderianegocio.IClientesBO;

/**
 * Subsistema de actualizar cliente
 * @author joseq
 */
public class FuncionalidadActulizarCliente implements IFuncionalidadActualizarCliente {
    
     IClientesBO clientesBO;

     /**
      * Constructor que inicializa el clienteBO
      */
    public FuncionalidadActulizarCliente() {
        this.clientesBO = new ClientesBO();
    }
    
    /**
     * Actualiza un cliente
     * @param cliente Dto del cliente
     * @return Cliente Actualizado
     */
    @Override
    public DTO_Cliente actualizarCliente(DTO_Cliente cliente) {
        DTO_Cliente dtoCliente = clientesBO.actualizarClienteEnVentas(cliente);
        return dtoCliente;
    }
    /**
     * Actualiza un cliente con el rfc
     * @param cliente DTO del cliente
     * @return El cliente actualizado
     */
    @Override
    public DTO_Cliente actualizarClienteConRfc(DTO_Cliente cliente){
        DTO_Cliente dtoCliente = clientesBO.actualizarClienteEnVentasConRFC(cliente);
        return dtoCliente;
    }
    
}
