import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 * For example (Input --> Output):
 * 
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit, there are 3 multiplications)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2, there are 4 multiplications)
 * 4 --> 0 (because 4 is already a one-digit number, there is no multiplication)
 */
public class PersistanceBuggerTest {
    @Test
    public void basicTests() {
        assertEquals(3, PersistanceBugger.persistence(39), "Incorrect answer for n=39");
        assertEquals(0, PersistanceBugger.persistence(4), "Incorrect answer for n=4");
        assertEquals(2, PersistanceBugger.persistence(25), "Incorrect answer for n=25");
        assertEquals(4, PersistanceBugger.persistence(999), "Incorrect answer for n=999");
    }

    @Test
    public void testForNumbersWithFiveOrMoreDigits() {
        assertEquals(2, PersistanceBugger.persistence(56712));
    }

    @Test
    public void addingDigitsOfANumber() {
        assertEquals(9, PersistanceBugger.multiplyDigitsInANumber(9));
        assertEquals(27, PersistanceBugger.multiplyDigitsInANumber(39));
        assertEquals(63, PersistanceBugger.multiplyDigitsInANumber(79));
        assertEquals(729, PersistanceBugger.multiplyDigitsInANumber(999));
    }
}
