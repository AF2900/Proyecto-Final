package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    
    @Test
    void testCrearClienteConDatosValidos() {
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle 123", "123456789");
        assertEquals("Juan", cliente.getNombre(), "El nombre debería ser Juan");
        assertEquals("Pérez", cliente.getApellido(), "El apellido debería ser Pérez");
        assertEquals("Calle 123", cliente.getDireccion(), "La dirección debe ser Calle 123");
        assertEquals("123456789", cliente.getTelefono(), "El teléfono debe ser 123456789");
    }

    @Test
    void testCrearClienteConDatosNulos() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            new Cliente(null, "Pérez", "Calle 123", "123456789");
        });
        assertTrue(exception.getMessage().contains("Los datos no pueden ser nulos o vacíos: nombre"),
                "nulo");
    }

    @Test
    void testCrearClienteConDatosVacios() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            new Cliente("", "Pérez", "Calle 123", "123456789");
        });
        assertTrue(exception.getMessage().contains("Los datos no pueden ser nulos o vacíos: nombre"),
                "vacio");
    }

    @Test
    void testCrearClienteConApellidoVacio() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            new Cliente("Juan", "", "Calle 123", "123456789");
        });
        assertTrue(exception.getMessage().contains("Los datos no pueden ser nulos o vacíos: apellido"),
                "no vacio");
    }
}