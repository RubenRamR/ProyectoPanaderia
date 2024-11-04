/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.panaderiadaos;

import Exceptions.PersistenciaException;
import com.mycompany.panaderiadominioentidades.Reporte;
import com.mycompany.panaderiadominiosMapeo.ClienteMapeo;
import com.mycompany.panaderiadominiosMapeo.ReporteMapeo;
import java.util.List;

/**
 * Interfaz IReporteDAO
 *
 * Esta interfaz define los métodos para guardar, consultar y eliminar reportes
 * en la base de datos.
 *
 * Proporciona métodos para guardar un reporte, consultar todos los reportes
 * almacenados y eliminar un reporte específico.
 *
 *
 */
public interface IReporteDAO {
    

    /**
     * Guarda un reporte en la base de datos.
     *
     * @param reporte El objeto Reporte que se va a guardar.
     * @return El objeto Reporte guardado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Reporte guardarReporte(Reporte reporte) throws PersistenciaException;

    /**
     * Consulta todos los reportes almacenados en la base de datos.
     *
     * @return Una lista de objetos Reporte.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public List<Reporte> consultarReportes() throws PersistenciaException;

    /**
     * Elimina un reporte de la base de datos.
     *
     * @param reporte El objeto Reporte que se va a eliminar.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public void eliminarReporte(Reporte reporte) throws PersistenciaException;
}
