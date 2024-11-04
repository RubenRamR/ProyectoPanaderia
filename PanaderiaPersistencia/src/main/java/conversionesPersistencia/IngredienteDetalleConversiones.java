/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.panaderiadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import org.bson.types.ObjectId;

/**
 * Clase para realizar conversiones entre objetos IngredienteDetalle y
 * IngredienteDetalleMapeo.
 */
public class IngredienteDetalleConversiones {

    /**
     * Convierte un objeto IngredienteDetalleMapeo a un objeto
     * IngredienteDetalle.
     *
     * @param detalleIngrediente El objeto IngredienteDetalleMapeo a convertir.
     * @return El objeto IngredienteDetalle convertido.
     */
    protected IngredienteDetalle convertir(IngredienteDetalleMapeo detalleIngrediente) {
        // Crea una nueva instancia de IngredienteDetalle.
        IngredienteDetalle detalleIngredienteE = new IngredienteDetalle();
        // Establece el ID del ingrediente del detalle.
        detalleIngredienteE.setIngredienteId(detalleIngrediente.getIngredienteId().toHexString());
        // Establece la cantidad del ingrediente del detalle.
        detalleIngredienteE.setCantidad(detalleIngrediente.getCantidad());
        // Establece el nombre del ingrediente del detalle.
        detalleIngredienteE.setNombre(detalleIngrediente.getNombre());
        // Retorna el detalle de ingrediente convertido.
        return detalleIngredienteE;
    }

    /**
     * Convierte un objeto IngredienteDetalle a un objeto
     * IngredienteDetalleMapeo.
     *
     * @param detalleIngrediente El objeto IngredienteDetalle a convertir.
     * @return El objeto IngredienteDetalleMapeo convertido.
     */
    protected IngredienteDetalleMapeo convertirMapeo(IngredienteDetalle detalleIngrediente) {
        // Crea una nueva instancia de IngredienteDetalleMapeo.
        IngredienteDetalleMapeo detalleIngredienteM = new IngredienteDetalleMapeo();
        // Establece el ID del ingrediente del detalle mapeado.
        detalleIngredienteM.setIngredienteId(new ObjectId(detalleIngrediente.getIngredienteId()));
        // Establece la cantidad del ingrediente del detalle mapeado.
        detalleIngredienteM.setCantidad(detalleIngrediente.getCantidad());
        // Establece el nombre del ingrediente del detalle mapeado.
        detalleIngredienteM.setNombre(detalleIngrediente.getNombre());
        // Retorna el detalle de ingrediente mapeado convertido.
        return detalleIngredienteM;
    }
}
