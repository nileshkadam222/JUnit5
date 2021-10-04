package guru.springframework;

import com.hoffnung.junit.Doller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void multiplactionTest(){
        Doller five = new Doller(5);
        five.multiplay(2);
        assertEquals(10,five.amount);
    }

}
