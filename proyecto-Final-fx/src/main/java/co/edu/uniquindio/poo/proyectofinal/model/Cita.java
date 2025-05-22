package co.edu.uniquindio.poo.proyectofinal.model;

import java.time.LocalDate;

//completada

public class Cita {
    private String id;
    private LocalDate fecha;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Cita(String id, String fecha, String hora, Medico medico, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id='" + id + '\'' +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
