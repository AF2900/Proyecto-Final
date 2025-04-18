package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Cita {
    private LocalDate fecha;
    private Especialidad especialidad;
    private Paciente paciente;
    public Cita(LocalDate fecha, Especialidad especialidad, Paciente paciente) {
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.paciente = paciente;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public Paciente getPaciente() {
        return paciente;
    }

}
