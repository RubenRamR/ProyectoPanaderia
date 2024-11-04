/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.result.DeleteResult;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominiosMapeo.ProductoMapeo;
import conversionesPersistencia.ProductosConversiones;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase ProductoDAO Esta clase implementa la interfaz IProductoDAO para
 * proporcionar las operaciones CRUD y consultas especializadas sobre los
 * productos en la base de datos.
 *
 */
public class ProductoDAO implements IProductoDAO {

    private IConexion conexion;
    private ProductosConversiones conversor;

    /**
     * Constructor de ProductoDAO. Inicializa la conexión a la base de datos y
     * el conversor de productos.
     */
    public ProductoDAO() {
        conexion = new Conexion("productos", ProductoMapeo.class);
        conversor = new ProductosConversiones();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Producto agregarProducto(Producto producto) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(conversor.convertirProductoMapeo(producto));

        try {
            return producto;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo agregar el producto");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Producto actualizar(Producto producto) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo productoActualizado = coleccion.findOneAndReplace(eq("_id", new ObjectId(producto.getId())), conversor.convertirProductoMapeo(producto));

        try {
            return conversor.convertirProducto(productoActualizado);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo actualizar el producto");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean eliminarProducto(ProductoMapeo producto) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", producto.getNombre()));

        try {
            return result.getDeletedCount() == 1;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo eliminar el producto");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Producto consultar(String id) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo resultado = coleccion.find(eq("_id", new ObjectId(id))).first();
        if (resultado == null) {
            return null;
        }

        try {
            return conversor.convertirProducto(resultado);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar el producto");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Producto> consultarProductos() throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ProductoMapeo> Productos = coleccion.find();
        List<Producto> listaProductos = new ArrayList<>();
        for (ProductoMapeo producto : Productos) {
            listaProductos.add(conversor.convertirProducto(producto));
        }
        try {
            return listaProductos;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar la lista");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Producto consultarPorNombre(String nombre) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo resultado = coleccion.find(eq("nombre", nombre)).first();
        if (resultado == null) {
            return null;
        }
        try {
            return conversor.convertirProducto(resultado);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Producto> consultarProductosCoincidentes(String nombre) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ProductoMapeo> resultados = coleccion.find(regex("nombre", "^" + nombre, "i"));

        List<ProductoMapeo> listaProductos = new LinkedList<>();
        resultados.into(listaProductos);
        try {
            return conversor.convertirProductos(listaProductos);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar la lista");
        }
    }
}
