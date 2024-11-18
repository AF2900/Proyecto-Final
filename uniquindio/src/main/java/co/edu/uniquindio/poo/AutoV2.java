package co.edu.uniquindio.poo;
import java.util.Scanner;

public class AutoV2 extends Vehiculo implements Registro {
    Scanner sc = new Scanner(System.in);
    
    public AutoV2(String tipoCombustible, String tipoTransmision,String marca, String estado, String modelo, int velocidadMaxima, String cilindraje, String cambios, String status){
        super(tipoCombustible, tipoTransmision, marca, estado, modelo,velocidadMaxima,cilindraje, cambios, status);
    }

    public void registroVehiculo(){
        int opcion;
        do{
            mostrarMensaje("¡Bienvenido al menú de registro automovilístico de Tu Carro UQ! Selecciona una opción del 1 al 8 para comenzar.");
            mostrarMensaje("1. Registrar Sedán");
            mostrarMensaje("2. Registrar Deportivo");
            mostrarMensaje("3. Registrar Camioneta");
            mostrarMensaje("4. Registrar Pick Up");
            mostrarMensaje("5. Registrar Van");
            mostrarMensaje("6. Registrar Autobús");
            mostrarMensaje("7. Registrar Camión");
            mostrarMensaje("8. Salir");
            opcion= sc.nextInt();

            switch(opcion){
                case 1:
                registrarSedan();
                break;
                
                case 2:
                registrarDeportivo();
                break;
                
                case 3:
                registrarCamioneta();
                break;
                
                case 4:
                registrarPickUp();
                break;

                case 5:
                registrarVan();
                break;

                case 6:
                registrarAutobus();
                break;

                case 7:
                registrarCamion();
                break;

                case 8:
                mostrarMensaje("Cerrando programa . . .");
                break;
                
                default:
                mostrarMensaje("Error, la opción ingresada no es válida.");

            }
        }while(opcion!=8);   
    }
     
    ///Sedán
     private void registrarSedan(){

        mostrarMensaje("Ha registrado Sedán");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca del Sedán: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones del Sedán: ");
        estado = sc.nextLine();

        mostrarMensaje("Ingrese el estado del Sedán (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo del Sedán: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios del Sedán: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima del Sedán: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje del Sedán: ");
        cilindraje = sc.next(); 
        
        mostrarMensaje("Ingrese el número máximo de pasajeros del Sedán: ");
        int numeroPasajeros = sc.nextInt();
        
        mostrarMensaje("Ingrese la capacidad del maletero del Sedán (En KG): ");
        double capacidadMaletero = sc.nextDouble();
        
        boolean tieneAireAcondicionado = obtenerOpcion("Ingrese si el Sedán cuenta con aire acondicionado (1.Si 2.No): ");
        boolean tieneCamaraReversa = obtenerOpcion("Ingrese si el Sedán cuenta con cámara de reversa (1.Si 2.No): ");
        boolean tieneVelocidadCrucero = obtenerOpcion("Ingrese si el Sedán cuenta con velocidad crucero (1.Si 2.No): ");
        boolean tieneABS = obtenerOpcion("Ingrese si el Sedán cuenta con ABS (1.Si 2.No): ");
        boolean tieneSensoresColision = obtenerOpcion("Ingrese si el Sedán cuenta con sensores de colisión (1.Si 2.No): ");
        boolean tieneSensorTransito = obtenerOpcion("Ingrese si el Sedán cuenta con sensores de tráfico cruzado (1.Si 2.No): ");
        boolean tieneAsistenteCarril = obtenerOpcion("Ingrese si el Sedán cuenta con asistente de permanencia de carril (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese el número de bolsas de aire del Sedán: ");
        int numeroBolsaAire = sc.nextInt();
        mostrarMensaje("Registro exitoso");
    }
    
     ///Deportivo
     private void registrarDeportivo(){
        
        mostrarMensaje("Ha registrado Deportivo");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca del Deportivo: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones del Deportivo: ");
        estado = sc.nextLine();
        
        mostrarMensaje("Ingrese el estado del Deportivo (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo del Deportivo: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios del Deportivo: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima del Deportivo: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje del Deportivo: ");
        cilindraje = sc.next(); 

        mostrarMensaje("Ingrese el número de puertas del Deportivo: ");
        int numeroPuertas = sc.nextInt();

        mostrarMensaje("Ingrese el tiempo que tarda el Deportivo en llegar a 100 kmh (Ingresar tiempo en segundos): ");
        int tiempo = sc.nextInt();
        mostrarMensaje("Registro exitoso");
        }

