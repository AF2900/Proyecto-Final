package co.edu.uniquindio.poo.hospital.ViewController;

import java.net.URL;
import java.time.LocalDate;
import java.util.Collection;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.hospital.App;
import co.edu.uniquindio.poo.hospital.Controller.ConsultaController;
import co.edu.uniquindio.poo.hospital.Model.*;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

public class ConsultaVC {

    private App app;
    ConsultaController consultaController;
    private ObservableList<Consulta> listaConsulta = FXCollections.observableArrayList();
    private ObservableList<CitaMedica> listaCitaMedica = FXCollections.observableArrayList();
    private ObservableList<Medicamento> listaMedicamento = FXCollections.observableArrayList();
    private Consulta selectedConsulta;
    private CitaMedica selectedCitaMedica;
    private Medicamento selectedMedicamento;

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TableView<Consulta> tb_Consulta;
    @FXML private Button btt_Eliminar;
    @FXML private TableColumn<CitaMedica, String> tbc_CodigoCita;
    @FXML private TableColumn<Consulta, String> tbc_nombreMedicamento;
    @FXML private TableColumn<Consulta, Double> tbc_Dosis;
    @FXML private DatePicker date_Consulta;
    @FXML private Button btt_Actualizar;
    @FXML private TextField txt_IdConsulta;
    @FXML private TableView<Medicamento> tb_Medicamento;
    @FXML private TableColumn<CitaMedica, LocalDate> tbc_FechaCita;
    @FXML private TableColumn<Consulta, String> tbc_Diagnostico;
    @FXML private TextField txt_Diagnostico;
    @FXML private TableView<CitaMedica> tb_CitaMedica;
    @FXML private TableColumn<Consulta, LocalDate> tbc_FechaConsulta;
    @FXML private Button btt_Agregar;
    @FXML private TableColumn<Consulta, String> tbc_IdConsulta;
    @FXML private TableColumn<Consulta, String> tbc_Cita;
    @FXML private TableColumn<Medicamento, String> tbc_nombreMedicamento1;
    @FXML private TableColumn<Medicamento, Double> tbc_dosis;
    @FXML private Button btt_Limpiar;
    @FXML private Button Volver;

    @FXML
    void Volver(ActionEvent event) {
        try {
            app.MenuProcedimiento();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void AgregarConsulta(ActionEvent event) {
        agregarConsulta();
    }

    @FXML
    void ActualizarConsulta(ActionEvent event) {
        actualizarConsulta();
    }

    @FXML
    void EliminarConsulta(ActionEvent event) {
        eliminarConsulta();
    }

    @FXML
    void LimpiarConsulta(ActionEvent event) {
        limpiarCamposConsulta();
    }

    @FXML
    void initialize() {
        consultaController = new ConsultaController(App.hospital);
        obtenerConsulta();
        ObtenerMedicamento();
        ObtenerCitaMedica();
        initView();
    }

    private void ObtenerCitaMedica() {
        Collection<CitaMedica> citaMedicas = consultaController.obtenerListaCitaMedica();
        if (citaMedicas != null) {
            listaCitaMedica.setAll(citaMedicas);
        }
    }

    private void ObtenerMedicamento() {
        Collection<Medicamento> medicamentos = consultaController.obtenerListaMedicamento();
        if (medicamentos != null) {
            listaMedicamento.setAll(medicamentos);
        }
    }

    private void obtenerConsulta() {
        if (consultaController != null) {
            listaConsulta.setAll(consultaController.ObtenerListaConsulta());
        }
    }

    private void initView() {
        initDataBinding();
        tb_Consulta.setItems(listaConsulta);
        tb_CitaMedica.setItems(listaCitaMedica);
        tb_Medicamento.setItems(listaMedicamento);
        listenerSelectionConsulta();
        listenerSelectionCitaMedica();
        listenerSelectionMedicamento();
    }

    private void initDataBinding() {
        tbc_IdConsulta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdConsulta()));
        tbc_FechaConsulta.setCellValueFactory(new PropertyValueFactory<>("fechaConsulta"));
        tbc_Diagnostico.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDiagnosticoConsulta()));
        tbc_FechaCita.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getFechaCita()));
        tbc_CodigoCita.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigoCita()));
        tbc_nombreMedicamento.setCellValueFactory(cellData -> {
            Medicamento medicamento = cellData.getValue().getMedicamento();
            return new SimpleStringProperty(medicamento != null ? medicamento.getNombre() : "Sin medicamento");
        });
        tbc_Dosis.setCellValueFactory(cellData -> {
            Medicamento medicamento = cellData.getValue().getMedicamento();
            return new SimpleObjectProperty<>(medicamento != null ? medicamento.getDosis() : null);
        });
        tbc_Cita.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCitaMedica().getCodigoCita()));
        tbc_nombreMedicamento1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbc_dosis.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDosis()));
    }

    private void listenerSelectionConsulta() {
        tb_Consulta.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedConsulta = newSelection;
            mostarInformacionConsulta(selectedConsulta);
        });
    }

    private void listenerSelectionCitaMedica() {
        tb_CitaMedica.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCitaMedica = newSelection;
        });
    }

    private void listenerSelectionMedicamento() {
        tb_Medicamento.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedMedicamento = newSelection;
        });
    }

    private void mostarInformacionConsulta(Consulta consulta) {
        if (consulta != null) {
            txt_IdConsulta.setText(consulta.getIdConsulta());
            date_Consulta.setValue(consulta.getFechaConsulta());
            txt_Diagnostico.setText(consulta.getDiagnosticoConsulta());
        }
    }

    private void agregarConsulta() {
        if (selectedMedicamento == null) {
            mostrarAlerta("Debe seleccionar un medicamento antes de agregar la consulta.");
            return;
        }
        if (selectedCitaMedica == null) {
            mostrarAlerta("Debe seleccionar una cita médica antes de agregar la consulta.");
            return;
        }

        Consulta consulta = buildConsulta();
        if (consultaController.crearConsulta(consulta)) {
            listaConsulta.add(consulta);
            limpiarCamposConsulta();
        }
    }

    private Consulta buildConsulta() {
        return new Consulta(
                txt_IdConsulta.getText(),
                date_Consulta.getValue(),
                txt_Diagnostico.getText(),
                selectedCitaMedica,
                selectedMedicamento
        );
    }

    private void eliminarConsulta() {
        if (consultaController.eliminarConsulta(txt_IdConsulta.getText())) {
            listaConsulta.remove(selectedConsulta);
            limpiarSeleccion();
        }
    }

    private void actualizarConsulta() {
        if (selectedConsulta != null && consultaController.actualizarConsulta(selectedConsulta.getIdConsulta(), buildConsulta())) {
            int index = listaConsulta.indexOf(selectedConsulta);
            if (index >= 0) {
                listaConsulta.set(index, buildConsulta());
            }
            tb_Consulta.refresh();
            limpiarSeleccion();
        }
    }

    private void limpiarSeleccion() {
        tb_Consulta.getSelectionModel().clearSelection();
        limpiarCamposConsulta();
    }

    private void limpiarCamposConsulta() {
        txt_IdConsulta.clear();
        date_Consulta.setValue(null);
        txt_Diagnostico.clear();
        tb_CitaMedica.getSelectionModel().clearSelection();
        tb_Medicamento.getSelectionModel().clearSelection();
    }

    public void setApp(App app) {
        this.app = app;
    }

    private void mostrarAlerta(String mensaje) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.WARNING);
        alert.setTitle("Advertencia");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}