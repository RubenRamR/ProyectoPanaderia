/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominioentidades;

/**
 * Clase que representa un ingrediente utilizado en la pastelería.
 */
public class Ingrediente {

    /**
     * Identificador único del ingrediente.
     */
    private String id;

    /**
     * Nombre del ingrediente.
     */
    private String nombre;

    /**
     * Cantidad del ingrediente.
     */
    private Integer cantidad;

    /**
     * Unidad de medida del ingrediente.
     */
    private String unidadDeMedida;

    /**
     * Precio del ingrediente.
     */
    private Float precio;

    /**
     * Constructor por defecto de la clase Ingrediente.
     */
    public Ingrediente() {
    }

    /**
     * Constructor de la clase Ingrediente.
     *
     * @param nombre Nombre del ingrediente.
     * @param cantidad Cantidad del ingrediente.
     * @param unidadDeMedida Unidad de medida del ingrediente.
     * @param precio Precio del ingrediente.
     */
    public Ingrediente(String nombre, Integer cantidad, String unidadDeMedida, Float precio) {
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
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del ingrediente.
     *
     * @param id Identificador del ingrediente.
     */
    public void setId(String id) {
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