        ///Camioneta
        private void registrarCamioneta(){
        
        mostrarMensaje("Ha registrado Camioneta");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca de la Camioneta: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones de la Camioneta: ");
        estado = sc.nextLine();

        mostrarMensaje("Ingrese el estado de la Camioneta (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo  de la Camioneta: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios de la Camioneta: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima de la Camioneta: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje de la Camioneta: ");
        cilindraje = sc.next(); 

        mostrarMensaje("Ingrese el número de puertas de la Camioneta: ");
         int numeroPuertas = sc.nextInt();
        
         mostrarMensaje("Ingrese el número máximo de pasajeros de la Camioneta: ");
        int numeroPasajeros = sc.nextInt();

         boolean tieneAireAcondicionado = obtenerOpcion("Ingrese si la Camioneta cuenta con aire acondicionado (1.Si 2.No): ");
        boolean tieneCamaraReversa = obtenerOpcion("Ingrese sila Camioneta cuenta con cámara de reversa (1.Si 2.No): ");
        boolean tieneVelocidadCrucero = obtenerOpcion("Ingrese si la Camioneta cuenta con velocidad crucero (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese el número de bolsas de aire de la Camioneta: ");
        
        int numeroBolsaAire = sc.nextInt();
        boolean tieneSensoresColision = obtenerOpcion("Ingrese si la Camioneta cuenta con sensores de colisión (1.Si 2.No): ");
        boolean tieneSensorTransito = obtenerOpcion("Ingrese si la Camioneta cuenta con sensores de tráfico cruzado (1.Si 2.No): ");
        boolean tieneAsistenteCarril = obtenerOpcion("Ingrese si la Camioneta cuenta con asistente de permanencia de carril (1.Si 2.No): ");
        boolean tipoCamioneta=obtenerOpcion("Ingrese si la Camioneta es una 4x4 (1.Si 2.No): ");
        mostrarMensaje("Registro exitoso");
    
    }

     ///Pickup
     private void registrarPickUp(){
        mostrarMensaje("Ha registrado Pick Up");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca de la Pick Up: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones de la Pick Up: ");
        estado = sc.nextLine();

        mostrarMensaje("Ingrese el estado de la Pick Up (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo  de la Pick Up: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios de la Pick Up: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima  de la Pick Up: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje  de la Pick Up: ");
        cilindraje = sc.next(); 

        mostrarMensaje("Ingrese el número de puertas  de la Pick Up: ");
        int numeroPuertas = sc.nextInt();
        
        mostrarMensaje("Ingrese el número máximo de pasajeros de la Pick Up: ");
        int numeroPasajeros = sc.nextInt();

        boolean tieneAireAcondicionado = obtenerOpcion("Ingrese si la Pick Up cuenta con aire acondicionado (1.Si 2.No): ");
        boolean tieneCamaraReversa = obtenerOpcion("Ingrese si la Pick Up cuenta con cámara de reversa (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese el número de bolsas de aire de la Pick Up: ");
        
        int numeroBolsaAire = sc.nextInt();
        boolean tieneABS = obtenerOpcion("Ingrese si la Pick Up cuenta con ABS (1.Si 2.No): ");
        boolean tipoPickUp=obtenerOpcion("Ingrese si la Camioneta es una 4x4 (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese la capacidad de la caja de la Pick Up: ");
        int capacidad = sc.nextInt();
        mostrarMensaje("Registro exitoso");
    }

    ///Van
    private void registrarVan(){
        mostrarMensaje("Ha registrado Van");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca de la Van: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones de la Van: ");
        estado = sc.nextLine();

        mostrarMensaje("Ingrese el estado de la Van (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo  de la Van: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios de la Van: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima de la Van: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje de la Van: ");
        cilindraje = sc.next(); 

        mostrarMensaje("Ingrese el número de puertas de la Van: ");
        int numeroPuertas = sc.nextInt();

        mostrarMensaje("Ingrese el número máximo de pasajeros de la Van: ");
        int numeroPasajeros = sc.nextInt();

        boolean tieneAireAcondicionado = obtenerOpcion("Ingrese si la Van cuenta con aire acondicionado (1.Si 2.No): ");
        boolean tieneCamaraReversa = obtenerOpcion("Ingrese si la Van cuenta con cámara de reversa (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese el número de bolsas de aire de la Van: ");
        int numeroBolsaAire = sc.nextInt();
        boolean tieneABS = obtenerOpcion("Ingrese si la Van cuenta con ABS (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese la capacidad del maletero de la Van: ");
        int capacidad = sc.nextInt();
        mostrarMensaje("Registro exitoso");
    }

