/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;


public class DTO_Cliente {

    private String ID;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;
    private String rfc;

    private List<DTO_Direccion> direcciones;

    public DTO_Cliente() {

    }

    public DTO_Cliente(String nombre) {
        this.nombre = nombre;
    }

    public DTO_Cliente(String ID, String nombre, String apellidoP, String apellidoM, String telefono, List<DTO_Direccion> direcciones) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    public DTO_Cliente(String nombre, String apellidoP, String apellidoM, String telefono, List<DTO_Direccion> direcciones) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;

        this.direcciones = direcciones;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public List<DTO_Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<DTO_Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "DTO_Cliente{" + "ID=" + ID + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", direcciones=" + direcciones + '}';
    }

}
