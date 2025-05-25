package co.edu.uniquindio.poo.proyectofinal.model;

//Terminada

import java.util.Calendar;
import java.util.LinkedList;

public class Medico extends Persona {
  private LinkedList<Paciente> listPacientes;
  private Especialidad especialidad;


  public Medico(String nombre, String apellido, String id, String telefono, Especialidad especialidad) {
      super(nombre, apellido, id, telefono);
    this.listPacientes = new LinkedList<>();
    this.especialidad = especialidad;

  }

    public HistorialMedico leerHistorialMedicoPaciente(String idPaciente) {
        for ( Paciente paciente : listPacientes ) {
            if (paciente.getId().equalsIgnoreCase(idPaciente)) {
                return paciente.getHistorialMedico();
            }
        }
        return null;
    }

  public LinkedList<Paciente> getListPacientes() {
    return listPacientes;
  }

  public void setListPacientes(LinkedList<Paciente> listPacientes) {
    this.listPacientes = listPacientes;
  }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
