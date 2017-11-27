package com.nikrockbet;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.reflect.InvocationTargetException;


public class Calculate {

    @FXML
    public static TextField resultfield;

    @FXML
    public static void totals(double number1, double number2) {

            if (number2 == 0) {
                resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
                resultfield.setText("Нельзя делить на 0");
            } else {
                String result = String.valueOf(number1 / number2);
                resultfield.setStyle("-fx-text-fill: green; -fx-alignment: center;");
                resultfield.setText(result);
            }
        }
    }