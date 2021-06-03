import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle test = new Triangle();
    @Test
    void testClassify1() {
        int a=8;
        int b=2;
        int c=3;
        boolean excepted = false;
        Triangle test = new Triangle();
        boolean result = test.triangle(a,b,c);
        assertEquals(excepted,result);
    }

    @Test
    void testPhanLoai1() {
        final String TAM_GIAC_CAN = "Tam giác cân";
        final String TAM_GIAC_THUONG = "Tam giác thường";
        final String TAM_GIAC_DEU = "Tam giác đều";
        final String TAM_GIAC_VUONG = "Tam giác vuông";
        final String NOT_TAM_GIAC ="Không phải tam giac";
        int a = 0;
        int b = 1;
        int c = 1;
        String excepted = NOT_TAM_GIAC;
        String result = test.triangleClassifi(a,b,c);
        assertEquals(excepted,result);

    }
}