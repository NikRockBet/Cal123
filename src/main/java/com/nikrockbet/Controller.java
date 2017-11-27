package com.nikrockbet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField resultfield;
    @FXML
    public TextField field1;
    @FXML
    public TextField field2;

    @FXML
    public void getResult (ActionEvent event) {
        try {
            double number1 = Double.parseDouble(field1.getText());
            double number2 = Double.parseDouble(field2.getText());

            String result = Calculate.totals(number1, number2);

            if (result == "Делить на 0 нельзя")
            {
                resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
                resultfield.setText(result);
            }

            else
            {
                resultfield.setStyle("-fx-text-fill: green; -fx-alignment: center;");
                resultfield.setText(result);
            }


        } catch (NumberFormatException e) {
            resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
            resultfield.setText("Неверные символы");
        }
    }
}