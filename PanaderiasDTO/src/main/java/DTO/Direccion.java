/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NaderCroft
 */
public class Direccion {
    private String nombre;
    private String calle;
    private String colonia;
    private String numero;

    public Direccion() {
    }

    public Direccion(String nombre, String calle, String colonia, String numero) {
        this.nombre = nombre;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombre=" + nombre + ", calle=" + calle + ", colonia=" + colonia + ", numero=" + numero + '}';
    }
    
    
    
}
