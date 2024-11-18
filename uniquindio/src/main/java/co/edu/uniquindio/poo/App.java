package co.edu.uniquindio.poo;
import java.util.Scanner;

public class App {
    private static String transacciones;
    
        public static void main(String[] args) {
         AutoV2 auto= new AutoV2(null, null, null, null, null, 0, null, null, null);
         Moto moto= new Moto(null, null, null, null, 0, null, null, null, null, 0, null, null, null);
         Cliente cliente = new Cliente("mario", "lopez", "calle 12 nm 3", "3122323333");
         Empleado empleado= new Empleado(transacciones, null, auto, moto, cliente, null);
     Dealer dealer = new Dealer();
     dealer.logIn();
    }
}
