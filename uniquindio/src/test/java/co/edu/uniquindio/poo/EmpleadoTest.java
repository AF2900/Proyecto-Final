package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class EmpleadoTest {
    @Test
    public void testRegistrarAuto() {
        Empleado empleado = new Empleado(null, "12345", null, null, null, null);
        AutoV2 auto = new AutoV2("Toyota", "Disponible", "Corolla", "5", "Gasolina", 180, "2.0L", "Manual", "OK");
        empleado.setAuto(auto);
        assertNotNull(empleado.getAuto(), "El auto debe estar registrado");
        assertEquals("Corolla", empleado.getAuto().getMarca(), "La marca debe coincidir");
    }

    @Test
    public void testRegistroCliente() {
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle 123", "3001234567");
        Empleado empleado = new Empleado(null, "12345", null, null, cliente, null);
        assertNotNull(empleado.getCliente(), "El cliente no debe ser nulo después del registro");
        assertEquals("Juan", empleado.getCliente().getNombre(), "El nombre del cliente debe coincidir");
        assertEquals("Pérez", empleado.getCliente().getApellido(), "El apellido del cliente debe coincidir");
        assertEquals("Calle 123", empleado.getCliente().getDireccion(), "La dirección del cliente debe coincidir");
        assertEquals("3001234567", empleado.getCliente().getTelefono(), "El teléfono del cliente debe coincidir");
    }

    @Test
    public void testInputMismatchException() {
        Empleado empleado = new Empleado(null, "12345", null, null, null, null);
        Exception exception = assertThrows(java.util.InputMismatchException.class, () -> {
            Scanner sc = new Scanner("TextoEnLugarDeNumero");
            sc.nextInt();
        });
        assertTrue(exception instanceof java.util.InputMismatchException, "excepción de tipo InputMismatchException");
    }
}
