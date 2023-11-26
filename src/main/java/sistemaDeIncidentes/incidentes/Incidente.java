package sistemaDeIncidentes.incidentes;

import sistemaDeIncidentes.clientes.Cliente;
import sistemaDeIncidentes.tecnicos.Especialidades;
import sistemaDeIncidentes.tecnicos.Tecnico;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Incidente {
    private int idIncidente;
    private Cliente cliente;
    private Tecnico tecnicoAsignado;
    private Especialidades problemaAsignado;

    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;

    public Incidente(int idIncidente, Cliente cliente, Tecnico tecnicoAsignado, Especialidades problemaAsignado, LocalDateTime horaInicio) {
        this.idIncidente = idIncidente;
        this.cliente = cliente;
        this.tecnicoAsignado = tecnicoAsignado;
        this.problemaAsignado = problemaAsignado;
        this.horaInicio = LocalDateTime.now();
        this.horaFin = LocalDateTime.now();

        //this.horaInicio = horaInicio;
        //this.horaFin = horaFin;
    }
}
