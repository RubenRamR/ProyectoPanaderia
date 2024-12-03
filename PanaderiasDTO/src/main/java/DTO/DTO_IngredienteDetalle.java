/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 * DTO de la entidad Ingrediente Detalle
 *
 */
public class DTO_IngredienteDetalle {

    /**
     * Id de los ingredientes
     */
    private String ingredienteId;
    /**
     * nombre del ingrediente
     */
    private String nombre;
    /**
     * cantidad del ingrediente
     */
    private Float cantidad;

    /**
     * Constructor que inicializa todos los atributos de la clase
     *
     * @param ingredienteId Id del ingrediente
     * @param nombre nombre del ingrediente
     * @param cantidad cantidad del ingrediente
     */
    public DTO_IngredienteDetalle(String ingredienteId, String nombre, Float cantidad) {
        this.ingredienteId = ingredienteId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el ID del ingrediente.
     *
     * Este método devuelve el identificador único del ingrediente. Se utiliza
     * para obtener el valor almacenado en el atributo `ingredienteId`.
     *
     * @return El ID del ingrediente como un valor de tipo `String`.
     */
    public String getIngredienteId() {
        return ingredienteId;
    }

    /**
     * Constructor vacío de la clase `DTO_IngredienteDetalle`.
     *
     * Este constructor inicializa un objeto de la clase
     * `DTO_IngredienteDetalle` sin parámetros. Se utiliza para crear un objeto
     * vacío que puede ser configurado posteriormente.
     */
    public DTO_IngredienteDetalle() {
        // Constructor vacío
    }

    /**
     * Establece el ID del ingrediente.
     *
     * Este método permite establecer el identificador único del ingrediente. El
     * valor proporcionado se guarda en el atributo `ingredienteId`.
     *
     * @param ingredienteId El ID del ingrediente como un valor de tipo
     * `String`.
     */
    public void setIngredienteId(String ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    /**
     * Obtiene el nombre del ingrediente.
     *
     * Este método devuelve el nombre del ingrediente. Se utiliza para obtener
     * el valor almacenado en el atributo `nombre`.
     *
     * @return El nombre del ingrediente como un valor de tipo `String`.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del ingrediente.
     *
     * Este método permite establecer el nombre del ingrediente. El valor
     * proporcionado se guarda en el atributo `nombre`.
     *
     * @param nombre El nombre del ingrediente como un valor de tipo `String`.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad del ingrediente.
     *
     * Este método devuelve la cantidad del ingrediente. Se utiliza para obtener
     * el valor almacenado en el atributo `cantidad`.
     *
     * @return La cantidad del ingrediente como un valor de tipo `Float`.
     */
    public Float getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del ingrediente.
     *
     * Este método permite establecer la cantidad del ingrediente. El valor
     * proporcionado se guarda en el atributo `cantidad`.
     *
     * @param cantidad La cantidad del ingrediente como un valor de tipo
     * `Float`.
     */
    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

}
