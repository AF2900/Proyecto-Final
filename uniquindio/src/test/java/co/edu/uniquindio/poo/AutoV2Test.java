package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutoV2Test {
    
    private AutoV2 auto;

    @BeforeEach
    void setUp() {
        // Se creó una instancia inicial de AutoV2 para las pruebas :)...
        auto = new AutoV2(
            "Gasolina", 
            "Automática", 
            "Toyota", 
            "Nuevo", 
            "Corolla", 
            180, 
            "1600cc", 
            "5", 
            "Disponible"
        );
    }

    @Test
    void testCrearAutoV2() {
        assertNotNull(auto, "La instancia de AutoV2 debe haberse creado correctamente");
        assertEquals("Toyota", auto.getMarca(), "La marca debe ser Toyota");
        assertEquals("Corolla", auto.getModelo(), "El modelo debe ser Corolla");
        assertEquals(180, auto.getVelocidadMaxima(), "La velocidad máxima debe ser 180");
        assertEquals("Nuevo", auto.getEstado(), "El estado inicial debe ser nuevo");
        assertEquals("Disponible", auto.getStatus(), "El status debe ser disponible");
    }

    @Test
    void testCambiarEstado() {
        auto.setEstado("Ocupado");
        assertEquals("Ocupado", auto.getEstado(), "El estado debe haberse actualizado a ocupado");
    }
    
    @Test
    void testVelocidadMaximaValida() {
        assertTrue(auto.getVelocidadMaxima() > 0, "La velocidad máxima debe ser mayor que 0.");
    }
}