/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominioentidades.Ingrediente;
import DTO.DTO_Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase IngredienteConversiones proporciona métodos para convertir entre
 * objetos Ingrediente y DTOs relacionados. Permite la conversión de
 * ingredientes entre entidades y DTOs, y viceversa. También incluye un método
 * para la conversión de listas de ingredientes.
 *
 * 
 */
public class IngredienteConversiones {

    /**
     * Convierte un objeto Ingrediente a un DTO_Ingrediente.
     *
     * @param ingrediente el Ingrediente a convertir
     * @return el DTO_Ingrediente resultante
     */
    public DTO_Ingrediente convertir(Ingrediente ingrediente) {
        if (ingrediente == null) {
            return null;
        }
        DTO_Ingrediente ingredienteDTO = new DTO_Ingrediente();
        ingredienteDTO.setId(ingrediente.getId());
        ingredienteDTO.setNombre(ingrediente.getNombre());
        ingredienteDTO.setCantidad(ingrediente.getCantidad());
        ingredienteDTO.setPrecio(ingrediente.getPrecio());
        

        return ingredienteDTO;
    }

    /**
     * Convierte una lista de objetos Ingrediente a una lista de DTOs de
     * Ingrediente.
     *
     * @param ingredientes la lista de Ingredientes a convertir
     * @return la lista de DTOs de Ingrediente resultante
     */
    public List<DTO_Ingrediente> convertir(List<Ingrediente> ingredientes) {
        if (ingredientes == null) {
            return null;
        }
        List<DTO_Ingrediente> ingredientesDTO = new ArrayList<>();
        for (Ingrediente ingrediente : ingredientes) {
            ingredientesDTO.add(convertir(ingrediente));
        }
        return ingredientesDTO;
    }
}
