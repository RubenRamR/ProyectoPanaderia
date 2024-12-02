package Pruebas;

import ConexionBD.ConexionMongoBD;
import Exceptions.PersistenciaException;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mycompany.panaderiadaos.IVentaDAO;
import com.mycompany.panaderiadaos.VentaDAO;
import com.mycompany.panaderiadominiosMapeo.VentaMapeo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author rramirez
 */
public class PanaderiaPersistencia {

    public static void main(String[] args) {

        ConexionMongoBD c = new ConexionMongoBD("localhost", 27017, "panaderia");

        // Crear instancia de VentaDAO
        VentaDAO ventaDAO = new VentaDAO(c.getColeccionVentas());

        // Parámetros de prueba
        int anio = 2024;
        int mes = 11;

        // Realizar la consulta
        Document datos = ventaDAO.consultarVentasPorMes(anio, mes);

        // Validar resultados
        if (datos != null)
        {
            int totalVentas = datos.getInteger("totalVentas", 0);
            double totalMonto = datos.getDouble("totalMonto");

            System.out.println("Res a" + anio);
            System.out.println("Resultados de Ventas del Mes:" + mes);
            System.out.println("Número de Ventas: " + totalVentas);
            System.out.println("Monto Total de Ventas: $" + totalMonto);
        } else
        {
            System.out.println("No se encontraron ventas para el mes " + mes + " del año " + anio);
        }

    }
}
