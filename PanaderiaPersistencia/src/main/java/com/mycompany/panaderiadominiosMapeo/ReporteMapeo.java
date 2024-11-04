package com.mycompany.panaderiadominiosMapeo;

import java.util.Date;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 * Clase que representa un reporte mapeado para persistencia.
 * Contiene atributos como nombre, contenido, tipo, categoría y fecha de expedición.
 * 
 * 
 */
public class ReporteMapeo {

    private ObjectId id;
    private String nombre;
    private Binary contenido;
    private String tipo;
    private String categoria;
    private Date fechaExpedicion;

    /**
     * Constructor de la clase ReporteMapeo.
     */
    public ReporteMapeo() {
    }

    /**
     * Constructor de la clase ReporteMapeo.
     * 
     * @param id Identificador del reporte.
     * @param nombre Nombre del reporte.
     * @param contenido Contenido del reporte.
     * @param tipo Tipo del reporte.
     * @param categoria Categoría del reporte.
     * @param fechaExpedicion Fecha de expedición del reporte.
     */
    public ReporteMapeo(ObjectId id, String nombre, Binary contenido, String tipo, String categoria, Date fechaExpedicion) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Obtiene el identificador del reporte.
     * 
     * @return Identificador del reporte.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del reporte.
     * 
     * @param id Identificador del reporte.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del reporte.
     * 
     * @return Nombre del reporte.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del reporte.
     * 
     * @param nombre Nombre del reporte.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el contenido del reporte.
     * 
     * @return Contenido del reporte.
     */
    public Binary getContenido() {
        return contenido;
    }

    /**
     * Establece el contenido del reporte.
     * 
     * @param contenido Contenido del reporte.
     */
    public void setContenido(Binary contenido) {
        this.contenido = contenido;
    }

    /**
     * Obtiene el tipo del reporte.
     * 
     * @return Tipo del reporte.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del reporte.
     * 
     * @param tipo Tipo del reporte.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la categoría del reporte.
     * 
     * @return Categoría del reporte.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del reporte.
     * 
     * @param categoria Categoría del reporte.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la fecha de expedición del reporte.
     * 
     * @return Fecha de expedición del reporte.
     */
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la fecha de expedición del reporte.
     * 
     * @param fechaExpedicion Fecha de expedición del reporte.
     */
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

}
