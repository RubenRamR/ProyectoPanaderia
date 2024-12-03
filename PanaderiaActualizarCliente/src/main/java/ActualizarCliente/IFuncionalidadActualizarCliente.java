/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ActualizarCliente;

import DTO.DTO_Cliente;

/**
 * Interfaz del subsistema FuncionalidadActualizarCliente
 * @author joseq
 */
public interface IFuncionalidadActualizarCliente {
    /**
     * Actualiza el cliente
     * @param cliente DTO del cliente
     * @return regresa el cliente actualizado
     */
      public DTO_Cliente actualizarCliente(DTO_Cliente cliente);
      /**
       * Actualzia el cliente con rfc
       * @param cliente DTO del cliente
       * @return Cliente actualizado
       */
    public DTO_Cliente actualizarClienteConRfc(DTO_Cliente cliente);
}
