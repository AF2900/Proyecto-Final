package co.edu.uniquindio.poo;
import java.util.Date;

public class Transaccion {
    private static int contador = 1;  // Contador para generar IDs únicos
    private int idTransaccion;
    private Empleado empleado;
    private Cliente cliente;
    private Moto moto;
    private AutoV2 auto;
    private String tipoTransaccion;  // "Alquiler", "Venta", "Compra"
    private Date fecha;
    
    public Transaccion(Cliente cliente, AutoV2 auto, String tipoTransaccion, Moto moto) {
        this.idTransaccion = contador++;
        this.empleado = empleado;
        this.cliente = cliente;
        this.auto = auto;
        this.moto = moto;
        this.tipoTransaccion = tipoTransaccion;
        this.fecha = new Date(); // La fecha y hora actuales
    }

    public Transaccion(Empleado empleado2, Cliente cliente2, Object object, String string, Moto moto2) {
        //TODO Auto-generated constructor stub
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public AutoV2 getAuto() {
        return auto;
    }
    public Moto getMoto(){
        return moto;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }
    
    /// Método para mostrar información de la transacción de Auto
    public void mostrarTransaccionAuto() {
        if (auto != null) {
            auto.mostrarMensaje("Transacción ID: " + idTransaccion);
            auto.mostrarMensaje("Empleado: " + empleado.getIdEmpleado());
            auto.mostrarMensaje("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
            auto.mostrarMensaje("Vehículo: " + auto.getModelo());
            auto.mostrarMensaje("Tipo de transacción: " + tipoTransaccion);
            auto.mostrarMensaje("Fecha: " + fecha.toString());
        } else {
            System.out.println("No hay auto asociado a esta transacción.");
        }
    }

    /// Método para mostrar información de la transacción de Auto
    public void mostrarTransaccionMoto() {
        if (moto != null) {
            auto.mostrarMensaje("Transacción ID: " + idTransaccion);
            auto.mostrarMensaje("Empleado: " + empleado.getIdEmpleado());
            auto.mostrarMensaje("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
            auto.mostrarMensaje("Vehículo: " + moto.getModelo());
            auto.mostrarMensaje("Tipo de transacción: " + tipoTransaccion);
            auto.mostrarMensaje("Fecha: " + fecha.toString());
        } else {
            System.out.println("No hay moto asociada a esta transacción.");
        }
    }
    
}