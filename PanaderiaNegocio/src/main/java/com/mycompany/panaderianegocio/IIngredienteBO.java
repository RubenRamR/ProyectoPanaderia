/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderianegocio;

/**
 * Clase de interfaz que implementa metodos del ingredienteDAO
 * @author rramirez
 */
public interface IIngredienteBO {

    /**
     * Metodo que calcula el monto total del costo de los ingredientes
     * @return Regresa el monto total en tipo Float
     */
    public Float calcularMontoTotal();

}
