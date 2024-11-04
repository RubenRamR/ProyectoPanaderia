/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominiosMapeo.IngredienteMapeo;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para realizar conversiones entre objetos Ingrediente y
 * IngredienteMapeo.
 */
public class IngredienteConversiones {

    /**
     * Convierte un objeto IngredienteMapeo a un objeto Ingrediente.
     *
     * @param ingrediente El objeto IngredienteMapeo a convertir.
     * @return El objeto Ingrediente convertido.
     */
    public Ingrediente convertir(IngredienteMapeo ingrediente) {
        if (ingrediente == null) {
            return null;
        }
        Ingrediente ingredienteE = new Ingrediente();
        ingredienteE.setId(ingrediente.getId().toHexString());
        ingredienteE.setNombre(ingrediente.getNombre());
        ingredienteE.setCantidad(ingrediente.getCantidad());
        ingredienteE.setPrecio(ingrediente.getPrecio());
        ingredienteE.setUnidadDeMedida(ingrediente.getUnidadDeMedida());
        return ingredienteE;
    }

    /**
     * Convierte una lista de objetos IngredienteMapeo a una lista de objetos
     * Ingrediente.
     *
     * @param ingredientes La lista de objetos IngredienteMapeo a convertir.
     * @return La lista de objetos Ingrediente convertida.
     */
    public List<Ingrediente> convertir(List<IngredienteMapeo> ingredientes) {
        List<Ingrediente> ingredientesE = new ArrayList<>();
        if (ingredientes == null) {
            return null;
        }
        for (IngredienteMapeo ingrediente : ingredientes) {
            ingredientesE.add(this.convertir(ingrediente));
        }
        return ingredientesE;
    }
}
