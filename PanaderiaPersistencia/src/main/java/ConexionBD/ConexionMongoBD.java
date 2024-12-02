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

    public ConexionMongoBD(String host, int puerto, String nombreBaseDatos) {
        this.mongoClient = new MongoClient(host, puerto);
        this.database = mongoClient.getDatabase(nombreBaseDatos);
    }

    public MongoCollection<Document> getColeccionVentas() {
        return database.getCollection("ventas");
    }

    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

}
