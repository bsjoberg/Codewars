import java.util.ArrayList;

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
            integerString.append(temp);
        } while  (num > 0);

        return Integer.parseInt(integerString.toString());
    }
}
