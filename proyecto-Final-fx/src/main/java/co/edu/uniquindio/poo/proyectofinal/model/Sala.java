package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;
import java.util.List;

public class Sala {
    private List<Paciente> pacientesAsignados ;
    public char[] capacidad;
    public char[] nombre;

    private String idSala;
    private boolean disposicion;

    public Sala(String idSala, boolean disposicion) {
        this.idSala = idSala;
        this.disposicion = disposicion;
        this.pacientesAsignados = new LinkedList<>();
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public boolean isDisposicion() {
        return disposicion;
    }

    public void setDisposicion(boolean disposicion) {
        this.disposicion = disposicion;
    }

    public List<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(List<Paciente> pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }
}
