module co.edu.uniquindio.poo.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens co.edu.uniquindio.poo.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal;

    opens co.edu.uniquindio.poo.proyectofinal.model to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal.model;

    opens co.edu.uniquindio.poo.proyectofinal.viewController to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal.viewController to javafx.fxml;




}