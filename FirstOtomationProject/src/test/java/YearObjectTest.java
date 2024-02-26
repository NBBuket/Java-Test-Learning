import org.example.YearObject;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class YearObjectTest {

    @Test
    void readYearTest1() throws IOException, ParseException { //checks if the date has a valid year value
        YearObject newYear = new YearObject();
        String newYear2 = newYear.readYear();
        Assertions.assertFalse(newYear2.isEmpty());
    }

    @Test
    void readYearTest2() throws IOException, ParseException { //checks if the year is a white space
        YearObject newYear = new YearObject();
        String newYear2 = newYear.readYear();
        Assertions.assertTrue(newYear2.isEmpty());
    }

    @Test
    void readYearTest3() throws IOException, ParseException { //checks if the year is null
        YearObject newYear = new YearObject();
        String newYear2 = newYear.readYear();
        Assertions.assertNull(newYear2);
    }
