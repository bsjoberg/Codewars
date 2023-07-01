
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class MorseCodeDecoderTest {

    @Test
    public void testSimpleMorseCode() {
        assertThat(MorseCodeDecoder.decode(".-"), is("A"));
    }

    @Test void testSimpleTwoLetterMorseCode() {
        assertThat(MorseCodeDecoder.decode(".- -"), is("AT"));
    }

    @Test void testSimpleTwoWordsMorseCode() {
        assertThat(MorseCodeDecoder.decode("-... .  .- -"), is("BE AT"));
    }

    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
