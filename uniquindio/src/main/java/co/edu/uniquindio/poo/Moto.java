package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Moto extends Vehiculo implements Registro {
    private Scanner sc = new Scanner(System.in);
    private String autonomia;
    private int duracionBateria;
    private String modo;
    private String ligera;
    
        public Moto(String marca, String estado, String modelo, String cambios, int velocidadMaxima, String cilindraje, String tipoCombustible, String tipoTransmision, String autonomia, int duracionBateria, String modo, String ligera, String status){
            super(tipoCombustible, tipoTransmision, marca, estado, modelo,velocidadMaxima,cilindraje, cambios,status);
            this.autonomia = autonomia;
            this.duracionBateria = duracionBateria;
            this.modo = modo;
            this.ligera = ligera;
        }

        public String getLigera() {
            return ligera;
        }

        public void setLigera(String ligera) {
            this.ligera = ligera;
        }

        public String getModo() {
            return modo;
        }

        public void setModo(String modo) {
            this.modo = modo;
        }

        public String getAutonomia() {
            return autonomia;
        }
    
        public void setAutonomia(String autonomia) {
            this.autonomia = autonomia;
        }
    
        public int getDuracionBateria() {
            return duracionBateria;
        }
    
        public void setDuracionBateria(int duracionBateria) {
            this.duracionBateria = duracionBateria;
        }

        public void mostrarMensaje(String mensaje){
            System.out.println(mensaje);
        }
    

        public void registroVehiculo() {
            while (true) {
                mostrarMensaje("Bienvenido a la sección de motos, por favor seleccione una categoría: ");
                mostrarMensaje("1. Registrar moto a gasolina");
                mostrarMensaje("2. Registrar moto a diésel");
                mostrarMensaje("3. Registrar moto eléctrica");
                mostrarMensaje("4. Registrar moto híbrida");
                mostrarMensaje("5. Salir");
                int opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
        
                switch (opcion) {
                    case 1:
                        mostrarMensaje("Ha registrado moto a gasolina");
                        mostrarMensaje("Ingrese la marca de la moto a gasolina: ");
                        this.marca = sc.nextLine();
                        mostrarMensaje("Ingrese el modelo de la moto a gasolina: ");
                        this.modelo = sc.nextLine();
                        mostrarMensaje("Ingrese el estado de la moto (Disponible o no disponible): ");
                        status = sc.nextLine().toLowerCase();
                        mostrarMensaje("Ingrese el límite de cambios de la moto a gasolina: ");
                        this.cambios = sc.nextLine();
                        mostrarMensaje("Ingrese la velocidad máxima de la moto a gasolina (En Km/h): ");
                        this.velocidadMaxima = sc.nextInt();
                        sc.nextLine(); // Consumir el salto de línea
                        mostrarMensaje("Ingrese el cilindraje de la moto a gasolina: ");
                        this.cilindraje = sc.nextLine();
        
                        while (true) {
                            mostrarMensaje("Seleccione si la moto a gasolina es nueva o usada (1.Nueva 2.Usada): ");
                            int one = sc.nextInt();
                            sc.nextLine(); // Consumir el salto de línea
                            if (one == 1) {
                                estado = "La moto a gasolina es nueva.";
                                break;
                            }
                            if (one == 2) {
                                estado = "La moto a gasolina es usada.";
                                break;
                            } else {
                                mostrarMensaje("Opción no válida");
                            }
                        }
                        break;
        
                    case 3: // Moto eléctrica
                        mostrarMensaje("Ha seleccionado moto eléctrica");
                        mostrarMensaje("Ingrese la marca de la moto eléctrica: ");
                        this.marca = sc.nextLine();
                        mostrarMensaje("Ingrese el modelo de la moto eléctrica: ");
                        this.modelo = sc.nextLine();
                        mostrarMensaje("Ingrese el estado de la moto (Disponible o no disponible): ");
                        status = sc.nextLine().toLowerCase();
                        mostrarMensaje("Ingrese la autonomía con carga completa deseada para la moto eléctrica: ");
                        this.autonomia = sc.nextLine();
                        mostrarMensaje("Ingrese la duración de batería deseada para la moto eléctrica (En Km): ");
                        this.duracionBateria = sc.nextInt();
                        sc.nextLine(); // Consumir el salto de línea
                        mostrarMensaje("Ingrese la velocidad máxima de la moto eléctrica (En Km/h): ");
                        this.velocidadMaxima = sc.nextInt();
                        sc.nextLine(); // Consumir el salto de línea
                        mostrarMensaje("Ingrese el cilindraje de la moto eléctrica: ");
                        this.cilindraje = sc.nextLine();
        
                        while (true) {
                            mostrarMensaje("Seleccione si la moto eléctrica es nueva o usada (1.Nueva 2.Usada): ");
                            int one = sc.nextInt();
                            sc.nextLine(); // Consumir el salto de línea
                            if (one == 1) {
                                estado = "La moto eléctrica es nueva.";
                                break;
                            }
                            if (one == 2) {
                                estado = "La moto eléctrica es usada.";
                                break;
                            } else {
                                mostrarMensaje("Opción no válida");
                            }
                        }
                        break;
        
                    case 4: // Moto híbrida
                        mostrarMensaje("Ha seleccionado la moto híbrida");
                        mostrarMensaje("Ingrese la marca de la moto híbrida: ");
                        this.marca = sc.nextLine();
                        mostrarMensaje("Ingrese el modelo de la moto híbrida: ");
                        this.modelo = sc.nextLine();
                        mostrarMensaje("Ingrese el estado de la moto (Disponible o no disponible): ");
                        status = sc.nextLine().toLowerCase();
                        mostrarMensaje("Ingrese el límite de cambios de la moto híbrida: ");
                        this.cambios = sc.nextLine();
                        mostrarMensaje("Ingrese la velocidad máxima de la moto híbrida (En Km/h): ");
                        this.velocidadMaxima = sc.nextInt();
                        sc.nextLine(); 
                        mostrarMensaje("Ingrese el cilindraje de la moto híbrida: ");
                        this.cilindraje = sc.nextLine();
        
                        while (true) {
                            mostrarMensaje("Seleccione si la moto híbrida es nueva o usada (1.Nueva 2.Usada): ");
                            int one = sc.nextInt();
                            sc.nextLine(); // Consumir el salto de línea
                            if (one == 1) {
                                estado = "La moto híbrida es nueva.";
                                break;
                            }
                            if (one == 2) {
                                estado = "La moto híbrida es usada.";
                                break;
                            } else {
                                mostrarMensaje("Opción no válida");
                            }
                        }
        
                        while (true) {
                            mostrarMensaje("Indique si la moto híbrida es enchufable (1.Sí 2.No): ");
                            int two = sc.nextInt();
                            sc.nextLine(); // Consumir el salto de línea
                            if (two == 1) {
                                modo = "La moto es enchufable.";
                                break;
                            }
                            if (two == 2) {
                                modo = "La moto no es enchufable.";
                                mostrarMensaje("Indique si la moto es híbrida ligera o no (1.Sí 2.No): ");
                                int three = sc.nextInt();
                                sc.nextLine(); // Consumir el salto de línea
                                if (three == 1) {
                                    ligera = "La moto es híbrida ligera";
                                    break;
                                }
                                if (three == 2) {
                                    ligera = "La moto no es híbrida ligera";
                                    break;
                                }
                            } else {
                                mostrarMensaje("Opción no válida");
                            }
                        }
                        break;
        
                    case 5:
                        mostrarMensaje("Saliendo del programa....");
                        return;
        
                    default:
                        mostrarMensaje("Opción no válida");
                        break;
                }
            }
        }
    
    
}