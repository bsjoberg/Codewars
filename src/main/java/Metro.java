import java.util.ArrayList;

public class Metro {
    public int countPassengers(ArrayList<int[]> stops) {
        int count = 0;

        for (int i = 0; i < stops.size(); i++) {
            count += stops.get(i)[0];
            count -= stops.get(i)[1];
        }
        return count;
    }
}
