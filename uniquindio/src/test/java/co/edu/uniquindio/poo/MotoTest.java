package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void testRegistroMotoGasolina() {
        String simulatedInput = "1\nYamaha\nFZ\nDisponible\n5\n150\n300cc\n1\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Moto moto = new Moto("Yamaha", "Disponible", "FZ", "5", 150, "300cc", "Gasolina", "Manual", null, 0, null, null, null);
        moto.registroVehiculo();

        String output = out.toString();
        assertTrue(output.contains("Ha registrado moto a gasolina"));
        assertTrue(output.contains("Ingrese la marca de la moto a gasolina"));
        assertEquals("Yamaha", moto.getMarca());
        assertEquals("FZ", moto.getModelo());
        assertEquals("300cc", moto.getCilindraje());
        assertEquals(150, moto.getVelocidadMaxima());
    }

    @Test
    void testSalirRegistroVehiculo() {
        String simulatedInput = "5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Moto moto = new Moto("Marca", "Estado", "Modelo", "Cambios", 0, "Cilindraje", "Combustible", "Transmision", null, 0, null, null, null);
        moto.registroVehiculo();

        String output = out.toString();
        assertTrue(output.contains("Saliendo del programa...."));
    }

    @Test
    void testSettersAndGetters() {
        Moto moto = new Moto("Honda", "Disponible", "CBR", "6", 200, "500cc", "Gasolina", "Manual", "300km", 120, "Modo Eco", "Ligera", "Nuevo");

        moto.setMarca("Suzuki");
        moto.setModelo("Hayabusa");
        moto.setCilindraje("1340cc");
        moto.setVelocidadMaxima(299);
        moto.setLigera("No ligera");
        moto.setAutonomia("400km");

        assertEquals("Suzuki", moto.getMarca());
        assertEquals("Hayabusa", moto.getModelo());
        assertEquals("1340cc", moto.getCilindraje());
        assertEquals(299, moto.getVelocidadMaxima());
        assertEquals("No ligera", moto.getLigera());
        assertEquals("400km", moto.getAutonomia());
    }

    @Test
    void testThrowsExceptionOnInvalidInput() {
        String simulatedInput = "abc\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        Moto moto = new Moto("Marca", "Estado", "Modelo", "Cambios", 0, "Cilindraje", "Combustible", "Transmision", null, 0, null, null, null);

        Exception exception = assertThrows(java.util.InputMismatchException.class, moto::registroVehiculo);
        assertNotNull(exception);
    }
}