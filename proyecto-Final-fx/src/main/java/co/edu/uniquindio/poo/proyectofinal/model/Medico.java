package co.edu.uniquindio.poo.proyectofinal.model;

//Terminada

public class Medico extends Persona {

  public Medico(String nombre, String apellido, String documentoIdentidad, String id, String telefono) {
      super(nombre, apellido, documentoIdentidad, id, telefono);

  }

    public HistorialMedico leerHistorialMedicoPaciente(String idPaciente) {
        for ( c : listCitas) {
            if (c.getId().equalsIgnoreCase(idCita)) {
                return c;
            }
        }
        return null;
    }

}
