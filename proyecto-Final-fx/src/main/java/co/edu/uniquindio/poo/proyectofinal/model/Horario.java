package co.edu.uniquindio.poo.proyectofinal.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    private String id;
    private LocalDate fecha;
    private LocalTime hora;
    private Jornada jornada;

    public Horario(String id, LocalDate fecha, LocalTime hora, Jornada jornada) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.jornada = jornada;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
}
