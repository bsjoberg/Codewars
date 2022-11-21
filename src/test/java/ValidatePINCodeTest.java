import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatePINCodeTest {
    @Test
    public void validPins() {
        assertEquals(true, ValidatePINCode.validatePin("1234"));
        assertEquals(true, ValidatePINCode.validatePin("0000"));
        assertEquals(true, ValidatePINCode.validatePin("1111"));
        assertEquals(true, ValidatePINCode.validatePin("123456"));
        assertEquals(true, ValidatePINCode.validatePin("098765"));
        assertEquals(true, ValidatePINCode.validatePin("000000"));
        assertEquals(true, ValidatePINCode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePINCode.validatePin("a234"));
        assertEquals(false, ValidatePINCode.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePINCode.validatePin("1"));
        assertEquals(false, ValidatePINCode.validatePin("12"));
        assertEquals(false, ValidatePINCode.validatePin("123"));
        assertEquals(false, ValidatePINCode.validatePin("12345"));
        assertEquals(false, ValidatePINCode.validatePin("1234567"));
        assertEquals(false, ValidatePINCode.validatePin("-1234"));
        assertEquals(false, ValidatePINCode.validatePin("1.234"));
        assertEquals(false, ValidatePINCode.validatePin("00000000"));
    }
}
