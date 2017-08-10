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
public class TablaDemPatDatosGenerales {
    int idDemandaPatronal, NumConsecutivo;
    String NombrePatron, DomicilioPatron, DomicilioPatronAux, Telefono, TelefonoAuxiliar, Celular, Ciudad, Poblacion, Estado, Junta, Expediente, DatosConflicto;
    Date AudienciaIncial;

    public int getNumConsecutivo() {
        return NumConsecutivo;
    }

    public void setNumConsecutivo(int NumConsecutivo) {
        this.NumConsecutivo = NumConsecutivo;
    }

    public int getIdDemandaPatronal() {
        return idDemandaPatronal;
    }

    public void setIdDemandaPatronal(int idDemandaPatronal) {
        this.idDemandaPatronal = idDemandaPatronal;
    }

   
    public String getNombrePatron() {
        return NombrePatron;
    }

    public void setNombrePatron(String NombrePatron) {
        this.NombrePatron = NombrePatron;
    }

    public String getDomicilioPatron() {
        return DomicilioPatron;
    }

    public void setDomicilioPatron(String DomicilioPatron) {
        this.DomicilioPatron = DomicilioPatron;
    }

    public String getDomicilioPatronAux() {
        return DomicilioPatronAux;
    }

    public void setDomicilioPatronAux(String DomicilioPatronAux) {
        this.DomicilioPatronAux = DomicilioPatronAux;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTelefonoAuxiliar() {
        return TelefonoAuxiliar;
    }

    public void setTelefonoAuxiliar(String TelefonoAuxiliar) {
        this.TelefonoAuxiliar = TelefonoAuxiliar;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getJunta() {
        return Junta;
    }

    public void setJunta(String Junta) {
        this.Junta = Junta;
    }

    public String getExpediente() {
        return Expediente;
    }

    public void setExpediente(String Expediente) {
        this.Expediente = Expediente;
    }

    public String getDatosConflicto() {
        return DatosConflicto;
    }

    public void setDatosConflicto(String DatosConflicto) {
        this.DatosConflicto = DatosConflicto;
    }

    public Date getAudienciaIncial() {
        return AudienciaIncial;
    }

    public void setAudienciaIncial(Date AudienciaIncial) {
        this.AudienciaIncial = AudienciaIncial;
    }
    
}
