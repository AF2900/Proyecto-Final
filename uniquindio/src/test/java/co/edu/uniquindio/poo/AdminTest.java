package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.rmi.AccessException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdminTest {

    private Admin Admin;
        private Cliente cliente;
        private final Admin admin = new Admin();
        private AutoV2 auto;
        private Moto moto;
    
        @BeforeEach
        void setUp() {
            Admin = new Admin();
            admin.empleados = new ArrayList<>();
        }
    
        @Test
        void testAgregarEmpleado() {                            
        // Crear empleado
        Empleado empleado= new Empleado(null, null, auto, moto, cliente, null);

        // Agregar empleado
        admin.agregarEmpleado(empleado);
        assertEquals(1, admin.empleados.size());
        assertEquals("001", admin.empleados.get(0).getIdEmpleado());
    }

    @Test
    void testEliminarEmpleadoExistente() {
        // Agregar empleado
        Empleado empleado= new Empleado(null, null, auto, moto, cliente, null);
        admin.empleados.add(empleado);

        // Eliminar empleado
        admin.eliminacionEmpleado(empleado);

        // lista vacía
        assertTrue(admin.empleados.isEmpty());
    }

    @Test
    void testMostrarMensaje() {
        assertDoesNotThrow(() -> admin.mostrarMensaje("Mensaje de prueba"));
    }

    @Test
    public void testOperacionValidaAgregar() {
        assertDoesNotThrow(() -> admin.realizarOperacion("Agregar"), 
            "No debería lanzar una excepción para una operación válida.");
    }

    @Test
    public void testOperacionValidaEliminar() {
        assertDoesNotThrow(() -> admin.realizarOperacion("Eliminar"), 
            "No debería lanzar una excepción para una operación válida.");
    }

    
}