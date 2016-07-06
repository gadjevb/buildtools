package clouway;

import com.clouway.Sumator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void addTwoNumbers(){
        Sumator sumator = new Sumator();
        assertEquals(5, sumator.sumInt(2,3));
    }

}
