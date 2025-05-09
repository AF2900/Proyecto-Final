package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Hospital {
    private String nombre;
    private String nit;
    private LinkedList<Cita> listCitas;
    private LinkedList<Medico> listMedicos;


    public Hospital(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listCitas = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }


}
