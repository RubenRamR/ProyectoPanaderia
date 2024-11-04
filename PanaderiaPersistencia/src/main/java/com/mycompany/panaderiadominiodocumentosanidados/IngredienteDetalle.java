package com.mycompany.panaderiadominiodocumentosanidados;

/**
 * 
 *Representa un ingrediente en detalle, incluyendo su identificador, nombre y
 * cantidad. Esta clase se utiliza para modelar los ingredientes de un producto
 * de la panaderia ya que contara con muchas cosas.
 * 
 */
public class IngredienteDetalle {

    private String ingredienteId;
    private String nombre;
    private Float cantidad;

    /**
     * Constructor por defecto
     */
    public IngredienteDetalle() {
    }

    /**
     * Constructor de la clase IngredienteDetalle.
     *
     * @param ingredienteId El identificador del ingrediente.
     * @param nombre El nombre del ingrediente.
     * @param cantidad La cantidad del ingrediente.
     */
    public IngredienteDetalle(String ingredienteId, String nombre, Float cantidad) {
        this.ingredienteId = ingredienteId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el identificador del ingrediente.
     *
     * @return El identificador del ingrediente.
     */
    public String getIngredienteId() {
        return ingredienteId;
    }

    /**
     * Establece el identificador del ingrediente.
     *
     * @param ingredienteId El identificador del ingrediente a establecer.
     */
    public void setIngredienteId(String ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    /**
     * Obtiene el nombre del ingrediente.
     *
     * @return El nombre del ingrediente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del ingrediente.
     *
     * @param nombre El nombre del ingrediente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad del ingrediente.
     *
     * @return La cantidad del ingrediente.
     */
    public Float getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del ingrediente.
     *
     * @param cantidad La cantidad del ingrediente a establecer.
     */
    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

}
