/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderianegocio;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadaos.IIngredienteDAO;
import com.mycompany.panaderiadaos.IngredienteDAO;
import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominiosMapeo.IngredienteMapeo;
import conversionesnegocio.IngredienteConversiones;
import DTO.DTO_Ingrediente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class InventarioIngredientesBO implements IInventarioIngredientesBO {

    private IIngredienteDAO ingredienteDAO;
    private IngredienteConversiones ingredienteConversiones;

    /**
     * Constructor de la clase
     */
    public InventarioIngredientesBO() {
        ingredienteDAO = new IngredienteDAO();
        ingredienteConversiones = new IngredienteConversiones();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente) {

        try {
            Ingrediente ingredienteNueva = ingredienteDAO.agregar(ConvertirDTOAIngrediente(ingrediente));
            return ingredienteConversiones.convertir(ingredienteNueva);
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Ingrediente> consultarIngredientes() {
        try {
            List<Ingrediente> ingredientes = ingredienteDAO.consultar();

            return ingredienteConversiones.convertir(ingredientes);
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IngredienteMapeo ConvertirDTOAIngrediente(DTO_Ingrediente ingredienteDTO) {
        IngredienteMapeo ingrediente = new IngredienteMapeo();
        ingrediente.setCantidad(ingredienteDTO.getCantidad());
        ingrediente.setNombre(ingredienteDTO.getNombre());
        ingrediente.setPrecio(ingredienteDTO.getPrecio());
       
        return ingrediente;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente) {
        DTO_Ingrediente dtoIngrediente = new DTO_Ingrediente();
        dtoIngrediente.setId(ingrediente.getId());

        dtoIngrediente.setCantidad(ingrediente.getCantidad());
        dtoIngrediente.setNombre(ingrediente.getNombre());
        dtoIngrediente.setPrecio(ingrediente.getPrecio());
        
        return dtoIngrediente;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingredienteDTO) {
        try {
            List<Ingrediente> ingredientes = ingredienteDAO.consultar(ConvertirDTOAIngrediente(ingredienteDTO));

            return ingredienteConversiones.convertir(ingredientes);
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente validarExistencia(DTO_Ingrediente ingrediente) {
        try {
            Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());

            if (ingredienteConsultado != null) {
                return ingredienteConversiones.convertir(ingredienteConsultado);
            }
            return null;
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente actualizarIngrediente(DTO_Ingrediente ingrediente) {
        try {
            Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());
            if (ingredienteConsultado != null) {
                return ingredienteConversiones.convertir(ingredienteDAO.actualizar(ConvertirDTOAIngrediente(ingrediente)));
            }
            return null;
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente) {
        try {
            Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());
            if (ingredienteConsultado != null) {
                return ingredienteDAO.eliminar(ConvertirDTOAIngrediente(ingrediente));
            }
            return false;
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente) {
        try {
            Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());
            return ingredienteConversiones.convertir(ingredienteConsultado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DTO_Ingrediente> consultarCantidadesIngredientesInventario(List<DTO_Ingrediente> ingredientes) {
        try {
            List<String> nombresIngredientes = new ArrayList<>();
            List<DTO_Ingrediente> ingredientesDTO = new ArrayList<>();
            for (DTO_Ingrediente ingrediente : ingredientes) {
                nombresIngredientes.add(ingrediente.getNombre());

            }

            for (Ingrediente ingrediente : ingredienteDAO.consultarCantidadesIngredientesInventario(nombresIngredientes)) {

                ingredientesDTO.add(convertirIngredienteADTO(ingrediente));
            }
            return ingredientesDTO;
        } catch (PersistenciaException ex) {
            Logger.getLogger(InventarioIngredientesBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
