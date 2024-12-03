/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 * DTO de la entidad ReporteIngresosDetalles
 *
 */
public class DTO_ReporteIngresosDetalles {

    /**
     * fecha de la venta
     */
    private String fechaVenta;
    /**
     * cantidad de las ventas
     */
    private String cantidadVentas;
    /**
     * ganancias del dia
     */
    private String gananciasDia;
    /**
     * fecha de la compra
     */
    private String fechaCompra;
    /**
     * nombre del cliente
     */
    private String nombreCliente;
    /**
     * total de la compra
     */
    private String totalDeCompra;

    /**
     * Constructor vacío de la clase DTO_ReporteIngresosDetalles.
     *
     * Este constructor inicializa un objeto de la clase sin valores
     * predefinidos. Se utiliza para crear una instancia vacía que luego puede
     * ser configurada mediante los métodos `set`.
     */
    public DTO_ReporteIngresosDetalles() {
    }

    /**
     * Obtiene la fecha de la venta.
     *
     * Este método devuelve la fecha en la que se realizó una venta. La fecha
     * está representada como una cadena de texto (`String`).
     *
     * @return La fecha de la venta como un valor de tipo `String`.
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Establece la fecha de la venta.
     *
     * Este método permite establecer la fecha de la venta. El valor
     * proporcionado se guarda en el atributo `fechaVenta` de tipo `String`.
     *
     * @param fechaVenta La fecha de la venta como un valor de tipo `String`.
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * Obtiene la cantidad de ventas realizadas.
     *
     * Este método devuelve la cantidad de ventas que ocurrieron en un día
     * específico. La cantidad se devuelve como una cadena de texto (`String`).
     *
     * @return La cantidad de ventas como un valor de tipo `String`.
     */
    public String getCantidadVentas() {
        return cantidadVentas;
    }

    /**
     * Establece la cantidad de ventas realizadas.
     *
     * Este método permite establecer la cantidad de ventas realizadas en un
     * día. El valor proporcionado se guarda en el atributo `cantidadVentas` de
     * tipo `String`.
     *
     * @param cantidadVentas La cantidad de ventas como un valor de tipo
     * `String`.
     */
    public void setCantidadVentas(String cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    /**
     * Obtiene las ganancias del día.
     *
     * Este método devuelve las ganancias generadas en un día específico. Las
     * ganancias se devuelven como una cadena de texto (`String`).
     *
     * @return Las ganancias del día como un valor de tipo `String`.
     */
    public String getGananciasDia() {
        return gananciasDia;
    }

    /**
     * Establece las ganancias del día.
     *
     * Este método permite establecer las ganancias generadas en un día
     * específico. El valor proporcionado se guarda en el atributo
     * `gananciasDia` de tipo `String`.
     *
     * @param gananciasDia Las ganancias del día como un valor de tipo `String`.
     */
    public void setGananciasDia(String gananciasDia) {
        this.gananciasDia = gananciasDia;
    }

    /**
     * Obtiene la fecha de la compra asociada a la venta.
     *
     * Este método devuelve la fecha en la que se realizó la compra relacionada
     * con la venta. La fecha está representada como una cadena de texto
     * (`String`).
     *
     * @return La fecha de la compra como un valor de tipo `String`.
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Establece la fecha de la compra asociada a la venta.
     *
     * Este método permite establecer la fecha de la compra relacionada con la
     * venta. El valor proporcionado se guarda en el atributo `fechaCompra` de
     * tipo `String`.
     *
     * @param fechaCompra La fecha de la compra como un valor de tipo `String`.
     */
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * Obtiene el nombre del cliente asociado con la compra.
     *
     * Este método devuelve el nombre del cliente que realizó la compra. El
     * nombre se devuelve como una cadena de texto (`String`).
     *
     * @return El nombre del cliente como un valor de tipo `String`.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el nombre del cliente asociado con la compra.
     *
     * Este método permite establecer el nombre del cliente que realizó la
     * compra. El valor proporcionado se guarda en el atributo `nombreCliente`
     * de tipo `String`.
     *
     * @param nombreCliente El nombre del cliente como un valor de tipo
     * `String`.
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el total de la compra.
     *
     * Este método devuelve el total de la compra realizada. El total se
     * devuelve como una cadena de texto (`String`).
     *
     * @return El total de la compra como un valor de tipo `String`.
     */
    public String getTotalDeCompra() {
        return totalDeCompra;
    }

    /**
     * Establece el total de la compra.
     *
     * Este método permite establecer el total de la compra realizada. El valor
     * proporcionado se guarda en el atributo `totalDeCompra` de tipo `String`.
     *
     * @param totalDeCompra El total de la compra como un valor de tipo
     * `String`.
     */
    public void setTotalDeCompra(String totalDeCompra) {
        this.totalDeCompra = totalDeCompra;
    }

}
