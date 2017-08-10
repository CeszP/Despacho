/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Cesz
 */
public class TablaDemPatRelacionPruebas {
    int idRelacionPruebas, idDemandaPatronal, AgregadaExpediente;
    String Descripcion;

    public int getIdRelacionPruebas() {
        return idRelacionPruebas;
    }

    public void setIdRelacionPruebas(int idRelacionPruebas) {
        this.idRelacionPruebas = idRelacionPruebas;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

    public int getAgregadaExpediente() {
        return AgregadaExpediente;
    }

    public void setAgregadaExpediente(int AgregadaExpediente) {
        this.AgregadaExpediente = AgregadaExpediente;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
