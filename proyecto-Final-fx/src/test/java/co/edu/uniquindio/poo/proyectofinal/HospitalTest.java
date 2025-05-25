package co.edu.uniquindio.poo.proyectofinal;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import co.edu.uniquindio.poo.proyectofinal.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class HospitalTest {
    Hospital hospital= new Hospital("Cementerio uniquindiano", "000000.1");
    Medico medico = new Medico("Dutch", "Vanderlinde", "090921", "3000",Especialidad.CARDIOLOGIA);
    HistorialMedico historial= new HistorialMedico("2221", null);
    Paciente paciente= new Paciente("Juan carlos", "Bodoque", "092861", "5532", "Deudas",  historial, null);
    Cita cita= new Cita("1987", LocalDate.of(2025, 5, 22), "17:40", medico, paciente);
    
//Tests de creación/eliminación de Citas

    @Test
    public void crearCitaTest(){
    boolean resultado= hospital.crearCita(cita);
    assertTrue(resultado);
    }

    @Test
    public void eliminarCitaTest(){
    hospital.crearCita(cita);
    boolean borrado = hospital.eliminarCita(cita);
    assertTrue(borrado);
    }

//Tests de creación/Eliminación de pacientes

    @Test
    public void addPaciente(){
    boolean pruebaUno= hospital.addPaciente(paciente);
    assertTrue(pruebaUno);
    }

    @Test
    public void borrarPaciente(){
    hospital.addPaciente(paciente);
    boolean borrado= hospital.eliminarPaciente(paciente);
    assertTrue(borrado);
    }

//Tests respecto a admin:
    @Test
    void testAgregarSalaExitosamente() {
    Hospital hospital = new Hospital("Hospital Central", "123456789");
    assertTrue(hospital.agregarSala(new Sala("A101", true)));
    }

    @Test
    void testAgregarSalaDuplicada() {
        Hospital hospital = new Hospital("Hospital Central", "123456789");
        hospital.agregarSala(new Sala("A101", true)); // Primera vez, debería agregarla
        assertFalse(hospital.agregarSala(new Sala("A101", true))); // Duplicada, debe fallar
    }

    @BeforeEach
    public void setUp() {
        hospital = new Hospital("Hospital", "12332323");
        hospital.getListSalas().clear();
        hospital.setListSalas(new LinkedList<>());
        hospital.getListSalas().add(new Sala("S1", false));
        hospital.getListSalas().add(new Sala("S2", false));
    }

    @Test
    public void modificarSalaExistente() {
        Sala salaModificada = new Sala("S1", true);

        boolean resultado = hospital.modificarSala(salaModificada);

        assertTrue(resultado);
        assertEquals(salaModificada, hospital.getListSalas().get(0));
    }

    @Test
    public void modificarSalaNoExistente() {
        Sala salaNueva = new Sala("S2", false);

        boolean resultado = hospital.modificarSala(salaNueva);

        assertTrue(resultado);
        assertEquals(2, hospital.getListSalas().size());
    }

    @Test
    public void testEliminarSalaExistente() {
        Sala salaEliminar = new Sala("S1", false);

        boolean resultado = hospital.eliminarSala(salaEliminar);

        assertTrue(resultado);
        assertEquals(1, hospital.getListSalas().size());
        assertNull(hospital.buscarSala("S1"));
    }

    @Test
    public void testEliminarSalaNoExistente() {
        Sala salaInexistente = new Sala("S3", true);

        boolean resultado = hospital.eliminarSala(salaInexistente);

        assertFalse(resultado);
        assertEquals(2, hospital.getListSalas().size());
    }

    @Test
    public void testBuscarSalaExistente() {
        Sala resultado = hospital.buscarSala("S2");

        assertNotNull(resultado);
        assertEquals("S2", resultado.getId());
    }

    @Test
    public void testBuscarSalaNoExistente() {
        Sala resultado = hospital.buscarSala("S99");
        assertNull(resultado);
    }
}