/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author rramirez
 */
public class ConexionMongoBD {

    private MongoClient mongoClient;
    private MongoDatabase database;

    /**
     * Constructor de la clase ConexionMongoBD. Establece una conexión a la base
     * de datos MongoDB especificada utilizando el host, el puerto y el nombre
     * de la base de datos proporcionados.
     *
     * @param host Nombre o dirección IP del servidor de MongoDB al que se va a
     * conectar.
     * @param puerto El puerto en el que MongoDB está escuchando.
     * @param nombreBaseDatos El nombre de la base de datos a la que se desea
     * acceder.
     */
    public ConexionMongoBD(String host, int puerto, String nombreBaseDatos) {
        this.mongoClient = new MongoClient(host, puerto);
        this.database = mongoClient.getDatabase(nombreBaseDatos);
    }

    /**
     * Obtiene la colección "ventas" de la base de datos actual. Este método
     * devuelve un objeto MongoCollection que representa la colección "ventas",
     * lo que permite realizar operaciones sobre ella (consultas, inserciones,
     * etc.).
     *
     * @return Una instancia de MongoCollection<Document> que representa la
     * colección "ventas" en la base de datos.
     */
    public MongoCollection<Document> getColeccionVentas() {
        return database.getCollection("ventas");
    }

    /**
     * Cierra la conexión con la base de datos MongoDB. Este método se debe
     * llamar cuando ya no se necesite la conexión a la base de datos, para
     * liberar los recursos.
     */
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

}
