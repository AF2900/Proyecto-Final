package co.edu.uniquindio.poo.proyectofinal.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private String direccion;

    private HistorialMedico historialMedico;

public Paciente(String nombre, String apellido, String documentoIdentidad, String id, String telefono,String direccion,HistorialMedico historialMedico,Especialidad especialidad) {
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


    public void solicitarCita() {


    }




    public void cancelarCita(LocalDate fecha, String hora){

}

public void consultarHistorialMedico(Cita cita){

}

public void actualizarPaciente (Paciente paciente){

}

/*
@Override
public void registrarDatos(){
    System.out.println("prueba");
}  


/*
@Override
public void actualizarDatos(){
    System.out.println("prueba");
*/
}

