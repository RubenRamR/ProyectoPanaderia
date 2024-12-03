/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 * DTO de la entidad Cliente
 * 
 */
public class DTO_Cliente {

    /**
     * Identificador unico del cliente
     */
    private String ID;
    /**
     * Nombre del cliente
     */
    private String nombre;
    /**
     * Apellido paterno del cliente
     */
    private String apellidoP;
    /**
     * Apellido materno del cliente
     */
    private String apellidoM;
    /**
     * Telefono del cliente
     */
    private String telefono;
    /**
     * RFC del cliente
     */
    private String rfc;

    /**
     * Lista de direcciones del cliente
     */
    private List<DTO_Direccion> direcciones;

    /**
     * Constructor vacio de la clase
     */
    public DTO_Cliente() {

    }

    /**
     * Constructor que inicializa el nombre
     * @param nombre Nombre del cliente
     */
    public DTO_Cliente(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa el id, nombre, apellido paterno, apellido materno, telefono
     * y su lista de direcciones
     * @param ID Clave unica del cliente
     * @param nombre Nombre del cliente
     * @param apellidoP Apellido paterno del cliente
     * @param apellidoM Apellido Materno del cliente
     * @param telefono Telefono del cliente
     * @param direcciones Direcciones del cliente
     */
    public DTO_Cliente(String ID, String nombre, String apellidoP, String apellidoM, String telefono, List<DTO_Direccion> direcciones) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    /**
     * Constructor que inicaliza el nombre, apellido paterno, apellido materno, telefono y direcciones
     * @param nombre Nombre del cliente
     * @param apellidoP Apellido paterno del cliente
     * @param apellidoM Apellido Materno del cliente
     * @param telefono Telefono del cliente
     * @param direcciones Direcciones del cliente
     */
    public DTO_Cliente(String nombre, String apellidoP, String apellidoM, String telefono, List<DTO_Direccion> direcciones) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;

        this.direcciones = direcciones;
    }

    /**
     * Regresa el ID
     * @return ID del cliente
     */
    public String getID() {
        return ID;
    }

    /**
     * Actualiza el id
     * @param ID Id nuevo del cliente
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Regresa el nombre 
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre
     * @param nombre Nombre Nuevo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido Paterno
     * @return Apellido paterno del cliente
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Actualia el apellido paterno
     * @param apellidoP Nuevo apellido paterno
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * Regresa el apellido materno
     * @return Apellido materno del cliente
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Actualiza el apellido Materno
     * @param apellidoM nuevo apellido materno
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * Regresa el telefono
     * @return telefono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * actualiza el telefono
     * @param telefono telefono nuevo
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     * Regresa la lista de direcciones
     * @return Lista de direcciones del cliente
     */
    public List<DTO_Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Actualiza la lista de direcciones
     * @param direcciones Lista nueva de direcciones
     */
    public void setDirecciones(List<DTO_Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * Regresa el RFC del cliente
     * @return RFC del cliente
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Actualiza el RFC del cliente
     * @param rfc Nuevo RFC
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * ToString de la clase
     * @return id,nombre,apellido paterno, apellido materno, telefono y direcciones
     */
    @Override
    public String toString() {
        return "DTO_Cliente{" + "ID=" + ID + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", direcciones=" + direcciones + '}';
    }

}
