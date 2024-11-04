package com.mycompany.panaderiadominiosMapeo;

/**
 * Clase que representa una dirección mapeada para persistencia.
 * Contiene atributos como calle, colonia y número exterior.
 * 
 * 
 */
public class DireccionMapeo {

    private String calle;
    private String colonia;
    private String numExterior;

    /**
     * Constructor de la clase DireccionMapeo.
     */
    public DireccionMapeo() {
    }

    /**
     * Constructor de la clase DireccionMapeo.
     * 
     * @param calle Nombre de la calle.
     * @param colonia Nombre de la colonia.
     * @param numExterior Número exterior.
     */
    public DireccionMapeo(String calle, String colonia, String numExterior) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
    }

    /**
     * Obtiene el nombre de la calle.
     * 
     * @return Nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     * 
     * @param calle Nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la colonia.
     * 
     * @return Nombre de la colonia.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece el nombre de la colonia.
     * 
     * @param colonia Nombre de la colonia.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el número exterior.
     * 
     * @return Número exterior.
     */
    public String getNumExterior() {
        return numExterior;
    }

    /**
     * Establece el número exterior.
     * 
     * @param numExterior Número exterior.
     */
    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto DireccionMapeo.
     * 
     * @return Representación en cadena de texto del objeto DireccionMapeo.
     */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", numExterior=" + numExterior + '}';
    }

}
