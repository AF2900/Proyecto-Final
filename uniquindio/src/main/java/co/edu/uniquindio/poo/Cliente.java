package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Cliente extends Persona {
Scanner sc = new Scanner(System.in);
    
public Cliente(String nombre,String apellido, String direccion,String telefono){
        super(nombre, apellido, direccion, telefono);

        if (nombre == null || nombre.isEmpty()) {
            throw new RuntimeException("Los datos no pueden ser nulos o vacíos: nombre");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new RuntimeException("Los datos no pueden ser nulos o vacíos: apellido");
        }
        if (direccion == null || direccion.isEmpty()) {
            throw new RuntimeException("Los datos no pueden ser nulos o vacíos: dirección");
        }
        if (telefono == null || telefono.isEmpty()) {
            throw new RuntimeException("Los datos no pueden ser nulos o vacíos: teléfono");
        }
    }
}