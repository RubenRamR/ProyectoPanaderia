package com.mycompany.panaderiadominiosMapeo;

import org.bson.types.ObjectId;

/**
 * Clase que representa un ingrediente mapeado para persistencia. Contiene
 * atributos como nombre, cantidad, unidad de medida y precio.
 *
 * 
 */
public class IngredienteMapeo {

    private ObjectId id;
    private String nombre;
    private Integer cantidad;
    private String unidadDeMedida;
    private Float precio;

    /**
     * Constructor de la clase IngredienteMapeo.
     */
    public IngredienteMapeo() {
    }

    /**
     * Constructor de la clase IngredienteMapeo.
     *
     * @param nombre Nombre del ingrediente.
     * @param cantidad Cantidad del ingrediente.
     * @param unidadDeMedida Unidad de medida del ingrediente.
     * @param precio Precio del ingrediente.
     */
    public IngredienteMapeo(String nombre, Integer cantidad, String unidadDeMedida, Float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
        this.precio = precio;
    }

    /**
     * Obtiene el identificador del ingrediente.
     *
     * @return Identificador del ingrediente.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del ingrediente.
     *
     * @param id Identificador del ingrediente.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del ingrediente.
     *
     * @return Nombre del ingrediente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del ingrediente.
     *
     * @param nombre Nombre del ingrediente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad del ingrediente.
     *
     * @return Cantidad del ingrediente.
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del ingrediente.
     *
     * @param cantidad Cantidad del ingrediente.
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la unidad de medida del ingrediente.
     *
     * @return Unidad de medida del ingrediente.
     */
    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    /**
     * Establece la unidad de medida del ingrediente.
     *
     * @param unidadDeMedida Unidad de medida del ingrediente.
     */
    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    /**
     * Obtiene el precio del ingrediente.
     *
     * @return Precio del ingrediente.
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del ingrediente.
     *
     * @param precio Precio del ingrediente.
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
