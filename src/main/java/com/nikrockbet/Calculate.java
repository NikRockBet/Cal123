package com.nikrockbet;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.reflect.InvocationTargetException;
import com.nikrockbet.Controller;


public class Calculate {

    public static String totals(double number1, double number2) {
        if (number2 == 0) {
            String result = "Делить на 0 нельзя";
            return result;
        } else {
            String result = Double.toString(number1 / number2);
            return result;
        }
    }
}