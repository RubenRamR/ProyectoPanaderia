/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominiosMapeo.ProductoMapeo;
import java.util.List;

/**
 * Interfaz IProductoDAO
 *
 * Esta interfaz define los métodos para realizar operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) y consultas especializadas sobre los productos en la
 * base de datos. Proporciona métodos para agregar, actualizar, eliminar y
 * consultar productos, así como para realizar consultas específicas por nombre
 * y coincidencias parciales.
 *
 *
 */
public interface IProductoDAO {

    /**
     * Agrega un nuevo producto a la base de datos.
     *
     * @param producto El objeto Producto que se va a agregar.
     * @return El objeto Producto agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Producto agregarProducto(Producto producto) throws PersistenciaException;

    /**
     * Actualiza un producto existente en la base de datos.
     *
     * @param producto El objeto Producto que se va a actualizar.
     * @return El objeto Producto actualizado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Producto actualizar(Producto producto) throws PersistenciaException;

    /**
     * Elimina un producto de la base de datos.
     *
     * @param producto El objeto ProductoMapeo que se va a eliminar.
     * @return True si el producto fue eliminado, false en caso contrario.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public boolean eliminarProducto(ProductoMapeo producto) throws PersistenciaException;

    /**
     * Consulta un producto por su ID.
     *
     * @param id El ID del producto.
     * @return El objeto Producto que coincide con el ID especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Producto consultar(String id) throws PersistenciaException;

    /**
     * Consulta todos los productos en la base de datos.
     *
     * @return Una lista de objetos Producto.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Producto> consultarProductos() throws PersistenciaException;

    /**
     * Consulta un producto por su nombre.
     *
     * @param nombre El nombre del producto.
     * @return El objeto Producto que coincide con el nombre especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Producto consultarPorNombre(String nombre) throws PersistenciaException;

    /**
     * Consulta los productos que coinciden parcialmente con el nombre
     * especificado.
     *
     * @param nombre El nombre parcial a buscar.
     * @return Una lista de objetos Producto que coinciden parcialmente con el
     * nombre especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Producto> consultarProductosCoincidentes(String nombre) throws PersistenciaException;
}
