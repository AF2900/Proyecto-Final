package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private TextArea textAreaReporte;

    private Hospital hospital;

    public void initialize() {
        hospital = new Hospital("Hospital UQ", "1254436778");
    }
    @FXML
    private void mostrarReporteCitas() {
        String reporte = hospital.generarReporteCitas();
        textAreaReporte.setText(reporte);
    }

}