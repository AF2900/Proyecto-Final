package co.edu.uniquindio.poo.proyectofinal;

import static org.junit.jupiter.api.Assertions.*;
import co.edu.uniquindio.poo.proyectofinal.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class PacienteTest {
    Paciente paciente, paciente1, paciente2;
    HistorialMedico historial;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
        paciente.setId("P001");

        paciente1 = new Paciente();
        paciente1.setId("P002");

        paciente2 = new Paciente();
        paciente2.setId("P003");

        historial = new HistorialMedico();

        original = new Paciente();
        original.setNombre("Luis");
        original.setApellido("Martínez");
        original.setId("P100");
        original.setDireccion("Calle A");
        original.setTelefono("12345");

        nuevo = new Paciente();
        nuevo.setNombre("Luis M.");
        nuevo.setApellido("Martínez R.");
        nuevo.setId("P100");
        nuevo.setDireccion("Calle B");
        nuevo.setTelefono("54321");

        copia = new Paciente();
        copia.setNombre("Luis");
        copia.setApellido("Martínez");
        copia.setId("P100");
        copia.setDireccion("Calle A");
        copia.setTelefono("12345");
    }

    @Test
    public void assertNotNull_historialCorrecto() {
        historial.setPaciente(paciente);
        paciente.setHistorialMedico(historial);

        assertNotNull(paciente.consultarHistorialMedico());
    }

    @Test
    public void assertNull_historialEsDeOtro() {
        historial.setPaciente(paciente1);
        paciente2.setHistorialMedico(historial);

        assertNull(paciente2.consultarHistorialMedico());
    }

    @Test
    public void assertNull_historialEsNulo() {
        paciente.setHistorialMedico(null);

        assertNull(paciente.consultarHistorialMedico());
    }

    Paciente original, nuevo, copia;

    @Test
    public void assertEquals_actualizarDatos() {
        original.actualizarPaciente(nuevo);

        assertEquals("Luis M.", original.getNombre());
        assertEquals("Martínez R.", original.getApellido());
        assertEquals("P100", original.getId());
        assertEquals("Calle B", original.getDireccion());
        assertEquals("54321", original.getTelefono());
    }

    @Test
    public void assertEquals_actualizarConDatosIguales() {
        original.actualizarPaciente(copia);

        assertEquals("Luis", original.getNombre());
        assertEquals("Martínez", original.getApellido());
        assertEquals("P100", original.getId());
        assertEquals("Calle A", original.getDireccion());
        assertEquals("12345", original.getTelefono());
    }

    @Test
    public void assertDoesNotThrow_actualizarConNull() {
        assertDoesNotThrow(() -> {
            original.actualizarPaciente(null);
        });

        assertEquals("Luis", original.getNombre());
        assertEquals("Martínez", original.getApellido());
    }
}