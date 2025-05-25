package co.edu.uniquindio.poo.proyectofinal.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class MenuPersonaViewController {
    HelloApplication application;



        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btn_Paciente;

        @FXML
        private Button btn_Volver;

        @FXML
        private Button btn_admin;

        @FXML
        private Button btn_medico;

        @FXML
        void abrirAdmin(ActionEvent event) {
             /*try {
                application.MenuProcedimiento();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        }

        @FXML
        void abrirMedico(ActionEvent event) {
             /*try {
                application.MenuProcedimiento();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        }

        @FXML
        void abrirPaciente(ActionEvent event) {
             /*try {
                application.MenuProcedimiento();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        }

        @FXML
        void volver(ActionEvent event) {
             try {
                application.openViewPrincipal();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    public void setApplication(HelloApplication application) {
        this.application = application;
    }

        @FXML
        void initialize() {
            assert btn_Paciente != null : "fx:id=\"btn_Paciente\" was not injected: check your FXML file 'menuPersona.fxml'.";
            assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'menuPersona.fxml'.";
            assert btn_admin != null : "fx:id=\"btn_admin\" was not injected: check your FXML file 'menuPersona.fxml'.";
            assert btn_medico != null : "fx:id=\"btn_medico\" was not injected: check your FXML file 'menuPersona.fxml'.";

        }

    }
