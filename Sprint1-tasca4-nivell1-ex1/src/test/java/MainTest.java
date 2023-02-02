import months.Month;
import org.example.Main;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
class MainTest {

    private ArrayList<String> months;

/**
 * To investigate why it is not working, arraylist seems empty
    @Before
    public void init() {
        months = new ArrayList<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
    }
**/

    @org.junit.jupiter.api.Test
    @DisplayName("count 12 months")
    void countMonths() {
        months = new ArrayList<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
        Assertions.assertEquals (true, Month.countMonths(months));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("ArrayList is not null")
    void isNotNull() {
        months = new ArrayList<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
        assertEquals(true,Month.isNotNull(months));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("8th month is august")
    void augustIsEight() {
        months = new ArrayList<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
        assertEquals(true,Month.augustIsEight(months));
    }
}