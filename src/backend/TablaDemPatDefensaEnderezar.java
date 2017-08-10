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
public class TablaDemPatDefensaEnderezar {
    int idDefensaEnderezar, idDemandaPatronal;
    String AccionesEnderezar;

    public int getIdDefensaEnderezar() {
        return idDefensaEnderezar;
    }

    public void setIdDefensaEnderezar(int idDefensaEnderezar) {
        this.idDefensaEnderezar = idDefensaEnderezar;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

    public String getAccionesEnderezar() {
        return AccionesEnderezar;
    }

    public void setAccionesEnderezar(String AccionesEnderezar) {
        this.AccionesEnderezar = AccionesEnderezar;
    }
}
