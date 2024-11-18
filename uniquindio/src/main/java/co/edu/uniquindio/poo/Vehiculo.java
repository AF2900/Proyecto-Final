package co.edu.uniquindio.poo;

public class Vehiculo {
    public String tipoCombustible;
    public String tipoTransmision;
    public String marca;
    public String cambios;
    public String estado;
    public String modelo;
    public int velocidadMaxima;
    public String cilindraje;
    public String status;

    public Vehiculo (String tipoCombustible, String tipoTransmision, String marca, String estado,  String modelo, int velocidadMaxima, String cilindraje, String cambios, String status){
        this.tipoCombustible=tipoCombustible;
        this.tipoTransmision= tipoTransmision;
        this.marca=marca;
        this.cambios=cambios;
        this.estado=estado;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
        this.cilindraje=cilindraje;
        this.status=status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo [tipoCombustible=" + tipoCombustible + ", tipoTransmision=" + tipoTransmision + ", marca="
                + marca + ", cambios=" + cambios + ", estado=" + estado + ", modelo=" + modelo + ", velocidadMaxima="
                + velocidadMaxima + ", cilindraje=" + cilindraje + ", status=" + status + "]";
    }
   
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    

    
    
}
