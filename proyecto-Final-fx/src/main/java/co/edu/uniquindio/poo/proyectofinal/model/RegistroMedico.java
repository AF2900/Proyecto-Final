package co.edu.uniquindio.poo.proyectofinal.model;

public class RegistroMedico {
    private String idRegistro;
    private String fecha;
    private String hora;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    public RegistroMedico(String idRegistro ,String fecha,String hora,String  diagnostico, String tratamiento, String observaciones) {
        this.idRegistro = idRegistro;
        this.fecha = fecha;
        this.hora = hora;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    @Override
    public String toString() {
        return "RegistroMedico{" +
                "idRegistro='" + idRegistro + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
