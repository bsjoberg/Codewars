
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class MorseCodeDecoderTest {

    @Test
    public void testSimpleMorseCode() {
        assertThat(MorseCodeDecoder.decode(".-"), is("A"));
    }

    @Test
    public void testSimpleTwoLetterMorseCode() {
        assertThat(MorseCodeDecoder.decode(".- -"), is("AT"));
    }

    @Test
    public void testSimpleTwoSeparateLetterMorseCode() {
        assertThat(MorseCodeDecoder.decode(" .  ."), is("E E"));
    }

    @Test
    public void testSimpleTwoWordsMorseCode() {
        assertThat(MorseCodeDecoder.decode("-... .  .- -"), is("BE AT"));
    }

    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

    @Test
    public void testSOSMessage() {
        assertThat(MorseCodeDecoder.decode(" ...---... "), is("SOS"));
    }

    @Test
    public void testSOSwithSpacesMessage() {
        assertThat(MorseCodeDecoder.decode(" ... --- ... "), is("SOS"));
    }

    @Test
    public void testLongMessage() {
        assertThat(MorseCodeDecoder.decode("...---... -.-.--  - .... .  --.- ..- .. -.-. -.-  -... .-. --- .-- -.  ..-. --- -..-  .--- ..- -- .--. ...  --- ...- . .-.  - .... .  .-.. .- --.. -.--  -.. --- --. .-.-.-"), is("SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
    }
}
