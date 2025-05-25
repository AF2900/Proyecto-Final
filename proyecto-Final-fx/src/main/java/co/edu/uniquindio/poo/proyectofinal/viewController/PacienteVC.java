    package co.edu.uniquindio.poo.proyectofinal.viewController;

    import java.net.URL;
    import java.util.ResourceBundle;

    import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
    import co.edu.uniquindio.poo.proyectofinal.model.HistorialMedico;
    import co.edu.uniquindio.poo.proyectofinal.model.Medico;
    import co.edu.uniquindio.poo.proyectofinal.model.Notificacion;
    import co.edu.uniquindio.poo.proyectofinal.model.Paciente;
    import javafx.collections.FXCollections;
    import javafx.collections.ObservableList;
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
    import javafx.scene.control.TableColumn;
    import javafx.scene.control.TableView;
    import javafx.scene.control.TextField;

    public class PacienteVC {
    HelloApplication application;

        private ObservableList<Paciente> listPaciente = FXCollections.observableArrayList();
        private ObservableList<HistorialMedico> listHistorialMedico = FXCollections.observableArrayList();
        private ObservableList<Notificacion> listNotificacion = FXCollections.observableArrayList();
        private Notificacion selectedNotificacion;
        private Paciente selectedPaciente;
        private HistorialMedico selectedHistorialMedico;
        PacienteController pacienteController;


            @FXML
            private ResourceBundle resources;

            @FXML
            private URL location;

            @FXML
            private Button Volver;

            @FXML
            private Button btt_Actualizar;

            @FXML
            private Button btt_Agregar;

            @FXML
            private Button btt_Eliminar;

            @FXML
            private Button btt_Limpiar;

            @FXML
            private TableView<Notificacion> tb_Notificacion;

            @FXML
            private TableView<Paciente> tb_Paciente;

            @FXML
            private TableView<HistorialMedico> tb_historial;

            @FXML
            private TableColumn<Notificacion, String> tbcNotificacion;

            @FXML
            private TableColumn<Paciente, String> tbc_Apellido;

            @FXML
            private TableColumn<HistorialMedico, String> tbc_CodigoHistorial;

            @FXML
            private TableColumn<HistorialMedico, String> tbc_Historial;

            @FXML
            private TableColumn<Paciente, String> tbc_Nombre;

            @FXML
            private TableColumn<Notificacion, String> tbc_Notificacion;

            @FXML
            private TableColumn<Paciente, String> tbc_cedula;

            @FXML
            private TableColumn<Paciente, String> tbc_telefono;

            @FXML
            private TextField txt_Apellido;

            @FXML
            private TextField txt_Cedula;

            @FXML
            private TextField txt_Nombre;

            @FXML
            private TextField txt_Telefono;

            @FXML
            void ActualizarPaciente(ActionEvent event) {
                /*try {
                    application.MenuProcedimiento();
                } catch (Exception e) {
                    e.printStackTrace();
                }*/

            }

            @FXML
            void AgregarPaciente(ActionEvent event) {
                /*try {
                    application.MenuProcedimiento();
                } catch (Exception e) {
                    e.printStackTrace();
                }*/

            }

            @FXML
            void EliminarPaciente(ActionEvent event) {
                /*try {
                    application.MenuProcedimiento();
                } catch (Exception e) {
                    e.printStackTrace();
                }*/

            }

            @FXML
            void LimpiarPaciente(ActionEvent event) {
                /*try {
                    application.MenuProcedimiento();
                } catch (Exception e) {
                    e.printStackTrace();
                }*/

            }

            @FXML
            void Volver(ActionEvent event) {
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
                assert Volver != null : "fx:id=\"Volver\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert btt_Actualizar != null : "fx:id=\"btt_Actualizar\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert btt_Agregar != null : "fx:id=\"btt_Agregar\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert btt_Eliminar != null : "fx:id=\"btt_Eliminar\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert btt_Limpiar != null : "fx:id=\"btt_Limpiar\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tb_Notificacion != null : "fx:id=\"tb_Notificacion\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tb_Paciente != null : "fx:id=\"tb_Paciente\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tb_historial != null : "fx:id=\"tb_historial\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbcNotificacion != null : "fx:id=\"tbcNotificacion\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_Apellido != null : "fx:id=\"tbc_Apellido\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_CodigoHistorial != null : "fx:id=\"tbc_CodigoHistorial\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_Historial != null : "fx:id=\"tbc_Historial\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_Nombre != null : "fx:id=\"tbc_Nombre\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_Notificacion != null : "fx:id=\"tbc_Notificacion\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_cedula != null : "fx:id=\"tbc_cedula\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert tbc_telefono != null : "fx:id=\"tbc_telefono\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert txt_Apellido != null : "fx:id=\"txt_Apellido\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert txt_Cedula != null : "fx:id=\"txt_Cedula\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert txt_Nombre != null : "fx:id=\"txt_Nombre\" was not injected: check your FXML file 'Paciente.fxml'.";
                assert txt_Telefono != null : "fx:id=\"txt_Telefono\" was not injected: check your FXML file 'Paciente.fxml'.";


                pacienteController=new PacienteController(HelloApplication.);
                ObtenerHistorialMedico();
                obtenerPaciente();
                initView();
            }


        }
