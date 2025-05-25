package co.edu.uniquindio.poo.proyectofinal.model;

public class Medicamiento {
    private String id;
    private String nombre;
    private double dosis;

    public Medicamiento(String id, String nombre, double dosis) {
        this.id = id;
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }
}
