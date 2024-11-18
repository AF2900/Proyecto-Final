package co.edu.uniquindio.poo;

import java.util.List;

public class Alquiler {
    // Lista de autos disponibles para alquiler
    private List<AutoV2> autosDisponibles;

    // Constructor
    public Alquiler(List<AutoV2> autosDisponibles) {
        this.autosDisponibles = autosDisponibles;
    }

    // Método para alquilar un auto
    public boolean alquilarAuto(String marca, String modelo) {
        for (AutoV2 auto : autosDisponibles) {
            // Verificar si el auto coincide con la marca y modelo y si está disponible
            if (auto.getMarca().equals(marca) && auto.getModelo().equals(modelo) && auto.getEstado().equals("Disponible")) {
                // Actualizar el estado del auto a "Alquilado"
                auto.setEstado("Alquilado");
                System.out.println("Auto alquilado: " + marca + " " + modelo);
                return true; // Indicar que el alquiler fue exitoso
            }
        }
        System.out.println("El auto no está disponible.");
        return false; // Si no se encuentra el auto o no está disponible
    }

    // Método para devolver un auto alquilado
    public boolean devolverAuto(String marca, String modelo) {
        for (AutoV2 auto : autosDisponibles) {
            // Verificar si el auto coincide con la marca y modelo y si está alquilado
            if (auto.getMarca().equals(marca) && auto.getModelo().equals(modelo) && auto.getEstado().equals("Alquilado")) {
                // Actualizar el estado del auto a "Disponible"
                auto.setEstado("Disponible");
                System.out.println("Auto devuelto: " + marca + " " + modelo);
                return true; // Indicar que el auto fue devuelto exitosamente
            }
        }
        System.out.println("El auto no está alquilado o no se encuentra.");
        return false; // Si el auto no está alquilado o no se encuentra
    }

    // Método para agregar un auto a la lista de autos disponibles
    public void agregarAuto(AutoV2 auto) {
        autosDisponibles.add(auto);
        System.out.println("Auto agregado: " + auto.getMarca() + " " + auto.getModelo());
    }

    // Método para mostrar todos los autos disponibles
    public void mostrarAutosDisponibles() {
        System.out.println("Autos disponibles para alquiler:");
        for (AutoV2 auto : autosDisponibles) {
            if (auto.getEstado().equals("Disponible")) {
                System.out.println(auto.getMarca() + " " + auto.getModelo() + " - " + auto.getTipoCombustible());
            }
        }
    }
}