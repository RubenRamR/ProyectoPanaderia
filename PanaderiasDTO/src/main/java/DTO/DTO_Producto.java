/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase DTO de la entidad Producto
 *
 */
public class DTO_Producto {

    /**
     * Id unico del producto
     */
    private String Id;
    /**
     * Precio del producto
     */
    private float precio;
    /**
     * Nombre del producto
     */
    private String nombre;
    /**
     * Descripcion del producto
     */
    private String descripcion;
    /**
     * Especificaciones del producto
     */
    private String especificaciones;
    /**
     * tamanio del producto
     */
    private String tamanio;
    /**
     * Lista de los detalles del ingrediente
     */
    private List<DTO_IngredienteDetalle> ingredientes;

    /**
     * Constructor del DTO producto
     */
    public DTO_Producto() {
        if (ingredientes == null) {
            ingredientes = new ArrayList<>();
        }
    }

    /**
     * Constructor que inicializa el nombre
     *
     * @param nombre Nombre del producto
     */
    public DTO_Producto(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicaliza el id, precio, nombre y la descripcion
     *
     * @param Id Id del producto
     * @param precio precio del producto
     * @param nombre nombre del producto
     * @param descripcion descripcion del producto
     */
    public DTO_Producto(String Id, float precio, String nombre, String descripcion) {
        this.Id = Id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    /**
     * Obtiene la lista de ingredientes del producto.
     *
     * Este método devuelve la lista de objetos `DTO_IngredienteDetalle` que
     * representan los ingredientes asociados con el producto.
     *
     * @return La lista de ingredientes del producto como un valor de tipo
     * `List<DTO_IngredienteDetalle>`.
     */
    public List<DTO_IngredienteDetalle> getIngredientes() {
        return ingredientes;
    }

    /**
     * Establece la lista de ingredientes del producto.
     *
     * Este método permite establecer la lista de ingredientes asociados con el
     * producto. Recibe una lista de objetos `DTO_IngredienteDetalle` que
     * representan los ingredientes del producto.
     *
     * @param ingredientes La lista de ingredientes del producto como un valor
     * de tipo `List<DTO_IngredienteDetalle>`.
     */
    public void setIngredientes(List<DTO_IngredienteDetalle> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Constructor de la clase `DTO_Producto`.
     *
     * Este constructor inicializa un objeto de la clase `DTO_Producto` con el
     * precio, nombre y descripción del producto.
     *
     * @param precio El precio del producto como un valor de tipo `float`.
     * @param nombre El nombre del producto como un valor de tipo `String`.
     * @param descripcion La descripción del producto como un valor de tipo
     * `String`.
     */
    public DTO_Producto(float precio, String nombre, String descripcion) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Añade un ingrediente a la lista de ingredientes del producto.
     *
     * Este método permite agregar un objeto `DTO_IngredienteDetalle` a la lista
     * de ingredientes del producto.
     *
     * @param ingredienteDetalle El ingrediente a añadir a la lista como un
     * valor de tipo `DTO_IngredienteDetalle`.
     */
    public void addDTO_IngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle) {
        this.getIngredientes().add(ingredienteDetalle);
    }

    /**
     * Obtiene el ID del producto.
     *
     * Este método devuelve el identificador único del producto. Se utiliza para
     * obtener el valor almacenado en el atributo `Id`.
     *
     * @return El ID del producto como un valor de tipo `String`.
     */
    public String getId() {
        return Id;
    }

    /**
     * Establece el ID del producto.
     *
     * Este método permite establecer el identificador único del producto. El
     * valor proporcionado se guarda en el atributo `Id`.
     *
     * @param Id El ID del producto como un valor de tipo `String`.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Obtiene el precio del producto.
     *
     * Este método devuelve el precio del producto. Se utiliza para obtener el
     * valor almacenado en el atributo `precio`.
     *
     * @return El precio del producto como un valor de tipo `float`.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * Este método permite establecer el precio del producto. El valor
     * proporcionado se guarda en el atributo `precio`.
     *
     * @param precio El precio del producto como un valor de tipo `float`.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * Este método devuelve el nombre del producto. Se utiliza para obtener el
     * valor almacenado en el atributo `nombre`.
     *
     * @return El nombre del producto como un valor de tipo `String`.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * Este método permite establecer el nombre del producto. El valor
     * proporcionado se guarda en el atributo `nombre`.
     *
     * @param nombre El nombre del producto como un valor de tipo `String`.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * Este método devuelve la descripción del producto. Se utiliza para obtener
     * el valor almacenado en el atributo `descripcion`.
     *
     * @return La descripción del producto como un valor de tipo `String`.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     *
     * Este método permite establecer la descripción del producto. El valor
     * proporcionado se guarda en el atributo `descripcion`.
     *
     * @param descripcion La descripción del producto como un valor de tipo
     * `String`.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene las especificaciones del producto.
     *
     * Este método devuelve las especificaciones del producto, como
     * características adicionales o detalles del mismo.
     *
     * @return Las especificaciones del producto como un valor de tipo `String`.
     */
    public String getEspecificaciones() {
        return especificaciones;
    }

    /**
     * Establece las especificaciones del producto.
     *
     * Este método permite establecer las especificaciones del producto. El
     * valor proporcionado se guarda en el atributo `especificaciones`.
     *
     * @param especificaciones Las especificaciones del producto como un valor
     * de tipo `String`.
     */
    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    /**
     * Obtiene el tamaño del producto.
     *
     * Este método devuelve el tamaño del producto, si está especificado. Se
     * utiliza para obtener el valor almacenado en el atributo `tamanio`.
     *
     * @return El tamaño del producto como un valor de tipo `String`.
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * Establece el tamaño del producto.
     *
     * Este método permite establecer el tamaño del producto. El valor
     * proporcionado se guarda en el atributo `tamanio`.
     *
     * @param tamanio El tamaño del producto como un valor de tipo `String`.
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Representa al producto como una cadena de texto.
     *
     * Este método sobrescribe el método `toString()` de la clase `Object` para
     * representar al producto de manera legible.
     *
     * @return Una cadena de texto que representa el producto con su ID, precio,
     * nombre y descripción.
     */
    @Override
    public String toString() {
        return "DTO_Producto{" + "Id=" + Id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
