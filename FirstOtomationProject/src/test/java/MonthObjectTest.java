import org.example.MonthObject;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class MonthObjectTest {

    @Test
    void readMonthTest1() throws IOException, ParseException { //checks if the date has a valid month value
        MonthObject newMonth = new MonthObject();
        String newMonth2 = newMonth.readMonth();
        Assertions.assertFalse(newMonth2.isEmpty());
    }

    @Test
    void readMonthTest2() throws IOException, ParseException { //checks if the month is a white space
        MonthObject newMonth = new MonthObject();
        String newMonth2 = newMonth.readMonth();
        Assertions.assertTrue(newMonth2.isEmpty());
    }

    @Test
    void readMonthTest3() throws IOException, ParseException { //checks if the month is null
        MonthObject newMonth = new MonthObject();
        String newMonth2 = newMonth.readMonth();
        Assertions.assertNull(newMonth2);
    }
    
