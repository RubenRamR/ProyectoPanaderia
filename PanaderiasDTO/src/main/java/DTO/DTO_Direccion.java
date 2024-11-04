/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


public class DTO_Direccion {
    private String calle;
    private String colonia;
    private String numExterior;


    public DTO_Direccion() {
    }

    public DTO_Direccion(String calle, String colonia, String numExterior, DTO_Cliente cliente) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
    }

    public DTO_Direccion(String calle) {
        this.calle = calle;
    }

    public DTO_Direccion(String calle, String colonia, String numExterior) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
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

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }


    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", numExterior=" + numExterior + '}';
    }
    
}
