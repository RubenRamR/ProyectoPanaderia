/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Map;
//import net.sf.jasperreports.engine.JasperReport;


public class DTO_GenerarReporte {
   private Map<String, Object> parameters;
   private Map<String, Object> fields;
//   private JasperReport jasperReport;

    public DTO_GenerarReporte() {
    }

    public DTO_GenerarReporte(Map<String, Object> parameters , Map<String, Object> fields) {
        this.parameters = parameters;
//        this.jasperReport = jasperReport;
        this.fields = fields;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

//    public JasperReport getJasperReport() {
//        return jasperReport;
//    }
//
//    public void setJasperReport(JasperReport jasperReport) {
//        this.jasperReport = jasperReport;
//    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }
    
   
}
