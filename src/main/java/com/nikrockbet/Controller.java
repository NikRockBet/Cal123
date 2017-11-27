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

            String number1 = field1.getText();
            String number2 = field2.getText();

            String result = Calculate.totals(number1, number2);

            if (result == "Делить на 0 нельзя")
            {
                resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
                resultfield.setText(result);
            }

            else if (result == "Неверные символы")
            {
                resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
                resultfield.setText("Неверные символы");
            }

            else
            {
                resultfield.setStyle("-fx-text-fill: green; -fx-alignment: center;");
                resultfield.setText(result);
            }

        }
    }
