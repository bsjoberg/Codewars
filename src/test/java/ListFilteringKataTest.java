import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFilteringKataTest {

    @Test
    public void example1() {
        assertEquals(List.of(1, 2), ListFilteringKata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
    }

    @Test
    public void example2() {
        assertEquals(List.of(1, 0, 15), ListFilteringKata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
    }

    @Test
    public void example3() {
        assertEquals(List.of(1, 2, 123), ListFilteringKata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
