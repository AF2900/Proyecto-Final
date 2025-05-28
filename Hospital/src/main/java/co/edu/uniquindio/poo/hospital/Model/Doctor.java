package co.edu.uniquindio.poo.hospital.Model;
//Terminada

import java.util.LinkedList;
public class Doctor extends Persona {

  private LinkedList<Paciente> listPacientes;
  private Especialidad especialidad;


  public Doctor(String nombre, String apellido, String id, String telefono, int edad, Especialidad especialidad) {
      super(nombre, apellido, id, telefono, edad);
    this.especialidad = especialidad;

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
