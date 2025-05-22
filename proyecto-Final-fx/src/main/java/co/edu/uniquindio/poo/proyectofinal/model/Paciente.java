package co.edu.uniquindio.poo.proyectofinal.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
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
//metodo de solicitar cita
    public void solicitarCita() {


    }

// metodo de cancelar cita
    public void cancelarCita(LocalDate fecha, String hora){

}
// consultar historialMedico
    public HistorialMedico consultarHistorialMedico() {
        if (historialMedico != null && historialMedico.getPaciente().getId().equals(this.getId())) {
            return historialMedico;
        } else {
            System.out.println("Historial no encontrado o no pertenece al paciente.");
            return null;
        }
    }


public void actualizarPaciente (Paciente paciente){


}


}

