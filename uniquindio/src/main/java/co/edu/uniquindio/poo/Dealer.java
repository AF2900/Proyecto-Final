package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Dealer {
    AutoV2 auto = new AutoV2("Marca", "Modelo", "Color", "Placa", "Tipo", 2023, "Motor", "Combustible", "Transmision");
    Moto moto = new Moto("Marca", "Modelo", "Color", "Placa", 2023, "Motor", "Cilindraje", "Combustible", "Frenos", 2, "Tipo", "Transmision", "Chasis");
    Cliente cliente = new Cliente("Nombre", "Cedula", "Telefono", "Direccion");
    Empleado empleado = new Empleado("Nombre", "Cedula", auto, moto, cliente, "Cargo");
    Admin administrador = new Admin();
    Scanner sc = new Scanner(System.in);
    String password = "TuCarritoUQ2024";
    String pregunta = "While-True".toLowerCase();

    public void logIn() {
        int opcion;
        while (true) {
            mostrarMensaje("\nBienvenido al sistema de Tu Carro UQ.\n");
            mostrarMensaje("Presione 1 para acceder a las funcionalidades de empleados.");
            mostrarMensaje("Presione 2 para acceder a las funcionalidades de administración.");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1) {
                empleado.menuSeleccion();
                break;
            } else if (opcion == 2) {
                inicioSesion();
                break;
            } else {
                mostrarMensaje("La opción ingresada no es válida.");
            }
        }
    }

    public void inicioSesion() {
        while (true) {
            mostrarMensaje("Bienvenido, Administrador, por favor ingrese la contraseña.");
            String pass = sc.nextLine();
            if (!pass.equals(password)) {
                mostrarMensaje("¿Desea realizar la recuperación de la contraseña? Y/N.");
                String input = sc.nextLine().trim();
                if (input.equalsIgnoreCase("Y")) {
                    mostrarMensaje("Conteste la pregunta de seguridad.\n");
                    mostrarMensaje("¿Cuál es el mantra del grupo Inmortal Code?");
                    String verificacion = sc.nextLine().toLowerCase();
                    if (!verificacion.equals(pregunta)) {
                        mostrarMensaje("Respuesta incorrecta.");
                    } else {
                        mostrarMensaje("La contraseña es: " + password);
                    }
                } else if (input.equalsIgnoreCase("N")) {
                    continue;
                } else {
                    mostrarMensaje("Opción no válida.");
                }
            } else {
                mostrarMensaje("Bienvenido, administrador.\n");
                administrador.administracion();
                break;
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
     

}