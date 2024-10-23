/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NaderCroft
 */
public class Venta {
    private double costo;
    private String nombre;
    private String fecha;
    private String ubicacion;

    public Venta() {
    }

    public Venta(double costo, String nombre, String fecha, String ubicacion) {
        this.costo = costo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Venta{" + "costo=" + costo + ", nombre=" + nombre + ", fecha=" + fecha + ", ubicacion=" + ubicacion + '}';
    }
    
    
    
}
