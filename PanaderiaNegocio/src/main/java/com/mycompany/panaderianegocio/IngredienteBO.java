/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadaos.IIngredienteDAO;
import com.mycompany.panaderiadaos.IngredienteDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * BO de Ingredientes
 * @author rramirez
 */
public class IngredienteBO implements IIngredienteBO {

    IIngredienteDAO ingredienteDAO;

    /**
     * Constructor de la clase
     */
    public IngredienteBO() {
        ingredienteDAO = new IngredienteDAO();
    }

    /**
     * Metodo que calcula el monto total de los ingredientes
     * @return Monto total de los ingredientes
     */
    @Override
    public Float calcularMontoTotal() {
        try
        {
            return ingredienteDAO.calcularMontoTotal();
        } catch (PersistenciaException ex)
        {
            Logger.getLogger(IngredienteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
