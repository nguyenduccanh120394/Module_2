import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {

    @Test
    void testCheckLeapYear_2020() {
        int year = 2020;
        boolean excepted = true;
        FindNextDay findNextDay = new FindNextDay();
        boolean result =findNextDay.checkLeapYear(year);
        assertEquals(excepted,result);
    }

    @Test
    void testCheckLeapYear_2018() {
        int year = 2018;
        boolean excepted = false;
        FindNextDay findNextDay = new FindNextDay();
        boolean result =findNextDay.checkLeapYear(year);
        assertEquals(excepted,result);
    }

    @Test
    void testDayInMOnth_2_2020() {
        int month= 2;
        int year = 2020;
        int exceptedDay=29;
        FindNextDay findNextDay = new FindNextDay();
        int result = findNextDay.dayInMonth(month,year);
        assertEquals(result,exceptedDay);
    }

    @Test
    void testDayInMonth_2_2018() {
        int month= 2;
        int year = 2018;
        int exceptedDay=28;
        FindNextDay findNextDay = new FindNextDay();
        int result = findNextDay.dayInMonth(month,year);
        assertEquals(result,exceptedDay);
    }

    @Test
    void testTheNextDay() {
        FindNextDay findNextDay = new FindNextDay();
        String result = findNextDay.theNextDay(31,12,2021);
        System.out.println(result);
    }
}