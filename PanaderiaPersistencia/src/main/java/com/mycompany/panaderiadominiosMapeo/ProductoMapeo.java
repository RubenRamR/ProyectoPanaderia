package com.mycompany.panaderiadominiosMapeo;

import com.mycompany.panaderiadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que representa un producto mapeado para persistencia. Contiene
 * atributos como precio, nombre, descripción y lista de ingredientes. Permite
 * agregar ingredientes a la lista.
 *
 * 
 */
public class ProductoMapeo {

    private ObjectId id;
    private float precio;
    private String nombre;
    private String descripcion;
    private List<IngredienteDetalleMapeo> ingredientes;

    /**
     * Constructor de la clase ProductoMapeo. Inicializa la lista de
     * ingredientes.
     */
    public ProductoMapeo() {
        if (ingredientes == null) {
            ingredientes = new ArrayList<>();
        }
    }

    /**
     * Constructor de la clase ProductoMapeo.
     *
     * @param id Identificador del producto.
     */
    public ProductoMapeo(ObjectId id) {
        this.id = id;
    }

    /**
     * Constructor de la clase ProductoMapeo.
     *
     * @param id Identificador del producto.
     * @param precio Precio del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param ingredientes Lista de ingredientes del producto.
     */
    public ProductoMapeo(ObjectId id, float precio, String nombre, String descripcion, List<IngredienteDetalleMapeo> ingredientes) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    /**
     * Constructor de la clase ProductoMapeo.
     *
     * @param precio Precio del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param ingredientes Lista de ingredientes del producto.
     */
    public ProductoMapeo(float precio, String nombre, String descripcion, List<IngredienteDetalleMapeo> ingredientes) {
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
    public List<IngredienteDetalleMapeo> getIngredientes() {
        return ingredientes;
    }

    /**
     * Establece la lista de ingredientes del producto.
     *
     * @param ingredientes Lista de ingredientes del producto.
     */
    public void setIngredientes(List<IngredienteDetalleMapeo> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Agrega un ingrediente a la lista de ingredientes del producto.
     *
     * @param ingrediente Ingrediente a agregar.
     */
    public void addIngredienteDetalle(IngredienteDetalleMapeo ingrediente) {
        this.getIngredientes().add(ingrediente);
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return Identificador del producto.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del producto.
     *
     * @param id Identificador del producto.
     */
    public void setId(ObjectId id) {
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
     * Obtiene una representación en cadena del objeto ProductoMapeo.
     *
     * @return Representación en cadena del objeto ProductoMapeo.
     */
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
