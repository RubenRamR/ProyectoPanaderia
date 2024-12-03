/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 * DTO de la entidad DetalleVenta
 * 
 */
public class DTO_DetalleVenta {

    /**
     * Precio de la venta
     */
    private float precio;
    /**
     * Importe de la venta
     */
    private float importe;
    /**
     * Cantidad de la venta
     */
    private int cantidad;
    /**
     * Especificaciones de la venta
     */
    private String especificacion;
    /**
     * ID del producto
     */
    private String Idproducto;
    /**
     * Tamanio del producto
     */
    private String tamanhoProducto;
    /**
     * DTO del producto
     */
    private DTO_Producto producto;

    /**
     * Constructor vacio
     */
    public DTO_DetalleVenta() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     *
     * @param precio precio del detalle
     * @param importe importe del detalle
     * @param cantidad cantidad del producto
     * @param especificacion especificaciones del producto
     * @param Idproducto ID del producto
     * @param tamanhoProducto tamanio del producto
     * @param producto DTO del producto
     */
    public DTO_DetalleVenta(float precio, float importe, int cantidad, String especificacion, String Idproducto, String tamanhoProducto, DTO_Producto producto) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.especificacion = especificacion;
        this.Idproducto = Idproducto;
        this.tamanhoProducto = tamanhoProducto;
        this.producto = producto;
    }

    /**
     * Obtiene el precio del producto en la venta.
     *
     * Este método devuelve el precio del producto en la venta. El valor de este
     * precio es utilizado para calcular el importe total de la venta.
     *
     * @return El precio del producto en la venta, representado como un valor de
     * tipo `float`.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto en la venta.
     *
     * Este método permite establecer el precio del producto en la venta. El
     * precio influye en el cálculo del importe total.
     *
     * @param precio El precio del producto, representado como un valor de tipo
     * `float`.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el importe total de la venta de este producto.
     *
     * Este método devuelve el importe total (precio * cantidad) de este
     * producto en la venta.
     *
     * @return El importe total del producto en la venta, representado como un
     * valor de tipo `float`.
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Establece el importe total de la venta de este producto.
     *
     * Este método permite establecer el importe total de este producto en la
     * venta. El importe es el resultado de multiplicar el precio por la
     * cantidad.
     *
     * @param importe El importe total del producto, representado como un valor
     * de tipo `float`.
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }

    /**
     * Obtiene la cantidad de productos de este tipo en la venta.
     *
     * Este método devuelve la cantidad de unidades del producto que están
     * siendo vendidas.
     *
     * @return La cantidad de productos, representada como un valor de tipo
     * `int`.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos de este tipo en la venta.
     *
     * Este método permite establecer la cantidad de unidades del producto que
     * están siendo vendidas.
     *
     * @param cantidad La cantidad de unidades del producto, representada como
     * un valor de tipo `int`.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la especificación del producto en la venta.
     *
     * Este método devuelve una descripción adicional o especificación del
     * producto, si está disponible.
     *
     * @return La especificación del producto como un valor de tipo `String`.
     */
    public String getEspecificacion() {
        return especificacion;
    }

    /**
     * Obtiene el objeto `DTO_Producto` que representa el producto en la venta.
     *
     * Este método devuelve el objeto que contiene toda la información del
     * producto, como nombre, código, etc.
     *
     * @return El objeto `DTO_Producto` que representa el producto.
     */
    public DTO_Producto getProducto() {
        return producto;
    }

    /**
     * Establece el objeto `DTO_Producto` que representa el producto en la
     * venta.
     *
     * Este método permite establecer el objeto que contiene la información del
     * producto asociado con la venta.
     *
     * @param producto El objeto `DTO_Producto` que representa el producto.
     */
    public void setProducto(DTO_Producto producto) {
        this.producto = producto;
    }

    /**
     * Establece la especificación del producto en la venta.
     *
     * Este método permite establecer una descripción adicional o especificación
     * para el producto en la venta.
     *
     * @param especificacion La especificación del producto como un valor de
     * tipo `String`.
     */
    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    /**
     * Obtiene el ID del producto en la venta.
     *
     * Este método devuelve el ID único del producto que está siendo vendido en
     * esta venta.
     *
     * @return El ID del producto como un valor de tipo `String`.
     */
    public String getIdproducto() {
        return Idproducto;
    }

    /**
     * Establece el ID del producto en la venta.
     *
     * Este método permite establecer el ID único del producto que está siendo
     * vendido.
     *
     * @param Idproducto El ID del producto como un valor de tipo `String`.
     */
    public void setIdproducto(String Idproducto) {
        this.Idproducto = Idproducto;
    }

    /**
     * Obtiene el tamaño del producto en la venta.
     *
     * Este método devuelve el tamaño del producto (por ejemplo, tamaño o
     * dimensiones) en la venta.
     *
     * @return El tamaño del producto como un valor de tipo `String`.
     */
    public String getTamanhoProducto() {
        return tamanhoProducto;
    }

    /**
     * Establece el tamaño del producto en la venta.
     *
     * Este método permite establecer el tamaño del producto (por ejemplo,
     * tamaño o dimensiones) que está siendo vendido.
     *
     * @param tamanhoProducto El tamaño del producto como un valor de tipo
     * `String`.
     */
    public void setTamanhoProducto(String tamanhoProducto) {
        this.tamanhoProducto = tamanhoProducto;
    }

    /**
     * Representación en forma de cadena del objeto `DTO_DetalleVenta`.
     *
     * Este método sobrescribe el método `toString` para proporcionar una
     * representación en cadena de texto del objeto `DTO_DetalleVenta`,
     * mostrando el precio, importe, cantidad, especificación e ID del producto.
     *
     * @return Una cadena que representa al objeto `DTO_DetalleVenta` con los
     * valores actuales de sus atributos.
     */
    @Override
    public String toString() {
        return "DTO_DetalleVenta{" + "precio=" + precio + ", importe=" + importe + ", cantidad=" + cantidad + ", especificacion=" + especificacion + ", Idproducto=" + Idproducto + '}';
    }

}
