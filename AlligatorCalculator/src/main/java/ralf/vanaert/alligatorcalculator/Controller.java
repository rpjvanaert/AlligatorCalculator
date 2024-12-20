package ralf.vanaert.alligatorcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.mariuszgromada.math.mxparser.Expression;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class Controller {

    private final DecimalFormat format;

    @FXML
    private TextField input;

    public Controller() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        this.format = new DecimalFormat("#.#############", symbols);
    }

    @FXML
    private void onTextChange() {
        Expression expression = new Expression(input.getText());

        input.setText(format.format(expression.calculate()));
        input.positionCaret(input.getText().length());
    }

    private void press(String inputString) {
        input.insertText(input.getCaretPosition(), inputString);
    }

    @FXML
    private void press7() {
        press("7");
    }

    @FXML
    private void press8() {
        press("8");
    }

    @FXML
    private void press9() {
        press("9");
    }

    @FXML
    private void pressDivide() {
        press("/");
    }

    @FXML
    private void press4() {
        press("4");
    }

    @FXML
    private void press5() {
        press("5");
    }

    @FXML
    private void press6() {
        press("6");
    }

    @FXML
    private void pressMultiply() {
        press("*");
    }

    @FXML
    private void press1() {
        press("1");
    }

    @FXML
    private void press2() {
        press("2");
    }

    @FXML
    private void press3() {
        press("3");
    }

    @FXML
    private void pressSubstract() {
        press("-");
    }

    @FXML
    private void press0() {
        press("0");
    }

    @FXML
    private void pressDecimal() {
        press(".");
    }

    @FXML
    private void pressEquals() {
        press("=");
    }

    @FXML
    private void pressAdd() {
        press("+");
    }
}