package co.edu.uniquindio.poo.proyectofinal.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Paciente extends Persona {
    private String direccion;

    public Paciente(String nombre, String apellido, String id, String telefono, String direccion) {
        super(nombre, apellido, id, telefono);
        this.direccion = direccion;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void actualizarPaciente(Paciente paciente) {
        if (paciente == null) {
            System.out.println("El paciente proporcionado es nulo.");
            return;
        }

        this.setNombre(paciente.getNombre());
        this.setId(paciente.getId());
        this.setApellido(paciente.getApellido());
        this.setDireccion(paciente.getDireccion());
        this.setTelefono(paciente.getTelefono());
    }
}
