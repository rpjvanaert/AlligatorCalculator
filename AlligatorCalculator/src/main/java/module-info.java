module ralf.vanaert.alligatorcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens ralf.vanaert.alligatorcalculator to javafx.fxml;
    exports ralf.vanaert.alligatorcalculator;
}