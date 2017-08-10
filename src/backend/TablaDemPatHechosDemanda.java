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
public class TablaDemPatHechosDemanda {
    int idHechosDemanda, idDemandaPatronal;

    public int getIdHechosDemanda() {
        return idHechosDemanda;
    }

    public void setIdHechosDemanda(int idHechosDemanda) {
        this.idHechosDemanda = idHechosDemanda;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

    public String getHechosDemanda() {
        return HechosDemanda;
    }

    public void setHechosDemanda(String HechosDemanda) {
        this.HechosDemanda = HechosDemanda;
    }

   
    String HechosDemanda;
}
