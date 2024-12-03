/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 * DTO de la entidad Direccion
 *
 */
public class DTO_Direccion {

    /**
     * Calle de la direccion
     */
    private String calle;
    /**
     * Colonia de la direccion
     */
    private String colonia;
    /**
     * Numero exterior de la direccion
     */
    private String numExterior;

    /**
     * Constructor vacio
     */
    public DTO_Direccion() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     *
     * @param calle calle de la direccion
     * @param colonia colonia de la direccion
     * @param numExterior numero exterior de la direccion
     * @param cliente DTO del cliente
     */
    public DTO_Direccion(String calle, String colonia, String numExterior, DTO_Cliente cliente) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
    }

    /**
     * Constructor que inicaliza la calle
     *
     * @param calle calle de la direccion
     */
    public DTO_Direccion(String calle) {
        this.calle = calle;
    }

    /**
     * Constructor que inicializa la calle, colonia y el numero exterior
     *
     * @param calle Calle de la direccion
     * @param colonia Colonia de la direccion
     * @param numExterior Numero exterior de la direccion
     */
    public DTO_Direccion(String calle, String colonia, String numExterior) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
    }

    /**
     * Obtiene el nombre de la calle en la dirección.
     *
     * Este método devuelve el nombre de la calle de la dirección. Se usa para
     * obtener el valor almacenado en el atributo `calle`.
     *
     * @return El nombre de la calle de la dirección, representado como un valor
     * de tipo `String`.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle en la dirección.
     *
     * Este método permite establecer el nombre de la calle en la dirección. El
     * valor proporcionado se guarda en el atributo `calle`.
     *
     * @param calle El nombre de la calle, representado como un valor de tipo
     * `String`.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la colonia en la dirección.
     *
     * Este método devuelve el nombre de la colonia de la dirección. Se usa para
     * obtener el valor almacenado en el atributo `colonia`.
     *
     * @return El nombre de la colonia de la dirección, representado como un
     * valor de tipo `String`.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece el nombre de la colonia en la dirección.
     *
     * Este método permite establecer el nombre de la colonia en la dirección.
     * El valor proporcionado se guarda en el atributo `colonia`.
     *
     * @param colonia El nombre de la colonia, representado como un valor de
     * tipo `String`.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el número exterior en la dirección.
     *
     * Este método devuelve el número exterior de la dirección. Se usa para
     * obtener el valor almacenado en el atributo `numExterior`.
     *
     * @return El número exterior de la dirección, representado como un valor de
     * tipo `String`.
     */
    public String getNumExterior() {
        return numExterior;
    }

    /**
     * Establece el número exterior en la dirección.
     *
     * Este método permite establecer el número exterior en la dirección. El
     * valor proporcionado se guarda en el atributo `numExterior`.
     *
     * @param numExterior El número exterior de la dirección, representado como
     * un valor de tipo `String`.
     */
    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    /**
     * Representación en forma de cadena de la dirección.
     *
     * Este método sobrescribe el método `toString` para proporcionar una
     * representación en cadena de texto de la dirección, mostrando el nombre de
     * la calle, colonia y número exterior.
     *
     * @return Una cadena que representa la dirección con los valores actuales
     * de los atributos `calle`, `colonia` y `numExterior`.
     */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", numExterior=" + numExterior + '}';
    }

}
