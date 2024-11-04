package com.mycompany.panaderiadominioentidades;

import com.mycompany.panaderiadominioentidades.Direccion;
import java.util.List;

/**
 * Clase que representa a un cliente de la pastelería.
 */
public class Cliente {


    /**
     * Identificador único del cliente.
     */
    private String id;

    /**
     * Nombre del cliente.
     */


    private String nombre;

    /**
     * Apellido paterno del cliente.
     */
    private String apellidoP;

    /**
     * Apellido materno del cliente.
     */
    private String apellidoM;

    /**
     * Número de teléfono del cliente.
     */
    private String telefono;

    /**
     * RFC (Registro Federal de Contribuyentes) del cliente.
     */
    private String rfc;

    /**
     * Lista de direcciones asociadas al cliente.
     */
    private List<Direccion> direcciones;

    /**
     * Constructor por defecto de la clase Cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor de la clase Cliente.
     *
     * @param id Identificador único del cliente.
     * @param nombre Nombre del cliente.
     * @param apellidoP Apellido paterno del cliente.
     * @param apellidoM Apellido materno del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param direcciones Lista de direcciones asociadas al cliente.
     */
    public Cliente(String id, String nombre, String apellidoP, String apellidoM, String telefono, List<Direccion> direcciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre Nombre del cliente.
     * @param apellidoP Apellido paterno del cliente.
     * @param apellidoM Apellido materno del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param direcciones Lista de direcciones asociadas al cliente.
     */
    public Cliente(String nombre, String apellidoP, String apellidoM, String telefono, List<Direccion> direcciones) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    /**
     * Constructor de la clase Cliente.
     *
     * @param id Identificador único del cliente.
     * @param nombre Nombre del cliente.
     * @param apellidoP Apellido paterno del cliente.
     * @param apellidoM Apellido materno del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param rfc RFC del cliente.
     * @param direcciones Lista de direcciones asociadas al cliente.
     */
    public Cliente(String id, String nombre, String apellidoP, String apellidoM, String telefono, String rfc, List<Direccion> direcciones) {
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
     * @return Identificador del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del cliente.
     *
     * @param id Identificador del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre Nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del cliente.
     *
     * @return Apellido paterno del cliente.
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Establece el apellido paterno del cliente.
     *
     * @param apellidoP Apellido paterno del cliente.
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * Obtiene el apellido materno del cliente.
     *
     * @return Apellido materno del cliente.
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Establece el apellido materno del cliente.
     *
     * @param apellidoM Apellido materno del cliente.
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return Número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono Número de teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el RFC del cliente.
     *
     * @return RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del cliente.
     *
     * @param rfc RFC del cliente.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene la lista de direcciones asociadas al cliente.
     *
     * @return Lista de direcciones asociadas al cliente.
     */
    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Establece la lista de direcciones asociadas al cliente.
     *
     * @param direcciones Lista de direcciones asociadas al cliente.
     */
    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * Devuelve una representación en cadena del objeto Cliente.
     *
     * @return Representación en cadena del objeto Cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", direcciones=" + direcciones + '}';
    }
}
