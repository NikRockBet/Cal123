import com.nikrockbet.Calculate;
import com.nikrockbet.Controller;
import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void positiveTest()
    {
        assertEquals("0.5555555555555556", Calculate.totals("-5", "-9"));
        assertEquals("-0.5", Calculate.totals("-5", "10"));
        assertEquals("-11.11111111111111", Calculate.totals("100", "-9"));
        assertEquals("81.29268292682927", Calculate.totals("9999", "123"));
        assertEquals("4.0E-103", Calculate.totals("4", "100e101"));
        assertEquals("0.0", Calculate.totals("0", "1"));
        assertEquals("0.5", Calculate.totals("256.1024", "512.2048"));

    }


    @Test
    public void negativeTest ()
    {
        assertEquals("Неверные символы", Calculate.totals("999*9", "123"));
        assertEquals("Неверные символы", Calculate.totals("HelloMy", "Friends"));
    }

    @Test
    public void zeroTest()
    {
        assertEquals("Делить на 0 нельзя", Calculate.totals("20", "0"));
        assertEquals("Делить на 0 нельзя", Calculate.totals("0", "0"));
    }


}
