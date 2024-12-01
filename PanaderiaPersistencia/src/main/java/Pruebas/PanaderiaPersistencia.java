package Pruebas;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadaos.IVentaDAO;
import com.mycompany.panaderiadaos.VentaDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rramirez
 */
public class PanaderiaPersistencia {

    public static void main(String[] args) {

        IVentaDAO v = new VentaDAO();

        try
        {
            System.out.println(v.obtenerAniosVentas());
        } catch (PersistenciaException ex)
        {
            Logger.getLogger(PanaderiaPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
