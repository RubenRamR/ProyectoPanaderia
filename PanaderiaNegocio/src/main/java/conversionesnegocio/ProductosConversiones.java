/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.panaderiadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.panaderiadominioentidades.Producto;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase ProductosConversiones proporciona métodos para convertir entre
 * objetos Producto y DTOs relacionados. Permite la conversión de productos
 * entre entidades y DTOs, y viceversa. También incluye métodos para convertir
 * listas de productos y listas de DTOs de productos.
 *
 *
 */
public class ProductosConversiones {

    /**
     * Convierte un objeto Producto a un DTO_Producto.
     *
     * @param producto el Producto a convertir
     * @return el DTO_Producto resultante
     */
    public DTO_Producto convertirProducto(Producto producto) {
        DTO_Producto productoDTO = new DTO_Producto();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        productoDTO.setId(producto.getId());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setDescripcion(producto.getDescripcion());

        for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            productoDTO.addDTO_IngredienteDetalle(convertirIngredienteDetalle.convertir(ingredienteDetalle));
        }

        return productoDTO;
    }

    /**
     * Convierte una lista de objetos Producto a una lista de DTO_Producto.
     *
     * @param productos la lista de Productos a convertir
     * @return la lista de DTO_Producto resultante
     */
    public List<DTO_Producto> convertirListaProductos(List<Producto> productos) {
        List<DTO_Producto> listaDTOProductos = new ArrayList<>();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        for (Producto producto : productos) {
            listaDTOProductos.add(convertirProducto(producto));
        }

        return listaDTOProductos;
    }

    /**
     * Convierte un DTO_Producto a un objeto Producto.
     *
     * @param productoDTO el DTO_Producto a convertir
     * @return el Producto resultante
     */
    public Producto convertirAEntidad(DTO_Producto productoDTO) {
        Producto producto = new Producto();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();
        producto.setId(productoDTO.getId());
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setDescripcion(productoDTO.getDescripcion());

        for (DTO_IngredienteDetalle id : productoDTO.getIngredientes()) {
            producto.addIngredienteDetalle(convertirIngredienteDetalle.convertir(id));

        }
        return producto;
    }

    /**
     * Convierte una lista de DTO_Producto a una lista de objetos Producto.
     *
     * @param productos la lista de DTO_Producto a convertir
     * @return la lista de Productos resultante
     */
    public List<Producto> convertirListaProductosEntidad(List<DTO_Producto> productos) {
        List<Producto> listaProductos = new ArrayList<>();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        for (DTO_Producto producto : productos) {
            listaProductos.add(convertirAEntidad(producto));
        }

        return listaProductos;
    }
}
