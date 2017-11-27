package com.nikrockbet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import java.lang.reflect.InvocationTargetException;

public class Controller {

    @FXML
    private TextField resultfield;
    @FXML
    private TextField field1;
    @FXML
    private TextField field2;



    @FXML
    public void getResult (ActionEvent event) {
        try {
            double number1 = Double.parseDouble(field1.getText());
            double number2 = Double.parseDouble(field2.getText());
            Calculate.totals(number1, number2);
        } catch (NumberFormatException e) {
            resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
            resultfield.setText("Неверные символы");
        }
    }

/*
    @FXML
    public void totals(double number1, double number2) {

        if (number2 == 0) {
            resultfield.setStyle("-fx-text-fill: red; -fx-alignment: center;");
            resultfield.setText("Нельзя делить на 0");
        }
        else
        {
            String result = String.valueOf(number1 / number2);
            resultfield.setStyle("-fx-text-fill: green; -fx-alignment: center;");
            resultfield.setText(result);
        }

    }
    */
}