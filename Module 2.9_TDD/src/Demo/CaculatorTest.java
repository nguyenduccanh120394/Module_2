package Demo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
class CaculatorTest {
    @Test
    void add() {
        int x = 1;
        int y = 1;
        Caculator instance = new Caculator();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
}