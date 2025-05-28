package co.edu.uniquindio.poo.hospital.Model;

public class Medicamento {
    private String idMedicamento;
    private String nombre;
    private double dosis;

    public Medicamento(String idMedicamento, String nombre, double dosis) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
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

