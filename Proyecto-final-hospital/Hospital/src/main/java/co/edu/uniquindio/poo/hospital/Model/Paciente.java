package co.edu.uniquindio.poo.hospital.Model;

public class Paciente extends Persona {
    private String direccion;

    public HistorialMedico historialMedico;


    public Paciente(String nombre, String Apellido, String cedula ,int edad, String telefono,String direccion, HistorialMedico historialMedico) {
        super(nombre, Apellido, cedula,edad,telefono);
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "historialMedico=" + historialMedico +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
