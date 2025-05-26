package co.edu.uniquindio.poo.proyectofinal.model;

public class Paciente extends Persona {
    private String direccion;

    public Paciente(String nombre, String apellido, String id, String telefono, String direccion) {
        super(nombre, apellido, id, telefono);
        this.direccion = direccion;

    }

    public String getDireccion() {
        return direccion;
    }
}