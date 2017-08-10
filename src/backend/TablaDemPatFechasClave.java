/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.sql.Date;
/**
 *
 * @author Cesz
 */
public class TablaDemPatFechasClave {
   int idBoletaElaboracionEntrega, idDemandaPatronal;
   Date FechaElaboracion, FechaRemision, FechaEntrega;
   String Expediente;

    public int getIdBoletaElaboracionEntrega() {
        return idBoletaElaboracionEntrega;
    }

    public void setIdBoletaElaboracionEntrega(int idBoletaElaboracionEntrega) {
        this.idBoletaElaboracionEntrega = idBoletaElaboracionEntrega;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

    public String getExpediente() {
        return Expediente;
    }

    public void setExpediente(String Expediente) {
        this.Expediente = Expediente;
    }

    public Date getFechaElaboracion() {
        return FechaElaboracion;
    }

    public void setFechaElaboracion(Date FechaElaboracion) {
        this.FechaElaboracion = FechaElaboracion;
    }

    public Date getFechaRemision() {
        return FechaRemision;
    }

    public void setFechaRemision(Date FechaRemision) {
        this.FechaRemision = FechaRemision;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }
   
}
