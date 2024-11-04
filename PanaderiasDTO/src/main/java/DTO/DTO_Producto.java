/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;
import java.util.List;


public class DTO_Producto {

    private String Id;
    private float precio;
    private String nombre;
    private String descripcion;
    private String especificaciones;
    private String tamanio;
    private List<DTO_IngredienteDetalle> ingredientes;

    public DTO_Producto() {
        if (ingredientes == null) {
            ingredientes = new ArrayList<>();
        }
    }

    public DTO_Producto(String nombre) {
        this.nombre = nombre;
    }

    public DTO_Producto(String Id, float precio, String nombre, String descripcion) {
        this.Id = Id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }

    public List<DTO_IngredienteDetalle> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<DTO_IngredienteDetalle> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public DTO_Producto(float precio, String nombre, String descripcion) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
       
    }

    public void addDTO_IngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle) {
        this.getIngredientes().add(ingredienteDetalle);
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }



    @Override
    public String toString() {
        return "DTO_Producto{" + "Id=" + Id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion +  '}';
    }

}
