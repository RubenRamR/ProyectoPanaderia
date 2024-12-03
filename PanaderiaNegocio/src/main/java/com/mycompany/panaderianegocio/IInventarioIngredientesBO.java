package com.mycompany.panaderianegocio;

import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominiosMapeo.IngredienteMapeo;
import DTO.DTO_Ingrediente;
import java.util.List;

/**
 * Clase de tipo Interfaz que implementa metodos de ingredientesDAO
 * @author Temo
 */
public interface IInventarioIngredientesBO {

    /**
     * Consulta todos los ingredientes en el inventario.
     *
     * @return una lista de DTO_Ingrediente representando todos los
     * ingredientes, o null si ocurre una excepción.
     */
    public List<DTO_Ingrediente> consultarIngredientes();

    /**
     * Agrega un nuevo ingrediente al inventario.
     *
     * @param ingrediente el DTO_Ingrediente que se desea agregar.
     * @return el DTO_Ingrediente agregado con su ID generado, o null si ocurre
     * una excepción.
     */
    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Consulta ingredientes en el inventario que coincidan con el
     * DTO_Ingrediente dado.
     *
     * @param ingrediente el DTO_Ingrediente con los criterios de búsqueda.
     * @return una lista de DTO_Ingrediente que coinciden con los criterios de
     * búsqueda, o null si ocurre una excepción.
     */
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Actualiza un ingrediente existente en el inventario.
     *
     * @param ingrediente el DTO_Ingrediente con los datos actualizados.
     * @return el DTO_Ingrediente actualizado, o null si ocurre una excepción.
     */
    public DTO_Ingrediente actualizarIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Convierte un DTO_Ingrediente a un objeto Ingrediente.
     *
     * @param ingrediente el DTO_Ingrediente que se desea convertir.
     * @return el objeto Ingrediente convertido, o null si ocurre una excepción.
     */
    IngredienteMapeo ConvertirDTOAIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Convierte un objeto Ingrediente a un DTO_Ingrediente.
     *
     * @param ingrediente el objeto Ingrediente que se desea convertir.
     * @return el DTO_Ingrediente convertido, o null si ocurre una excepción.
     */
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente);

    /**
     * Valida la existencia de un ingrediente en el inventario.
     *
     * @param ingrediente el DTO_Ingrediente que se desea validar.
     * @return el DTO_Ingrediente si existe en el inventario, o null si no
     * existe.
     */
    public DTO_Ingrediente validarExistencia(DTO_Ingrediente ingrediente);

    /**
     * Elimina un ingrediente del inventario.
     *
     * @param ingrediente el DTO_Ingrediente que se desea eliminar.
     * @return true si el ingrediente fue eliminado correctamente, o false si
     * ocurre una excepción.
     */
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente);

    /**
     * Consulta un ingrediente en el inventario por su nombre.
     *
     * @param ingrediente el DTO_Ingrediente con el nombre a buscar.
     * @return el DTO_Ingrediente encontrado, o null si no existe.
     */
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente);

    /**
     * Consulta las cantidades de ingredientes en el inventario que coincidan
     * con una lista de nombres de ingredientes.
     *
     * @param ingredientesNombres una lista de DTO_Ingrediente con los nombres
     * de los ingredientes a consultar.
     * @return una lista de DTO_Ingrediente con las cantidades correspondientes,
     * o null si ocurre una excepción.
     */
    public List<DTO_Ingrediente> consultarCantidadesIngredientesInventario(List<DTO_Ingrediente> ingredientesNombres);

}
