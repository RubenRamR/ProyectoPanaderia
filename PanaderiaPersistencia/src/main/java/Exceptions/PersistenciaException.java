package Exceptions;

/**
 * Excepción que indica un error relacionado con la persistencia de datos.
 * Puede ser lanzada en casos como fallos de conexión a la base de datos, problemas de consulta, etc.
 * 
 * 
 */
public class PersistenciaException extends Exception {

    /**
     * Constructor de la clase PersistenciaException.
     * 
     * @param message El mensaje que describe la excepción.
     */
    public PersistenciaException(String message) {
        super(message);
    }
    
}
