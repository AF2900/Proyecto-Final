package co.edu.uniquindio.poo.hospital;

import co.edu.uniquindio.poo.hospital.Model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static co.edu.uniquindio.poo.hospital.Model.Especialidad.CARDIOLOGIA;
import static co.edu.uniquindio.poo.hospital.Model.Especialidad.NEUROLOGIA;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

class HospitalTest {

    private Hospital hospital;

    @BeforeEach
    void setUp() {
        hospital = new Hospital("Hospital UQ");
    }

    @Test
    void agregarYVerificarPaciente() {
        Paciente p = new Paciente("123", "Ana", "F", "2323232", "calle 123", 30, new HistorialMedico("122121"));
        assertTrue(hospital.agregarPaciente(p));
        assertTrue(hospital.verificarPaciente("123"));
        assertFalse(hospital.agregarPaciente(p));
    }

    @Test
    void actualizarPaciente() {
        HistorialMedico historial = new HistorialMedico("232323");
        Paciente p = new Paciente("Ana", "Perez", "123", "555-1234", "Calle 305", 23, new HistorialMedico("123123"));
        hospital.agregarPaciente(p);

        HistorialMedico nuevoHistorial = new HistorialMedico("232323");
        Paciente nuevo = new Paciente("Ana Maria", "Perez", "123", "555-6789", "Calle 305", 23, new HistorialMedico("123123"));

        assertTrue(hospital.actualizarPaciente("123", nuevo));

        Paciente actualizado = hospital.getPacientes().stream()
                .filter(pa -> pa.getId().equals("123"))
                .findFirst()
                .orElse(null);

        assertNotNull(actualizado);
        assertEquals("Ana Maria", actualizado.getNombre());
        assertEquals("Perez", actualizado.getApellido());
        assertEquals("555-6789", actualizado.getTelefono());
        assertEquals("Calle 305", actualizado.getDireccion());
    }

    @Test
    void eliminarPaciente() {
        Paciente p = new Paciente("123", "Ana", "F", "3434343", "calle 34", 32, new HistorialMedico("122121"));
        hospital.agregarPaciente(p);

        assertEquals(1, hospital.getPacientes().size());
        assertFalse(hospital.eliminarPaciente("999"));
    }

    @Test
    void agregarYVerificarDoctor() {
        Doctor d = new Doctor("456", "Dr. Juan", "2323232", "320202232", 23, CARDIOLOGIA);
        assertTrue(hospital.agregarDoctor(d));
        assertTrue(hospital.verificarDoctor("456"));
    }

    @Test
    void actualizarDoctor() {
        Doctor original = new Doctor("Juan", "Gomez", "456", "555-1234", 32, CARDIOLOGIA);
        hospital.agregarDoctor(original);

        Doctor actualizado = new Doctor("Juan Carlos", "Gomez", "456", "555-4321", 32, NEUROLOGIA);
        assertTrue(hospital.actualizarDoctor("456", actualizado));

        Doctor doctorActualizado = hospital.getDoctores().stream()
                .filter(doc -> doc.getId().equals("456"))
                .findFirst()
                .orElse(null);

        assertNotNull(doctorActualizado);
        assertEquals("Juan Carlos", doctorActualizado.getNombre());
        assertEquals(NEUROLOGIA, doctorActualizado.getEspecialidad());
        assertEquals("555-4321", doctorActualizado.getTelefono());
    }

    @Test
    void eliminarDoctor() {
        Doctor d = new Doctor("456", "Dr. Juan", "2323232", "320202232", 35, CARDIOLOGIA);
        hospital.agregarDoctor(d);

        assertFalse(hospital.eliminarDoctor("999"));
        assertTrue(hospital.verificarDoctor("456"));
    }

    @Test
    void agregarYEliminarCitaMedica() {
        CitaMedica cita = new CitaMedica("789", LocalDate.parse("2025-03-12"), 10.0,
                new Doctor("Douglas", "Alvarez", "94838833", "3232323232", 39, NEUROLOGIA),
                new Paciente("123", "Ana", "F", "2323232", "calle 123", 32, new HistorialMedico("122121"))
        );

        hospital.reservarCita(cita);
        assertEquals(1, hospital.getCitaMedicas().size());
        assertTrue(hospital.cancelarCita("789"));
        assertEquals(0, hospital.getCitaMedicas().size());
    }

    @Test
    void agregarYEliminarMedicamento() {
        Medicamento m = new Medicamento("med1", "Paracetamol", 500.0);
        hospital.agregarMedicamento(m);
        assertEquals(1, hospital.getMedicamentos().size());
        assertTrue(hospital.eliminarMedicamento("med1"));
        assertEquals(0, hospital.getMedicamentos().size());
    }

    @Test
    void agregarYEliminarHistorial() {
        HistorialMedico h = new HistorialMedico("23232");
        assertTrue(hospital.agregarHistorial(h));
        assertEquals(1, hospital.getHistorialMedicos().size());
        assertTrue(hospital.eliminarHistorial("23232"));
        assertEquals(0, hospital.getHistorialMedicos().size());
    }

    @Test
    void eliminarCitaInexistente() {
        assertFalse(hospital.cancelarCita("noExiste"));
    }
}