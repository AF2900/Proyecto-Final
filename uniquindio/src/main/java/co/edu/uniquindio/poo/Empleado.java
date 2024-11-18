package co.edu.uniquindio.poo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Empleado {
    private String idEmpleado;
    protected ArrayList<AutoV2> listaDeAutos = new ArrayList<>();
    protected ArrayList<Moto> listaDeMotos = new ArrayList<>();
    private List<String> transacciones = new ArrayList<>();
    private AutoV2 auto=new AutoV2(null, null, null, null, null, 0, null, null, null);
    private Moto moto= new Moto(null, null, null, null, 0, null, null, null, null, 0, null, null, null);
    private Cliente cliente;
    private Transaccion transaccion;
    private Alquiler alquiler;
    private Scanner sc = new Scanner(System.in);

    public Empleado(int transacciones, String idEmpleado, AutoV2 auto, Moto moto, Cliente cliente, Transaccion transaccion){
        this.idEmpleado = idEmpleado;
        this.auto = auto;
        this.moto = moto;
        this.cliente = cliente;
        this.transaccion=transaccion;
    }

    public Empleado(int i, String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public Empleado(String string, String idEmpleado2, AutoV2 auto2, Moto moto2, Cliente cliente2, String string2) {
        //TODO Auto-generated constructor stub
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public AutoV2 getAuto() {
        return auto;
    }

    public void setAuto(AutoV2 auto) {
        this.auto = auto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void menuSeleccion(){
        int theChoice;
        mostrarMensaje("\nBienvenido al menú de empleados de Tu Carro UQ!\n");
        mostrarMensaje("Presione 1 para entrar al menú de funcionalidades");
        mostrarMensaje("Presione 2 para entrar al menú de registro de clientes");
        mostrarMensaje("Presione 3 para entrar al menú de registro de álquiler");
        mostrarMensaje("Presione 4 para entrar al menú de registro de Venta");
        mostrarMensaje("Presione 5 para entrar al menú de registro de Compra");
        mostrarMensaje("Presione 6 para entrar al menú de registro de transacciones");
        mostrarMensaje("Presione 7 para salir del programa");
        theChoice=sc.nextInt();
        sc.nextLine();
        do{
            switch (theChoice) {
                case 1:
                registrarAuto();
                break;
                
                case 2:
                registroCliente();
                break;
                
                case 3:
                registroAlquiler();
                break;
                
                case 4:
                venderAuto();
                break;
                
                case 5:
                comprarAuto();
                break;

                case 6:
                registrarTransaccion();
                break;
                
                case 7:
                mostrarMensaje("Cerrando el programa . . .");
                System.exit(0);
                break;
                default:
                mostrarMensaje("Opción no válida");
                    
            }

        }while(theChoice>7);
    }

    // Método para registrar autos
    public void registrarAuto(){
        int opcion;
        do {
            mostrarMensaje("\nBienvenido al menú de funcionalidades generales de Tu Carro UQ! \n");
            mostrarMensaje("Presione 1 para ingresar un Automóvil");
            mostrarMensaje("Presione 2 para ingresar una Motocicleta");
            mostrarMensaje("Presione 3 para cerrar este menú");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    auto.registroVehiculo();
                    listaDeAutos.add(auto);
                    break;
                case 2:
                    moto.registroVehiculo();
                    listaDeMotos.add(moto);
                    break;
                case 3:
                    mostrarMensaje("Cerrando menú . . .");
                    menuSeleccion();
                    break;
                default:
                    mostrarMensaje("Error, la opción ingresada no es válida");
            }
        } while (opcion != 3);
    }

    // Método para registrar un cliente
    public void registroCliente(){
        int opcion;
       mostrarMensaje("\nBienvenido al menú de registro de clientes de Tu Carro UQ!\n");
       do{
       mostrarMensaje("\nPresione 1 Para registrar un cliente");
       mostrarMensaje("presione 2 para cerrar el programa");
       opcion=sc.nextInt();
       sc.nextLine();
       switch(opcion){
    
        case 1:
        mostrarMensaje("Ingrese el nombre del cliente: ");
        cliente.nombre=sc.nextLine();
        mostrarMensaje("Ingrese el apellido del cliente: ");
        cliente.apellido=sc.nextLine();
        mostrarMensaje("Ingrese la dirección del cliente: ");
        cliente.direccion=sc.nextLine();
        mostrarMensaje("Ingrese el número telefónico del cliente: ");
        cliente.telefono=sc.nextLine();
        mostrarMensaje("El cliente ha sido registrado exitosamente");
        break;
        
        case 2:
        mostrarMensaje("Cerrando Programa . . .");
        menuSeleccion();
        break;
        default:
        mostrarMensaje("Error, la opción ingresada no es válida");
        
       } 

        }while(opcion!=2);
    }
    

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void registroAlquiler() {
        int opcionTres;
        mostrarMensaje("Ingrese 1 para el registro de alquiler de un Carro");
        mostrarMensaje("Ingrese 2 para el registro de alquiler de una Moto");
        mostrarMensaje("Ingrese 3 para cancelar");
        opcionTres = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
    
        // Bucle para repetir hasta que el cliente cancele
        do {
            switch (opcionTres) {
                
                // Alquiler de carros
                case 1:
                    alquilarCarro(); // Método para alquilar un carro
                    break;
    
                // Alquiler de motos
                case 2:
                    alquilarMoto(); // Método para alquilar una moto
                    break;
    
                case 3:
                    mostrarMensaje("Cancelando el proceso...");
                    menuSeleccion(); 
                    break;
    
                default:
                    mostrarMensaje("Error, la opción ingresada no es válida");
            }
        } while (opcionTres != 3);
    }

    // Registro de alquileres
    public void alquilarAuto(){
        alquiler.alquilarAuto(idEmpleado, idEmpleado);
    }

    public void alquilarCarro() {
        mostrarMensaje("Ingrese el nombre del cliente:");
        String nombreCliente = sc.nextLine();
    
        mostrarMensaje("Ingrese el modelo del carro:");
        String modeloCarro = sc.nextLine();
    
        mostrarMensaje("Ingrese el número de días de alquiler:");
        int diasAlquiler = sc.nextInt();
        sc.nextLine(); 
    
        mostrarMensaje("Ingrese el costo diario del alquiler:");
        double costoDiario = sc.nextDouble();
        sc.nextLine(); 
    
        double costoTotal = diasAlquiler * costoDiario;
    
        mostrarMensaje("\nResumen del alquiler:");
        mostrarMensaje("Cliente: " + nombreCliente);
        mostrarMensaje("Carro: " + modeloCarro);
        mostrarMensaje("Días de alquiler: " + diasAlquiler);
        mostrarMensaje("Costo diario: $" + costoDiario);
        mostrarMensaje("Costo total: $" + costoTotal);
        mostrarMensaje("¡Alquiler registrado exitosamente!");
    }

    public void alquilarMoto() {
        mostrarMensaje("Ingrese el nombre del cliente:");
        String nombreCliente = sc.nextLine();
    
        mostrarMensaje("Ingrese el modelo de la moto:");
        String modeloMoto = sc.nextLine();
    
        mostrarMensaje("Ingrese el número de días de alquiler:");
        int diasAlquiler = sc.nextInt();
        sc.nextLine(); 
    
        mostrarMensaje("Ingrese el costo diario del alquiler:");
        double costoDiario = sc.nextDouble();
        sc.nextLine(); 
    
        double costoTotal = diasAlquiler * costoDiario;
    
        mostrarMensaje("\nResumen del alquiler:");
        mostrarMensaje("Cliente: " + nombreCliente);
        mostrarMensaje("Moto: " + modeloMoto);
        mostrarMensaje("Días de alquiler: " + diasAlquiler);
        mostrarMensaje("Costo diario: $" + costoDiario);
        mostrarMensaje("Costo total: $" + costoTotal);
        mostrarMensaje("¡Alquiler registrado exitosamente!");
    }
 
    public void venderAuto() {
        int opcionCuatro;
        do{
            mostrarMensaje("\nBienvenido al menú de venta de vehículos de Tu Carro UQ!\n");
            mostrarMensaje("\nPresione 1 Para vender un vehículo");
            mostrarMensaje("presione 2 para cerrar el programa");
            opcionCuatro=sc.nextInt();
            switch(opcionCuatro){
                case 1:
                sc.nextLine();
                mostrarMensaje("Ingrese el ID del empleado que realiza la venta:");
                String idEmpleado = sc.nextLine();
                mostrarMensaje("Ingrese el nombre del cliente:");
                String nombreCliente = sc.nextLine();
                mostrarMensaje("Ingrese el tipo de vehículo vendido (Auto/Moto):");
                String tipoVehiculo = sc.nextLine();
                mostrarMensaje("Ingrese la marca del vehículo:");
                String marcaVehiculo = sc.nextLine();
                mostrarMensaje("Ingrese la variable del vehículo (Sedán, deportivo, etc (auto). Ó gasolina, diesel, etc (moto).");
                String variable = sc.nextLine();
                mostrarMensaje("Ingrese el modelo del vehículo:");
                String modeloVehiculo = sc.nextLine();
                mostrarMensaje("Ingrese el precio de la venta:");
                double precioVenta = sc.nextDouble();
                sc.nextLine();
                mostrarMensaje("\nResumen de la venta:\n");
                mostrarMensaje("Empleado ID: " + idEmpleado);
                mostrarMensaje("Cliente: " + nombreCliente);
                mostrarMensaje("Vehículo vendido: " + tipoVehiculo + " - " + marcaVehiculo + " - " + variable + " - "  +modeloVehiculo );
                mostrarMensaje("Precio de venta: $" + precioVenta);
                mostrarMensaje("¡Venta registrada exitosamente!\n");

                case 2:
                mostrarMensaje("Cerrando Programa . . .");
                menuSeleccion();
                break;
            
                default:
                mostrarMensaje("Error, la opción ingresada no es válida");
            }    
        } while (opcionCuatro != 4);
    }    

    public void comprarAuto() {
        int opcionCinco;
        do{
            mostrarMensaje("\nBienvenido al menú de compra de vehículos de Tu Carro UQ!\n");
            mostrarMensaje("\nPresione 1 Para comprar un carro");
            mostrarMensaje("presione 2 para comprar una moto");
            mostrarMensaje("presione 3 para cerrar el programa");
            opcionCinco=sc.nextInt();
            switch (opcionCinco) {
                case 1:
                mostrarMensaje("Ha seleccionado carro\n");
                sc.nextLine();
                mostrarMensaje("Ingrese la marca del carro:");
                String marca = sc.nextLine();
                mostrarMensaje("Ingrese el modelo del carro:");
                String modelo = sc.nextLine();
                mostrarMensaje("Ingrese el color del carro:");
                String color = sc.nextLine();
                mostrarMensaje("Ingrese la placa del carro:");
                String placa = sc.nextLine();
                mostrarMensaje("Ingrese el tipo del carro (SUV, sedán, etc.):");
                String tipo = sc.nextLine();
                mostrarMensaje("Ingrese el año del carro:");
                int anio = sc.nextInt();
                sc.nextLine();
                mostrarMensaje("Ingrese el motor del carro:");
                String motor = sc.nextLine();
                mostrarMensaje("Ingrese el tipo de combustible del carro:");
                String combustible = sc.nextLine();
                mostrarMensaje("Ingrese el tipo de transmisión del carro:");
                String transmision = sc.nextLine();
                mostrarMensaje("El carro ha sido comprado y registrado exitosamente.\n");
                mostrarMensaje("Detalles del carro comprado:");
                mostrarMensaje("Marca: " + marca);
                mostrarMensaje("Modelo: " + modelo);
                mostrarMensaje("Color: " + color);
                mostrarMensaje("Placa: " + placa);
                mostrarMensaje("Año: " + anio);
                mostrarMensaje("Tipo: " + tipo);
                mostrarMensaje("Transmisión: " +transmision);
                AutoV2 nuevoAuto = new AutoV2(marca, modelo, color, placa, tipo, anio, motor, combustible, transmision);
                listaDeAutos.add(nuevoAuto);
                break;

                case 2:
                mostrarMensaje("Ha seleccionado moto\n");
                sc.nextLine();
                mostrarMensaje("Ingrese la marca de la moto: ");
                String m = sc.nextLine();
                mostrarMensaje("Ingrese el modelo de la moto: ");
                String model = sc.nextLine();
                mostrarMensaje("Ingrese el color: ");
                String colour = sc.nextLine();
                mostrarMensaje("Ingrese el tipo de la moto (gasolina, diesel, etc.):");
                String type = sc.nextLine();
                mostrarMensaje("Ingrese el límite de cambios de la moto: ");
                String cambios = sc.nextLine();
                mostrarMensaje("Ingrese la velocidad máxima de la moto (En Km/h): ");
                int velocidadMaxima = sc.nextInt();
                sc.nextLine();
                mostrarMensaje("Ingrese el cilindraje de la moto: ");
                String cilindraje = sc.nextLine();
                mostrarMensaje("La moto ha sido comprada y registrada exitosamente.\n");
                mostrarMensaje("Detalles de la moto comprada:");
                mostrarMensaje("Marca: " + m);
                mostrarMensaje("Modelo: " + model);
                mostrarMensaje("Color: " + colour);
                mostrarMensaje("Tipo: " + type);
                mostrarMensaje("Cambios: " + cambios);
                mostrarMensaje("Velocidad máxima: " + velocidadMaxima);
                mostrarMensaje("Cilindraje: " + cilindraje);
                Moto nuevaMoto=listaDeMotos(m,model,colour,type,cambios,velocidadMaxima,cilindraje);
                                break;
                
                                case 3:
                                mostrarMensaje("Cerrando Programa . . .");
                                menuSeleccion();
                                break;
                            
                                default:
                                mostrarMensaje("Error, la opción ingresada no es válida");
                            }   
                        } while (opcionCinco != 5);
                    }
                
                    private Moto listaDeMotos(String m, String model, String colour, String type, String cambios, int velocidadMaxima,
                            String cilindraje) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'listaDeMotos'");
                    }
                
                    public void registrarTransaccion(){
        int opcionSeis;
        do{
            mostrarMensaje("\nBienvenido al menú de registro de transacción de Tu Carro UQ!\n");
            mostrarMensaje("\nPresione 1 Para registrar una transacción");
            mostrarMensaje("presione 2 para cerrar el programa");
            opcionSeis=sc.nextInt();
            switch (opcionSeis) {
                case 1:
                sc.nextLine();
                System.out.println("Ingrese el tipo de vehículo (Auto/Moto):");
                String tipoVehiculo = sc.nextLine();
                System.out.println("Ingrese el modelo del vehículo:");
                String modelo = sc.nextLine();
                System.out.println("Ingrese el cliente asociado:");
                String cliente = sc.nextLine();
                System.out.println("Ingrese el precio de la transacción:");
                double precio = sc.nextDouble();
                sc.nextLine();
                String transaccion = String.format("Tipo: %s, Modelo: %s, Cliente: %s, Precio: %.2f", tipoVehiculo, modelo, cliente, precio);
                transacciones.add(transaccion);
                System.out.println("Transacción registrada con éxito.");
                break;

                case 2:
                mostrarMensaje("Cerrando Programa . . .");
                menuSeleccion();
                break;
            
                default:
                mostrarMensaje("Error, la opción ingresada no es válida");
            }
        } while (opcionSeis != 6);
    }
    
    public List<String> obtenerTransacciones() {
        return transacciones;
    }
}