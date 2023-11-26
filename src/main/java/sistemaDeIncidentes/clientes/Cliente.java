package sistemaDeIncidentes.clientes;

import sistemaDeIncidentes.tecnicos.Especialidades;
import sistemaDeIncidentes.tecnicos.TipoDocumento;

//import javax.annotation.processing.Generated;
//import javax.persistence.Entity;
//import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;




public class Cliente {

    private int idCliente;
    private String razonSocial;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String mail;
    private TipoDocumento tipoDocumento;
    //private Especialidades serviciosContratados;
    private List<Especialidades> serviciosContratados;

    public Cliente(String nombre, String apellido, String numeroDocumento, TipoDocumento tipoDocumento) {
        this.serviciosContratados = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
