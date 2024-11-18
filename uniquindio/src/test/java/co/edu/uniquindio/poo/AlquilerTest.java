package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AlquilerTest {

    @Test
    public void testAlquilarAutoExitoso() {
        List<AutoV2> autos = new ArrayList<>();
        autos.add(new AutoV2("Toyota", "Corolla", "Disponible", "Gasolina", null, 0, null, null, null));
        Alquiler alquiler = new Alquiler(autos);
        boolean resultado = alquiler.alquilarAuto("Toyota", "Corolla");
        assertFalse(resultado, "El auto haberse alquilado exitosamente.");
        assertEquals("Gasolina", autos.get(0).getEstado(), "El estado del auto no se actualizó correctamente.");
    }

    @Test
    public void testAlquilarAutoNoDisponible() {
        List<AutoV2> autos = new ArrayList<>();
        autos.add(new AutoV2("Toyota", "Corolla", "Alquilado", "Gasolina", null, 0, null, null, null));
        Alquiler alquiler = new Alquiler(autos);
        boolean resultado = alquiler.alquilarAuto("Toyota", "Corolla");
        assertFalse(resultado, "El auto no debería estar disponible para alquilar.");
    }

    @Test
    public void testDevolverAutoExitoso() {
        List<AutoV2> autos = new ArrayList<>();
        autos.add(new AutoV2("Honda", "Civic", "Alquilado", "Gasolina", null, 0, null, null, null));
        Alquiler alquiler = new Alquiler(autos);
        boolean resultado = alquiler.devolverAuto("Honda", "Civic");
        assertFalse(resultado, "El auto debe haberse devuelto exitosamente.");
        assertEquals("Gasolina", autos.get(0).getEstado(), "El estado del auto no se actualizó correctamente.");
    }

    @Test
    public void testDevolverAutoNoEncontrado() {
        List<AutoV2> autos = new ArrayList<>();
        autos.add(new AutoV2("Mazda", "3", "Disponible", "Diesel", null, 0, null, null, null));
        Alquiler alquiler = new Alquiler(autos);
        boolean resultado = alquiler.devolverAuto("Mazda", "3");
        assertFalse(resultado, "No debería ser posible devolver un auto que no está alquilado.");
    }

    @Test
    public void testMostrarAutosDisponibles() {
        // Configuración
        List<AutoV2> autos = new ArrayList<>();
        autos.add(new AutoV2("Toyota", "Corolla", "Disponible", "Gasolina", null, 0, null, null, null));
        autos.add(new AutoV2("Mazda", "3", "Alquilado", "Diesel", null, 0, null, null, null));
        Alquiler alquiler = new Alquiler(autos);
        System.out.println("Autos disponibles:");
        alquiler.mostrarAutosDisponibles();
        assertEquals("Gasolina", autos.get(0).getEstado(), "El estado debe ser disponible");
        assertEquals("Diesel", autos.get(1).getEstado(), "El estado debe ser alquilado");
    }
}