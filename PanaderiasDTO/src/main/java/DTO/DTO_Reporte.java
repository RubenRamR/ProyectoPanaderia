/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.File;
import java.util.Date;


public class DTO_Reporte {

    private String id;
    private String nombre;
    private byte[] bytesContenido;
    private String tipo;
    private String categoria;
    private Date fechaExpedicion;

    public DTO_Reporte() {
    }

    public DTO_Reporte(String id, String nombre, byte[] bytesContenido, String tipo, String categoria, Date fechaExpedicion) {
        this.id = id;
        this.nombre = nombre;
        this.bytesContenido = bytesContenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    public DTO_Reporte(String nombre, byte[] bytesContenido, String tipo, String categoria, Date fechaExpedicion) {
        this.nombre = nombre;
        this.bytesContenido = bytesContenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getBytesContenido() {
        return bytesContenido;
    }

    public void setBytesContenido(byte[] bytesContenido) {
        this.bytesContenido = bytesContenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

}
