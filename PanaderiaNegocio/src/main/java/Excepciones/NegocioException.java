package Excepciones;

/**
 * La clase NegocioException representa una excepción específica relacionada con errores
 * en la lógica del negocio.
 * 
 */
public class NegocioException extends Exception {

    /**
     * Construye una instancia de NegocioException sin un mensaje específico.
     */
    public NegocioException() {
    }

    /**
     * Construye una instancia de NegocioException con un mensaje específico que describe
     * la causa de la excepción.
     * 
     * @param message El mensaje que describe la causa de la excepción.
     */
    public NegocioException(String message) {
        super(message);
    }

}
