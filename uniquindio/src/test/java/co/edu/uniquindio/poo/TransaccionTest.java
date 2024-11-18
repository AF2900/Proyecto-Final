package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransaccionTest {

    private Cliente cliente;
    private AutoV2 auto;
    private Moto moto;
    private Empleado empleado;

    @BeforeEach
    public void setUp() {
        // Configuración
        cliente = new Cliente("Juan", "Pérez", "123456789", "juan.perez@example.com");
        auto = new AutoV2("Toyota", "Corolla", "Disponible", "Gasolina", null, 0, null, null, null);
        moto = new Moto("Yamaha", "MT-07", "Disponible", "Gasolina", 0, null, null, null, null, 0, null, null, null);
        empleado = new Empleado(1, "Carlos", "Gómez");
    }

    @Test
    public void testCrearTransaccionAuto() {
        // Crear una transacción de tipo "Venta" para un Auto
        Transaccion transaccion = new Transaccion(cliente, auto, "Venta", null);

        // Verificaciones
        assertEquals(1, transaccion.getIdTransaccion(), "El ID de la transacción debe ser 1");
        assertEquals(cliente, transaccion.getCliente(), "El cliente asociado no es correcto");
        assertEquals(auto, transaccion.getAuto(), "El auto asociado no es correcto");
        assertNull(transaccion.getMoto(), "No debería haber una moto asociada");
        assertEquals("Venta", transaccion.getTipoTransaccion(), "El tipo de transacción no es correcto");
        assertNotNull(transaccion.getFecha(), "La fecha de la transacción no debería ser nula");
    }

    @Test
    public void testCrearTransaccionMoto() {
        // Crear una transacción de tipo "Alquiler" para una Moto
        Transaccion transaccion = new Transaccion(cliente, null, "Alquiler", moto);

        // Verificaciones
        assertEquals(2, transaccion.getIdTransaccion(), "El ID de la transacción debería ser 2.");
        assertEquals(cliente, transaccion.getCliente(), "El cliente asociado no es correcto.");
        assertEquals(moto, transaccion.getMoto(), "La moto asociada no es correcta.");
        assertNull(transaccion.getAuto(), "No debería haber un auto asociado.");
        assertEquals("Alquiler", transaccion.getTipoTransaccion(), "El tipo de transacción no es correcto.");
        assertNotNull(transaccion.getFecha(), "La fecha de la transacción no debería ser nula.");
    }

    @Test
    public void testMostrarTransaccionAuto() {
        // Configuración
        Empleado empleado = new Empleado(1, "Carlos", "Gómez");
        Transaccion transaccion = new Transaccion(empleado, cliente, auto, "Venta", null);
        System.out.println("Mostrando transacción de auto:");
        transaccion.mostrarTransaccionAuto();
}

    @Test
    public void testMostrarTransaccionMoto() {
        // Configuración
        Empleado empleado = new Empleado(2, "Ana", "Martínez");
        Transaccion transaccion = new Transaccion(empleado, cliente, null, "Alquiler", moto);
        System.out.println("Mostrando transacción de moto:");
        transaccion.mostrarTransaccionMoto();
    }
}