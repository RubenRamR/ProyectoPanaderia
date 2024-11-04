/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderianegocio;

import com.mycompany.panaderiadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominiosMapeo.ProductoMapeo;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import java.util.List;

/**
 *
 * 
 */
public interface IProductosBO {

    /**
     * Agrega un nuevo producto.
     *
     * @param producto el DTO_Producto que se desea agregar.
     * @return el DTO_Producto agregado con su ID generado, o null si ocurre una
     * excepción.
     */
    public DTO_Producto agregarProducto(DTO_Producto producto);

    /**
     * Actualiza un producto existente.
     *
     * @param producto el DTO_Producto con los datos actualizados.
     * @return el DTO_Producto actualizado, o null si ocurre una excepción.
     */
    public DTO_Producto actualizarProducto(DTO_Producto producto);

    /**
     * Consulta todos los productos.
     *
     * @return una lista de DTO_Producto representando todos los productos, o
     * null si ocurre una excepción.
     */
    public List<DTO_Producto> consultarProductos();

    /**
     * Consulta un producto por su nombre.
     *
     * @param nombre el nombre del producto a consultar.
     * @return el DTO_Producto encontrado, o null si no existe.
     */
    public DTO_Producto consultarProductoPorNombre(String nombre);

    /**
     * Consulta un producto por su ID.
     *
     * @param id el ID del producto a consultar.
     * @return el DTO_Producto encontrado, o null si no existe.
     */
    public DTO_Producto consultarProducto(String id);

    /**
     * Convierte un DTO_Producto a un objeto ProductoMapeo.
     *
     * @param producto el DTO_Producto que se desea convertir.
     * @return el objeto ProductoMapeo convertido, o null si ocurre una
     * excepción.
     */
    public ProductoMapeo convertirDTOAProductoMapeo(DTO_Producto producto);

    /**
     * Convierte un DTO_Producto a un objeto Producto.
     *
     * @param producto el DTO_Producto que se desea convertir.
     * @return el objeto Producto convertido, o null si ocurre una excepción.
     */
    public Producto convertirDTOAProducto(DTO_Producto producto);

    /**
     * Convierte un DTO_IngredienteDetalle a un objeto IngredienteDetalleMapeo.
     *
     * @param ingredienteDetalle el DTO_IngredienteDetalle que se desea
     * convertir.
     * @return el objeto IngredienteDetalleMapeo convertido, o null si ocurre
     * una excepción.
     */
    public IngredienteDetalleMapeo convertirDTOAIngredienteDetalleMapeo(DTO_IngredienteDetalle ingredienteDetalle);

    /**
     * Convierte un DTO_IngredienteDetalle a un objeto IngredienteDetalle.
     *
     * @param ingredienteDetalle el DTO_IngredienteDetalle que se desea
     * convertir.
     * @return el objeto IngredienteDetalle convertido, o null si ocurre una
     * excepción.
     */
    public IngredienteDetalle convertirDTOAIngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle);

    /**
     * Consulta un ingrediente por su nombre.
     *
     * @param nombre el nombre del ingrediente a consultar.
     * @return el DTO_Ingrediente encontrado, o null si no existe.
     */
    public DTO_Ingrediente consultarIngredientePorNombre(String nombre);

    /**
     * Calcula el costo total de una lista de ingredientes detallados.
     *
     * @param productos una lista de IngredienteDetalle para los que se desea
     * calcular el costo.
     * @return el costo total de los ingredientes, o null si ocurre una
     * excepción.
     */
    public Float calcularCosto(List<IngredienteDetalle> productos);

    /**
     * Elimina un producto.
     *
     * @param producto el DTO_Producto que se desea eliminar.
     * @return true si el producto fue eliminado correctamente, o false si
     * ocurre una excepción.
     */
    public boolean eliminarProducto(DTO_Producto producto);

    /**
     * Consulta los ingredientes faltantes para la producción de un producto.
     *
     * @param producto el DTO_Producto para el cual se desean consultar los
     * ingredientes faltantes.
     * @return una lista de DTO_Ingrediente con los ingredientes faltantes, o
     * null si ocurre una excepción.
     */
    public List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto);

    /**
     * Consulta productos que coinciden con un nombre parcial.
     *
     * @param nombre el nombre parcial a buscar.
     * @return una lista de DTO_Producto que coinciden con el nombre, o null si
     * ocurre una excepción.
     */
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre);

    /**
     * Consulta la lista de productos que tienen stock disponible.
     *
     * @return una lista de DTO_Producto con stock disponible, o null si ocurre
     * una excepción.
     */
    public List<DTO_Producto> consultarListaProductosConStock();

}
