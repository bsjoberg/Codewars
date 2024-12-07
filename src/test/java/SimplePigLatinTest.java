import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimplePigLatinTest {

    @Test
    public void convertASimpleWordToPigLatin() {
        assertEquals("siay", PigLatin.convertWordToPigLatin("is"));
        assertEquals("atinlay", PigLatin.convertWordToPigLatin("latin"));
        assertEquals("igPay", PigLatin.convertWordToPigLatin("Pig"));
    }

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
