package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.Especialidad;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Medicamiento;
import co.edu.uniquindio.poo.proyectofinal.model.Medico;
import co.edu.uniquindio.poo.proyectofinal.viewController.InicioViewController;
import co.edu.uniquindio.poo.proyectofinal.viewController.MenuPersonaViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    public Hospital hospital = new Hospital("HospitalUQ", "101012");
    private Stage primaryStage;

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

    public static void main(String[] args) {
        launch();
    }

    public void inicializarData() {
        Medico medico = new Medico("Jhan Carlos", "Gomez", "121700", "32020", Especialidad.MEDICINA_GENERAL);
        hospital.addMedico(medico);
        Medicamiento medicamento = new Medicamiento("4554", "acteaminofen", 10.0);
        hospital.addMedicamento(medicamento);
    }
}
