package co.edu.uniquindio.poo.proyectofinal.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioViewController {
    HelloApplication application;




        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnProcedimineto;

        @FXML
        private Button btn_HistorialMEdico;

        @FXML
        private Button btn_Medicamento;

        @FXML
        private Button btn_persona;

        @FXML
        void abrirHistorialMedico(ActionEvent event) {
            /*try {
                application.MenuProcedimiento();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        }

        @FXML
        void abrirMedicamento(ActionEvent event) {
            /*try {
                application.MenuProcedimiento();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        }

        @FXML
        void abrirPersona(ActionEvent event) {
            try {
                application.GestionUsuarios();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @FXML
        void abrirProcedimientos(ActionEvent event) {
            /*try {
                application.MenuProcedimiento();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        }
        public void setApplication(HelloApplication application) {
            this.application = application;
        }

        @FXML
        void initialize() {
            assert btnProcedimineto != null : "fx:id=\"btnProcedimineto\" was not injected: check your FXML file 'inicio.fxml'.";
            assert btn_HistorialMEdico != null : "fx:id=\"btn_HistorialMEdico\" was not injected: check your FXML file 'inicio.fxml'.";
            assert btn_Medicamento != null : "fx:id=\"btn_Medicamento\" was not injected: check your FXML file 'inicio.fxml'.";
            assert btn_persona != null : "fx:id=\"btn_persona\" was not injected: check your FXML file 'inicio.fxml'.";

        }



}
