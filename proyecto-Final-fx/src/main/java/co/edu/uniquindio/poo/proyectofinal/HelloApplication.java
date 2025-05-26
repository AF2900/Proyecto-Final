package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.*;
import co.edu.uniquindio.poo.proyectofinal.viewController.InicioViewController;
import co.edu.uniquindio.poo.proyectofinal.viewController.MenuPersonaViewController;
import co.edu.uniquindio.poo.proyectofinal.viewController.PacienteVC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloApplication extends Application {

    public static Hospital Hospital;
    public Hospital hospital = new Hospital("HospitalUQ", "101012");
    private Stage primaryStage;

    public static Hospital Hospital() {
        return Hospital;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Bienvenido");
        openViewPrincipal();
    }

    public void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HelloApplication.class.getResource("/co/edu/uniquindio/poo/proyectofinal/FXML/inicio.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            InicioViewController primaryController = loader.getController();
            primaryController.setApplication(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void GestionUsuarios() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HelloApplication.class.getResource("/co/edu/uniquindio/poo/proyectofinal/FXML/menuPersona.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            MenuPersonaViewController menuPersonaViewController = loader.getController();
            menuPersonaViewController.setApplication(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Paciente() {
        try {
            Hospital = new Hospital("HospitalUQ", "101012");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HelloApplication.class.getResource("/co/edu/uniquindio/poo/proyectofinal/FXML/Paciente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            PacienteVC pacienteVC = loader.getController();
            pacienteVC.setApplication(this);


            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void inicializarData() {
        
        Medico medico = new Medico("Jhan Carlos", "Gomez", "121700", "32020", Especialidad.MEDICINA_GENERAL);
        hospital.addMedico(medico);
        Paciente paciente = new Paciente("snati","Gonxo","3329","3432324","soledamz4");
        hospital.addPaciente(paciente);
        Medicamiento medicamento = new Medicamiento("4554", "acteaminofen", 10.0);
        hospital.addMedicamento(medicamento);
        RegistroMedico registroMedico = new RegistroMedico("232","12/10/14","4pm","el paciente tiene diarrea","acetaminofen","Tomar cada 8 horas");
        List<RegistroMedico> registroMedicos = new ArrayList<>();
        registroMedicos.add(registroMedico);




        HistorialMedico historialMedico = new HistorialMedico("1", paciente, registroMedicos);
        historialMedico.setPaciente(paciente);
        hospital.crearHistorial(historialMedico);


        HistorialMedico resultado = hospital.buscarHistorialMedicoPaciente(paciente);
        if (resultado != null) {
            System.out.println("ID del historial: " + resultado.getIdHistorialMedico());
            List<RegistroMedico> registros = resultado.getLista();

            for (RegistroMedico registro : registros) {
                System.out.println(registro.toString()); // O formatear la impresión según los datos de registro
            }
        } else {
            System.out.println("No se encontró historial para el paciente.");
        }

// ✅ Solo mostrar (sin lógica adicional)
        System.out.println("Historial encontrado: " + resultado.getIdHistorialMedico());


    }

}
