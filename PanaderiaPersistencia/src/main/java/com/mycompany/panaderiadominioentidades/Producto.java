/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominioentidades;

import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un producto en la pastelería.
 */
public class Producto {

    /**
     * Identificador único del producto.
     */
    private String id;

    /**
     * Precio del producto.
     */
    private float precio;

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Descripción del producto.
     */
    private String descripcion;

    /**
     * Lista de ingredientes del producto.
     */
    private List<IngredienteDetalle> ingredientes;

    /**
     * Constructor por defecto de la clase Producto. Inicializa la lista de
     * ingredientes.
     */
    public Producto() {
        ingredientes = new ArrayList<>();
    }

    /**
     * Constructor de la clase Producto.
     *
     * @param id Identificador único del producto.
     */
    public Producto(String id) {
        this.id = id;
    }

    /**
     * Constructor de la clase Producto.
     *
     * @param id Identificador único del producto.
     * @param precio Precio del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param ingredientes Lista de ingredientes del producto.
     */
    public Producto(String id, float precio, String nombre, String descripcion, List<IngredienteDetalle> ingredientes) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    /**
     * Constructor de la clase Producto.
     *
     * @param precio Precio del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param ingredientes Lista de ingredientes del producto.
     */
    public Producto(float precio, String nombre, String descripcion, List<IngredienteDetalle> ingredientes) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    /**
     * Obtiene la lista de ingredientes del producto.
     *
     * @return Lista de ingredientes del producto.
     */
    public List<IngredienteDetalle> getIngredientes() {
        return ingredientes;
    }

    /**
     * Establece la lista de ingredientes del producto.
     *
     * @param ingredientes Lista de ingredientes del producto.
     */
    public void setIngredientes(List<IngredienteDetalle> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Agrega un ingrediente detalle a la lista de ingredientes del producto.
     *
     * @param ingrediente Ingrediente detalle a agregar.
     */
    public void addIngredienteDetalle(IngredienteDetalle ingrediente) {
        this.getIngredientes().add(ingrediente);
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return Identificador del producto.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del producto.
     *
     * @param id Identificador del producto.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return Precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio Precio del producto.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre Nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     *
     * @param descripcion Descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve una representación en cadena del objeto Producto.
     *
     * @return Representación en cadena del objeto Producto.
     */
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
}
