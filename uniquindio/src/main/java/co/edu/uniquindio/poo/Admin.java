package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    ArrayList<Empleado> empleados;
    private Empleado empleado=new Empleado(null, null, null, null, null, null);
    private Scanner sc = new Scanner(System.in);
    
    public Admin(){
        this.empleados= new ArrayList<>();
}
///Menú de Administración

public void administracion(){
 int opcion;
 mostrarMensaje("Bienvenido, Administrador, al menú de gestionamiento de Tu Carro UQ.");
 mostrarMensaje("Presione 1 para gestionar empleados.");
 mostrarMensaje("Presione 2 para ver el registro de reportes.");
 mostrarMensaje("Presione 3 para gestionamiento de excepciones.");
 mostrarMensaje("Presione 4 para salir del programa.");
 opcion= sc.nextInt();
 sc.nextLine();
 switch(opcion){
    case 1:
    gestionamientoEmpleados();
    break;
    case 2:
    
    break;
    
    case 3:
    registrosReportes();
    case 4:
    mostrarMensaje("Cerrando sesión . . .");
    System.exit(0);
    break;

    default:
    mostrarMensaje("Error, la opción ingresada no es válida");
    administracion();
    
 }   
}
///Gestionamiento 
public void gestionamientoEmpleados(){
    int opcionDos;
    mostrarMensaje("Presione 1 para agregar un nuevo empleado.");
    mostrarMensaje("Presione 2 para eliminar un empleado.");
    mostrarMensaje("Presione 3 para salir del programa de gestionamiento.");
    opcionDos= sc.nextInt();
    sc.nextLine();
    Empleado nuevoEmpleado;
    switch (opcionDos) {
        case 1:
            nuevoEmpleado= new Empleado(null, null, null, null, null, null);
            agregarEmpleado(nuevoEmpleado);
            break;

        case 2:
        eliminacionEmpleado(empleado);
        break;

        case 3:
        mostrarMensaje("Cancelando operación . . .\n");
        administracion();
        break;
    
        default:
        mostrarMensaje("Opción no válida. \n");
        administracion();
            
    }

}

///Registro de empleados
public void agregarEmpleado(Empleado empleado){
    mostrarMensaje("Ingrese el ID del empleado: ");
    String idEmpleado = sc.nextLine();
    empleado.setIdEmpleado(idEmpleado);
    empleados.add(empleado);
    mostrarMensaje("Empleado registrado con el ID: " + idEmpleado+".\n");
    administracion();
}


public void eliminacionEmpleado(Empleado empleado){
    mostrarMensaje("Ingrese el ID del empleado a eliminar: ");
    String idEliminar = sc.nextLine();
    Empleado empleadoAEliminar = null;
    for (Empleado emp : empleados) {
        if (emp.getIdEmpleado().equals(idEliminar)) {
            empleadoAEliminar = emp;
            break;
        }
    }
    if (empleadoAEliminar != null) {
        empleados.remove(empleadoAEliminar);
        mostrarMensaje("Empleado con ID " + idEliminar + " ha sido eliminado.");
    } else {
        mostrarMensaje("Empleado no encontrado.");
    }
}

public void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
}

public Object realizarOperacion(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'realizarOperacion'");
}

public void gestionExcepciones(){
    mostrarMensaje("Menú de gestión de excepciones:");
    mostrarMensaje("1. Ver excepciones registradas.");
    mostrarMensaje("2. Probar manejo de excepciones.");
    mostrarMensaje("3. Salir al menú principal.");
    
    int opcionExcepcion = sc.nextInt();
    sc.nextLine();

    switch (opcionExcepcion) {
        case 1:
            mostrarMensaje("Actualmente no hay excepciones registradas. (Funcionalidad futura).");
            gestionExcepciones(); // Regresar al menú de excepciones.
            break;

        case 2:
            probarManejoExcepciones(); // Método para probar manejo de excepciones.
            break;

        case 3:
            administracion(); // Regresar al menú principal.
            break;

        default:
            mostrarMensaje("Opción no válida. Por favor intente de nuevo.");
            gestionExcepciones();
    }
}

private void probarManejoExcepciones() {
    mostrarMensaje("Probando manejo de excepciones:");
    mostrarMensaje("1. Dividir por cero.");
    mostrarMensaje("2. Acceso a índice fuera de rango.");
    mostrarMensaje("3. Regresar al menú de gestión de excepciones.");
    
    int opcionPrueba = sc.nextInt();
    sc.nextLine();

    try {
        switch (opcionPrueba) {
            case 1:
                // Generar una excepción de división por cero.
                int resultado = 10 / 0;
                mostrarMensaje("Resultado: " + resultado); // Este mensaje no se ejecutará.
                break;

            case 2:
                // Generar una excepción de índice fuera de rango.
                ArrayList<String> lista = new ArrayList<>();
                mostrarMensaje(lista.get(1)); // Acceso a un índice inexistente.
                break;

            case 3:
                gestionExcepciones(); // Regresar al menú.
                break;

            default:
                mostrarMensaje("Opción no válida. Por favor intente de nuevo.");
                probarManejoExcepciones();
        }
    } catch (ArithmeticException e) {
        mostrarMensaje("Error: División por cero no permitida. Detalles: " + e.getMessage());
    } catch (IndexOutOfBoundsException e) {
        mostrarMensaje("Error: Índice fuera de rango. Detalles: " + e.getMessage());
    } catch (Exception e) {
        mostrarMensaje("Error inesperado: " + e.getMessage());
    } finally {
        mostrarMensaje("Prueba de manejo de excepciones finalizada.\n");
        gestionExcepciones(); // Volver al menú de excepciones después de manejar la excepción.
    }
}

public void registrosReportes(){
    int opcionsita;
    mostrarMensaje("Presione 1 para ver el reporte de autos registrados.");
    mostrarMensaje("Presione 2 para ver el reporte de motos registradas.");
    opcionsita=sc.nextInt();
    switch(opcionsita){
        case 1:
        
        if (empleado.listaDeAutos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else{
            mostrarMensaje("Lista de autos registrados:");
            for (AutoV2 auto : empleado.listaDeAutos) {
                System.out.println(auto);
        }
    } break;
    case 2:
    if (empleado.listaDeMotos.isEmpty()) {
        System.out.println("No hay vehículos registrados.");
    } else{
        mostrarMensaje("Lista de motos registradas:");
        for (Moto moto : empleado.listaDeMotos) {
            System.out.println(moto);
    }
    } 
    break;
default:
    mostrarMensaje("Error, opción no válida.");
    administracion();
    }
    
 
}   
}
