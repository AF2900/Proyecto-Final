package co.edu.uniquindio.poo.hospital.Model;

// 04/14/25 Update log: Fue creada la clase persona.

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String telefono;
    protected int edad;

    public Persona(String nombre, String apellido, String id, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
