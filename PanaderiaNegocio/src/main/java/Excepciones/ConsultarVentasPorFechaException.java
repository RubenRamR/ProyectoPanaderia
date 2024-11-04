package Excepciones;

/**
 * La clase ConsultarVentasPorFechaException representa una excepción que se lanza
 * cuando ocurre un error al intentar consultar las ventas por fecha.
 * 
 * 
 */
public class ConsultarVentasPorFechaException extends Exception {

    /**
     * Constructor que permite crear una instancia de ConsultarVentasPorFechaException
     * con un mensaje de error personalizado.
     * 
     * @param message El mensaje de error que describe la causa de la excepción.
     */
    public ConsultarVentasPorFechaException(String message) {
        super(message);
    }

}
