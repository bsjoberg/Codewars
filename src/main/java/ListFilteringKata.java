import java.util.ArrayList;
import java.util.List;

public class ListFilteringKata {
    private ListFilteringKata() {}

    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();

        // Iterate through the list and only keep integers
        for (Object o : list) {
            if (o instanceof Number)
                result.add(o);
        }

        // Return the List with the Strings filtered out
        return result;
    }
}
