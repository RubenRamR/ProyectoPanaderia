package com.mycompany.panaderiadocumentosanidadosmapeo;

import org.bson.types.ObjectId;

/**
 * Clase que representa un detalle de ingrediente mapeado para documentos anidados.
 */
public class IngredienteDetalleMapeo {

    private ObjectId ingredienteId;
    private String nombre;
    private Float cantidad;

    /**
     * Constructor de la clase IngredienteDetalleMapeo.
     * 
     * @param ingredienteId El ObjectId del ingrediente.
     * @param nombre El nombre del ingrediente.
     * @param cantidad La cantidad del ingrediente.
     */
    public IngredienteDetalleMapeo(ObjectId ingredienteId, String nombre, Float cantidad) {
        this.ingredienteId = ingredienteId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * Constructor vacío de la clase IngredienteDetalleMapeo.
     */
    public IngredienteDetalleMapeo() {
    }

    /**
     * Obtiene el ObjectId del ingrediente.
     * 
     * @return El ObjectId del ingrediente.
     */
    public ObjectId getIngredienteId() {
        return ingredienteId;
    }

    /**
     * Establece el ObjectId del ingrediente.
     * 
     * @param ingredienteId El ObjectId del ingrediente.
     */
    public void setIngredienteId(ObjectId ingredienteId) {
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
     * @param nombre El nombre del ingrediente.
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
     * @param cantidad La cantidad del ingrediente.
     */
    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

}
