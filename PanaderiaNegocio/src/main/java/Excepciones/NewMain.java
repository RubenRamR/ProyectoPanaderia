/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import ConexionBD.ConexionMongoBD;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mycompany.panaderiadaos.IVentaDAO;
import com.mycompany.panaderiadaos.VentaDAO;
import com.mycompany.panaderianegocio.IVentasBO;
import com.mycompany.panaderianegocio.VentasBO;
import org.bson.Document;

/**
 *
 * @author rramirez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ConexionMongoBD c = new ConexionMongoBD("localhost", 27017, "panaderia");

        IVentaDAO vd = new VentaDAO(c.getColeccionVentas());
        
//        IVentasBO v = new VentasBO(coleccion);
        System.out.println(vd.consultarVentasPorMes(2024, 11));

    }

}
