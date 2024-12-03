/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 * DTO de la entidad Venta Mes
 * @author rramirez
 */
public class DTO_VentaMes {

    /**
     * Numero de ventas del mes
     */
    int numeroVentas;
    /**
     * Monto toal de las ventas del mes
     */
    float montoTotal;

    /**
     * Constructor Vacio
     */
    public DTO_VentaMes() {
    }

    /**
     * Constructor que inicializa los atributos de la clase
     * @param numeroVentas numero de ventas del mes
     * @param montoTotal monto total del mes
     */
    public DTO_VentaMes(int numeroVentas, float montoTotal) {
        this.numeroVentas = numeroVentas;
        this.montoTotal = montoTotal;
    }

    /**
     * Regresa el numero de ventas
     * @return numero de ventas
     */
    public int getNumeroVentas() {
        return numeroVentas;
    }

    /**
     * Actualiza el numero de ventas
     * @param numeroVentas el nuevo numero de ventas
     */
    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    /**
     * Regresa el monto total de las ventas del mes
     * @return monto total del mes
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Actualiza el monto total de la venta del mes
     * @param montoTotal nuevo monto total de ventas
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * To string de la clase
     * @return numero de ventas, y el monto total
     */
    @Override
    public String toString() {
        return "DTO_VentaMes{" + "numeroVentas=" + numeroVentas + ", montoTotal=" + montoTotal + '}';
    }

}
