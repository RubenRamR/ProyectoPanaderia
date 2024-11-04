/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;

/**
 * La clase IngredienteDetalleConversiones proporciona métodos para convertir
 * entre objetos IngredienteDetalle y DTOs relacionados. Permite la conversión
 * de detalles de ingredientes entre entidades y DTOs, y viceversa. También
 * incluye un método para convertir un DTO de Ingrediente a un DTO de Detalle de
 * Ingrediente.
 *
 * 
 */
public class IngredienteDetalleConversiones {

    /**
     * Convierte un objeto IngredienteDetalle a un DTO_IngredienteDetalle.
     *
     * @param detalleIngrediente el IngredienteDetalle a convertir
     * @return el DTO_IngredienteDetalle resultante
     */
    public DTO_IngredienteDetalle convertir(IngredienteDetalle detalleIngrediente) {
        DTO_IngredienteDetalle detalleIngredienteDTO = new DTO_IngredienteDetalle();
        detalleIngredienteDTO.setIngredienteId(detalleIngrediente.getIngredienteId());
        detalleIngredienteDTO.setCantidad(detalleIngrediente.getCantidad());
        detalleIngredienteDTO.setNombre(detalleIngrediente.getNombre());
        return detalleIngredienteDTO;
    }

    /**
     * Convierte un DTO_IngredienteDetalle a un objeto IngredienteDetalle.
     *
     * @param detalleIngredienteDTO el DTO_IngredienteDetalle a convertir
     * @return el IngredienteDetalle resultante
     */
    public IngredienteDetalle convertir(DTO_IngredienteDetalle detalleIngredienteDTO) {
        IngredienteDetalle detalleIngrediente = new IngredienteDetalle();
        detalleIngrediente.setIngredienteId(detalleIngredienteDTO.getIngredienteId());
        detalleIngrediente.setCantidad(detalleIngredienteDTO.getCantidad());
        detalleIngrediente.setNombre(detalleIngredienteDTO.getNombre());
        return detalleIngrediente;
    }

    /**
     * Convierte un DTO_Ingrediente a un DTO_IngredienteDetalle.
     *
     * @param ingredienteDTO el DTO_Ingrediente a convertir
     * @return el DTO_IngredienteDetalle resultante
     */
    public DTO_IngredienteDetalle convertirIngredienteADetalleIngrediente(DTO_Ingrediente ingredienteDTO) {
        DTO_IngredienteDetalle detalleIngrediente = new DTO_IngredienteDetalle();
        detalleIngrediente.setIngredienteId(ingredienteDTO.getId());
        detalleIngrediente.setCantidad(Float.valueOf(ingredienteDTO.getCantidad()));
        detalleIngrediente.setNombre(ingredienteDTO.getNombre());
        return detalleIngrediente;
    }
}
