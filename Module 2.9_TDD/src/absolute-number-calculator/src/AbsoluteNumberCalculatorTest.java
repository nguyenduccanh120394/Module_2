import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void findAbsolute() {
        int number = 1;
        int expected =0;

        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
}