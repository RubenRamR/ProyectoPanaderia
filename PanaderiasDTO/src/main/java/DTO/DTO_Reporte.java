/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.File;
import java.util.Date;

/**
 * DTO de la entidad Reporte
 *
 */
public class DTO_Reporte {

    /**
     * Id unico del reporte
     */
    private String id;
    /**
     * Nombre del reporte
     */
    private String nombre;
    /**
     * Bytes del contenido
     */
    private byte[] bytesContenido;
    /**
     * Tipo del reporte
     */
    private String tipo;
    /**
     * categoria del reporte
     */
    private String categoria;
    /**
     * fecha de expedicion
     */
    private Date fechaExpedicion;

    /**
     * Constructor vacio
     */
    public DTO_Reporte() {
    }

    /**
     * Constructor que inicializa el id, nombre, bytes, tipo, categoria,
     * fechaExpedicion
     *
     * @param id Id
     * @param nombre nombre
     * @param bytesContenido bytes
     * @param tipo tipo
     * @param categoria categoria
     * @param fechaExpedicion fecha expedicion
     */
    public DTO_Reporte(String id, String nombre, byte[] bytesContenido, String tipo, String categoria, Date fechaExpedicion) {
        this.id = id;
        this.nombre = nombre;
        this.bytesContenido = bytesContenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Constructor que inicializa el nombre, bytes, tipo, categoria, fecha
     * Expedicion
     *
     * @param nombre nombre
     * @param bytesContenido bytes
     * @param tipo tipo
     * @param categoria categoria
     * @param fechaExpedicion fecha Expedicion
     */
    public DTO_Reporte(String nombre, byte[] bytesContenido, String tipo, String categoria, Date fechaExpedicion) {
        this.nombre = nombre;
        this.bytesContenido = bytesContenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Obtiene el ID del archivo o recurso.
     *
     * Este método devuelve el identificador único del archivo o recurso. Se
     * utiliza para obtener el valor almacenado en el atributo `id`.
     *
     * @return El ID del archivo como un valor de tipo `String`.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del archivo o recurso.
     *
     * Este método permite establecer el identificador único del archivo o
     * recurso. El valor proporcionado se guarda en el atributo `id`.
     *
     * @param id El ID del archivo como un valor de tipo `String`.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del archivo o recurso.
     *
     * Este método devuelve el nombre del archivo o recurso. Se utiliza para
     * obtener el valor almacenado en el atributo `nombre`.
     *
     * @return El nombre del archivo como un valor de tipo `String`.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del archivo o recurso.
     *
     * Este método permite establecer el nombre del archivo o recurso. El valor
     * proporcionado se guarda en el atributo `nombre`.
     *
     * @param nombre El nombre del archivo como un valor de tipo `String`.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el contenido del archivo o recurso en forma de bytes.
     *
     * Este método devuelve el contenido binario del archivo o recurso. Se
     * utiliza para obtener el valor almacenado en el atributo `bytesContenido`.
     *
     * @return El contenido del archivo en forma de un arreglo de bytes
     * (`byte[]`).
     */
    public byte[] getBytesContenido() {
        return bytesContenido;
    }

    /**
     * Establece el contenido del archivo o recurso en forma de bytes.
     *
     * Este método permite establecer el contenido binario del archivo o
     * recurso. El valor proporcionado se guarda en el atributo
     * `bytesContenido`.
     *
     * @param bytesContenido El contenido binario del archivo como un arreglo de
     * bytes (`byte[]`).
     */
    public void setBytesContenido(byte[] bytesContenido) {
        this.bytesContenido = bytesContenido;
    }

    /**
     * Obtiene el tipo del archivo o recurso.
     *
     * Este método devuelve el tipo de archivo o recurso, que podría ser el tipo
     * MIME o el formato del archivo (por ejemplo, "image/png",
     * "application/pdf", etc.).
     *
     * @return El tipo del archivo como un valor de tipo `String`.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del archivo o recurso.
     *
     * Este método permite establecer el tipo de archivo o recurso, como su tipo
     * MIME. El valor proporcionado se guarda en el atributo `tipo`.
     *
     * @param tipo El tipo del archivo como un valor de tipo `String`.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la categoría del archivo o recurso.
     *
     * Este método devuelve la categoría a la que pertenece el archivo o
     * recurso. Se utiliza para obtener el valor almacenado en el atributo
     * `categoria`.
     *
     * @return La categoría del archivo como un valor de tipo `String`.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del archivo o recurso.
     *
     * Este método permite establecer la categoría del archivo o recurso. El
     * valor proporcionado se guarda en el atributo `categoria`.
     *
     * @param categoria La categoría del archivo como un valor de tipo `String`.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la fecha de expedición del archivo o recurso.
     *
     * Este método devuelve la fecha en que el archivo o recurso fue expedido.
     * Se utiliza para obtener el valor almacenado en el atributo
     * `fechaExpedicion`.
     *
     * @return La fecha de expedición del archivo como un valor de tipo `Date`.
     */
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la fecha de expedición del archivo o recurso.
     *
     * Este método permite establecer la fecha de expedición del archivo o
     * recurso. El valor proporcionado se guarda en el atributo
     * `fechaExpedicion`.
     *
     * @param fechaExpedicion La fecha de expedición del archivo como un valor
     * de tipo `Date`.
     */
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

}
