package co.edu.uniquindio.poo.proyectofinal.Model;
import java.time.LocalDate;

public class Paciente extends Persona {
    private String direccion;
    private Especialidad especialidad;
    private HistorialMedico historialMedico;

public Paciente(String nombre, String apellido, String documentoIdentidad, String id, String telefono,String direccion,HistorialMedico historialMedico) {
    super(nombre, apellido, documentoIdentidad, id, telefono);
    this.direccion=direccion;
    this.historialMedico=historialMedico;
}




public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public HistorialMedico getHistorialMedico() {
    return historialMedico;
}

public void setHistorialMedico(HistorialMedico historialMedico) {
    this.historialMedico = historialMedico;
}

//este metodo esta mal
// cuando solicitas una cita no pones la especialidad ,esta es la especialidad del Medico, no es para solicitar en una cita

/*
public Cita solicitarCita(LocalDate fecha, Especialidad especialidad){
    //Podemos agregar validaciones aquí.
    Cita nuevaCita= new Cita(fecha, especialidad, this);
    mostrarMensaje("La cita ha sido registrada.");
    return nuevaCita;
}
*/
    // igual tenemos que preguntarle al profesor si necesitamos esa clase

@Override
public void registrarDatos(){
    System.out.println("prueba");
}  



@Override
public void actualizarDatos(){
    System.out.println("prueba");

}
}
