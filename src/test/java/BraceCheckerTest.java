import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testInvalidSingleBrace() {
        assertEquals(false, checker.isValid("{"));
    }

    @Test
    public void testValidParenthesis() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testValidBraces() {
        assertEquals(true, checker.isValid("{}"));
    }

    @Test
    public void testValidBrackets() {
        assertEquals(true, checker.isValid("[]"));
    }

    @Test
    public void testMultipleOpenCloseBraces() {
        assertEquals(true, checker.isValid("(){}"));
    }

//    @Test
//    public void testValidNestedBraces() {
//        assertEquals(true, checker.isValid("([{}])"));
//    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

}
