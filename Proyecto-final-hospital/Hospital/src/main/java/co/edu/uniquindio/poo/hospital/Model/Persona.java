package co.edu.uniquindio.poo.hospital.Model;

public abstract class Persona {
    private String nombre;
    private String Apellido;
    private String cedula;
    private int edad;
    private String telefono;


        public Persona(String nombre, String Apellido, String cedula ,int edad, String telefono) {
       this.nombre = nombre;
       this.Apellido = Apellido;
       this.cedula = cedula;
       this.edad = edad;
       this.telefono = telefono;
    }


    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona setApellido(String apellido) {
        Apellido = apellido;
        return this;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
