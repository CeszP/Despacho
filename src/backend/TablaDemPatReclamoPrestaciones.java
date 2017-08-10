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
public class TablaDemPatReclamoPrestaciones {
    int idReclamoPrestaciones, idDemandaPatronal,ChequeoPrestaciones;
    String PrestacionesReclamadas; 

    public int getIdReclamoPrestaciones() {
        return idReclamoPrestaciones;
    }

    public void setIdReclamoPrestaciones(int idReclamoPrestaciones) {
        this.idReclamoPrestaciones = idReclamoPrestaciones;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

    public int getChequeoPrestaciones() {
        return ChequeoPrestaciones;
    }

    public void setChequeoPrestaciones(int ChequeoPrestaciones) {
        this.ChequeoPrestaciones = ChequeoPrestaciones;
    }

    public String getPrestacionesReclamadas() {
        return PrestacionesReclamadas;
    }

    public void setPrestacionesReclamadas(String PrestacionesReclamadas) {
        this.PrestacionesReclamadas = PrestacionesReclamadas;
    }
    
}
