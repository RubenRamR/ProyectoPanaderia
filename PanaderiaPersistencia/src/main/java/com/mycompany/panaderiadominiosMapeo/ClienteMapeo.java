package com.mycompany.panaderiadominiosMapeo;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * Representa un cliente mapeado para persistencia en la base de datos. Esta
 * clase mapea la información de un cliente, incluyendo su identificador,
 * nombre, apellidos, teléfono, RFC y lista de direcciones.
 *
 * 
 */
public class ClienteMapeo {

    private ObjectId id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;
    private String rfc;
    private List<DireccionMapeo> direcciones;

    /**
     * Constructor vacío de la clase ClienteMapeo.
     */
    public ClienteMapeo() {
    }

    /**
     * Constructor de la clase ClienteMapeo.
     *
     * @param id El identificador del cliente.
     * @param nombre El nombre del cliente.
     * @param apellidoP El primer apellido del cliente.
     * @param apellidoM El segundo apellido del cliente.
     * @param telefono El número de teléfono del cliente.
     * @param direcciones La lista de direcciones del cliente.
     */
    public ClienteMapeo(ObjectId id, String nombre, String apellidoP, String apellidoM, String telefono, List<DireccionMapeo> direcciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    /**
     * Constructor de la clase ClienteMapeo.
     *
     * @param nombre El nombre del cliente.
     * @param apellidoP El primer apellido del cliente.
     * @param apellidoM El segundo apellido del cliente.
     * @param telefono El número de teléfono del cliente.
     * @param direcciones La lista de direcciones del cliente.
     */
    public ClienteMapeo(String nombre, String apellidoP, String apellidoM, String telefono, List<DireccionMapeo> direcciones) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    /**
     * Constructor de la clase ClienteMapeo.
     *
     * @param nombre El nombre del cliente.
     * @param apellidoP El primer apellido del cliente.
     * @param apellidoM El segundo apellido del cliente.
     * @param telefono El número de teléfono del cliente.
     * @param rfc El RFC del cliente.
     * @param direcciones La lista de direcciones del cliente.
     */
    public ClienteMapeo(String nombre, String apellidoP, String apellidoM, String telefono, String rfc, List<DireccionMapeo> direcciones) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.rfc = rfc;
        this.direcciones = direcciones;
    }

    /**
     * Constructor de la clase ClienteMapeo.
     *
     * @param id El identificador del cliente.
     * @param nombre El nombre del cliente.
     * @param apellidoP El primer apellido del cliente.
     * @param apellidoM El segundo apellido del cliente.
     * @param telefono El número de teléfono del cliente.
     * @param rfc El RFC del cliente.
     * @param direcciones La lista de direcciones del cliente.
     */
    public ClienteMapeo(ObjectId id, String nombre, String apellidoP, String apellidoM, String telefono, String rfc, List<DireccionMapeo> direcciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.rfc = rfc;
        this.direcciones = direcciones;
    }

    /**
     * Obtiene el identificador del cliente.
     *
     * @return El identificador del cliente.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del cliente.
     *
     * @param id El identificador del cliente a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el primer apellido del cliente.
     *
     * @return El primer apellido del cliente.
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Establece el primer apellido del cliente.
     *
     * @param apellidoP El primer apellido del cliente a establecer.
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * Obtiene el segundo apellido del cliente.
     *
     * @return El segundo apellido del cliente.
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Establece el segundo apellido del cliente.
     *
     * @param apellidoM El segundo apellido del cliente a establecer.
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono del cliente a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el RFC del cliente.
     *
     * @return El RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del cliente.
     *
     * @param rfc El RFC del cliente a establecer.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene la lista de direcciones del cliente.
     *
     * @return La lista de direcciones del cliente.
     */
    public List<DireccionMapeo> getDirecciones() {
        return direcciones;
    }
    /**
     * Guarda las direcciones mapeo del cliente
     * @param direcciones 
     */
    public void setDirecciones(List<DireccionMapeo> direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto ClienteMapeo.
     *
     * @return Representación en cadena de texto del objeto ClienteMapeo.
     */
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", direcciones=" + direcciones + '}';
    }

}
