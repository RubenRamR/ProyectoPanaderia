/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominioentidades.Factura;
import DTO.DTO_Factura;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase FacturasConversiones proporciona métodos para convertir entre
 * objetos Factura y DTOs relacionados. Permite la conversión de facturas entre
 * entidades y DTOs, y viceversa. También incluye métodos para la conversión de
 * listas de facturas.
 *
 * 
 */
public class FacturasConversiones {

    VentasConversiones conversorVentas;

    public FacturasConversiones() {
        conversorVentas = new VentasConversiones();
    }

    /**
     * Convierte un objeto Factura a un DTO_Factura sin incluir la información
     * de la venta asociada.
     *
     * @param factura la Factura a convertir
     * @return el DTO_Factura resultante
     */
    public DTO_Factura facturaEntidadADto(Factura factura) {
        DTO_Factura facturaDto = new DTO_Factura();

        factura.setId(factura.getId());
        facturaDto.setFechaEmision(factura.getFechaEmision());
        facturaDto.setFechaVencimiento(factura.getFechaVencimiento());
        facturaDto.setVenta(conversorVentas.convertirADTO(factura.getVenta()));
        facturaDto.setBytesContenido(factura.getBytesContenido());

        return facturaDto;
    }

    /**
     * Convierte un objeto Factura a un DTO_Factura incluyendo la información de
     * la venta asociada.
     *
     * @param factura la Factura a convertir
     * @return el DTO_Factura resultante
     */
    public DTO_Factura convertirADto(Factura factura) {
        DTO_Factura facturaDto = new DTO_Factura();

        factura.setId(factura.getId());
        facturaDto.setFechaEmision(factura.getFechaEmision());
        facturaDto.setFechaVencimiento(factura.getFechaVencimiento());
        facturaDto.setBytesContenido(factura.getBytesContenido());
        facturaDto.setVenta(conversorVentas.convertirADTO(factura.getVenta()));

        return facturaDto;
    }

    /**
     * Convierte un DTO_Factura a un objeto Factura.
     *
     * @param factura el DTO_Factura a convertir
     * @return el objeto Factura resultante
     */
    public Factura facturaDtoAEntidad(DTO_Factura factura) {
        Factura facturaEnt = new Factura();

        factura.setId(factura.getId());
        facturaEnt.setFechaEmision(factura.getFechaEmision());
        facturaEnt.setFechaVencimiento(factura.getFechaVencimiento());
        facturaEnt.setVenta(conversorVentas.convertirDtoVentaAEntidad(factura.getVenta()));
        facturaEnt.setBytesContenido(factura.getBytesContenido());

        return facturaEnt;
    }

    /**
     * Convierte una lista de objetos Factura a una lista de DTOs de Factura sin
     * incluir la información de las ventas asociadas.
     *
     * @param facturas la lista de Facturas a convertir
     * @return la lista de DTOs de Factura resultante
     */
    public List<DTO_Factura> listaFacturasADto(List<Factura> facturas) {
        List<DTO_Factura> facturasDto = new ArrayList<>();

        for (Factura factura : facturas) {
            facturasDto.add(facturaEntidadADto(factura));
        }
        return facturasDto;

    }
}
