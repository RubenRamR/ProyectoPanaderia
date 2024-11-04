/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominioentidades;

import java.util.Date;

/**
 * Clase que representa un reporte generado en la pastelería.
 */
public class Reporte {
    
    /** Identificador único del reporte. */
    private String id;
    
    /** Nombre del reporte. */
    private String nombre;
    
    /** Contenido del reporte en bytes. */
    private byte[] bytesContenido;
    
    /** Tipo de reporte. */
    private String tipo;
    
    /** Categoría del reporte. */
    private String categoria;
    
    /** Fecha de expedición del reporte. */
    private Date fechaExpedicion;

    /**
     * Constructor por defecto de la clase Reporte.
     */
    public Reporte() {
    }

    /**
     * Constructor de la clase Reporte.
     * @param id Identificador único del reporte.
     * @param nombre Nombre del reporte.
     * @param bytesContenido Contenido del reporte en bytes.
     * @param tipo Tipo de reporte.
     * @param categoria Categoría del reporte.
     * @param fechaExpedicion Fecha de expedición del reporte.
     */
    public Reporte(String id, String nombre, byte[] bytesContenido, String tipo, String categoria, Date fechaExpedicion) {
        this.id = id;
        this.nombre = nombre;
        this.bytesContenido = bytesContenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Constructor de la clase Reporte.
     * @param nombre Nombre del reporte.
     * @param bytesContenido Contenido del reporte en bytes.
     * @param tipo Tipo de reporte.
     * @param categoria Categoría del reporte.
     * @param fechaExpedicion Fecha de expedición del reporte.
     */
    public Reporte(String nombre, byte[] bytesContenido, String tipo, String categoria, Date fechaExpedicion) {
        this.nombre = nombre;
        this.bytesContenido = bytesContenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Obtiene el identificador del reporte.
     * @return Identificador del reporte.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del reporte.
     * @param id Identificador del reporte.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del reporte.
     * @return Nombre del reporte.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del reporte.
     * @param nombre Nombre del reporte.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el contenido del reporte en bytes.
     * @return Contenido del reporte en bytes.
     */
    public byte[] getBytesContenido() {
        return bytesContenido;
    }

    /**
     * Establece el contenido del reporte en bytes.
     * @param bytesContenido Contenido del reporte en bytes.
     */
    public void setBytesContenido(byte[] bytesContenido) {
        this.bytesContenido = bytesContenido;
    }

    /**
     * Obtiene el tipo de reporte.
     * @return Tipo de reporte.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de reporte.
     * @param tipo Tipo de reporte.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la categoría del reporte.
     * @return Categoría del reporte.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del reporte.
     * @param categoria Categoría del reporte.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la fecha de expedición del reporte.
     * @return Fecha de expedición del reporte.
     */
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la fecha de expedición del reporte.
     * @param fechaExpedicion Fecha de expedición del reporte.
     */
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
}
