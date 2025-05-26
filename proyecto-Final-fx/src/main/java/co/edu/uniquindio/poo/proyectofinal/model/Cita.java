package co.edu.uniquindio.poo.proyectofinal.model;

import java.time.LocalDate;

//completada

public class Cita {
    private String idCita;
    private LocalDate fecha;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Cita(String idCita, LocalDate fecha, String hora, Medico medico, Paciente paciente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getidCita() {
        return idCita;
    }

    public void setidCita(String idCita) {
        this.idCita = idCita;
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
                "idCita='" + idCita + '\'' +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
