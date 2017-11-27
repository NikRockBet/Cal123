import com.nikrockbet.Calculate;
import junit.framework.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void positiveTest()
    {
        assertEquals("-1.0", Calculate.totals(1, -1));
        assertEquals("-1.0", Calculate.totals(9999, 9999));

    }








    @Test
    public void zeroTest()
    {

        assertEquals("5.0", Calculate.totals(20, 4));
    }


}
