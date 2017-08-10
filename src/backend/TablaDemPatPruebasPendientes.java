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
public class TablaDemPatPruebasPendientes {
    int idPruebasPendientes, idDemandaPatronal;
    String Descripcion, Status;

    public int getIdPruebasPendientes() {
        return idPruebasPendientes;
    }

    public void setIdPruebasPendientes(int idPruebasPendientes) {
        this.idPruebasPendientes = idPruebasPendientes;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
