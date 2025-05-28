package co.edu.uniquindio.poo.hospital.Model;

public class Paciente extends Persona {
    private String direccion;
    public HistorialMedico historialMedico;

    public Paciente(String nombre, String apellido, String id, String telefono, String direccion,int edad, HistorialMedico historialMedico) {
        super(nombre, apellido, id, telefono, edad);
        this.direccion = direccion;
        this.historialMedico = historialMedico;

    }
    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
}