    ///Autobús
    private void registrarAutobus(){
        mostrarMensaje("Ha registrado Autobús");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca del Autobús: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones del Autobús: ");
        estado = sc.nextLine();

        mostrarMensaje("Ingrese el estado del Autobús (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo del Autobús: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios del Autobús: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima del Autobús: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje del Autobús: ");
        cilindraje = sc.next(); 

        mostrarMensaje("Ingrese el número de puertas del Autobús: ");
        int numeroPuertas = sc.nextInt();

        mostrarMensaje("Ingrese el número máximo de pasajeros del Autobús: ");
        int numeroPasajeros = sc.nextInt();

        mostrarMensaje("Ingrese la capacidad del maletero del Autobús: ");
        int capacidad = sc.nextInt();

        boolean tieneAireAcondicionado = obtenerOpcion("Ingrese si la Van cuenta con aire acondicionado (1.Si 2.No): ");
        boolean tieneCamaraReversa = obtenerOpcion("Ingrese si la Van cuenta con cámara de reversa (1.Si 2.No): ");
        
        mostrarMensaje("Ingrese el número de bolsas de aire de la Van: ");
        int numeroBolsaAire = sc.nextInt();
        boolean tieneABS = obtenerOpcion("Ingrese si la Van cuenta con ABS (1.Si 2.No): ");

        while(true){
            mostrarMensaje("Ingrese el número de ejes del Autobús: ");
            int numeroEjes = sc.nextInt();
            if(numeroEjes > 0){ 
                mostrarMensaje("Número de ejes ingresado: " + numeroEjes);
                break;
            } else {
                mostrarMensaje("Opción no válida. Ingrese un número positivo.");
            }
        }
        
        while(true){
            mostrarMensaje("Ingrese el número de salidas de emergencia del Autobús: ");
            int numeroSalidasEmergencia = sc.nextInt();
            if(numeroSalidasEmergencia >= 0){ 
                mostrarMensaje("Número de salidas de emergencia ingresado: " + numeroSalidasEmergencia);
                break;
            } else {
                mostrarMensaje("Opción no válida. Ingrese un número válido.");
            }
        }
        mostrarMensaje("Registro exitoso");
    }

    ///Camión
    private void registrarCamion(){
        mostrarMensaje("Ha registrado Camión");
        
        marca=sc.nextLine();
        mostrarMensaje("Ingrese la marca del Camión: ");
        marca = sc.nextLine();
        
        mostrarMensaje("Ingrese las condiciones del Camión: ");
        estado = sc.nextLine();

        mostrarMensaje("Ingrese el estado del Camión (Disponible o no disponible): ");
        status = sc.nextLine().toLowerCase();
        
        mostrarMensaje("Ingrese el modelo del Camión: ");
        modelo = sc.nextLine();

        mostrarMensaje("Ingrese los cambios del Camión: ");
        cambios = sc.nextLine();
        
        mostrarMensaje("Ingrese la velocidad máxima  del Camión: ");
        velocidadMaxima = sc.nextInt();
        
        mostrarMensaje("Ingrese el tipo de cilindraje  del Camión: ");
        cilindraje = sc.next(); 

       mostrarMensaje("Ingrese la capacidad de carga del Camión (En KG): ");
       int capacidad=sc.nextInt();

       boolean tieneAireAcondicionado = obtenerOpcion("Ingrese si el Camión cuenta con aire acondicionado (1.Si 2.No): ");
       boolean tieneCamaraReversa = obtenerOpcion("Ingrese si el Camión cuenta con cámara de reversa (1.Si 2.No): ");
       
       mostrarMensaje("Ingrese el número de bolsas de aire de el Camión: ");
       int numeroBolsaAire = sc.nextInt();
       boolean tieneABS = obtenerOpcion("Ingrese si el Camión cuenta con ABS (1.Si 2.No): ");

       while(true){
        mostrarMensaje("Ingrese el número de ejes del Camión: ");
        int numeroEjes = sc.nextInt();
        if(numeroEjes > 0){ 
            mostrarMensaje("Número de ejes ingresado: " + numeroEjes);
            break;
        } else {
            mostrarMensaje("Opción no válida. Ingrese un número positivo.");
        }
        }
        mostrarMensaje("Registro exitoso");
    }

    private boolean obtenerOpcion(String mensaje) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            mostrarMensaje(mensaje);
            int opcion = sc.nextInt();
            if (opcion == 1) {
                mostrarMensaje("Cuenta con esta característica.");
                return true;
            } else if (opcion == 2) {
                mostrarMensaje("No cuenta con esta característica.");
                return false;
            } else {
                mostrarMensaje("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
