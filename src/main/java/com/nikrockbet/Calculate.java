package com.nikrockbet;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.reflect.InvocationTargetException;
import com.nikrockbet.Controller;


public class Calculate {

    public static String totals(String number1, String number2) {
        try {

            // переконвертировали полученные переменные в тип Double
            Double numberFirst = Double.valueOf(number1);
            Double numberSecond = Double.valueOf(number2);


            if (numberSecond == 0) {
                String result = "Делить на 0 нельзя";
                return result;

            } else {
                String result = Double.toString(numberFirst / numberSecond);
                return result;
            }
                // обрабатываем исключение, при неверном вводе символом
        } catch (NumberFormatException e)

        {
            String result = "Неверные символы";
            return result;
        }


    }
}