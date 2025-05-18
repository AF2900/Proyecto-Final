package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;
import java.util.List;

public class Sala {
    private List<Paciente> pacientesAsignados = new LinkedList<>();
    public char[] capacidad;
    public char[] nombre;

    private String id;
    private boolean disposicion;

    public Sala(String id, boolean disposicion) {
        this.id = id;
        this.disposicion = disposicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
