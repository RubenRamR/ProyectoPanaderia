/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.panaderiadominioentidades.Cliente;
import com.mycompany.panaderiadominioentidades.DetalleVenta;
import com.mycompany.panaderiadominioentidades.Direccion;
import com.mycompany.panaderiadominioentidades.Venta;
import com.mycompany.panaderiadominiosMapeo.ClienteMapeo;
import com.mycompany.panaderiadominiosMapeo.DetalleVentaMapeo;
import com.mycompany.panaderiadominiosMapeo.DireccionMapeo;
import com.mycompany.panaderiadominiosMapeo.VentaMapeo;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase para realizar conversiones entre objetos Venta y VentaMapeo.
 */
public class VentasConversiones {

    private ClientesConversiones conversorCliente;
    private ProductosConversiones conversorProductos;

    /**
     * Constructor de la clase VentasConversiones.
     */
    public VentasConversiones() {
        conversorCliente = new ClientesConversiones();
        conversorProductos = new ProductosConversiones();
    }

    /**
     * Convierte un objeto VentaMapeo a un objeto Venta.
     *
     * @param venta El objeto VentaMapeo a convertir.
     * @return El objeto Venta convertido.
     */
    public Venta convertirAVentaEntidad(VentaMapeo venta) {
        Venta ventaE = new Venta();
        ventaE.setId(venta.getId().toHexString());
        ventaE.setFechaEntrega(venta.getFechaEntrega());
        ventaE.setFechaRegistro(venta.getFechaRegistro());
        ventaE.setMontoTotal(venta.getMontoTotal());
        ventaE.setEstado(venta.getEstado());
        if (venta.getCliente() != null) {
            Cliente cliente = new Cliente();
            cliente.setId(venta.getCliente().getId().toHexString());
            cliente.setNombre(venta.getCliente().getNombre());
            cliente.setApellidoP(venta.getCliente().getApellidoP());
            cliente.setApellidoM(venta.getCliente().getApellidoM());
            ventaE.setCliente(cliente);
        }
        List<DetalleVenta> detallesVenta = new ArrayList<>();
        for (DetalleVentaMapeo detalleVenta : venta.getDetallesVenta()) {
            DetalleVenta detalleVentaE = new DetalleVenta();
            detalleVentaE.setCantidad(detalleVenta.getCantidad());
            detalleVentaE.setDetallesCliente(detalleVenta.getDetallesCliente());
            detalleVentaE.setProductoId(detalleVenta.getProductoId().toString());
            detalleVentaE.setImporte(detalleVenta.getImporte());
            detalleVentaE.setPrecio(detalleVenta.getPrecio());
            detalleVentaE.setTamanhoProducto(detalleVenta.getTamanhoProducto());
            detallesVenta.add(detalleVentaE);
        }
        ventaE.setDetallesVenta(detallesVenta);
        Direccion direccion = new Direccion();
        direccion.setCalle(venta.getDireccionEntrega().getCalle());
        direccion.setColonia(venta.getDireccionEntrega().getColonia());
        direccion.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        ventaE.setDireccionEntrega(direccion);
        return ventaE;
    }

    /**
     * Convierte un objeto VentaMapeo a un objeto Venta, incluyendo la
     * conversión de objetos relacionados.
     *
     * @param venta El objeto VentaMapeo a convertir.
     * @return El objeto Venta convertido.
     */
    public Venta convertirAVentaEntidadObjetos(VentaMapeo venta) {
        Venta ventaE = new Venta();
        ventaE.setId(venta.getId().toString());
        ventaE.setFechaEntrega(venta.getFechaEntrega());
        ventaE.setFechaRegistro(venta.getFechaRegistro());
        ventaE.setMontoTotal(venta.getMontoTotal());
        ventaE.setEstado(venta.getEstado());
        ventaE.setCliente(conversorCliente.convertirClienteConRFC(venta.getCliente()));
        List<DetalleVenta> detallesVentaE = new ArrayList<>();
        for (DetalleVentaMapeo detalleVenta : venta.getDetallesVenta()) {
            DetalleVenta detalleVentaE = new DetalleVenta();
            detalleVentaE.setCantidad(detalleVenta.getCantidad());
            detalleVentaE.setDetallesCliente(detalleVenta.getDetallesCliente());
            detalleVentaE.setProductoId(detalleVenta.getProductoId().toString());
            detalleVentaE.setImporte(detalleVenta.getImporte());
            detalleVentaE.setPrecio(detalleVenta.getPrecio());
            detalleVentaE.setTamanhoProducto(detalleVenta.getTamanhoProducto());
            detalleVentaE.setProducto(conversorProductos.convertirProducto(detalleVenta.getProducto()));
            detallesVentaE.add(detalleVentaE);
        }
        ventaE.setDetallesVenta(detallesVentaE);
        Direccion direccionE = new Direccion();
        direccionE.setCalle(venta.getDireccionEntrega().getCalle());
        direccionE.setColonia(venta.getDireccionEntrega().getColonia());
        direccionE.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        ventaE.setDireccionEntrega(direccionE);
        return ventaE;
    }

    /**
     * Convierte un objeto Venta a un objeto VentaMapeo.
     *
     * @param venta El objeto Venta a convertir.
     * @return El objeto VentaMapeo convertido.
     */
    public VentaMapeo convertirAVentaMapeo(Venta venta) {
        VentaMapeo ventaMapeo = new VentaMapeo();
        if (venta.getCliente()!=null) {
             ClienteMapeo cliente = new ClienteMapeo();
            cliente.setId(new ObjectId(venta.getCliente().getId()));
            cliente.setNombre(venta.getCliente().getNombre());
            cliente.setApellidoP(venta.getCliente().getApellidoP());
            cliente.setApellidoM(venta.getCliente().getApellidoM());
            ventaMapeo.setCliente(cliente);
        }
        ventaMapeo.setFechaEntrega(venta.getFechaEntrega());
        ventaMapeo.setFechaRegistro(venta.getFechaRegistro());
        ventaMapeo.setMontoTotal(venta.getMontoTotal());
        ventaMapeo.setEstado(venta.getEstado());
        List<DetalleVentaMapeo> detallesVentaMapeo = new ArrayList<>();
        for (DetalleVenta detalleVenta : venta.getDetallesVenta()) {
            DetalleVentaMapeo detalleVentaMapeo = new DetalleVentaMapeo();
            detalleVentaMapeo.setCantidad(detalleVenta.getCantidad());
            detalleVentaMapeo.setDetallesCliente(detalleVenta.getDetallesCliente());
            detalleVentaMapeo.setProductoId(new ObjectId(detalleVenta.getProductoId()));
            detalleVentaMapeo.setImporte(detalleVenta.getImporte());
            detalleVentaMapeo.setPrecio(detalleVenta.getPrecio());
            detallesVentaMapeo.add(detalleVentaMapeo);
            detalleVentaMapeo.setTamanhoProducto(detalleVenta.getTamanhoProducto());
            detallesVentaMapeo.add(detalleVentaMapeo);
        }
        ventaMapeo.setDetallesVenta(detallesVentaMapeo);
        DireccionMapeo direccionMapeo = new DireccionMapeo();
        direccionMapeo.setCalle(venta.getDireccionEntrega().getCalle());
        direccionMapeo.setColonia(venta.getDireccionEntrega().getColonia());
        direccionMapeo.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        ventaMapeo.setDireccionEntrega(direccionMapeo);
        return ventaMapeo;
    }
}
