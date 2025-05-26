        package co.edu.uniquindio.poo.proyectofinal.viewController;

        import java.net.URL;
        import java.util.Collection;
        import java.util.ResourceBundle;

        import co.edu.uniquindio.poo.proyectofinal.Controller.PacienteController;
        import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
        import co.edu.uniquindio.poo.proyectofinal.model.HistorialMedico;
        import co.edu.uniquindio.poo.proyectofinal.model.Medico;
        import co.edu.uniquindio.poo.proyectofinal.model.Notificacion;
        import co.edu.uniquindio.poo.proyectofinal.model.Paciente;
        import javafx.beans.property.SimpleObjectProperty;
        import javafx.beans.property.SimpleStringProperty;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.TextField;

        public class PacienteVC  {

            private HelloApplication application;
            private ObservableList<Paciente> listPaciente = FXCollections.observableArrayList();
            private Paciente selectedPaciente;
            PacienteController pacienteController;


            @FXML
                private ResourceBundle resources;

                @FXML
                private URL location;

                @FXML
                private Button Volver;

                @FXML
                private Button btn_Notificacion;

                @FXML
                private Button btt_Actualizar;

                @FXML
                private Button btt_Agregar;

                @FXML
                private Button btt_Eliminar;

                @FXML
                private Button btt_Limpiar;

                @FXML
                private TableView<Paciente> tb_Paciente;



                @FXML
                private TableColumn<Paciente, String> tbc_Apellido;



                @FXML
                private TableColumn<Paciente, String> tbc_Nombre;

                @FXML
                private TableColumn<Paciente, String> tbc_cedula;

                @FXML
                private TableColumn<Paciente, String> tbc_direccion;

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
                private TextField txt_direccion;

                @FXML
                void ActualizarPaciente(ActionEvent event) {
                    actualizarPaciente();
                }

                @FXML
                void AgregarPaciente(ActionEvent event) {
                    agregarpaciente();
                }

                @FXML
                void EliminarPaciente(ActionEvent event) {
                    eliminarPaciente();

                }

                @FXML
                void LimpiarPaciente(ActionEvent event) {
                    limpiarCamposPaciente();

                }

                @FXML
                void Volver(ActionEvent event) {
                    try {
                        application.openViewPrincipal();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }

                @FXML
                void abrirNotificacion(ActionEvent event) {
                    /*
                    try {
                        application.openViewPrincipal();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }*/

                }


                @FXML
                void initialize() {
                    assert Volver != null : "fx:id=\"Volver\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert btn_Notificacion != null : "fx:id=\"btn_Notificacion\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert btt_Actualizar != null : "fx:id=\"btt_Actualizar\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert btt_Agregar != null : "fx:id=\"btt_Agregar\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert btt_Eliminar != null : "fx:id=\"btt_Eliminar\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert btt_Limpiar != null : "fx:id=\"btt_Limpiar\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert tb_Paciente != null : "fx:id=\"tb_Paciente\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert tbc_Apellido != null : "fx:id=\"tbc_Apellido\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert tbc_Nombre != null : "fx:id=\"tbc_Nombre\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert tbc_cedula != null : "fx:id=\"tbc_cedula\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert tbc_direccion != null : "fx:id=\"tbc_direccion\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert tbc_telefono != null : "fx:id=\"tbc_telefono\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert txt_Apellido != null : "fx:id=\"txt_Apellido\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert txt_Cedula != null : "fx:id=\"txt_Cedula\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert txt_Nombre != null : "fx:id=\"txt_Nombre\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert txt_Telefono != null : "fx:id=\"txt_Telefono\" was not injected: check your FXML file 'Paciente.fxml'.";
                    assert txt_direccion != null : "fx:id=\"txt_direccion\" was not injected: check your FXML file 'Paciente.fxml'.";
                    pacienteController = new PacienteController(HelloApplication.Hospital());

                    obtenerPaciente();
                    initView();
                }






            /**
             * Metodo que permite obtener los datos de paciente
             */
            private void obtenerPaciente() {
                if (pacienteController != null) {
                    listPaciente.addAll(pacienteController.ObtenerListaPaciente());
                } else {
                    System.err.println("PacienteController no está inicializado.");
                }
            }



            /**
             * Metodo que inicializa la vista en javaFX
             */
            private void initView() {
                initDataBinding();
                obtenerPaciente();
                tb_Paciente.getItems().clear();
                tb_Paciente.setItems(listPaciente);
                listenerSelectionPaciente();
            }

            /**
             * Metodo que configura la vinculacion de datos en las tablas
             */
            private void initDataBinding() {
                tbc_Nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
                tbc_Apellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
                tbc_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
                tbc_telefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
                tbc_direccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));

            }

            /**
             * Metodo que escucha los cambios en la selecion de paciente y actualiza la variable selectedPaciente
             */
            private void listenerSelectionPaciente() {
                tb_Paciente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
                    selectedPaciente = newSelection;
                    mostarInformacionPaciente(selectedPaciente);
                });
            }






            /**
             * Metodo que muestra la información del paciente sleccionado en los campos de la interfaz
             *
             * @param paciente
             */
            private void mostarInformacionPaciente(Paciente paciente) {
                if (paciente != null) {
                    txt_Nombre.setText(paciente.getNombre());
                    txt_Apellido.setText(paciente.getApellido());
                    txt_Cedula.setText(paciente.getId());
                    txt_Telefono.setText(paciente.getTelefono());
                    txt_direccion.setText(paciente.getDireccion());

                }
            }

            /**
             * Metodo que agrega un paciente
             */
            private void agregarpaciente() {
                Paciente paciente = buildPaciente();
                if (pacienteController.crearPaciente(paciente)) {
                    listPaciente.add(paciente);
                    limpiarCamposPaciente();
                }
            }

            /**
             * Metodo que crea una instancia de Paciente con los datos ingresados en la interfaz
             *
             * @return
             */
            private Paciente buildPaciente() {
                Paciente paciente = new Paciente(
                        txt_Nombre.getText(),
                        txt_Apellido.getText(),
                        txt_Cedula.getText(),
                        txt_Telefono.getText(),
                        txt_direccion.getText()

                );
                return paciente;

            }


            /**
             * Metodo que elimina un paciente
             */
            private void eliminarPaciente() {
                if (pacienteController.eliminarPaciente(txt_Cedula.getText())) {
                    listPaciente.remove(selectedPaciente);
                    limpiarCamposPaciente();
                    limpiarSeleccion();
                }
            }

            /**
             * Metodo que actualiza un paciente
             */
            private void actualizarPaciente() {

                if (selectedPaciente != null &&
                        pacienteController.actualizarPaciente(selectedPaciente.getId(), buildPaciente())) {

                    int index = listPaciente.indexOf(selectedPaciente);
                    if (index >= 0) {
                        listPaciente.set(index, buildPaciente());
                    }

                    tb_Paciente.refresh();
                    limpiarSeleccion();
                    limpiarCamposPaciente();
                }
            }

            /**
             * metodo que limpia la seleccion de la tabla
             */
            private void limpiarSeleccion() {
                tb_Paciente.getSelectionModel().clearSelection();
                limpiarCamposPaciente();
            }

            /**
             * Metodo quue limpia los campos del paciente seleccionado
             */
            private void limpiarCamposPaciente() {
                txt_Cedula.clear();
                txt_Nombre.clear();
                txt_Apellido.clear();
                txt_Telefono.clear();
                txt_direccion.clear();
            }

            public void setApplication(HelloApplication application) {
                this.application = application;
            }




        }


