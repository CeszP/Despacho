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
public class TablaDemPatPruebasRemitidas {
    int idPruebasRemitidas, idDemandaPatronal;
    String Descripcion;

    public int getIdPruebasRemitidas() {
        return idPruebasRemitidas;
    }

    public void setIdPruebasRemitidas(int idPruebasRemitidas) {
        this.idPruebasRemitidas = idPruebasRemitidas;
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
}
