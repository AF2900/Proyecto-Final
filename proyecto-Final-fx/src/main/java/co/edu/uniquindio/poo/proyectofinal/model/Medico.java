package co.edu.uniquindio.poo.proyectofinal.model;

//Terminada

import java.util.Calendar;
import java.util.LinkedList;

public class Medico extends Persona {
  private LinkedList<Paciente> listPacientes;


  public Medico(String nombre, String apellido, String documentoIdentidad, String id, String telefono) {
      super(nombre, apellido, documentoIdentidad, id, telefono);
    this.listPacientes = new LinkedList<>();

  }
  public void verHistorialMedicoPaciente(Paciente paciente){

  }

  public LinkedList<Paciente> getListPacientes() {
    return listPacientes;
  }

  public void setListPacientes(LinkedList<Paciente> listPacientes) {
    this.listPacientes = listPacientes;
  }
}
