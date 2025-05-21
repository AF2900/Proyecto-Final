package co.edu.uniquindio.poo.proyectofinal.model;

public class Notificacion {
    private String id;
    private String detalle;

    public Notificacion(String id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
