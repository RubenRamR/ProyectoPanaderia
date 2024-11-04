/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Ingrediente;
import com.mycompany.panaderiadominiosMapeo.IngredienteMapeo;
import java.util.List;

/**
 * Interfaz IIngredienteDAO
 * <p>
 * Esta interfaz define los métodos para realizar operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) y consultas especializadas sobre los ingredientes en la
 * base de datos.
 * </p>
 *
 * <p>
 * Proporciona métodos para agregar, actualizar, eliminar y consultar
 * ingredientes, así como para realizar consultas específicas relacionadas con
 * el inventario de ingredientes.</p>
 *
 * @see Ingrediente
 * @see IngredienteMapeo
 * @see PersistenciaException
 *
 * @version 1.0
 * @since 2024
 *
 */
public interface IIngredienteDAO {

    /**
     * Agrega un nuevo ingrediente a la base de datos.
     *
     * @param ingrediente El objeto IngredienteMapeo que se va a agregar.
     * @return El objeto Ingrediente agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Ingrediente agregar(IngredienteMapeo ingrediente) throws PersistenciaException;

    /**
     * Actualiza un ingrediente existente en la base de datos.
     *
     * @param ingrediente El objeto IngredienteMapeo que se va a actualizar.
     * @return El objeto Ingrediente actualizado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Ingrediente actualizar(IngredienteMapeo ingrediente) throws PersistenciaException;

    /**
     * Consulta todos los ingredientes en la base de datos.
     *
     * @return Una lista de objetos Ingrediente.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Ingrediente> consultar() throws PersistenciaException;

    /**
     * Consulta los ingredientes que coinciden con los criterios especificados.
     *
     * @param ingrediente El objeto IngredienteMapeo que contiene los criterios
     * de búsqueda.
     * @return Una lista de objetos Ingrediente que coinciden con los criterios.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Ingrediente> consultar(IngredienteMapeo ingrediente) throws PersistenciaException;

    /**
     * Consulta un ingrediente por su nombre.
     *
     * @param nombre El nombre del ingrediente.
     * @return El objeto Ingrediente que coincide con el nombre especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Ingrediente consultarPorNombre(String nombre) throws PersistenciaException;

    /**
     * Elimina un ingrediente de la base de datos.
     *
     * @param ingrediente El objeto IngredienteMapeo que se va a eliminar.
     * @return True si el ingrediente fue eliminado, false en caso contrario.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Boolean eliminar(IngredienteMapeo ingrediente) throws PersistenciaException;

    /**
     * Consulta los ingredientes que faltan en el inventario.
     *
     * @param ingredientesIds Una lista de IDs de los ingredientes a consultar.
     * @return Una lista de objetos Ingrediente que están faltando.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Ingrediente> consultarIngredientesFaltantes(List<String> ingredientesIds) throws PersistenciaException;

    /**
     * Consulta las cantidades de ingredientes en el inventario.
     *
     * @param ingredientesNombres Una lista de nombres de los ingredientes a
     * consultar.
     * @return Una lista de objetos Ingrediente con las cantidades disponibles
     * en el inventario.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Ingrediente> consultarCantidadesIngredientesInventario(List<String> ingredientesNombres) throws PersistenciaException;

    /**
     * Consulta los ingredientes que tienen stock disponible.
     *
     * @return Una lista de objetos Ingrediente que tienen stock disponible.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Ingrediente> consultarIngredientesConStock() throws PersistenciaException;

}
