package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;

// Constructor
    public Persona(String nombre, String apellido, String direccion, String telefono){

    this.nombre=nombre;
    this.apellido=apellido;
    this.direccion=direccion;
    this.telefono=telefono;
}

public String getNombre() {
    return nombre;
}

public String getApellido() {
    return apellido;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

@Override
public String toString() {
    return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
            + telefono + "]";
}

public void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
}

}

