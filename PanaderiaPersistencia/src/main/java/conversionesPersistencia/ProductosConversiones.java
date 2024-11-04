/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.panaderiadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.panaderiadominioentidades.Producto;
import com.mycompany.panaderiadominiosMapeo.ProductoMapeo;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase para realizar conversiones entre objetos Producto y ProductoMapeo.
 */
public class ProductosConversiones {

    private IngredienteDetalleConversiones ingredienteDetalleConversiones;

    /**
     * Constructor de la clase ProductosConversiones.
     */
    public ProductosConversiones() {
        ingredienteDetalleConversiones = new IngredienteDetalleConversiones();
    }

    /**
     * Convierte un objeto ProductoMapeo a un objeto Producto.
     *
     * @param producto El objeto ProductoMapeo a convertir.
     * @return El objeto Producto convertido.
     */
    public Producto convertirProducto(ProductoMapeo producto) {
        Producto productoE = new Producto();
        productoE.setId(producto.getId().toHexString());
        productoE.setPrecio(producto.getPrecio());
        productoE.setNombre(producto.getNombre());
        productoE.setDescripcion(producto.getDescripcion());

        for (IngredienteDetalleMapeo ingredienteDetalle : producto.getIngredientes()) {
            productoE.addIngredienteDetalle(ingredienteDetalleConversiones.convertir(ingredienteDetalle));
        }

        return productoE;
    }

    /**
     * Convierte una lista de objetos ProductoMapeo a una lista de objetos
     * Producto.
     *
     * @param productosMapeo La lista de objetos ProductoMapeo a convertir.
     * @return La lista de objetos Producto convertida.
     */
    public List<Producto> convertirProductos(List<ProductoMapeo> productosMapeo) {
        List<Producto> productos = new ArrayList<>();

        for (ProductoMapeo productoMapeo : productosMapeo) {
            Producto producto = convertirProducto(productoMapeo);
            productos.add(producto);
        }

        return productos;
    }

    /**
     * Convierte un objeto Producto a un objeto ProductoMapeo.
     *
     * @param producto El objeto Producto a convertir.
     * @return El objeto ProductoMapeo convertido.
     */
    public ProductoMapeo convertirProductoMapeo(Producto producto) {
        ProductoMapeo productoM = new ProductoMapeo();
        productoM.setPrecio(producto.getPrecio());
        productoM.setNombre(producto.getNombre());
        productoM.setDescripcion(producto.getDescripcion());

        List<IngredienteDetalleMapeo> ingredientesMapeo = new ArrayList<>();

        for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            IngredienteDetalleMapeo ingredienteDetalleM = ingredienteDetalleConversiones.convertirMapeo(ingredienteDetalle);
            ingredientesMapeo.add(ingredienteDetalleM);
        }

        productoM.setIngredientes(ingredientesMapeo);

        return productoM;
    }
}
