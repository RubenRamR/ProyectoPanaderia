/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadominioentidades;

/**
 * Clase que representa una dirección en la pastelería.
 */
public class Direccion {
    
    /** Nombre de la calle. */
    private String calle;
    
    /** Nombre de la colonia. */
    private String colonia;
    
    /** Número exterior de la dirección. */
    private String numExterior;

    /**
     * Constructor por defecto de la clase Direccion.
     */
    public Direccion() {
    }

    /**
     * Constructor de la clase Direccion.
     * @param calle Nombre de la calle.
     * @param colonia Nombre de la colonia.
     * @param numExterior Número exterior de la dirección.
     */
    public Direccion(String calle, String colonia, String numExterior) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
    }

    /**
     * Obtiene el nombre de la calle.
     * @return Nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     * @param calle Nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la colonia.
     * @return Nombre de la colonia.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece el nombre de la colonia.
     * @param colonia Nombre de la colonia.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el número exterior de la dirección.
     * @return Número exterior de la dirección.
     */
    public String getNumExterior() {
        return numExterior;
    }

    /**
     * Establece el número exterior de la dirección.
     * @param numExterior Número exterior de la dirección.
     */
    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    /**
     * Devuelve una representación en cadena del objeto Direccion.
     * @return Representación en cadena del objeto Direccion.
     */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", numExterior=" + numExterior + '}';
    }

}