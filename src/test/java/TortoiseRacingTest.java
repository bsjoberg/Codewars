import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TortoiseRacingTest {
        @Test
    public void tests() {
        assertArrayEquals(new int[]{0, 32, 18}, TortoiseRacing.race(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, TortoiseRacing.race(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, TortoiseRacing.race(80, 100, 40));
    }

    @Test
    public void timeToCloseDistance() {
        assertEquals(7200, TortoiseRacing.timeToCloseDistance(100, 200));
    }

    @Test
    public void convertSecondsToTimeArray() {
        assertTrue(Arrays.equals(new int[]{1, 10, 10}, TortoiseRacing.convertToTimeArrary(4210)));
        assertTrue(Arrays.equals(new int[]{2, 0, 0}, TortoiseRacing.convertToTimeArrary(7200)));
    }

    @Test
    public void handleCaseWhenRacerAIsFasterOrEqual() {
        assertNull(TortoiseRacing.race(90, 80, 10));
        assertNull(TortoiseRacing.race(70, 70, 10));
    }
}
