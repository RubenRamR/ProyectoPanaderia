/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author rramirez
 */
public class DTO_VentaMes {

    int numeroVentas;
    float montoTotal;

    public DTO_VentaMes() {
    }

    public DTO_VentaMes(int numeroVentas, float montoTotal) {
        this.numeroVentas = numeroVentas;
        this.montoTotal = montoTotal;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "DTO_VentaMes{" + "numeroVentas=" + numeroVentas + ", montoTotal=" + montoTotal + '}';
    }

}
