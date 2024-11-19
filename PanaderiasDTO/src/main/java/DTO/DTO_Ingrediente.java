/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class DTO_Ingrediente {

    private String id;
    private String nombre;
    private Integer cantidad;
      
    private Float precio;

    public DTO_Ingrediente() {
    }

    public DTO_Ingrediente(String id, String nombre, Integer cantidad, Float precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;

        this.precio = precio;
    }

    public DTO_Ingrediente(String nombre) {
        this.nombre = nombre;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
