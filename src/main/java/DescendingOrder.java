import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    private DescendingOrder() {}

    public static int sortDesc(int num) {
        StringBuilder integerString = new StringBuilder("");

        // Parse into individual ints
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            int temp = num % 10;
            array.add(temp);
            num /= 10;
        } while  (num > 0);

        // Sort the array
        Collections.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.size(); i++) {
            integerString.append(array.get(i));
        }

        return Integer.parseInt(integerString.toString());
    }
}
