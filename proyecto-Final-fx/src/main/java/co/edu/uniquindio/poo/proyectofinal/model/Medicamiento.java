package co.edu.uniquindio.poo.proyectofinal.model;

public class Medicamiento {
    private String idMedicamiento;
    private String nombre;
    private double dosis;

    public Medicamiento(String idMedicamiento, String nombre, double dosis) {
        this.idMedicamiento = idMedicamiento;
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getIdMedicamiento() {
        return idMedicamiento;
    }

    public void setIdMedicamiento(String idMedicamiento) {
        this.idMedicamiento = idMedicamiento;
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
