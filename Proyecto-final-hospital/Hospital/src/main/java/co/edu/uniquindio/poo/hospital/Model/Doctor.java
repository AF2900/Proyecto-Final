package co.edu.uniquindio.poo.hospital.Model;

public class Doctor extends Persona {

    private Especialidad especialidad;

    public Doctor(String nombre, String Apellido, String cedula ,int edad, String telefono, Especialidad especialidad) {
        super(nombre,Apellido,cedula, edad, telefono);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "especialidad=" + especialidad +
                '}';
    }
}
