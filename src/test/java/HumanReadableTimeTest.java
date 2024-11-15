import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import org.junit.jupiter.api.Test;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and
 * returns the time in a human-readable format (HH:MM:SS)
 *
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 * 
 * You can find some examples in the test fixtures.
 */
public class HumanReadableTimeTest {
    @Test
    public void Tests() {
        assertEquals("00:00:00", HumanReadableTime.makeReadable(0));
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
    }
}
