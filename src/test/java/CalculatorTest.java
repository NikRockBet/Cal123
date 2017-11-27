import com.nikrockbet.Calculate;
import com.nikrockbet.Controller;
import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void positiveTest()
    {
        assertEquals("-1.0", Calculate.totals("1", "-1"));
        assertEquals("81.29268292682927", Calculate.totals("9999", "123"));
    }


    @Test
    public void negativeTest ()

    {
        assertEquals("Неверные символы", Calculate.totals("999*9", "123"));
        assertEquals("Неверные символы", Calculate.totals("HelloMy", "Friend"));
    }

    @Test
    public void zeroTest()
    {
        assertEquals("Делить на 0 нельзя", Calculate.totals("20", "0"));
    }


}
