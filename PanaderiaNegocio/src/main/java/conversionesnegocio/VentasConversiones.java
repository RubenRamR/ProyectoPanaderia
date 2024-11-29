/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominioentidades.DetalleVenta;
import com.mycompany.panaderiadominioentidades.Direccion;
import com.mycompany.panaderiadominioentidades.Venta;
import DTO.DTO_DetalleVenta;
import DTO.DTO_Direccion;
import DTO.DTO_Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class VentasConversiones {

    ClientesConversiones conversorCliente;
    ProductosConversiones conversorProductos;

    /**
     * La clase VentasConversiones proporciona métodos para convertir entre
     * objetos Venta y DTOs relacionados. Permite la conversión de ventas entre
     * entidades y DTOs, y viceversa. También incluye métodos para convertir
     * listas de ventas a listas de DTOs de ventas, y viceversa.
     *
     * @author abelc
     */
    public VentasConversiones() {
        conversorCliente = new ClientesConversiones();
        conversorProductos = new ProductosConversiones();
    }

    /**
     * Convierte un objeto Venta a un DTO_Venta.
     *
     * @param venta la Venta a convertir
     * @return el DTO_Venta resultante
     */
    public DTO_Venta convertirVentaADTO(Venta venta) {
        DTO_Venta dtoVenta = new DTO_Venta();
        if (venta.getCliente().getId() != null) {
            dtoVenta.setID(venta.getId());
        }

        dtoVenta.setFechaEntrega(venta.getFechaEntrega());
        dtoVenta.setFechaRegistro(venta.getFechaRegistro());
        dtoVenta.setMontoTotal(venta.getMontoTotal());
        dtoVenta.setEstado(venta.getEstado());
        if (venta.getCliente() != null) {
            dtoVenta.setCliente(conversorCliente.convertirCliente(venta.getCliente()));
        }

        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
        for (DetalleVenta detalleVenta : venta.getDetallesVenta()) {
            DTO_DetalleVenta detalleVentaDTO = new DTO_DetalleVenta();
            detalleVentaDTO.setCantidad(detalleVenta.getCantidad());
            detalleVentaDTO.setEspecificacion(detalleVenta.getDetallesCliente());
            detalleVentaDTO.setIdproducto(detalleVenta.getProductoId());
            detalleVentaDTO.setImporte(detalleVenta.getImporte());
            detalleVentaDTO.setPrecio(detalleVenta.getPrecio());
            detalleVentaDTO.setTamanhoProducto(detalleVentaDTO.getTamanhoProducto());
            detallesVenta.add(detalleVentaDTO);
        }
        dtoVenta.setDetallesVenta(detallesVenta);
        DTO_Direccion dtoDireccion = new DTO_Direccion();
        dtoDireccion.setCalle(venta.getDireccionEntrega().getCalle());
        dtoDireccion.setColonia(venta.getDireccionEntrega().getColonia());
        dtoDireccion.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        dtoVenta.setDireccionEntrega(dtoDireccion);
        return dtoVenta;
    }

    /**
     * Convierte un DTO_Venta a un objeto Venta para agregar.
     *
     * @param ventaDTO el DTO_Venta a convertir
     * @return la Venta resultante
     */
    public Venta convertirDTOAgregar(DTO_Venta ventaDTO) {
        Venta venta = new Venta();
        venta.setId((ventaDTO.getID()));
        venta.setFechaEntrega(ventaDTO.getFechaEntrega());
        venta.setFechaRegistro(ventaDTO.getFechaRegistro());
        venta.setMontoTotal(ventaDTO.getMontoTotal());
        venta.setEstado(ventaDTO.getEstado());
        venta.setCliente(conversorCliente.convertirDtoClienteAEntidad(ventaDTO.getCliente()));
        List<DetalleVenta> detallesVenta = new ArrayList<>();
        for (DTO_DetalleVenta detalleVentaDTO : ventaDTO.getDetallesVenta()) {
            DetalleVenta detalleVenta = new DetalleVenta();
            detalleVenta.setCantidad(detalleVentaDTO.getCantidad());
            detalleVenta.setDetallesCliente(detalleVentaDTO.getEspecificacion());
            detalleVenta.setProductoId(detalleVentaDTO.getIdproducto());
            detalleVenta.setImporte(detalleVentaDTO.getImporte());
            detalleVenta.setPrecio(detalleVentaDTO.getPrecio());
            detalleVenta.setTamanhoProducto(detalleVentaDTO.getTamanhoProducto());
            detallesVenta.add(detalleVenta);
        }
        venta.setDetallesVenta(detallesVenta);

        Direccion direccionEntrega = new Direccion();
        DTO_Direccion dtoDireccion = ventaDTO.getDireccionEntrega();
        direccionEntrega.setCalle(dtoDireccion.getCalle());
        direccionEntrega.setColonia(dtoDireccion.getColonia());
        direccionEntrega.setNumExterior(dtoDireccion.getNumExterior());
        venta.setDireccionEntrega(direccionEntrega);

        return venta;
    }

    /**
     * Convierte un objeto Venta a un DTO_Venta.
     *
     * @param venta la Venta a convertir
     * @return el DTO_Venta resultante
     */
    public DTO_Venta convertirADTO(Venta venta) {
        DTO_Venta dtoVenta = new DTO_Venta();
        dtoVenta.setID(venta.getId());
        dtoVenta.setFechaEntrega(venta.getFechaEntrega());
        dtoVenta.setFechaRegistro(venta.getFechaRegistro());
        dtoVenta.setMontoTotal(venta.getMontoTotal());
        dtoVenta.setEstado(venta.getEstado());
        dtoVenta.setCliente(conversorCliente.convertirCliente(venta.getCliente()));
        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
        for (DetalleVenta detalleVenta : venta.getDetallesVenta()) {
            DTO_DetalleVenta detalleVentaDTO = new DTO_DetalleVenta();
            detalleVentaDTO.setCantidad(detalleVenta.getCantidad());
            detalleVentaDTO.setEspecificacion(detalleVenta.getDetallesCliente());
            detalleVentaDTO.setIdproducto(detalleVenta.getProductoId());
            detalleVentaDTO.setImporte(detalleVenta.getImporte());
            detalleVentaDTO.setPrecio(detalleVenta.getPrecio());
            detalleVentaDTO.setTamanhoProducto(detalleVentaDTO.getTamanhoProducto());
            
            detallesVenta.add(detalleVentaDTO);
        }
        dtoVenta.setDetallesVenta(detallesVenta);
        DTO_Direccion dtoDireccion = new DTO_Direccion();
        dtoDireccion.setCalle(venta.getDireccionEntrega().getCalle());
        dtoDireccion.setColonia(venta.getDireccionEntrega().getColonia());
        dtoDireccion.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        dtoVenta.setDireccionEntrega(dtoDireccion);
        return dtoVenta;
    }

    /**
     * Convierte un DTO_Venta a un objeto Venta.
     *
     * @param dtoVenta el DTO_Venta a convertir
     * @return la Venta resultante
     */
    public Venta convertirDtoVentaAEntidad(DTO_Venta dtoVenta) {
        Venta venta = new Venta();
        if (dtoVenta.getID() != null) {
            venta.setId(dtoVenta.getID());
        }
        venta.setFechaEntrega(dtoVenta.getFechaEntrega());
        venta.setFechaRegistro(dtoVenta.getFechaRegistro());
        venta.setMontoTotal(dtoVenta.getMontoTotal());
        venta.setEstado(dtoVenta.getEstado());
        if (dtoVenta.getCliente() != null) {
            venta.setCliente(conversorCliente.convertirDtoClienteAEntidad(dtoVenta.getCliente()));
        }
        List<DetalleVenta> detallesVenta = new ArrayList<>();
        for (DTO_DetalleVenta detalleVentaDTO : dtoVenta.getDetallesVenta()) {
            DetalleVenta detalleVenta = new DetalleVenta();
            detalleVenta.setCantidad(detalleVentaDTO.getCantidad());
            detalleVenta.setDetallesCliente(detalleVentaDTO.getEspecificacion());
            detalleVenta.setProductoId(detalleVentaDTO.getIdproducto());
            detalleVenta.setImporte(detalleVentaDTO.getImporte());
            detalleVenta.setPrecio(detalleVentaDTO.getPrecio());
            detalleVenta.setTamanhoProducto(detalleVentaDTO.getTamanhoProducto()); // Asumiendo que este método existe en la clase DetalleVenta
            detalleVenta.setProducto(conversorProductos.convertirAEntidad(detalleVentaDTO.getProducto()));
            detallesVenta.add(detalleVenta);
        }
        venta.setDetallesVenta(detallesVenta);
        Direccion direccionEntrega = new Direccion();
        direccionEntrega.setCalle(dtoVenta.getDireccionEntrega().getCalle());
        direccionEntrega.setColonia(dtoVenta.getDireccionEntrega().getColonia());
        direccionEntrega.setNumExterior(dtoVenta.getDireccionEntrega().getNumExterior());
        venta.setDireccionEntrega(direccionEntrega);
        return venta;
    }

    /**
     * Convierte una lista de ventas a una lista de DTO_Venta.
     *
     * @param ventas la lista de ventas a convertir
     * @return la lista de DTO_Venta resultante
     */
    public List<DTO_Venta> convertirListaADTO(List<Venta> ventas) {

        List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta : ventas) {
            DTO_Venta dtoVenta = convertirVentaADTO(venta);

            ventasDTO.add(dtoVenta);
        }
        return ventasDTO;
    }

    /**
     * Convierte una lista de DTO_Venta a una lista de ventas.
     *
     * @param ventas la lista de DTO_Venta a convertir
     * @return la lista de ventas resultante
     */
    public List<Venta> listaVentasDtoAEntidad(List<DTO_Venta> ventas) {
        List<Venta> ventasEnt = new ArrayList<>();
        for (DTO_Venta ventaDto : ventas) {
            Venta venta = convertirDtoVentaAEntidad(ventaDto);
            ventasEnt.add(venta);
        }
        return ventasEnt;
    }
}
