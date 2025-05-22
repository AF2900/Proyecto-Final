package co.edu.uniquindio.poo.proyectofinal;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import co.edu.uniquindio.poo.proyectofinal.model.Cita;
import co.edu.uniquindio.poo.proyectofinal.model.HistorialMedico;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Medico;
import co.edu.uniquindio.poo.proyectofinal.model.Paciente;

public class HospitalTest {
    Hospital hospital= new Hospital("Cementerio uniquindiano", "000000.1");
    Medico medico = new Medico("Dutch", "Vanderlinde", "090921", "900", "09213");
    HistorialMedico historial= new HistorialMedico("2221", null);
    Paciente paciente= new Paciente("Juan carlos", "Bodoque", "092861", "5532", "Deudas", "Casa 1", historial, null);
    Cita cita= new Cita("1987", LocalDate.of(2025, 5, 22), "17:40", medico, paciente);
    
//Test de creación de médicos
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


}
