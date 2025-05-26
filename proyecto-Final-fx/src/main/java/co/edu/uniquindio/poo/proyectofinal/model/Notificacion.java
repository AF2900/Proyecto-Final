package co.edu.uniquindio.poo.proyectofinal.model;

public class Notificacion {
    private String idNotificacion;
    private String detalle;
    private Paciente paciente;

    public Notificacion(String idNotificacion, String detalle, Paciente paciente) {
        this.idNotificacion = idNotificacion;
        this.detalle = detalle;
        this.paciente = paciente;
    }

    public String getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
