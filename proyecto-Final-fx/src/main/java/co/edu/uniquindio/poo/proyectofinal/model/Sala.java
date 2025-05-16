package co.edu.uniquindio.poo.proyectofinal.model;

public class Sala {
    private String id;
    private boolean disposicion;

    public Sala(String id, boolean disposicion) {
        this.id = id;
        this.disposicion = disposicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisposicion() {
        return disposicion;
    }

    public void setDisposicion(boolean disposicion) {
        this.disposicion = disposicion;
    }
}
