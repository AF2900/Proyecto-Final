package co.edu.uniquindio.poo.proyectofinal.Controller;

import co.edu.uniquindio.poo.proyectofinal.model.HistorialMedico;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Paciente;

import java.util.Collection;

public class PacienteController {
    private Hospital hospital;

    /**
     * Constructor de la clase
     * @param hospital instancia del hospital
     */
    public PacienteController(Hospital hospital) {
        this.hospital = hospital;
    }

    /**
     * Método que permite crear un paciente
     * @param paciente Paciente a agregar
     * @return true si se agregó correctamente, false si ya existe
     */
    public boolean crearPaciente(Paciente paciente) {
        if (hospital == null) {
            System.err.println("Error: El Hospital no ha sido inicializado.");
            return false;
        }
        return hospital.addPaciente(paciente);
    }

    /**
     * Método que permite obtener la lista de pacientes
     * @return Colección de pacientes
     */
    public Collection<Paciente> ObtenerListaPaciente() {
        if (hospital == null) {
            System.err.println("Error: No se puede obtener la lista de pacientes porque el hospital es null.");
            return null;
        }
        return hospital.getListPacientes();
    }

    /**
     * Método que permite eliminar un paciente por ID
     * @param id ID del paciente a eliminar
     * @return true si se eliminó correctamente
     */
    public boolean eliminarPaciente(String id) {
        if (hospital == null) {
            System.err.println("Error: No se puede eliminar paciente porque el hospital es null.");
            return false;
        }
        Paciente paciente = buscarPacientePorId(id);
        if (paciente == null) {
            System.err.println("Error: Paciente con ID " + id + " no encontrado.");
            return false;
        }
        return hospital.eliminarPaciente(String.valueOf(paciente));
    }

    /**
     * Método que permite actualizar un paciente existente
     * @param id ID del paciente a actualizar
     * @param paciente nuevos datos del paciente
     * @return true si se actualizó correctamente
     */
    public boolean actualizarPaciente(String id, Paciente paciente) {
        if (hospital == null) {
            System.err.println("Error: No se puede actualizar paciente porque el hospital es null.");
            return false;
        }
        Paciente existente = buscarPacientePorId(id);
        if (existente == null) {
            System.err.println("Error: Paciente con ID " + id + " no encontrado.");
            return false;
        }
        return hospital.addPaciente(paciente);
    }





    /**
     * Método auxiliar para buscar un paciente por ID
     * @param id ID del paciente
     * @return instancia de Paciente o null si no se encuentra
     */
    private Paciente buscarPacientePorId(String id) {
        for (Paciente paciente : hospital.getListPacientes()) {
            if (paciente.getId().equals(id)) {
                return paciente;
            }
        }
        return null;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}
