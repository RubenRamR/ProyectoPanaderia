package ConexionBD;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author joseq
 */
public class Conexion<V, T> implements IConexion<T> {

    private String nombreBaseDatos = "panaderia";
    private String cadenaConexion = "mongodb://127.0.0.1:27017";
    private final String nombreColeccion;
    private final Class<T> tipoBase;

    /**
     * Constructor de la clase Conexion.
     * <p>
     * Inicializa la conexión con la base de datos y la colección especificada.
     * </p>
     *
     * @param nombreColeccion El nombre de la colección en la base de datos.
     * @param tipoBase La clase del tipo T que representa los documentos en la
     * colección.
     */
    public Conexion(String nombreColeccion, Class<T> tipoBase) {
        this.nombreColeccion = nombreColeccion;
        this.tipoBase = tipoBase;
    }

    /**
     * Obtiene la colección de MongoDB para el tipo T.
     * <p>
     * Configura la conexión a la base de datos MongoDB, incluyendo el uso de un
     * CodecRegistry para manejar automáticamente los POJOs.
     * </p>
     *
     * @return una colección de MongoDB de tipo T.
     */
    @Override
    public MongoCollection<T> obtenerColeccion() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry).applyConnectionString(new ConnectionString(cadenaConexion))
                .build();
        MongoClient cliente = MongoClients.create(settings);

        MongoDatabase baseDatos = cliente.getDatabase(nombreBaseDatos);
        MongoCollection<T> coleccion = baseDatos.getCollection(nombreColeccion, tipoBase);

        return coleccion;
    }
}
