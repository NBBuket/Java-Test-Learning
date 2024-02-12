import org.example.DateObjects;
import org.junit.jupiter.api.Test;

class DateObjectsTests {

    @Test
    void readDayTest() {
        DateObjects newDate = new DateObjects();
        newDate.readDay();
    }

    @Test
    void readMonthTest() {
        DateObjects newDate = new DateObjects();
        newDate.readMonth();
    }

    @Test
    void readYearTest() {
        DateObjects newDate = new DateObjects();
        newDate.readYear();
    }
}
