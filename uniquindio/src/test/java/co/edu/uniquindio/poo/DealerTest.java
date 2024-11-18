package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    private Dealer dealer;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        // Inicializar Dealer
        dealer = new Dealer();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testLogInEmpleado() {
        String input = "1\n"; // 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        dealer.logIn();
        String output = outputStream.toString();
        assertTrue(output.contains("Bienvenido al sistema de Tu Carro UQ"));
        assertTrue(output.contains("Presione 1 para acceder a las funcionalidades de empleados"));
    }

    @Test
    void testInicioSesionConContraseñaCorrecta() {
        String input = dealer.password + "\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        dealer.inicioSesion();
        String output = outputStream.toString();
        assertTrue(output.contains("Bienvenido, Administrador, por favor ingrese la contraseña"));
        assertTrue(output.contains("Bienvenido, administrador"));
    }

    @Test
    void testInicioSesionConContraseñaIncorrectaYRecuperacionExitosa() {
        String input = "incorrecta\nY\nWhile-True\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        dealer.inicioSesion();
        String output = outputStream.toString();
        assertTrue(output.contains("¿Desea realizar la recuperación de la contraseña?"));
        assertTrue(output.contains("Conteste la pregunta de seguridad"));
        assertTrue(output.contains("La contraseña es: " + dealer.password));
    }

    @Test
    void testInicioSesionConContraseñaIncorrectaYRecuperacionFallida() {
        String input = "incorrecta\nY\nrespuesta-incorrecta\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        dealer.inicioSesion();
        String output = outputStream.toString();
        assertTrue(output.contains("¿Desea realizar la recuperación de la contraseña?"));
        assertTrue(output.contains("Conteste la pregunta de seguridad"));
        assertTrue(output.contains("Respuesta incorrecta."));
    }

    @Test
    void testMostrarMensaje() {
        dealer.mostrarMensaje("Prueba de mensaje");
        String output = outputStream.toString();
        assertEquals("Prueba de mensaje\n", output.trim());
    }
}