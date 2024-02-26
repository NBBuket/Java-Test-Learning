import org.example.DayObject;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class DayObjectTest {

    @Test
    void readDayTest1() throws IOException, ParseException { //checks if the date has a valid day value
        DayObject newDay = new DayObject();
        String newDay2 = newDay.readDay();
        Assertions.assertFalse(newDay2.isEmpty());
    }

    @Test
    void readDayTest2() throws IOException, ParseException { //checks if the day is a white space
        DayObject newDay = new DayObject();
        String newDay2 = newDay.readDay();
        Assertions.assertTrue(newDay2.isEmpty());
    }

    @Test
    void readDayTest3() throws IOException, ParseException { //checks if the day is null
        DayObject newDay = new DayObject();
        String newDay2 = newDay.readDay();
        Assertions.assertNull(newDay2);
    }
    
}
