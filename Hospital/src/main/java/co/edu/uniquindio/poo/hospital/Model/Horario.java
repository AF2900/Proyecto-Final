package co.edu.uniquindio.poo.hospital.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    private String idHorario;
    private LocalDate fecha;
    private LocalTime hora;

    public Horario(String idHorario, LocalDate fecha, LocalTime hora) {
        this.idHorario = idHorario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}

